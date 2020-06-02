import javax.xml.transform.Result;
import java.security.Policy;
import java.sql.*;
import java.util.ArrayList;

public class ServerConnection {

    private String url;
    private Connection connection;
    private Statement statement;
    public static ServerConnection S;

    public ServerConnection(String url) {
        Policy.setPolicy(new DerbyPolicy());
        this.url = url;
        S=this;
    }

    public boolean Connect() {
        try {
            connection = DriverManager.getConnection(url);
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean Disconnect(){
        try{
            connection=DriverManager.getConnection(url+";shutdown=true");
            return true;
        } catch(SQLException e){}
        return false;
    }

    public void CreateEmpty() {
        try {
            connection = DriverManager.getConnection(url + ";create=true");

            statement = connection.createStatement();

            statement.execute("CREATE TABLE Users (" +
                    "  user_id Int NOT NULL GENERATED ALWAYS AS IDENTITY," +
                    "  username Varchar(20) NOT NULL," +
                    "  password Varchar(20) NOT NULL," +
                    "  email Varchar(25) NOT NULL," +
                    "  birth_date DATE NOT NULL," +
                    "  balance Float(2) NOT NULL," +
                    "  is_employee Boolean NOT NULL," +
                    "  PRIMARY KEY (user_id)," +
                    "  UNIQUE (user_id, username, email)" +
                    ")");

            statement.execute("CREATE TABLE Books (" +
                    "  book_id Int NOT NULL GENERATED ALWAYS AS IDENTITY," +
                    "  title Varchar(20) NOT NULL," +
                    "  author_name Varchar(20) NOT NULL," +
                    "  author_surname Varchar(20) NOT NULL," +
                    "  description Varchar(255) NOT NULL," +
                    "  price Float(2) NOT NULL," +
                    "  PRIMARY KEY (book_id)," +
                    "  UNIQUE (book_id, title)" +
                    ")");

            statement.execute("CREATE TABLE Orders(" +
                    "  order_id Int NOT NULL GENERATED ALWAYS AS IDENTITY," +
                    "  user_id Int NOT NULL," +
                    "  book_id Int NOT NULL," +
                    "  PRIMARY KEY (order_id)" +
                    ")");

            statement.execute("CREATE INDEX IX_Relationship5 ON Orders (user_id)");

            statement.execute("CREATE INDEX IX_Relationship6 ON Orders (book_id)");

            statement.execute("CREATE TABLE Reviews(" +
                    "  review_id Int NOT NULL GENERATED ALWAYS AS IDENTITY," +
                    "  user_id Int NOT NULL," +
                    "  book_id Int NOT NULL," +
                    "  rating Int NOT NULL," +
                    "  comment Varchar(255)," +
                    "  PRIMARY KEY (review_id)" +
                    ")");

            statement.execute("CREATE INDEX IX_Relationship7 ON Reviews (user_id)");

            statement.execute("CREATE INDEX IX_Relationship8 ON Reviews (book_id)");
            statement.execute("ALTER TABLE Orders ADD CONSTRAINT Relationship5 FOREIGN KEY (user_id) REFERENCES Users (user_id) ON DELETE RESTRICT ON UPDATE RESTRICT");

            statement.execute("ALTER TABLE Orders ADD CONSTRAINT Relationship6 FOREIGN KEY (book_id) REFERENCES Books (book_id) ON DELETE RESTRICT ON UPDATE RESTRICT");

            statement.execute("ALTER TABLE Reviews ADD CONSTRAINT Relationship7 FOREIGN KEY (user_id) REFERENCES Users (user_id) ON DELETE RESTRICT ON UPDATE RESTRICT");

            statement.execute("ALTER TABLE Reviews ADD CONSTRAINT Relationship8 FOREIGN KEY (book_id) REFERENCES Books (book_id) ON DELETE RESTRICT ON UPDATE RESTRICT");

            Connect();
        } catch (SQLException exception) {
            exception.printStackTrace();
        }
    }

    public boolean AddUser(String username, String email, String password, String birth_date, float balance, boolean is_worker) {
        try {
            statement = connection.createStatement();
            statement.execute("INSERT INTO Users (username,email,password,birth_date,balance,is_employee) VALUES ('" + username + "','" + email + "','" + password +"','"+birth_date+"'," + balance + ",'" + is_worker + "')");
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean AddReview(String book_title, String username, int rating) {
        try {
            statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("SELECT user_id FROM Users WHERE username='" + username + "'");
            rs.next();
            int user_id = rs.getInt("user_id");
            rs = statement.executeQuery("SELECT book_id FROM Books WHERE title='" + book_title + "'");
            rs.next();
            int book_id = rs.getInt("book_id");
            statement.execute("INSERT INTO Reviews (book_id,user_id,rating) VALUES ('" + book_id + "','" + user_id + "','" + rating + "')");
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean AddReview(String book_title, String username, int rating, String comment) {
        try {
            statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("SELECT user_id FROM Users WHERE username='" + username + "'");
            rs.next();
            int user_id = rs.getInt("user_id");
            rs = statement.executeQuery("SELECT book_id FROM Books WHERE title='" + book_title + "'");
            rs.next();
            int book_id = rs.getInt("book_id");
            statement.execute("INSERT INTO Reviews (book_id,user_id,rating,comment) VALUES (" + book_id + "," + user_id + "," + rating + ",'" + comment + "')");
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean AddBook(String title, String author_name, String author_surname, String description, float price){
        try{
            statement = connection.createStatement();
            statement.execute("INSERT INTO Books (title, author_name, author_surname, description, price) VALUES ('"+title+"','"+author_name+"','"+author_surname+"','"+description+"',"+price+")");
            return true;
        } catch(SQLException e){e.printStackTrace();}
        return false;
    }

    public int Register(String username, String email, String password, String birth_date) {
        if (LookForEmail(email) && LookForUsername(username)) return 1;
        if (LookForUsername(username)) return 2;
        if (LookForEmail(email)) return 3;
        if(AddUser(username, email, password, birth_date, 0f, false))
        return 0;
        else return 4;
    }

    public boolean LogIn(String username, String password) {
        if (LookForUsername(username) && CheckPassword(password, username))
            return true;
        else return false;
    }

    public boolean LookForUsername(String username) {
        try {
            statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("SELECT username FROM Users");
            while (rs.next()) if (rs.getString("username").equals(username)) return true;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean LookForEmail(String email) {
        try {
            statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("SELECT email FROM Users");
            while (rs.next()) if (rs.getString("email").equals(email)) return true;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean CheckPassword(String password, String username) {
        try {
            statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("SELECT password FROM Users WHERE username='"+username+"'");
            rs.next();
            if (rs.getString("password").equals(password)) return true;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public float GetOverallRating(String book_title) {
        try {
            statement = connection.createStatement();
            ResultSet rs1=statement.executeQuery("SELECT book_id FROM Books WHERE title='"+book_title+"'");
            rs1.next();
            int id=rs1.getInt("book_id");
            ResultSet rs = statement.executeQuery("SELECT rating FROM Reviews WHERE book_id=" + id + "");
            int sum = 0, count = 0;
            while (rs.next()) {
                sum += rs.getInt("rating");
                count++;
            }

            if (count > 0) return (float) sum / count;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0f;
    }

    public float GetUsersBalance(String username){
        float balance=0;
        try{
            statement=connection.createStatement();
            ResultSet rs=statement.executeQuery("SELECT balance FROM Users WHERE username='"+username+"'");
            rs.next();
            balance=rs.getFloat("balance");
        } catch(SQLException e){e.printStackTrace();}
        return balance;
    }

    public ArrayList<String> GetLatestReviews(String book_title, int count) {
        ArrayList<String> al = new ArrayList<>();
        ArrayList<String> ans=new ArrayList<>();
        int rlcount=count;
        try {
            statement=connection.createStatement();
            ResultSet rs1=statement.executeQuery("SELECT book_id FROM Books WHERE title='"+book_title+"'");
            rs1.next();
            int id=rs1.getInt("book_id");
            ResultSet rs = statement.executeQuery("SELECT rating, comment, user_id FROM Reviews WHERE book_id=" + id + "");
            while (rs.next()) {
                al.add(Integer.toString(rs.getInt("rating")));
                al.add(rs.getString("comment"));
            }

            if(rlcount>al.size()/2) rlcount=al.size()/2;

            for (int i = al.size()-1; i >= al.size()-(rlcount*2); i-=2) {
                ans.add(al.get(i-1));
                ans.add(al.get(i));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return ans;
    }

    public boolean IsEmployee(String username) {
        boolean emp = false;
        try {
            statement=connection.createStatement();
            ResultSet rs = statement.executeQuery("SELECT is_employee FROM Users WHERE username='" + username + "'");
            rs.next();
            emp = rs.getBoolean("is_employee");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return emp;
    }

    public void SetAsEmployee(String username) {
        try {
            statement=connection.createStatement();
            statement.execute("UPDATE Users SET is_employee=true WHERE username='" + username + "'");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public float GetBookPrice(String book_title) {
        float price = 0;
        try {
            statement=connection.createStatement();
            ResultSet rs = statement.executeQuery("SELECT price FROM Books WHERE title='" + book_title + "'");
            rs.next();
            price = rs.getFloat("price");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return price;
    }

    public String GetBookDesc(String book_title){
        try{
            statement=connection.createStatement();
            ResultSet rs=statement.executeQuery("SELECT description FROM Books WHERE title='"+book_title+"'");
            rs.next();
            return rs.getString("description");
        } catch(SQLException e){e.printStackTrace();}
        return "";
    }

    public void ChangeUsersBalance(String username, float amount) {
        try {
            statement=connection.createStatement();
            statement.execute("UPDATE Users SET balance=balance+" + amount + " WHERE username='" + username + "'");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void ChangePassword(String username, String password){
        try{
            statement=connection.createStatement();
            statement.execute("UPDATE Users SET password='"+password+"' WHERE username='"+username+"'");
        } catch(SQLException e){e.printStackTrace();}
    }

    public void BuyBook(String username, String title){
        try{
            statement=connection.createStatement();
            ResultSet rs1=statement.executeQuery("SELECT book_id, price FROM Books WHERE title='"+title+"'");
            rs1.next();
            int book_id=rs1.getInt("book_id");
            float price=rs1.getFloat("price");
            connection.createStatement();
            ResultSet rs2=statement.executeQuery("SELECT user_id FROM Users WHERE username='"+username+"'");
            rs2.next();
            int user_id=rs2.getInt("user_id");
            connection.createStatement();
            statement.execute("INSERT INTO Orders (user_id, book_id) VALUES ("+user_id+","+book_id+")");
            ChangeUsersBalance(username,price*(-1));
        } catch(SQLException e){e.printStackTrace();}
    }

    public ArrayList<String> GetLatestBooks(int count) {
        ArrayList<String> al = new ArrayList<>();
        ArrayList<String> ans=new ArrayList<>();
        int rlcount=count;
        try {
            statement=connection.createStatement();
            ResultSet rs = statement.executeQuery("SELECT title,author_name,author_surname,description,price FROM Books");

            while(rs.next()){
                al.add(rs.getString("title"));
                al.add(rs.getString("author_name"));
                al.add(rs.getString("author_surname"));
                al.add(rs.getString("description"));
                al.add(Float.toString(rs.getFloat("price")));
            }

            if(rlcount>al.size()/5) rlcount=al.size()/5;

            for (int i = al.size()-1; i >= al.size()-(rlcount*5); i-=5) {
                ans.add(al.get(i-4));
                ans.add(al.get(i-3));
                ans.add(al.get(i-2));
                ans.add(al.get(i-1));
                ans.add(al.get(i));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return ans;
    }

    public ArrayList<String> SearchByTitle(String title){
        ArrayList<String> res=new ArrayList<>();
        try {
            statement=connection.createStatement();
            ResultSet rs = statement.executeQuery("SELECT title,author_name,author_surname,price FROM Books WHERE title='"+title+"'");

            while(rs.next()){
                res.add(rs.getString("title"));
                res.add(rs.getString("author_name"));
                res.add(rs.getString("author_surname"));
                res.add(Float.toString(rs.getFloat("price")));
            }
        } catch(SQLException e){e.printStackTrace();}
        return res;
    }

    public ArrayList<String> SearchByAuthorsName(String name){
        ArrayList<String> res=new ArrayList<>();
        try {
            statement=connection.createStatement();
            ResultSet rs = statement.executeQuery("SELECT title,author_name,author_surname,price FROM Books WHERE author_name='"+name+"'");

            while(rs.next()){
                res.add(rs.getString("title"));
                res.add(rs.getString("author_name"));
                res.add(rs.getString("author_surname"));
                res.add(Float.toString(rs.getFloat("price")));
            }
        } catch(SQLException e){e.printStackTrace();}
        return res;
    }

    public ArrayList<String> SearchByAuthorsSurname(String surname){
        ArrayList<String> res=new ArrayList<>();
        try {
            statement=connection.createStatement();
            ResultSet rs = statement.executeQuery("SELECT title,author_name,author_surname,price FROM Books WHERE author_surname='"+surname+"'");

            while(rs.next()){
                res.add(rs.getString("title"));
                res.add(rs.getString("author_name"));
                res.add(rs.getString("author_surname"));
                res.add(Float.toString(rs.getFloat("price")));
            }
        } catch(SQLException e){e.printStackTrace();}
        return res;
    }

    public ArrayList<String> GetUsersBooks(String username){
        ArrayList<String> books=new ArrayList<>();
        try{
            statement = connection.createStatement();
            ResultSet rs1=statement.executeQuery("SELECT user_id FROM Users WHERE username='"+username+"'");
            rs1.next();
            int userid=rs1.getInt("user_id");
            ResultSet rs2=statement.executeQuery("SELECT book_id FROM Orders WHERE user_id="+userid+"");
            ArrayList<Integer> bkid=new ArrayList<>();

            while(rs2.next()) bkid.add(rs2.getInt("book_id"));

            for(int i=0;i<bkid.size();i++){
                ResultSet rs3=statement.executeQuery("SELECT title, author_name, author_surname FROM Books WHERE book_id="+bkid.get(i)+"");
                rs3.next();
                books.add(rs3.getString("title"));
                books.add(rs3.getString("author_name"));
                books.add(rs3.getString("author_surname"));
            }
        } catch(SQLException e){e.printStackTrace();}
        return books;
    }

    public ArrayList<String> GetUsers() {
        ArrayList<String> res = new ArrayList<>();
        try {
            statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("SELECT * FROM Users");
            while (rs.next())
                res.add(rs.getString("user_id") + " " +
                        rs.getString("username") + " " +
                        rs.getString("password") + " " +
                        rs.getString("email") + " " +
                        rs.getString("birth_date") + " " +
                        rs.getBoolean("is_employee"
                        ));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return res;
    }//GetUsers()
}
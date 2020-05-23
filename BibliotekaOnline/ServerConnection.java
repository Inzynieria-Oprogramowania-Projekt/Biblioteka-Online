import java.security.Policy;
import java.sql.*;
import java.util.ArrayList;

public class ServerConnection {

    private String url;
    private Connection connection;
    private Statement statement;

    public ServerConnection(String url) {
        Policy.setPolicy(new DerbyPolicy());
        this.url = url;
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
                    "  balance Float(2) NOT NULL," +
                    "  is_employee Boolean NOT NULL," +
                    "  PRIMARY KEY (user_id)," +
                    "  UNIQUE (user_id, username, email)" +
                    ")");

            statement.execute("CREATE TABLE Books (" +
                    "  book_id Int NOT NULL," +
                    "  title Varchar(20) NOT NULL," +
                    "  author_name Varchar(20) NOT NULL," +
                    "  author_surname Varchar(20) NOT NULL," +
                    "  description Varchar(255) NOT NULL," +
                    "  price Float(2) NOT NULL," +
                    "  PRIMARY KEY (book_id)," +
                    "  UNIQUE (book_id, title)" +
                    ")");

            statement.execute("CREATE TABLE Orders(" +
                    "  order_id Int NOT NULL," +
                    "  user_id Int NOT NULL," +
                    "  book_id Int NOT NULL," +
                    "  PRIMARY KEY (order_id)" +
                    ")");

            statement.execute("CREATE INDEX IX_Relationship5 ON Orders (user_id)");

            statement.execute("CREATE INDEX IX_Relationship6 ON Orders (book_id)");

            statement.execute("CREATE TABLE Reviews(" +
                    "  review_id Int NOT NULL," +
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

    public void AddUser(String username, String email, String password, float balance, boolean is_worker) {
        try {
            statement = connection.createStatement();
            statement.execute("INSERT INTO Users (username,email,password,balance,is_employee) VALUES ('" + username + "','" + email + "','" + password + "'," + balance + ",'" + is_worker + "')");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public boolean AddReview(String book_title, String username, int rating) {
        try {
            statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("SELECT user_id FROM Users WHERE username='" + username + "'");
            int user_id = rs.getInt("user_id");
            rs = statement.executeQuery("SELECT book_id FROM Books WHERE title='" + book_title + "'");
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
            int user_id = rs.getInt("user_id");
            rs = statement.executeQuery("SELECT book_id FROM Books WHERE title='" + book_title + "'");
            int book_id = rs.getInt("book_id");
            statement.execute("INSERT INTO Reviews (book_id,user_id,rating,comment) VALUES ('" + book_id + "','" + user_id + "','" + rating + "','" + comment + "')");
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public int Register(String username, String email, String password) {
        if (LookForEmail(email) && LookForUsername(username)) return 1;
        if (LookForUsername(username)) return 2;
        if (LookForEmail(email)) return 3;
        AddUser(username, email, password, 0f, false);
        return 0;
    }

    public boolean LogIn(String username, String password) {
        if (LookForUsername(username) && LookForPassword(password))
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

    public boolean LookForPassword(String password) {
        try {
            statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("SELECT password FROM Users");
            while (rs.next()) if (rs.getString("password").equals(password)) return true;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public float GetOverallRating(String book_title) {
        try {
            statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("SELECT rating FROM Reviews WHERE title='" + book_title + "'");
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

    public ArrayList<String> GetNewestReviews(String book_title, int count) {
        ArrayList<String> al = new ArrayList<>();
        try {
            connection.createStatement();
            ResultSet rs = statement.executeQuery("SELECT rating, comment FROM Rewievs WHERE title='" + book_title + "'");
            if (rs.last()) {
                al.add(Integer.toString(rs.getInt("rating")));
                al.add(rs.getString("comment"));
            }
            for (int i = 0; i < count - 1; i++) {
                if (rs.previous()) {
                    al.add(Integer.toString(rs.getInt("rating")));
                    al.add(rs.getString("comment"));
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return al;
    }

    public boolean IsEmployee(String username) {
        boolean emp = false;
        try {
            connection.createStatement();
            ResultSet rs = statement.executeQuery("SELECT is_employee FROM Users WHERE username='" + username + "'");
            emp = rs.getBoolean("is_employee");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return emp;
    }

    public void SetAsEmployee(String username) {
        try {
            connection.createStatement();
            statement.execute("UPDATE Users SET is_employee=true WHERE username='" + username + "'");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public float GetBookPrice(String book_title) {
        float price = 0;
        try {
            connection.createStatement();
            ResultSet rs = statement.executeQuery("SELECT price FROM Books WHERE title='" + book_title + "'");
            price = rs.getFloat("price");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return price;
    }

    public void ChangeUsersBalance(String username, float amount) {
        try {
            connection.createStatement();
            statement.execute("UPDATE Users SET balance=balance-" + amount + " WHERE username='" + username + "'");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public ArrayList<String> GetLatestBooks(int count) {
        ArrayList<String> al = new ArrayList<>();
        try {
            connection.createStatement();
            ResultSet rs = statement.executeQuery("SELECT title,author,description,price FROM Books");
            if (rs.last()) {
                al.add(rs.getString("title"));
                al.add(rs.getString("author"));
                al.add(rs.getString("description"));
                al.add(Float.toString(rs.getFloat("price")));
            }

            for (int i = 0; i < count - 1; i++) {
                if (rs.previous()) {
                    al.add(rs.getString("title"));
                    al.add(rs.getString("author"));
                    al.add(rs.getString("description"));
                    al.add(Float.toString(rs.getFloat("price")));
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return al;
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
                        rs.getBoolean("is_employee"
                        ));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return res;
    }//GetUsers()
}

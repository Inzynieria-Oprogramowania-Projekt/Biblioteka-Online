import java.util.ArrayList;

public class Main {

    public static void main(String[] args)
    {
        ServerConnection s=new ServerConnection("jdbc:derby:Biblioteka_Online");
        //s.CreateEmpty();
        s.Connect();
        s.Register("user1", "email@ksiazki.pl","haslo1");
        s.Register("user2", "tak@ksiazki.pl","haslo2");
        ArrayList<String> users=s.GetUsers();

        for(int i=0;i<users.size();i++) System.out.println(users.get(i));

        s.Disconnect();
    }
}

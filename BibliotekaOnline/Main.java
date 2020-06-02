import java.util.ArrayList;

public class Main {

    public static void main(String[] args)
    {
        ServerConnection s=new ServerConnection("jdbc:derby:Biblioteka_Online");
        //s.CreateEmpty();
        s.Connect();
        s.Disconnect();
    }
}

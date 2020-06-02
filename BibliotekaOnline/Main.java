
public class Main {
    public static void main(String[] args)
    {
        ServerConnection s=new ServerConnection("jdbc:derby:Biblioteka_Online");
        ServerConnection.S.Connect();

        JFrameLogin login = new JFrameLogin();
        login.setLocationRelativeTo(null);
        JFrameLogin.S.setVisible(true);

        JFrameRegister register = new JFrameRegister();
        register.setLocationRelativeTo(null);
        JFrameSearch search = new JFrameSearch();
        search.setLocationRelativeTo(null);
        JFrameAccountPage accpage = new JFrameAccountPage();
        accpage.setLocationRelativeTo(null);
    }
}

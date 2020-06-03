
public class Main {
    public static void main(String[] args) {
        ServerConnection s=new ServerConnection("jdbc:derby:Biblioteka_Online");
        ServerConnection.S.Connect();
        User user=new User();
        Book book=new Book();

        Runtime.getRuntime().addShutdownHook(new Thread() {
            public void run() {
                ServerConnection.S.Disconnect();
            }
        });

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            //java.util.logging.Logger.getLogger(com.mycompany.guidemo.JFrameAddComentary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            //java.util.logging.Logger.getLogger(com.mycompany.guidemo.JFrameAddComentary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            //java.util.logging.Logger.getLogger(com.mycompany.guidemo.JFrameAddComentary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            //java.util.logging.Logger.getLogger(com.mycompany.guidemo.JFrameAddComentary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }


        JFrameLogin login = new JFrameLogin();
        login.setLocationRelativeTo(null);
        JFrameLogin.S.setVisible(true);

        JFrameRegister register = new JFrameRegister();
        register.setLocationRelativeTo(null);

        JFrameSearch search = new JFrameSearch();
        search.setLocationRelativeTo(null);

        JFrameAccountPage accpage = new JFrameAccountPage();
        accpage.setLocationRelativeTo(null);

        JFrameAddBook addbook = new JFrameAddBook();
        addbook.setLocationRelativeTo(null);

        JFrameAddComentary ac=new JFrameAddComentary();
        ac.setLocationRelativeTo(null);

        JFrameKomentarz k=new JFrameKomentarz();
        k.setLocationRelativeTo(null);

        JFrameBookPage b=new JFrameBookPage();
        b.setLocationRelativeTo(null);

        JFrameReading r=new JFrameReading();
        r.setLocationRelativeTo(null);
    }
}

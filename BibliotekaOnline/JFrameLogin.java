import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.*;

public class JFrameLogin extends JFrame {

    public static JFrameLogin S;

    public JFrameLogin() {
        initComponents();
        jLabel1.setVisible(false);
        S=this;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        jPasswordField1 = new javax.swing.JPasswordField();
        usernameLogin = new javax.swing.JLabel();
        usernamePassword = new javax.swing.JLabel();
        fieldUsernameLogin = new javax.swing.JTextField();
        fieldPasswordLogin = new javax.swing.JPasswordField();
        buttonExit = new javax.swing.JButton();
        buttonLogin = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        JMenuItemRegister = new javax.swing.JMenuItem();
        JMenuItemSutekEwakuacji = new javax.swing.JMenuItem();
        JMenuItemRecoveryPassword = new javax.swing.JMenuItem();

        jPasswordField1.setText("jPasswordField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Biblioteka Online");

        usernameLogin.setText("Nazwa Użytkownika");

        usernamePassword.setText("Hasło");

        buttonExit.setText("Wyjdź");
        buttonExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonExitActionPerformed(evt);
            }
        });

        buttonLogin.setText("Zaloguj");
        buttonLogin.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                buttonLoginComponentHidden(evt);
            }
        });
        buttonLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonLoginActionPerformed(evt);
            }
        });

        jLabel1.setText("LoginMistaken");

        jMenu1.setText("File");

        JMenuItemRegister.setText("Zarejestruj");
        JMenuItemRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMenuItemRegisterActionPerformed(evt);
            }
        });
        jMenu1.add(JMenuItemRegister);

        JMenuItemSutekEwakuacji.setText("Wyjdź");
        JMenuItemSutekEwakuacji.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMenuItemSutekEwakuacjiActionPerformed(evt);
            }
        });
        jMenu1.add(JMenuItemSutekEwakuacji);

        JMenuItemRecoveryPassword.setText("Odzyskaj hasło");
        jMenu1.add(JMenuItemRecoveryPassword);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(usernameLogin)
                                        .addComponent(buttonExit, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(usernamePassword))
                                .addGap(62, 62, 62)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel1)
                                        .addComponent(fieldUsernameLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(buttonLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(fieldPasswordLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(36, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(usernameLogin)
                                        .addComponent(fieldUsernameLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(42, 42, 42)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(usernamePassword)
                                        .addComponent(fieldPasswordLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel1)
                                .addGap(34, 34, 34)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(buttonExit, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(buttonLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
    }

    private void buttonExitActionPerformed(java.awt.event.ActionEvent evt) {
        System.exit(0);
    }

    private void JMenuItemSutekEwakuacjiActionPerformed(java.awt.event.ActionEvent evt) {
        System.exit(0);
    }

    private void buttonLoginActionPerformed(java.awt.event.ActionEvent evt) {
        JFrameLogin.S.setVisible(false);
        JFrameSearch.S.setVisible(true);

    }

    private void JMenuItemRegisterActionPerformed(java.awt.event.ActionEvent evt) {
        JFrameLogin.S.setVisible(false);
        JFrameRegister.S.setVisible(true);

    }

    private void buttonLoginComponentHidden(java.awt.event.ComponentEvent evt) {

    }


    // Variables declaration - do not modify
    private javax.swing.JMenuItem JMenuItemRecoveryPassword;
    private javax.swing.JMenuItem JMenuItemRegister;
    private javax.swing.JMenuItem JMenuItemSutekEwakuacji;
    private javax.swing.JButton buttonExit;
    private javax.swing.JButton buttonLogin;
    private javax.swing.JPasswordField fieldPasswordLogin;
    private javax.swing.JTextField fieldUsernameLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JLabel usernameLogin;
    private javax.swing.JLabel usernamePassword;
    // End of variables declaration

    public javax.swing.JMenuItem getJMenuItemRecoveryPassword() {
        return JMenuItemRecoveryPassword;
    }

    public javax.swing.JMenuItem getJMenuItemRegister() {
        return JMenuItemRegister;
    }

    public javax.swing.JMenuItem getJMenuItemSutekEwakuacji() {
        return JMenuItemSutekEwakuacji;
    }

    public javax.swing.JButton getButtonExit() {
        return buttonExit;
    }

    public javax.swing.JButton getButtonLogin() {
        return buttonLogin;
    }

    public javax.swing.JPasswordField getFieldPasswordLogin() {
        return fieldPasswordLogin;
    }

    public javax.swing.JTextField getFieldUsernameLogin() {
        return fieldUsernameLogin;
    }

    public javax.swing.JLabel getjLabel1() {
        return jLabel1;
    }

    public javax.swing.JMenu getjMenu1() {
        return jMenu1;
    }

    public javax.swing.JMenuBar getjMenuBar1() {
        return jMenuBar1;
    }

    public javax.swing.JPasswordField getjPasswordField1() {
        return jPasswordField1;
    }

    public javax.swing.JLabel getUsernameLogin() {
        return usernameLogin;
    }

    public javax.swing.JLabel getUsernamePassword() {
        return usernamePassword;
    }


    public void setJMenuItemRecoveryPassword(javax.swing.JMenuItem JMenuItemRecoveryPassword) {
        this.JMenuItemRecoveryPassword = JMenuItemRecoveryPassword;
    }

    public void setJMenuItemRegister(javax.swing.JMenuItem JMenuItemRegister) {
        this.JMenuItemRegister = JMenuItemRegister;
    }

    public void setJMenuItemSutekEwakuacji(javax.swing.JMenuItem JMenuItemSutekEwakuacji) {
        this.JMenuItemSutekEwakuacji = JMenuItemSutekEwakuacji;
    }

    public void setButtonExit(javax.swing.JButton buttonExit) {
        this.buttonExit = buttonExit;
    }

    public void setButtonLogin(javax.swing.JButton buttonLogin) {
        this.buttonLogin = buttonLogin;
    }

    public void setFieldPasswordLogin(javax.swing.JPasswordField fieldPasswordLogin) {
        this.fieldPasswordLogin = fieldPasswordLogin;
    }

    public void setFieldUsernameLogin(javax.swing.JTextField fieldUsernameLogin) {
        this.fieldUsernameLogin = fieldUsernameLogin;
    }

    public void setjLabel1(javax.swing.JLabel jLabel1) {
        this.jLabel1 = jLabel1;
    }

    public void setjMenu1(javax.swing.JMenu jMenu1) {
        this.jMenu1 = jMenu1;
    }

    public void setjMenuBar1(javax.swing.JMenuBar jMenuBar1) {
        this.jMenuBar1 = jMenuBar1;
    }

    public void setjPasswordField1(javax.swing.JPasswordField jPasswordField1) {
        this.jPasswordField1 = jPasswordField1;
    }

    public void setUsernameLogin(javax.swing.JLabel usernameLogin) {
        this.usernameLogin = usernameLogin;
    }

    public void setUsernamePassword(javax.swing.JLabel usernamePassword) {
        this.usernamePassword = usernamePassword;
    }
}

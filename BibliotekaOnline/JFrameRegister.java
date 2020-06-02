import javax.swing.*;

public class JFrameRegister extends JFrame {

    public static JFrameRegister S;

    public JFrameRegister() {
        initComponents();
        jLabelUsernameTaken.setVisible(false);
        S=this;
    }

    private void initComponents() {

        labelUsername = new javax.swing.JLabel();
        labelPassword = new javax.swing.JLabel();
        labelRepeatPassword = new javax.swing.JLabel();
        labelBirthDate = new javax.swing.JLabel();
        labelMail = new javax.swing.JLabel();
        labelRepeatMail = new javax.swing.JLabel();
        fieldUsername = new javax.swing.JTextField();
        fieldMail = new javax.swing.JTextField();
        fieldRepeatMail = new javax.swing.JTextField();
        JButtonRegister = new javax.swing.JButton();
        JButtonExit = new javax.swing.JButton();
        fieldPassword = new javax.swing.JPasswordField();
        fieldRepeatPassword = new javax.swing.JPasswordField();
        jLabelUsernameTaken = new javax.swing.JLabel();
        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        jMenuBar1 = new javax.swing.JMenuBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Biblioteka Online");

        labelUsername.setText("Nazwa Użytkownika");

        labelPassword.setText("Hasło");

        labelRepeatPassword.setText("Powtórz hasło");

        labelBirthDate.setText("Data urodzenia");

        labelMail.setText("e-mail");

        labelRepeatMail.setText("Powtórz e-mail");

        JButtonRegister.setText("Zarejestruj");
        JButtonRegister.setActionCommand("JButtonRegister");
        JButtonRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonRegisterActionPerformed(evt);
            }
        });

        JButtonExit.setText("Cofnij");
        JButtonExit.setActionCommand("JButtonUndo");
        JButtonExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonExitActionPerformed(evt);
            }
        });

        jLabelUsernameTaken.setText("Nazwa użytkownika zajęta");

        jFormattedTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextField1ActionPerformed(evt);
            }
        });
        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(44, 44, 44)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                .addComponent(labelMail)
                                                                .addComponent(labelRepeatPassword)
                                                                .addComponent(labelPassword)
                                                                .addComponent(labelUsername))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(27, 27, 27)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                        .addComponent(labelRepeatMail)
                                                                        .addComponent(labelBirthDate))))
                                                .addGap(50, 50, 50))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(JButtonExit, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabelUsernameTaken, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(fieldUsername)
                                        .addComponent(fieldMail, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE)
                                        .addComponent(fieldRepeatMail)
                                        .addComponent(fieldPassword)
                                        .addComponent(fieldRepeatPassword)
                                        .addComponent(JButtonRegister, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jFormattedTextField1))
                                .addGap(42, 42, 42))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addComponent(jLabelUsernameTaken)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(labelUsername)
                                                .addGap(18, 18, 18)
                                                .addComponent(labelPassword)
                                                .addGap(27, 27, 27)
                                                .addComponent(labelRepeatPassword)
                                                .addGap(22, 22, 22)
                                                .addComponent(labelMail)
                                                .addGap(18, 18, 18)
                                                .addComponent(labelRepeatMail)
                                                .addGap(18, 18, 18)
                                                .addComponent(labelBirthDate))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(fieldUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(fieldPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(fieldRepeatPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(fieldMail, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(fieldRepeatMail, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jFormattedTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(JButtonRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(JButtonExit, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }

    private void JButtonExitActionPerformed(java.awt.event.ActionEvent evt) {
        JFrameRegister.S.setVisible(false);
        JFrameLogin.S.setVisible(true);
    }

    private void jFormattedTextField1ActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private void JButtonRegisterActionPerformed(java.awt.event.ActionEvent evt) {
        String mail=fieldMail.getText();
        boolean at=false;
        boolean dot=false;
        boolean check=true;

        for(int i=0;i<mail.length();i++){
            if(mail.charAt(i)=='.' && at) dot=true;
            if(mail.charAt(i)=='@') at=true;
        }

        if(!at) check=false;
        if(!dot) check=false;

        int reg=ServerConnection.S.Register(fieldUsername.getText(),fieldMail.getText(),new String(fieldPassword.getPassword()),jFormattedTextField1.getText());

        if(fieldUsername.getText().equals(null) || fieldMail.getText().equals(null) || new String(fieldPassword.getPassword()).equals(null) || jFormattedTextField1.getText().equals(null)){
            jLabelUsernameTaken.setText("Uzupełnij wszystkie pola!");
            jLabelUsernameTaken.setVisible(true);
        }
        else if(!check){
            jLabelUsernameTaken.setText("Niepoprawny format adresu email!");
            jLabelUsernameTaken.setVisible(true);
        }
        else if(!new String(fieldPassword.getPassword()).equals(new String(fieldRepeatPassword.getPassword()))) {
            jLabelUsernameTaken.setText("Hasło nie zostało powtórzone poprawnie!");
            jLabelUsernameTaken.setVisible(true);
        }
        else if(!fieldMail.getText().equals(fieldRepeatMail.getText())){
            jLabelUsernameTaken.setText("Adres email nie został powtórzony poprawnie!");
            jLabelUsernameTaken.setVisible(true);
        }
        else if(reg==1)
        {
            jLabelUsernameTaken.setText("Nazwa użytkownika jest zajęta! Użytkownik o podanym adresie email już istnieje!");
            jLabelUsernameTaken.setVisible(true);
        }
        else if(reg==2)
        {
            jLabelUsernameTaken.setText("Nazwa użytkownika jest zajęta!");
            jLabelUsernameTaken.setVisible(true);
        }
        else if(reg==3)
        {
            jLabelUsernameTaken.setText("Użytkownik o podanym adresie email już istnieje!");
            jLabelUsernameTaken.setVisible(true);
        }
        else if(reg==4)
        {
            jLabelUsernameTaken.setText("Niepoprawny format daty!");
            jLabelUsernameTaken.setVisible(true);
        }
        else
        {
            JFrameRegister.S.setVisible(false);
            JFrameLogin.S.setVisible(true);
            jLabelUsernameTaken.setVisible(false);
            fieldUsername.setText(null);
            fieldMail.setText(null);
            fieldPassword.setText(null);
            jFormattedTextField1.setText(null);
        }
    }

    private javax.swing.JButton JButtonExit;
    private javax.swing.JButton JButtonRegister;
    private javax.swing.JTextField fieldMail;
    private javax.swing.JPasswordField fieldPassword;
    private javax.swing.JTextField fieldRepeatMail;
    private javax.swing.JPasswordField fieldRepeatPassword;
    private javax.swing.JTextField fieldUsername;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JLabel jLabelUsernameTaken;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JLabel labelBirthDate;
    private javax.swing.JLabel labelMail;
    private javax.swing.JLabel labelPassword;
    private javax.swing.JLabel labelRepeatMail;
    private javax.swing.JLabel labelRepeatPassword;
    private javax.swing.JLabel labelUsername;
    // End of variables declaration

    public javax.swing.JButton getJButtonExit() {
        return JButtonExit;
    }

    public javax.swing.JButton getJButtonRegister() {
        return JButtonRegister;
    }

    public javax.swing.JTextField getFieldMail() {
        return fieldMail;
    }

    public javax.swing.JPasswordField getFieldPassword() {
        return fieldPassword;
    }

    public javax.swing.JTextField getFieldRepeatMail() {
        return fieldRepeatMail;
    }

    public javax.swing.JPasswordField getFieldRepeatPassword() {
        return fieldRepeatPassword;
    }

    public javax.swing.JTextField getFieldUsername() {
        return fieldUsername;
    }

    public javax.swing.JFormattedTextField getjFormattedTextField1() {
        return jFormattedTextField1;
    }

    public javax.swing.JLabel getjLabelUsernameTaken() {
        return jLabelUsernameTaken;
    }

    public javax.swing.JMenuBar getjMenuBar1() {
        return jMenuBar1;
    }

    public javax.swing.JLabel getLabelBirthDate() {
        return labelBirthDate;
    }

    public javax.swing.JLabel getLabelMail() {
        return labelMail;
    }

    public javax.swing.JLabel getLabelPassword() {
        return labelPassword;
    }

    public javax.swing.JLabel getLabelRepeatMail() {
        return labelRepeatMail;
    }

    public javax.swing.JLabel getLabelRepeatPassword() {
        return labelRepeatPassword;
    }

    public javax.swing.JLabel getLabelUsername() {
        return labelUsername;
    }

    public void setJButtonExit(javax.swing.JButton JButtonExit) {
        this.JButtonExit = JButtonExit;
    }

    public void setJButtonRegister(javax.swing.JButton JButtonRegister) {
        this.JButtonRegister = JButtonRegister;
    }

    public void setFieldMail(javax.swing.JTextField fieldMail) {
        this.fieldMail = fieldMail;
    }

    public void setFieldPassword(javax.swing.JPasswordField fieldPassword) {
        this.fieldPassword = fieldPassword;
    }

    public void setFieldRepeatMail(javax.swing.JTextField fieldRepeatMail) {
        this.fieldRepeatMail = fieldRepeatMail;
    }

    public void setFieldRepeatPassword(javax.swing.JPasswordField fieldRepeatPassword) {
        this.fieldRepeatPassword = fieldRepeatPassword;
    }

    public void setFieldUsername(javax.swing.JTextField fieldUsername) {
        this.fieldUsername = fieldUsername;
    }

    public void setjFormattedTextField1(javax.swing.JFormattedTextField jFormattedTextField1) {
        this.jFormattedTextField1 = jFormattedTextField1;
    }

    public void setjLabelUsernameTaken(javax.swing.JLabel jLabelUsernameTaken) {
        this.jLabelUsernameTaken = jLabelUsernameTaken;
    }

    public void setjMenuBar1(javax.swing.JMenuBar jMenuBar1) {
        this.jMenuBar1 = jMenuBar1;
    }

    public void setLabelBirthDate(javax.swing.JLabel labelBirthDate) {
        this.labelBirthDate = labelBirthDate;
    }

    public void setLabelMail(javax.swing.JLabel labelMail) {
        this.labelMail = labelMail;
    }

    public void setLabelPassword(javax.swing.JLabel labelPassword) {
        this.labelPassword = labelPassword;
    }

    public void setLabelRepeatMail(javax.swing.JLabel labelRepeatMail) {
        this.labelRepeatMail = labelRepeatMail;
    }

    public void setLabelRepeatPassword(javax.swing.JLabel labelRepeatPassword) {
        this.labelRepeatPassword = labelRepeatPassword;
    }

    public void setLabelUsername(javax.swing.JLabel labelUsername) {
        this.labelUsername = labelUsername;
    }
}

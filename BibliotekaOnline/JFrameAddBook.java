public class JFrameAddBook extends javax.swing.JFrame {

    public static JFrameAddBook S;

    public JFrameAddBook() {
        initComponents();
        S=this;
    }

    private void initComponents() {

        jFileChooser1 = new javax.swing.JFileChooser();
        jLabel1 = new javax.swing.JLabel();
        JButtonAddAvatar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaDescription = new javax.swing.JTextArea();
        JButtonAddDescription = new javax.swing.JButton();
        JButtonAddBook = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldTitle = new javax.swing.JTextField();
        jTextFieldAuthor = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldPrice = new javax.swing.JTextField();
        JButtonUploadBook = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Biblioteka Online");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("Resources/tak3.jpg"))); // NOI18N

        JButtonAddAvatar.setText("Dodaj miniaturę");
        JButtonAddAvatar.setActionCommand("JButtonAddAvatar");

        jTextAreaDescription.setColumns(20);
        jTextAreaDescription.setRows(5);
        jTextAreaDescription.setText("Krótki opis rękodziełą, spisanego w trzynastu księgach, gęsim piórem,\nz użyciem atramentu żelaznego");
        jScrollPane1.setViewportView(jTextAreaDescription);

        JButtonAddDescription.setText("Powrót");
        JButtonAddDescription.setActionCommand("JButtonAddDescription");
        JButtonAddDescription.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonAddDescriptionActionPerformed(evt);
            }
        });
        JButtonAddBook.setText("Dodaj książkę");
        JButtonAddBook.setActionCommand("JButtonAddBook");
        JButtonAddBook.addActionListener(new java.awt.event.ActionListener() {
                                             public void actionPerformed(java.awt.event.ActionEvent evt) {
                                                 JButtonAddBookActionPerformed(evt);
                                             }
                                         });

        jLabel2.setText("Tytuł");

        jLabel3.setText("Autor");

        jTextFieldTitle.setText("Trzynastoksiąg");
        jTextFieldTitle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jTextFieldAuthor.setText("Brak");

        jLabel4.setText("Cena");

        jTextFieldPrice.setText("37.50");

        JButtonUploadBook.setText("Wgraj Plik");
        JButtonUploadBook.setActionCommand("JButtonUploadBook");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel2)
                                                        .addComponent(jTextFieldTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel3)
                                                        .addComponent(jTextFieldAuthor)))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(10, 10, 10)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(JButtonAddAvatar)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                                        .addComponent(JButtonUploadBook, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(JButtonAddBook, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addGap(122, 122, 122)
                                                                                .addComponent(JButtonAddDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                                .addComponent(jTextFieldPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                                                .addGap(323, 323, 323)
                                                                                .addComponent(jLabel4)
                                                                                .addGap(23, 23, 23)))))))
                                .addContainerGap(25, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(JButtonAddAvatar))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel2)
                                                        .addComponent(jLabel3))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jTextFieldTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jTextFieldAuthor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(JButtonUploadBook, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(JButtonAddBook)
                                        .addComponent(JButtonAddDescription)
                                        .addComponent(jTextFieldPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>
    private void JButtonAddDescriptionActionPerformed(java.awt.event.ActionEvent evt) {
        JFrameAddBook.S.setVisible(false);
        JFrameAccountPage.S.setVisible(true);
    }
    private void JButtonAddBookActionPerformed(java.awt.event.ActionEvent evt) {

        ServerConnection.S.AddBook(jTextFieldTitle.getText(),jTextFieldAuthor.getText(), jTextFieldAuthor.getText(), jTextAreaDescription.getText(), Float.parseFloat(jTextFieldPrice.getText()));
    }
    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private javax.swing.JButton JButtonAddAvatar;
    private javax.swing.JButton JButtonAddBook;
    private javax.swing.JButton JButtonAddDescription;
    private javax.swing.JButton JButtonUploadBook;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaDescription;
    private javax.swing.JTextField jTextFieldTitle;
    private javax.swing.JTextField jTextFieldAuthor;
    private javax.swing.JTextField jTextFieldPrice;
    // End of variables declaration

    public javax.swing.JButton getJButtonAddAvatar() {
        return JButtonAddAvatar;
    }

    public javax.swing.JButton getJButtonAddBook() {
        return JButtonAddBook;
    }

    public javax.swing.JButton getJButtonAddDescription() {
        return JButtonAddDescription;
    }

    public javax.swing.JButton getJButtonUploadBook() {
        return JButtonUploadBook;
    }

    public javax.swing.JFileChooser getjFileChooser1() {
        return jFileChooser1;
    }

    public javax.swing.JLabel getjLabel1() {
        return jLabel1;
    }

    public javax.swing.JLabel getjLabel2() {
        return jLabel2;
    }

    public javax.swing.JLabel getjLabel3() {
        return jLabel3;
    }

    public javax.swing.JLabel getjLabel4() {
        return jLabel4;
    }

    public javax.swing.JScrollPane getjScrollPane1() {
        return jScrollPane1;
    }

    public javax.swing.JTextArea getjTextAreaDescription() {
        return jTextAreaDescription;
    }

    public javax.swing.JTextField getjTextFieldTitle() {
        return jTextFieldTitle;
    }

    public javax.swing.JTextField getjTextFieldAuthor() {
        return jTextFieldAuthor;
    }

    public javax.swing.JTextField getjTextFieldPrice() {
        return jTextFieldPrice;
    }

    public void setJButtonAddAvatar(javax.swing.JButton JButtonAddAvatar) {
        this.JButtonAddAvatar = JButtonAddAvatar;
    }

    public void setJButtonAddBook(javax.swing.JButton JButtonAddBook) {
        this.JButtonAddBook = JButtonAddBook;
    }

    public void setJButtonAddDescription(javax.swing.JButton JButtonAddDescription) {
        this.JButtonAddDescription = JButtonAddDescription;
    }

    public void setJButtonUploadBook(javax.swing.JButton JButtonUploadBook) {
        this.JButtonUploadBook = JButtonUploadBook;
    }

    public void setjFileChooser1(javax.swing.JFileChooser jFileChooser1) {
        this.jFileChooser1 = jFileChooser1;
    }

    public void setjLabel1(javax.swing.JLabel jLabel1) {
        this.jLabel1 = jLabel1;
    }

    public void setjLabel2(javax.swing.JLabel jLabel2) {
        this.jLabel2 = jLabel2;
    }

    public void setjLabel3(javax.swing.JLabel jLabel3) {
        this.jLabel3 = jLabel3;
    }

    public void setjLabel4(javax.swing.JLabel jLabel4) {
        this.jLabel4 = jLabel4;
    }

    public void setjScrollPane1(javax.swing.JScrollPane jScrollPane1) {
        this.jScrollPane1 = jScrollPane1;
    }

    public void setjTextAreaDescription(javax.swing.JTextArea jTextAreaDescription) {
        this.jTextAreaDescription = jTextAreaDescription;
    }

    public void setjTextFieldTitle(javax.swing.JTextField jTextFieldTitle) {
        this.jTextFieldTitle = jTextFieldTitle;
    }

    public void setjTextFieldAuthor(javax.swing.JTextField jTextFieldAuthor) {
        this.jTextFieldAuthor = jTextFieldAuthor;
    }

    public void setjTextFieldPrice(javax.swing.JTextField jTextFieldPrice) {
        this.jTextFieldPrice = jTextFieldPrice;
    }
}
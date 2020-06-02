
public class JFrameAddComentary extends javax.swing.JFrame {

    public static JFrameAddComentary S;

    public JFrameAddComentary() {
        initComponents();
        S=this;
    }

    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        JButtonAddComentary = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Biblioteka Online");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        JButtonAddComentary.setText("Dodaj komentarz");
        JButtonAddComentary.setActionCommand("JButtonAddComentary");
        JButtonAddComentary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonAddComentaryActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane1)
                                .addContainerGap())
                        .addGroup(layout.createSequentialGroup()
                                .addGap(141, 141, 141)
                                .addComponent(JButtonAddComentary)
                                .addContainerGap(146, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(JButtonAddComentary)
                                .addGap(5, 5, 5))
        );

        pack();
    }

    private void JButtonAddComentaryActionPerformed(java.awt.event.ActionEvent evt) {
        JFrameBookPage.S.setEnabled(true);
        JFrameAddComentary.S.setVisible(false);
        ServerConnection.S.AddReview(Book.S.getTitle(),User.S.getUsername(),(Integer)JFrameBookPage.S.getjSpinner1().getValue());
        JFrameBookPage.S.getOcena().setText(Float.toString(ServerConnection.S.GetOverallRating(Book.S.getTitle())));
        jTextArea1.setText(null);
    }

    private javax.swing.JButton JButtonAddComentary;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;

    public javax.swing.JButton getJButtonAddComentary() {
        return JButtonAddComentary;
    }

    public javax.swing.JScrollPane getjScrollPane1() {
        return jScrollPane1;
    }

    public javax.swing.JTextArea getjTextArea1() {
        return jTextArea1;
    }

    public void setJButtonAddComentary(javax.swing.JButton JButtonAddComentary) {
        this.JButtonAddComentary = JButtonAddComentary;
    }

    public void setjScrollPane1(javax.swing.JScrollPane jScrollPane1) {
        this.jScrollPane1 = jScrollPane1;
    }

    public void setjTextArea1(javax.swing.JTextArea jTextArea1) {
        this.jTextArea1 = jTextArea1;
    }
}

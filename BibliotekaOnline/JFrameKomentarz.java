import javax.swing.*;

public class JFrameKomentarz extends JFrame {

    public static JFrameKomentarz S;

    public JFrameKomentarz() {
        initComponents();
        S=this;
    }

    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        JButtonConfirm = new javax.swing.JButton();
        JButtonHesitate = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Biblioteka Online");

        jLabel1.setText("Czy chcesz dodać komentarz?");

        JButtonConfirm.setText("Tak");
        JButtonConfirm.setActionCommand("JButtonConfirm");
        JButtonConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonConfirmActionPerformed(evt);
            }
        });

        JButtonHesitate.setText("Nie");
        JButtonHesitate.setActionCommand("JButtonHesitate");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(JButtonConfirm)
                                                .addGap(47, 47, 47)
                                                .addComponent(JButtonHesitate))
                                        .addComponent(jLabel1))
                                .addContainerGap(34, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(JButtonConfirm)
                                        .addComponent(JButtonHesitate))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }

    private void JButtonConfirmActionPerformed(java.awt.event.ActionEvent evt) {
        JFrameAddComentary.S.setVisible(true);
        JFrameKomentarz.S.setVisible(false);
    }

    private javax.swing.JButton JButtonConfirm;
    private javax.swing.JButton JButtonHesitate;
    private javax.swing.JLabel jLabel1;

    public javax.swing.JButton getJButtonConfirm() {
        return JButtonConfirm;
    }

    public javax.swing.JButton getJButtonHesitate() {
        return JButtonHesitate;
    }

    public javax.swing.JLabel getjLabel1() {
        return jLabel1;
    }

    public void setJButtonConfirm(javax.swing.JButton JButtonConfirm) {
        this.JButtonConfirm = JButtonConfirm;
    }

    public void setJButtonHesitate(javax.swing.JButton JButtonHesitate) {
        this.JButtonHesitate = JButtonHesitate;
    }

    public void setjLabel1(javax.swing.JLabel jLabel1) {
        this.jLabel1 = jLabel1;
    }
}

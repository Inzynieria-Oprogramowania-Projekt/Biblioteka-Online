import javax.swing.*;

public class JFrameSearch extends JFrame {

    public static JFrameSearch S;

    public JFrameSearch() {
        initComponents();
        S=this;
    }

    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        JTextFieldSearch = new javax.swing.JTextField();
        JButtonSearch = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        JMenuItemAccPage = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Biblioteka Online");

        JTextFieldSearch.setText("Wyszukaj");
        JTextFieldSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTextFieldSearchActionPerformed(evt);
            }
        });

        JButtonSearch.setText("Wyszukaj");
        JButtonSearch.setActionCommand("JButtonSearch");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null}
                },
                new String [] {
                        "Title 1", "Title 2", "Title 3", "Title 4"
                }
        ));
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setText("Brak wyników wyszukiwania");

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("Wyszukuj po tytule");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("Wyszukuj po autorze");

        jMenu1.setText("File");
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        JMenuItemAccPage.setText("Strona Konta");
        JMenuItemAccPage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMenuItemAccPageActionPerformed(evt);
            }
        });
        jMenu1.add(JMenuItemAccPage);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(jScrollPane1))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(90, 90, 90)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jLabel1)
                                                                .addGap(0, 0, Short.MAX_VALUE))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(JTextFieldSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(26, 26, 26)
                                                                .addComponent(JButtonSearch)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jRadioButton1)
                                                                        .addComponent(jRadioButton2))
                                                                .addGap(9, 9, 9)))))
                                .addContainerGap())
                        .addComponent(jSeparator1)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(jRadioButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(JTextFieldSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(JButtonSearch)
                                        .addComponent(jRadioButton2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }

    private void JTextFieldSearchActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private void JMenuItemAccPageActionPerformed(java.awt.event.ActionEvent evt) {
        JFrameAccountPage.S.setVisible(true);
        JFrameSearch.S.setVisible(false);
    }

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private javax.swing.JButton JButtonSearch;
    private javax.swing.JMenuItem JMenuItemAccPage;
    private javax.swing.JTextField JTextFieldSearch;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;

    public javax.swing.JButton getJButtonSearch() {
        return JButtonSearch;
    }

    public javax.swing.JTextField getJTextFieldSearch() {
        return JTextFieldSearch;
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

    public javax.swing.JMenuItem getJMenuItemAccPage() {
        return JMenuItemAccPage;
    }

    public javax.swing.JScrollPane getjScrollPane1() {
        return jScrollPane1;
    }

    public javax.swing.JSeparator getjSeparator1() {
        return jSeparator1;
    }

    public javax.swing.JTable getjTable1() {
        return jTable1;
    }

    public void setJButtonSearch(javax.swing.JButton JButtonSearch) {
        this.JButtonSearch = JButtonSearch;
    }

    public void setJTextFieldSearch(javax.swing.JTextField JTextFieldSearch) {
        this.JTextFieldSearch = JTextFieldSearch;
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

    public void setJMenuItemAccPage(javax.swing.JMenuItem JMenuItemAccPage) {
        this.JMenuItemAccPage = JMenuItemAccPage;
    }

    public void setjScrollPane1(javax.swing.JScrollPane jScrollPane1) {
        this.jScrollPane1 = jScrollPane1;
    }

    public void setjSeparator1(javax.swing.JSeparator jSeparator1) {
        this.jSeparator1 = jSeparator1;
    }

    public void setjTable1(javax.swing.JTable jTable1) {
        this.jTable1 = jTable1;
    }
}

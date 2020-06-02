import javax.swing.*;
import java.util.ArrayList;

public class JFrameSearch extends javax.swing.JFrame {

    public static JFrameSearch S;

    public JFrameSearch() {
        initComponents();
        jLabel1.setVisible(false);
        S=this;
    }

    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        JTextFieldSearch = new javax.swing.JTextField();
        JButtonSearch = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        JButtonSelect = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        JMenuItemAccPage = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Biblioteka Online");

        JTextFieldSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTextFieldSearchActionPerformed(evt);
            }
        });

        JButtonSearch.setText("Wyszukaj");
        JButtonSearch.setActionCommand("JButtonSearch");
        JButtonSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonSearchActionPerformed(evt);
            }
        });

        jList1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        jScrollPane1.setViewportView(jList1);

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

        JButtonSelect.setText("Wybierz");
        JButtonSelect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonSelectActionPerformed(evt);
            }
        });

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
                                .addGap(90, 90, 90)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel1)
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(JTextFieldSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(26, 26, 26)
                                                .addComponent(JButtonSearch)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jRadioButton1)
                                                        .addComponent(jRadioButton2))
                                                .addGap(19, 19, 19))))
                        .addComponent(jSeparator1)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 625, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(JButtonSelect)
                                .addGap(0, 0, Short.MAX_VALUE))
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
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                                .addContainerGap())
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(65, 65, 65)
                                                .addComponent(JButtonSelect)
                                                .addContainerGap(68, Short.MAX_VALUE))))
        );

        pack();
    }

    private void JTextFieldSearchActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private void JMenuItemAccPageActionPerformed(java.awt.event.ActionEvent evt) {
        JFrameAccountPage.S.getjLabel2().setText(User.S.getUsername());
        JFrameAccountPage.S.getjLabel3().setText("- "+ServerConnection.S.GetUsersBalance(User.S.getUsername())+" zł");

        JFrameAccountPage.S.owned=ServerConnection.S.GetUsersBooks(User.S.getUsername());
        String[] lista=new String[JFrameAccountPage.S.owned.size()/3];

        for(int i=0;i<lista.length;i+=3){
            lista[i]=JFrameAccountPage.S.owned.get(i)+" - "+JFrameAccountPage.S.owned.get(i+1)+" "+JFrameAccountPage.S.owned.get(i+2);
        }

        DefaultListModel def=new DefaultListModel();
        for(int i=0;i<lista.length;i++) def.addElement(lista[i]);
        JFrameAccountPage.S.jList1.setModel(def);
        JFrameAccountPage.S.setVisible(true);
        JFrameSearch.S.setVisible(false);
    }

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private void JButtonSelectActionPerformed(java.awt.event.ActionEvent evt) {
        if(!jList1.isSelectionEmpty()) {
            Book.S=new Book(books.get(4*jList1.getSelectedIndex()), books.get(4*jList1.getSelectedIndex()+1), books.get(4*jList1.getSelectedIndex()+2), Float.parseFloat(books.get(4*jList1.getSelectedIndex()+3)));

            JFrameBookPage.S.getOcena().setText(Float.toString(ServerConnection.S.GetOverallRating(Book.S.getTitle())));
            JFrameBookPage.S.getjLabel5().setText(Book.S.getTitle());
            JFrameBookPage.S.getjLabel6().setText(Book.S.getAuthor_name()+" "+Book.S.getAuthor_surname());
            JFrameBookPage.S.getjLabel7().setText(ServerConnection.S.GetBookPrice(Book.S.getTitle())+" zł");
            JFrameBookPage.S.getjTextArea1().setText(ServerConnection.S.GetBookDesc(Book.S.getTitle()));
            JFrameSearch.S.setVisible(false);
            JFrameBookPage.S.setVisible(true);
        }
    }

    private void JButtonSearchActionPerformed(java.awt.event.ActionEvent evt){
        if(!(!jRadioButton1.isSelected() && !jRadioButton2.isSelected())) {
            if (jRadioButton1.isSelected()) {
                books = ServerConnection.S.SearchByTitle(JTextFieldSearch.getText());
            } else if (jRadioButton2.isSelected()) {
                books = ServerConnection.S.SearchByAuthorsSurname(JTextFieldSearch.getText());
            }

            String[] lista = new String[books.size() / 4];

            for (int i = 0; i < books.size(); i += 4) {
                lista[i] = books.get(i) + " - " + books.get(i + 1) + " " + books.get(i + 2) + " - " + books.get(i + 3) + " zł";
            }

            DefaultListModel def=new DefaultListModel();
            for(int i=0;i<lista.length;i++) def.addElement(lista[i]);
            jList1.setModel(def);
        }
    }


    private ArrayList<String> books;
    private javax.swing.JButton JButtonSearch;
    private javax.swing.JButton JButtonSelect;
    private javax.swing.JMenuItem JMenuItemAccPage;
    private javax.swing.JTextField JTextFieldSearch;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JList<String> jList1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration

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


}

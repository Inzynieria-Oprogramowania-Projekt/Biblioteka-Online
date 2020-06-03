import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfReader;
import com.itextpdf.kernel.pdf.canvas.parser.PdfTextExtractor;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class JFrameAccountPage extends javax.swing.JFrame {

    public static JFrameAccountPage S;

    public JFrameAccountPage() {
        initComponents();
        S=this;
    }


    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        JButtonCart = new javax.swing.JButton();
        JButtonLogout = new javax.swing.JButton();
        JButtonCharge = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jPasswordField2 = new javax.swing.JPasswordField();
        jLabel11 = new javax.swing.JLabel();
        jPasswordField3 = new javax.swing.JPasswordField();
        JButtonChangePassword = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jLabel4 = new javax.swing.JLabel();
        JButtonRead = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        JButtonAddBook = new javax.swing.JButton();
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Biblioteka Online");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("Resources/rsz_userimage.png"))); // NOI18N
        jLabel1.setText("Tutaj będzie obrazek");

        jLabel2.setText("Administrator");

        jLabel3.setText("37,50 zł ");

        JButtonCart.setText("Koszyk");
        JButtonCart.setActionCommand("JButtonCart");
        JButtonCart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonCartActionPerformed(evt);
            }
        });

        JButtonLogout.setText("Wyloguj");
        JButtonLogout.setActionCommand("JButtonLogout");
        JButtonLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonLogoutActionPerformed(evt);
            }
        });

        JButtonCharge.setText("Doładuj");
        JButtonCharge.setActionCommand("JButtonCharge");
        JButtonCharge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonChargeActionPerformed(evt);
            }
        });

        jLabel5.setText("Stan konta");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addGap(30, 30, 30)
                                                        .addComponent(jLabel2))
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addContainerGap()
                                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addComponent(jLabel5)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(jLabel3))
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGap(10, 10, 10)
                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(JButtonCart)
                                                                        .addComponent(JButtonCharge)
                                                                        .addComponent(JButtonLogout))
                                                                .addGap(0, 0, Short.MAX_VALUE)))))
                                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(JButtonCharge)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(JButtonCart)
                                .addGap(18, 18, 18)
                                .addComponent(JButtonLogout)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel8.setText("Zmiana hasła");

        jLabel9.setText("Podaj bieżące hasło");

        jLabel10.setText("Podaj nowe hasło");

        jLabel11.setText("Powtórz nowe hasło");

        JButtonChangePassword.setText("Zmień Hasło");
        JButtonChangePassword.setActionCommand("JButtonChangePassword");
        JButtonChangePassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonChangePasswordActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel9)
                                                        .addComponent(jLabel10)
                                                        .addComponent(jLabel8))
                                                .addContainerGap(84, Short.MAX_VALUE))
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(jLabel11)
                                                        .addComponent(JButtonChangePassword)
                                                        .addComponent(jPasswordField1, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                                                        .addComponent(jPasswordField2)
                                                        .addComponent(jPasswordField3))
                                                .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(29, 29, 29)
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jPasswordField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jPasswordField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(JButtonChangePassword)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jList1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane2.setViewportView(jList1);

        jLabel4.setText("Lista posiadanych książek");

        JButtonRead.setText("Czytaj");
        JButtonRead.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonReadActionPerformed(evt);
            }
        });

        jMenu1.setText("File");

        jMenuItem1.setText("Wyszukiwanie");
        jMenuItem1.setActionCommand("JButtonSearch");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        JButtonAddBook.setText("Dodaj książkę");
        JButtonAddBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonAddBookActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap(62, Short.MAX_VALUE)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel4)))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(48, 48, 48)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(JButtonAddBook)
                                                        .addComponent(JButtonRead))))
                                .addContainerGap(11, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(jLabel4)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(JButtonRead)
                                                .addGap(18, 18, 18)
                                                .addComponent(JButtonAddBook)
                                                .addGap(0, 0, Short.MAX_VALUE)))
                                .addContainerGap())
        );

        pack();
    }

    private void JButtonAddBookActionPerformed(ActionEvent evt) {
        JFrameAddBook.S.setVisible(true);
        JFrameAccountPage.S.setVisible(false);
    }

    private void JButtonCartActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private void JButtonChangePasswordActionPerformed(java.awt.event.ActionEvent evt) {
        if (ServerConnection.S.CheckPassword(new String(jPasswordField1.getPassword()), User.S.getUsername()) && new String(jPasswordField2.getPassword()).equals(new String(jPasswordField3.getPassword()))) {
            ServerConnection.S.ChangePassword(User.S.getUsername(), new String(jPasswordField2.getPassword()));
            jPasswordField1.setText(null);
            jPasswordField2.setText(null);
            jPasswordField3.setText(null);
        }
    }

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {
        jPasswordField1.setText(null);
        jPasswordField2.setText(null);
        jPasswordField3.setText(null);
        JFrameSearch.S.setVisible(true);
        JFrameAccountPage.S.setVisible(false);
    }

    private void JButtonLogoutActionPerformed(java.awt.event.ActionEvent evt) {
        jPasswordField1.setText(null);
        jPasswordField2.setText(null);
        jPasswordField3.setText(null);
        JFrameLogin.S.setVisible(true);
        JFrameAccountPage.S.setVisible(false);
    }

    private void JButtonChargeActionPerformed(java.awt.event.ActionEvent evt){
        ServerConnection.S.ChangeUsersBalance(User.S.getUsername(), 10f);
        jLabel3.setText("- "+ServerConnection.S.GetUsersBalance(User.S.getUsername())+" zł");
    }

    private void JButtonReadActionPerformed(java.awt.event.ActionEvent evt) {
        if(!jList1.isSelectionEmpty()) {
            Book.S=new Book(owned.get(3*jList1.getSelectedIndex()), owned.get(3*jList1.getSelectedIndex()+1), owned.get(3*jList1.getSelectedIndex()+2),0f);

            try {
                JFrameReading.S.setBook(new PdfDocument(new PdfReader(new File("Resources/"+Book.S.getTitle() + "-" + Book.S.getAuthor_name() + "_" + Book.S.getAuthor_surname()+".pdf"))));
            } catch(IOException e){e.printStackTrace();}

            JFrameReading.S.getjLabel1().setText(PdfTextExtractor.getTextFromPage(JFrameReading.S.getBook().getPage(1)));
            JFrameReading.S.setPage_nr(1);
            JFrameAccountPage.S.setVisible(false);
            JFrameReading.S.setVisible(true);
        }
    }

    public ArrayList<String> owned;
    private javax.swing.JButton JButtonCart;
    private javax.swing.JButton JButtonChangePassword;
    private javax.swing.JButton JButtonCharge;
    private javax.swing.JButton JButtonLogout;
    private javax.swing.JButton JButtonRead;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    public javax.swing.JList<String> jList1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JPasswordField jPasswordField3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton JButtonAddBook;
    // End of variables declaration

    public javax.swing.JButton getJButtonCart() {
        return JButtonCart;
    }

    public javax.swing.JButton getJButtonChangePassword() {
        return JButtonChangePassword;
    }

    public javax.swing.JButton getJButtonCharge() {
        return JButtonCharge;
    }

    public javax.swing.JButton getJButtonLogout() {
        return JButtonLogout;
    }

    public javax.swing.JLabel getjLabel1() {
        return jLabel1;
    }

    public javax.swing.JLabel getjLabel10() {
        return jLabel10;
    }

    public javax.swing.JLabel getjLabel11() {
        return jLabel11;
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

    public javax.swing.JLabel getjLabel5() {
        return jLabel5;
    }

    public javax.swing.JLabel getjLabel8() {
        return jLabel8;
    }

    public javax.swing.JLabel getjLabel9() {
        return jLabel9;
    }

    public javax.swing.JMenu getjMenu1() {
        return jMenu1;
    }

    public javax.swing.JMenuBar getjMenuBar1() {
        return jMenuBar1;
    }

    public javax.swing.JMenuItem getjMenuItem1() {
        return jMenuItem1;
    }

    public javax.swing.JPanel getjPanel1() {
        return jPanel1;
    }

    public javax.swing.JPanel getjPanel2() {
        return jPanel2;
    }

    public javax.swing.JPasswordField getjPasswordField1() {
        return jPasswordField1;
    }

    public javax.swing.JPasswordField getjPasswordField2() {
        return jPasswordField2;
    }

    public javax.swing.JPasswordField getjPasswordField3() {
        return jPasswordField3;
    }

    public javax.swing.JScrollPane getjScrollPane2() {
        return jScrollPane2;
    }

    public void setJButtonCart(javax.swing.JButton JButtonCart) {
        this.JButtonCart = JButtonCart;
    }

    public void setJButtonChangePassword(javax.swing.JButton JButtonChangePassword) {
        this.JButtonChangePassword = JButtonChangePassword;
    }

    public void setJButtonCharge(javax.swing.JButton JButtonCharge) {
        this.JButtonCharge = JButtonCharge;
    }

    public void setJButtonLogout(javax.swing.JButton JButtonLogout) {
        this.JButtonLogout = JButtonLogout;
    }

    public void setjLabel1(javax.swing.JLabel jLabel1) {
        this.jLabel1 = jLabel1;
    }

    public void setjLabel10(javax.swing.JLabel jLabel10) {
        this.jLabel10 = jLabel10;
    }

    public void setjLabel11(javax.swing.JLabel jLabel11) {
        this.jLabel11 = jLabel11;
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

    public void setjLabel5(javax.swing.JLabel jLabel5) {
        this.jLabel5 = jLabel5;
    }

    public void setjLabel8(javax.swing.JLabel jLabel8) {
        this.jLabel8 = jLabel8;
    }

    public void setjLabel9(javax.swing.JLabel jLabel9) {
        this.jLabel9 = jLabel9;
    }

    public void setjMenu1(javax.swing.JMenu jMenu1) {
        this.jMenu1 = jMenu1;
    }

    public void setjMenuBar1(javax.swing.JMenuBar jMenuBar1) {
        this.jMenuBar1 = jMenuBar1;
    }

    public void setjMenuItem1(javax.swing.JMenuItem jMenuItem1) {
        this.jMenuItem1 = jMenuItem1;
    }

    public void setjPanel1(javax.swing.JPanel jPanel1) {
        this.jPanel1 = jPanel1;
    }

    public void setjPanel2(javax.swing.JPanel jPanel2) {
        this.jPanel2 = jPanel2;
    }

    public void setjPasswordField1(javax.swing.JPasswordField jPasswordField1) {
        this.jPasswordField1 = jPasswordField1;
    }

    public void setjPasswordField2(javax.swing.JPasswordField jPasswordField2) {
        this.jPasswordField2 = jPasswordField2;
    }

    public void setjPasswordField3(javax.swing.JPasswordField jPasswordField3) {
        this.jPasswordField3 = jPasswordField3;
    }

    public void setjScrollPane2(javax.swing.JScrollPane jScrollPane2) {
        this.jScrollPane2 = jScrollPane2;
    }

}

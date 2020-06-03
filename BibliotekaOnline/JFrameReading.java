import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.canvas.parser.PdfTextExtractor;

import javax.swing.*;
import java.awt.*;

public class JFrameReading extends javax.swing.JFrame {

    public static JFrameReading S;
    public JFrameReading() {
        initComponents();
        JButtonNextPage.setVisible(true);
        JButtonUndo.setText("Powrót");
        jLabel1.setMaximumSize(new Dimension(300,400));
        jLabel1.setMinimumSize(new Dimension(0,0));
        jLabel1.setLineWrap(true);
        S=this;
    }

    private void initComponents() {

        jLabel1 = new javax.swing.JTextArea();
        JButtonForwardPage = new javax.swing.JButton();
        JButtonNextPage = new javax.swing.JButton();
        JButtonUndo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("jLabel1");

        JButtonForwardPage.setText("Poprzednia strona");
        JButtonForwardPage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonForwardPageActionPerformed(evt);
            }
        });

        JButtonNextPage.setText("Następna strona");
        JButtonNextPage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonNextPageActionPerformed(evt);
            }
        });

        JButtonUndo.setText("Powrót");
        JButtonUndo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonUndoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(JButtonUndo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(JButtonForwardPage, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                                                .addComponent(JButtonNextPage, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 469, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(JButtonNextPage, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(JButtonForwardPage, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(JButtonUndo, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                                .addContainerGap())
        );

        pack();
    }

    private void JButtonForwardPageActionPerformed(java.awt.event.ActionEvent evt) {
        if(page_nr-1>0){
            page_nr--;
            JFrameReading.S.getjLabel1().setText(PdfTextExtractor.getTextFromPage(JFrameReading.S.getBook().getPage(page_nr)));
        }
    }

    private void JButtonNextPageActionPerformed(java.awt.event.ActionEvent evt) {
        if(page_nr+1<=book.getNumberOfPages()){
            page_nr++;
            JFrameReading.S.getjLabel1().setText(PdfTextExtractor.getTextFromPage(JFrameReading.S.getBook().getPage(page_nr)));
        }
    }

    private void JButtonUndoActionPerformed(java.awt.event.ActionEvent evt) {
        page_nr=1;
        book.close();
        JFrameAccountPage.S.setVisible(true);
        JFrameReading.S.setVisible(false);
    }

    private PdfDocument book;
    private int page_nr;
    private javax.swing.JButton JButtonForwardPage;
    private javax.swing.JButton JButtonNextPage;
    private javax.swing.JButton JButtonUndo;
    private JTextArea jLabel1;

    public PdfDocument getBook(){return book;}
    public void setBook(PdfDocument p){book=p;}

    public int getPage_nr(){return page_nr;}
    public void setPage_nr(int a){page_nr=a;}

    public JTextArea getjLabel1(){return jLabel1;}
}

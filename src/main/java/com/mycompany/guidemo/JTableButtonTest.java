/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.guidemo;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.*;

/**
 *
 * @author bgabr
 */
class JTableButtonTest extends JFrame {
    
  private JTable table;
   private JScrollPane scrollPane;
   public JTableButtonTest() {
      setTitle("JTableButton Test");
      TableCellRenderer tableRenderer;
      JTableButtonModel model = new JTableButtonModel();
      table = new JTable(model);
      tableRenderer = table.getDefaultRenderer(JButton.class);
      table.setDefaultRenderer(JButton.class, new JTableButtonRenderer(tableRenderer));
      scrollPane = new JScrollPane(table);
      add(scrollPane, BorderLayout.CENTER);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setLocationRelativeTo(null);
      setSize(400, 450);
      setVisible(true);
   }
   public static void main(String[] args) {
      new JTableButtonTest();
   }
}

class JTableButtonRenderer implements TableCellRenderer {
   private TableCellRenderer defaultRenderer;
   public JTableButtonRenderer(TableCellRenderer renderer) {
      defaultRenderer = renderer;
   }
   public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
      if(value instanceof Component)
         return (Component)value;
         return defaultRenderer.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
   }
}
class JTableButtonModel extends AbstractTableModel {
    JButton wybierz = new JButton("Wybierz");
   private Object[][] rows = {{"Jan Fran","Praktyczne zastosowanie łyżeczki do herbaty", wybierz},{"Button2","Praktyczne", wybierz},{"Button3","Praktyczne", wybierz}, {"Button4","Praktyczne", wybierz}};
   private String[] columns = {"Autor","Tytuł", "Buttons"};
   public String getColumnName(int column) {
      return columns[column];
   }
   public int getRowCount() {
      return rows.length;
   }
   public int getColumnCount() {
      return columns.length;
   }
  
   public Object getValueAt(int row, int column) {
      return rows[row][column];
   }

   public boolean isCellEditable(int row, int column) {
      return false;
   }
   public Class getColumnClass(int column) {
      return getValueAt(0, column).getClass();
   }
}
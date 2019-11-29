/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import dbmanager.WordDatabaseManager;
import java.awt.Toolkit;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Magnit
 */
public class ConfigurationFrame extends javax.swing.JFrame {

    /**
     * Creates new form ConfigurationFrame
     */
    WordDatabaseManager wordDatabaseManager = new WordDatabaseManager();
    DefaultTableModel model;
    
    public ConfigurationFrame() {
        super("Configuration");
        initComponents();
        model = wordDatabaseManager.getModel();
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("language.png")));
        searchInTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableWord = new javax.swing.JTable();
        buttonEdit = new javax.swing.JButton();
        buttonDelete = new javax.swing.JButton();
        buttonBack = new javax.swing.JButton();
        textFieldSearch = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        tableWord.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tableWord.setModel(wordDatabaseManager.getModel());
        tableWord.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tableWord.setRowHeight(20);
        jScrollPane1.setViewportView(tableWord);

        buttonEdit.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        buttonEdit.setForeground(new java.awt.Color(0, 204, 0));
        buttonEdit.setIcon(new javax.swing.ImageIcon("C:\\Users\\Magnit\\Downloads\\edit.png")); // NOI18N
        buttonEdit.setText("Edit word");
        buttonEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEditActionPerformed(evt);
            }
        });

        buttonDelete.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        buttonDelete.setForeground(new java.awt.Color(204, 0, 0));
        buttonDelete.setIcon(new javax.swing.ImageIcon("C:\\Users\\Magnit\\Downloads\\delete.png")); // NOI18N
        buttonDelete.setText("Delete word");
        buttonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonDeleteActionPerformed(evt);
            }
        });

        buttonBack.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        buttonBack.setIcon(new javax.swing.ImageIcon("C:\\Users\\Magnit\\Downloads\\left-arrow.png")); // NOI18N
        buttonBack.setText("Back");
        buttonBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonBackActionPerformed(evt);
            }
        });

        textFieldSearch.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        textFieldSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textFieldSearchKeyTyped(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        jLabel1.setText("Search in table:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 562, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(buttonBack)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(3, 3, 3)
                                .addComponent(textFieldSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(buttonEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77)
                .addComponent(buttonDelete)
                .addGap(82, 82, 82))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textFieldSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(buttonBack, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonDeleteActionPerformed
        
        try {
            String id = tableWord.getValueAt(tableWord.getSelectedRow(), 0).toString();
            int input = JOptionPane.showConfirmDialog(null, "The word will be deleted!", "Warning", JOptionPane.WARNING_MESSAGE);
            if (input == 0) {
                wordDatabaseManager.deleteWord(Integer.parseInt(id));
                new ConfigurationFrame().setVisible(true);
                dispose();
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Please select word to delete");
        }
        //refreshTable();

    }//GEN-LAST:event_buttonDeleteActionPerformed

    private void buttonEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEditActionPerformed
        // TODO add your handling code here:
        try {
            String id = tableWord.getValueAt(tableWord.getSelectedRow(), 0).toString();
            new addAndEditFrame(id).setVisible(true);
            dispose();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(rootPane, "Please select word to edit");
        }
    }//GEN-LAST:event_buttonEditActionPerformed

    private void buttonBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonBackActionPerformed
        // TODO add your handling code here:
        new MainFrame().setVisible(true);
        dispose();
    }//GEN-LAST:event_buttonBackActionPerformed

    private void textFieldSearchKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textFieldSearchKeyTyped
        // TODO add your handling code here:
        String text = textFieldSearch.getText();
        try {
            if (text.matches("/^[0-9A-Za-z\\s\\-]+$/")) {
                evt.consume();
            }
        } catch (Exception ex) {
        }
    }//GEN-LAST:event_textFieldSearchKeyTyped

//    private void refreshTable() {
//        for (int i = tableWord.getRowCount() - 1; i > 0; i--) {
//            model.removeRow(i);
//        }
//        model = wordDatabaseManager.getModel();
//        //tableWord.setModel(model);
//    }
    private void searchInTable() {
        TableRowSorter<TableModel> rowSorter = new TableRowSorter<>(model);
        tableWord.setRowSorter(rowSorter);
        textFieldSearch.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                String text = textFieldSearch.getText();
                
                if (text.trim().length() == 0) {
                    rowSorter.setRowFilter(null);
                } else {
                    try {
                        rowSorter.setRowFilter(RowFilter.regexFilter("(?i)" + text.toLowerCase()));
                    } catch (Exception ex) {
                    }
                    
                }
            }
            
            @Override
            public void removeUpdate(DocumentEvent e) {
                String text = textFieldSearch.getText();
                
                if (text.trim().length() == 0) {
                    rowSorter.setRowFilter(null);
                } else {
                    try {
                        rowSorter.setRowFilter(RowFilter.regexFilter("(?i)" + text.toLowerCase()));
                    } catch (Exception ex) {
                    }
                }
            }
            
            @Override
            public void changedUpdate(DocumentEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonBack;
    private javax.swing.JButton buttonDelete;
    private javax.swing.JButton buttonEdit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableWord;
    private javax.swing.JTextField textFieldSearch;
    // End of variables declaration//GEN-END:variables
}

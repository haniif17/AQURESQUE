/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package aquresque;

import javax.swing.table.DefaultTableModel;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author ACER
 */
public class GudangPage extends javax.swing.JFrame {

    /**
     * Creates new form GudangPage
     */
    public GudangPage() {
        initComponents();
        loadTableData();
    }
    
    private void loadTableData() {
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("ID");
        model.addColumn("Kode Barang");
        model.addColumn("Jenis Barang");
        model.addColumn("Nama Barang");
        model.addColumn("Jumlah");
        model.addColumn("Satuan");
        model.addColumn("Status");

        try {
            ResultSet rs = DatabaseController.getAllBantuan();
            while (rs.next()) {
                model.addRow(new Object[]{
                    rs.getInt("id"),
                    rs.getString("kode_brg"),
                    rs.getString("jenis_brg"),
                    rs.getString("nama_brg"),
                    rs.getInt("jumlah"),
                    rs.getString("satuan"),
                    rs.getString("status")
                });
            }
            tbl_dataGdg.setModel(model);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Gagal memuat data: " + e.getMessage());
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lbl_userGudang = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btn_tambahBrg = new javax.swing.JButton();
        btn_editBrg = new javax.swing.JButton();
        btn_hapusBrg = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_dataGdg = new javax.swing.JTable();
        btn_cariBrg = new javax.swing.JButton();
        tf_cariBrg = new javax.swing.JTextField();
        btn_refreshTable = new javax.swing.JButton();
        btn_kembaliMain = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aquresque/aquresquelogo.png"))); // NOI18N
        jLabel1.setText("jLabel1");

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel2.setText("Hai,");

        lbl_userGudang.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        lbl_userGudang.setText("User");

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel3.setText("Berikut tentang Gudang");

        btn_tambahBrg.setBackground(new java.awt.Color(56, 142, 60));
        btn_tambahBrg.setForeground(new java.awt.Color(255, 255, 255));
        btn_tambahBrg.setText("TAMBAH BARANG");
        btn_tambahBrg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_tambahBrgActionPerformed(evt);
            }
        });

        btn_editBrg.setBackground(new java.awt.Color(117, 117, 117));
        btn_editBrg.setForeground(new java.awt.Color(255, 255, 255));
        btn_editBrg.setText("EDIT BARANG");
        btn_editBrg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editBrgActionPerformed(evt);
            }
        });

        btn_hapusBrg.setBackground(new java.awt.Color(121, 85, 72));
        btn_hapusBrg.setForeground(new java.awt.Color(255, 255, 255));
        btn_hapusBrg.setText("HAPUS BARANG");
        btn_hapusBrg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_hapusBrgActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(13, 71, 161));

        jLabel4.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel4.setText("Data Gudang");

        tbl_dataGdg.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "KODE BRG", "JENIS BRG", "NAMA BRG", "JUMLAH", "SATUAN"
            }
        ));
        jScrollPane1.setViewportView(tbl_dataGdg);

        btn_cariBrg.setBackground(new java.awt.Color(51, 51, 0));
        btn_cariBrg.setText("CARI");
        btn_cariBrg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cariBrgActionPerformed(evt);
            }
        });

        tf_cariBrg.setBackground(new java.awt.Color(13, 71, 161));
        tf_cariBrg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_cariBrgActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 498, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tf_cariBrg, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_cariBrg)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(btn_cariBrg)
                    .addComponent(tf_cariBrg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btn_refreshTable.setBackground(new java.awt.Color(204, 255, 0));
        btn_refreshTable.setForeground(new java.awt.Color(255, 255, 255));
        btn_refreshTable.setText("REFRESH BARANG");
        btn_refreshTable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_refreshTableActionPerformed(evt);
            }
        });

        btn_kembaliMain.setBackground(new java.awt.Color(51, 51, 0));
        btn_kembaliMain.setForeground(new java.awt.Color(255, 255, 255));
        btn_kembaliMain.setText("KEMBALI");
        btn_kembaliMain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_kembaliMainActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbl_userGudang))
                    .addComponent(btn_tambahBrg, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_editBrg, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_hapusBrg, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_refreshTable, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_kembaliMain, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(lbl_userGudang))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addGap(32, 32, 32)
                        .addComponent(btn_tambahBrg, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_editBrg, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_hapusBrg, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(59, 59, 59)
                        .addComponent(btn_refreshTable, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(59, 59, 59)
                        .addComponent(btn_kembaliMain, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_tambahBrgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_tambahBrgActionPerformed
        // TODO add your handling code here: 
        TambahBarangDialog tambahDialog = new TambahBarangDialog();
        tambahDialog.setVisible(true);
    }//GEN-LAST:event_btn_tambahBrgActionPerformed

    private void btn_editBrgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editBrgActionPerformed
        // TODO add your handling code here:
        EditBarangDialog editDialog = new EditBarangDialog();
        editDialog.setVisible(true);
    }//GEN-LAST:event_btn_editBrgActionPerformed

    private void btn_hapusBrgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_hapusBrgActionPerformed
        // TODO add your handling code here:
        HapusBarangDialog hapusDialog = new HapusBarangDialog();
        hapusDialog.setVisible(true);
    }//GEN-LAST:event_btn_hapusBrgActionPerformed

    private void btn_refreshTableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_refreshTableActionPerformed
        // TODO add your handling code here:
        loadTableData();
        JOptionPane.showMessageDialog(this, "Tabel telah diperbarui.");
    }//GEN-LAST:event_btn_refreshTableActionPerformed

    private void btn_kembaliMainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_kembaliMainActionPerformed
        // TODO add your handling code here:
        MainFrame mainFrame = new MainFrame();
        mainFrame.setVisible(true);
    }//GEN-LAST:event_btn_kembaliMainActionPerformed

    private void tf_cariBrgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_cariBrgActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_cariBrgActionPerformed

    private void btn_cariBrgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cariBrgActionPerformed
        // TODO add your handling code here:
        String keyword = tf_cariBrg.getText();

        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("ID");
        model.addColumn("Kode Barang");
        model.addColumn("Jenis Barang");
        model.addColumn("Nama Barang");
        model.addColumn("Jumlah");
        model.addColumn("Satuan");
        model.addColumn("Status");

        try {
            ResultSet rs = DatabaseController.searchBarang(keyword);

            while (rs.next()) {
                model.addRow(new Object[]{
                    rs.getInt("id"),
                    rs.getString("kode_brg"),
                    rs.getString("jenis_brg"),
                    rs.getString("nama_brg"),
                    rs.getInt("jumlah"),
                    rs.getString("satuan"),
                    rs.getString("status")
                });
            }

            tbl_dataGdg.setModel(model);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Gagal menampilkan hasil pencarian: " + e.getMessage());
        }
    }//GEN-LAST:event_btn_cariBrgActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GudangPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GudangPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GudangPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GudangPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GudangPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cariBrg;
    private javax.swing.JButton btn_editBrg;
    private javax.swing.JButton btn_hapusBrg;
    private javax.swing.JButton btn_kembaliMain;
    private javax.swing.JButton btn_refreshTable;
    private javax.swing.JButton btn_tambahBrg;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_userGudang;
    private javax.swing.JTable tbl_dataGdg;
    private javax.swing.JTextField tf_cariBrg;
    // End of variables declaration//GEN-END:variables
}

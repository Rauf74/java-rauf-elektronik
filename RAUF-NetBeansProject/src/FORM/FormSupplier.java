/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package FORM;
import ClassDatabase.ClassDatabase;
//import com.mysql.cj.jdbc.PreparedStatementWrapper;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
//import java.text.DecimalFormat;
import javax.swing.JOptionPane;
//import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;
/**
 *
 * @author alfar
 */
public class FormSupplier extends javax.swing.JInternalFrame {

    /**
     * Creates new form FormSupplier
     */
    public FormSupplier() {
        initComponents();
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
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        kodeSupplierTF = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        namaTF = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        noTeleponTF = new javax.swing.JTextField();
        addBT = new javax.swing.JButton();
        saveBT = new javax.swing.JButton();
        editBT = new javax.swing.JButton();
        deleteBT = new javax.swing.JButton();
        closeBT = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblSupplier = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        alamatTA = new javax.swing.JTextArea();

        jPanel1.setBackground(new java.awt.Color(255, 51, 51));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("FORM ENTRI DATA SUPPLIER");

        jLabel2.setText("Kode Supplier");

        kodeSupplierTF.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                kodeSupplierTFCaretUpdate(evt);
            }
        });

        jLabel3.setText("Nama Supplier");

        jLabel4.setText("Alamat");

        jLabel6.setText("No. Telp");

        addBT.setText("Add");
        addBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBTActionPerformed(evt);
            }
        });

        saveBT.setText("Save");
        saveBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBTActionPerformed(evt);
            }
        });

        editBT.setText("Edit");
        editBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editBTActionPerformed(evt);
            }
        });

        deleteBT.setText("Delete");
        deleteBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBTActionPerformed(evt);
            }
        });

        closeBT.setText("Close");
        closeBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeBTActionPerformed(evt);
            }
        });

        tblSupplier.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Kode Supplier", "Nama", "Alamat", "No. Telp"
            }
        ));
        jScrollPane1.setViewportView(tblSupplier);

        alamatTA.setColumns(20);
        alamatTA.setRows(5);
        jScrollPane2.setViewportView(alamatTA);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(kodeSupplierTF, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(namaTF, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(noTeleponTF, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jScrollPane1)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(addBT, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(saveBT, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(editBT, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(deleteBT)
                            .addGap(18, 18, 18)
                            .addComponent(closeBT))))
                .addGap(90, 90, 90))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(kodeSupplierTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(namaTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(noTeleponTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)))
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addBT)
                    .addComponent(saveBT)
                    .addComponent(editBT)
                    .addComponent(deleteBT)
                    .addComponent(closeBT))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(55, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel1)))
                .addContainerGap(8, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void kodeSupplierTFCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_kodeSupplierTFCaretUpdate
        try {
            Connection c=ClassDatabase.getkoneksi();
            Statement s=c.createStatement();
            String sql="SELECT * FROM supplier WHERE kode_supplier='" + this.kodeSupplierTF.getText() + "'";
            ResultSet r=s.executeQuery(sql);
            while (r.next()) {
                this.namaTF.setText(r.getString(2));
                this.alamatTA.setText(r.getString("alamat"));
                this.noTeleponTF.setText(r.getString("notelp"));
            }
            r.close();
            s.close();
        } catch (SQLException e) {
            System.out.println("Terjadi kesalahan" + e);
        }
    }//GEN-LAST:event_kodeSupplierTFCaretUpdate

    private void addBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBTActionPerformed
        kodeSupplierTF.setText("");
        namaTF.setText("");
        alamatTA.setText("");
        noTeleponTF.setText("");
        kodeSupplierTF.requestFocus();
    }//GEN-LAST:event_addBTActionPerformed

    private void saveBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBTActionPerformed
        String kode_supplier=this.kodeSupplierTF.getText();
        String nama=this.namaTF.getText();
        String alamat=this.alamatTA.getText();
        String notelp=this.noTeleponTF.getText();
        if (kodeSupplierTF.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Data Belum Lengkap, Kode Supplier Tidak Boleh Kosong");
        }
        else{
            if (namaTF.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Data Belum Lengkap, Nama Supplier Tidak Boleh Kosong");
            }
            else {
                if (alamatTA.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(this, "Data Belum Lengkap, Alamat Tidak Boleh Kosong");
                }
                else {
                    if (noTeleponTF.getText().isEmpty()) {
                        JOptionPane.showMessageDialog(this, "Data Belum Lengkap, Nomor Telepon Tidak Boleh Kosong");
                    }
                    else {
                        try {
                            Connection c = ClassDatabase.getkoneksi();
                            String sql = "INSERT INTO supplier VALUES (?,?,?,?)";
                            PreparedStatement p =(PreparedStatement) c.prepareStatement(sql);
                            p.setString(1, kode_supplier);
                            p.setString(2, nama);
                            p.setString(3, alamat);
                            p.setString(4, notelp);
                            p.executeUpdate();
                            p.close();
                            JOptionPane.showMessageDialog(this, "Sukses Tambah Data");
                        } catch (Exception e) {
                            System.out.println(e);
                        } finally {
                        }}}}}
                        try {
                            Connection c = ClassDatabase.getkoneksi();
                            Statement s = c.createStatement();
                            String sql = "SELECT kode_supplier, namasup, alamat, notelp FROM supplier";
                            ResultSet r = s.executeQuery(sql);
                            tblSupplier.setModel(DbUtils.resultSetToTableModel(r));
                        } catch (Exception e) {
                            JOptionPane.showMessageDialog(null, e);
                        }
    }//GEN-LAST:event_saveBTActionPerformed

    private void editBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editBTActionPerformed
        //EDIT
        String kode_supplier=this.kodeSupplierTF.getText();
        String nama=this.namaTF.getText();
        String alamat=this.alamatTA.getText();
        String notelp=this.noTeleponTF.getText();
        if (kodeSupplierTF.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Data Belum Lengkap, Kode Supplier Tidak Boleh Kosong");
        }
        else {
            if (namaTF.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Data Belum Lengkap, Nama Supplier Tidak Boleh Kosong");
            }
            else {
                if (alamatTA.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(this, "Data Belum Lengkap, Alamat Tidak Boleh Kosong");
                }
                else {
                    if (noTeleponTF.getText().isEmpty()) {
                        JOptionPane.showMessageDialog(this, "Data Belum Lengkap, Nomor Telepon Tidak Boleh Kosong");
                    }
                    else {
                        try {
                            Connection c=ClassDatabase.getkoneksi();
                            String sql="UPDATE `rauf`.`supplier` SET `namasup`=?,`alamat`=?,`notelp`=? WHERE `kode_supplier`=?";
                            PreparedStatement p=(PreparedStatement) c.prepareStatement(sql);
                            p.setString(4, kode_supplier);
                            p.setString(1, nama);
                            p.setString(2, alamat);
                            p.setString(3, notelp);
                            p.executeUpdate();
                            p.close();
                            JOptionPane.showMessageDialog(this, "Sukses Update Data");
                        } catch (SQLException e) {
                            System.out.println(e);
                        }finally{
                        }}}}}
                        try {
                            Connection c=ClassDatabase.getkoneksi();
                            Statement s=c.createStatement();
                            String sql="SELECT kode_supplier,namasup,alamat,notelp FROM supplier";
                            ResultSet r=s.executeQuery(sql);
                            tblSupplier.setModel(DbUtils.resultSetToTableModel(r));
                        } catch (Exception e) {
                            JOptionPane.showMessageDialog( null, e);
                        }
    }//GEN-LAST:event_editBTActionPerformed

    private void deleteBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBTActionPerformed
        //DELETE
        String kode_supplier=this.kodeSupplierTF.getText();

        try {
            Connection c=ClassDatabase.getkoneksi();
            String sql = "DELETE FROM supplier WHERE kode_supplier=?";
            PreparedStatement p=(PreparedStatement) c.prepareStatement(sql);
            p.setString(1, kode_supplier);

            p.executeUpdate();
            p.close();
            JOptionPane.showMessageDialog(this, "Sukses Hapus Data");
        } catch (SQLException e) {
            System.out.println(e);
        }  finally {

        }
        try {
            Connection c=ClassDatabase.getkoneksi();
            Statement s=c.createStatement();
            String sql="SELECT kode_supplier, namasup, alamat, notelp FROM supplier";
            ResultSet r=s.executeQuery(sql);
            tblSupplier.setModel(DbUtils.resultSetToTableModel(r));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_deleteBTActionPerformed

    private void closeBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeBTActionPerformed
        int ex = JOptionPane.showConfirmDialog(null, "Apakah anda akan keluar?", "Anda yakin?", JOptionPane.YES_NO_OPTION);
        if (ex == 0){
            dispose();
        }
    }//GEN-LAST:event_closeBTActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBT;
    private javax.swing.JTextArea alamatTA;
    private javax.swing.JButton closeBT;
    private javax.swing.JButton deleteBT;
    private javax.swing.JButton editBT;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField kodeSupplierTF;
    private javax.swing.JTextField namaTF;
    private javax.swing.JTextField noTeleponTF;
    private javax.swing.JButton saveBT;
    private javax.swing.JTable tblSupplier;
    // End of variables declaration//GEN-END:variables
}
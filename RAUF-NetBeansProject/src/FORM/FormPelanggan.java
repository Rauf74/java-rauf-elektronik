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
import java.text.DecimalFormat;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author RAUF
 */
public class FormPelanggan extends javax.swing.JInternalFrame {

    /**
     * Creates new form FormEntri
     */
    public FormPelanggan() {
        super("Form Entri");
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        noIdentitasTF = new javax.swing.JTextField();
        ktpRB = new javax.swing.JRadioButton();
        simRB = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        namaTF = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lkRB = new javax.swing.JRadioButton();
        prRB = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        nohpTF = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        addBT = new javax.swing.JButton();
        saveBT = new javax.swing.JButton();
        editBT = new javax.swing.JButton();
        deleteBT = new javax.swing.JButton();
        closeBT = new javax.swing.JButton();
        caridataBT = new javax.swing.JButton();
        caridataTF = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPelanggan = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        alamatTA = new javax.swing.JTextArea();
        tglTF = new com.toedter.calendar.JDateChooser();

        jPanel1.setBackground(new java.awt.Color(51, 255, 51));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("FORM ENTRI DATA PELANGGAN");

        jLabel2.setText("No. Identitas");

        noIdentitasTF.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                noIdentitasTFCaretUpdate(evt);
            }
        });

        buttonGroup1.add(ktpRB);
        ktpRB.setText("KTP");

        buttonGroup1.add(simRB);
        simRB.setText("SIM");

        jLabel3.setText("Nama");

        jLabel4.setText("Alamat");

        jLabel5.setText("Jenis Kelamin");

        buttonGroup2.add(lkRB);
        lkRB.setText("Laki-laki");

        buttonGroup2.add(prRB);
        prRB.setText("Perempuan");

        jLabel6.setText("No. HP");

        jLabel7.setText("Tanggal");

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

        caridataBT.setText("Cari Data");

        caridataTF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                caridataTFKeyPressed(evt);
            }
        });

        tblPelanggan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No. Identitas", "Jenis Identitas", "Nama", "Alamat", "Jenis Kelamin", "No. Hp", "Tanggal"
            }
        ));
        jScrollPane1.setViewportView(tblPelanggan);

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
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 555, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel4)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(tglTF, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(55, 55, 55)
                                        .addComponent(caridataBT))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                        .addComponent(noIdentitasTF, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(ktpRB)
                                        .addGap(18, 18, 18)
                                        .addComponent(simRB))
                                    .addComponent(namaTF, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                        .addComponent(lkRB)
                                        .addGap(18, 18, 18)
                                        .addComponent(prRB))
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(addBT, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                                    .addComponent(saveBT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(editBT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(deleteBT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(closeBT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(32, 32, 32))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(nohpTF, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(151, 151, 151)
                                .addComponent(caridataTF, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(noIdentitasTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ktpRB)
                    .addComponent(simRB)
                    .addComponent(addBT))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(namaTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(saveBT)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lkRB)
                                .addComponent(prRB)))
                        .addGap(19, 19, 19)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(nohpTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(editBT))
                        .addGap(18, 18, 18)
                        .addComponent(deleteBT)
                        .addGap(18, 18, 18)
                        .addComponent(closeBT)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(caridataBT)
                        .addComponent(caridataTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(tglTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
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

    private void deleteBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBTActionPerformed
        //DELETE
        java.util.Date tgl_plg=(java.util.Date) this.tglTF.getDate();
        String no_identitas=this.noIdentitasTF.getText();
        
        try {
            Connection c=ClassDatabase.getkoneksi();
            String sql = "DELETE FROM pelanggan WHERE no_identitas=?";
            PreparedStatement p=(PreparedStatement) c.prepareStatement(sql);
            p.setString(1, no_identitas);
            
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
            String sql="SELECT no_identitas, j_identitas, nama, alamat, jk, nohp, tgl_plg FROM pelanggan";
            ResultSet r=s.executeQuery(sql);
            tblPelanggan.setModel(DbUtils.resultSetToTableModel(r));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_deleteBTActionPerformed

    private void addBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBTActionPerformed
        noIdentitasTF.setText("");
        namaTF.setText("");
        alamatTA.setText("");
        nohpTF.setText("");
        tglTF.setDate(null);
        buttonGroup1.clearSelection();
        buttonGroup2.clearSelection();
        noIdentitasTF.requestFocus();
    }//GEN-LAST:event_addBTActionPerformed

    private void saveBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBTActionPerformed
        java.util.Date tgl_plg=(java.util.Date) this.tglTF.getDate();
            String no_identitas=this.noIdentitasTF.getText();
            String nama=this.namaTF.getText();
            String j_identitas=null;
            if (ktpRB.isSelected()) {
                j_identitas = "KTP";
        } else if (simRB.isSelected()){
                j_identitas = "SIM";
        }
            String jk = null;
            if (lkRB.isSelected()) {
                jk = "Laki-laki";
        } else if (prRB.isSelected()){
                jk = "Perempuan";
        }
            String alamat=this.alamatTA.getText();
            String nohp=this.nohpTF.getText();
            if (noIdentitasTF.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Data Belum Lengkap, Nomor Identitas Pelanggan Tidak Boleh Kosong");               
        }
            else{
                if (namaTF.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(this, "Data Belum Lengkap, Nama Pelanggan Tidak Boleh Kosong");
                }
                else {
                    if (alamatTA.getText().isEmpty()) {
                        JOptionPane.showMessageDialog(this, "Data Belum Lengkap, Alamat Tidak Boleh Kosong");
                    }
                    else {
                        if (nohpTF.getText().isEmpty()) {
                            JOptionPane.showMessageDialog(this, "Data Belum Lengkap, Nomor HP Tidak Boleh Kosong");
                        }
                        else {
                            try {
                                Connection c = ClassDatabase.getkoneksi();
                                String sql = "INSERT INTO pelanggan values (?,?,?,?,?,?,?)";
                                PreparedStatement p =(PreparedStatement) c.prepareStatement(sql);
                                p.setString(1, no_identitas);
                                p.setString(2, j_identitas);
                                p.setString(3, nama);
                                p.setString(4, alamat);
                                p.setString(5, jk);
                                p.setString(6, nohp);
                                p.setDate(7, new java.sql.Date(tgl_plg.getTime()));
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
                               String sql = "SELECT no_identitas, j_identitas, nama, alamat, jk, nohp, tgl_plg FROM pelanggan";
                               ResultSet r = s.executeQuery(sql);
                               tblPelanggan.setModel(DbUtils.resultSetToTableModel(r));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_saveBTActionPerformed

    private void editBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editBTActionPerformed
        //EDIT
        java.util.Date tgl_plg=(java.util.Date) this.tglTF.getDate();
        String no_identitas=this.noIdentitasTF.getText();
        String nama=this.namaTF.getText();
        String j_identitas=null;
        if (ktpRB.isSelected()) {
            j_identitas = "KTP";
        } else if (simRB.isSelected()) {
            j_identitas = "SIM";
        }
        String jk = null;
        if (lkRB.isSelected()) {
            jk = "Laki-laki";
        } else if (prRB.isSelected()){
            jk = "Perempuan";
        }
        String alamat=this.alamatTA.getText();
        String nohp=this.nohpTF.getText();
        if (noIdentitasTF.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Data Belum Lengkap, Nomor Identitas Pelanggan Tidak Boleh Kosong");
        }
        else {
            if (namaTF.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Data Belum Lengkap, Nama Pelanggan Tidak Boleh Kosong");
            }
            else {
                if (alamatTA.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(this, "Data Belum Lengkap, Alamat Tidak Boleh Kosong");
                }
                else {
                    if (nohpTF.getText().isEmpty()) {
                        JOptionPane.showMessageDialog(this, "Data Belum Lengkap, Nomor HP Tidak Boleh Kosong");
                    }
                    else {
                        try {
                            Connection c=ClassDatabase.getkoneksi();
                            String sql="UPDATE `rauf`.`pelanggan` SET `j_identitas`=?,`nama`=?,`alamat`=?,`jk`=?,`nohp`=?,`tgl_plg`=? WHERE `no_identitas`=?";
                            PreparedStatement p=(PreparedStatement) c.prepareStatement(sql);
                            p.setString(7, no_identitas);
                            p.setString(1, j_identitas);
                            p.setString(2, nama);
                            p.setString(3, alamat);
                            p.setString(4, jk);
                            p.setString(5, nohp);
                            p.setDate(6, new java.sql.Date(tgl_plg.getTime()));
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
            String sql="SELECT no_identitas,j_identitas,nama,jk,alamat,nohp,tgl_plg FROM pelanggan";
            ResultSet r=s.executeQuery(sql);
            tblPelanggan.setModel(DbUtils.resultSetToTableModel(r));
        } catch (Exception e) {
            JOptionPane.showMessageDialog( null, e);
        }
    }//GEN-LAST:event_editBTActionPerformed

    private void noIdentitasTFCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_noIdentitasTFCaretUpdate
        try {
            Connection c=ClassDatabase.getkoneksi();
            Statement s=c.createStatement();
            String sql="SELECT * FROM pelanggan WHERE no_identitas='" + this.noIdentitasTF.getText() + "'";
            ResultSet r=s.executeQuery(sql);
            while (r.next()) {
                this.namaTF.setText(r.getString(3));
                if ("KTP".equalsIgnoreCase(r.getString("j_identitas"))) {
                    ktpRB.setSelected(true);
                } else {
                    simRB.setSelected(true);
                }
                if ("Laki-laki".equalsIgnoreCase(r.getString("jk"))) {
                    lkRB.setSelected(true);
                } else {
                    prRB.setSelected(true);
                }
                this.alamatTA.setText(r.getString("alamat"));
                this.tglTF.setDate(r.getDate("tgl_plg"));
                this.nohpTF.setText(r.getString("nohp"));
            }
            r.close();
            s.close();
        } catch (SQLException e) {
            System.out.println("Terjadi kesalahan" + e);
        }
    }//GEN-LAST:event_noIdentitasTFCaretUpdate

    private void closeBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeBTActionPerformed
        int ex = JOptionPane.showConfirmDialog(null, "Apakah anda akan keluar?", "Anda yakin?", JOptionPane.YES_NO_OPTION);
        if (ex == 0){
            dispose();
        }
    }//GEN-LAST:event_closeBTActionPerformed

    private void caridataTFKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_caridataTFKeyPressed
        DefaultTableModel tableTampil1 = new DefaultTableModel();
        tableTampil1.addColumn("No. Identitas");
        tableTampil1.addColumn("Jenis Identitas");
        tableTampil1.addColumn("Nama");
        tableTampil1.addColumn("Alamat");
        tableTampil1.addColumn("Jenis Kelamin");
        tableTampil1.addColumn("No. HP");
        tableTampil1.addColumn("Tanggal Pelanggan");
        
        try {
            Connection c=ClassDatabase.getkoneksi();
            Statement s=c.createStatement();
            String sql = "SELECT * FROM pelanggan WHERE no_identitas LIKE '%" + caridataTF.getText() + "%'" +
                    "OR j_identitas LIKE '%" + caridataTF.getText() + "%'" + "OR nama LIKE '%" + caridataTF.getText() + "%'" +
                    "OR alamat LIKE '%" + caridataTF.getText() + "%'" + "OR jk LIKE '%" + caridataTF.getText() + "%'" +
                    "OR nohp LIKE '%" + caridataTF.getText() + "%'" + "OR tgl_plg LIKE '%" + caridataTF.getText() + "%'";
            ResultSet r=s.executeQuery(sql);
            while (r.next()) {
                tableTampil1.addRow(new Object[] {
                    r.getString(1),
                    r.getString(2),
                    r.getString(3),
                    r.getString(4),
                    r.getString(5),
                    r.getString(6),
                    r.getString(7),
                });
                tblPelanggan.setModel(tableTampil1);
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_caridataTFKeyPressed

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
            java.util.logging.Logger.getLogger(MenuUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormPelanggan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBT;
    private javax.swing.JTextArea alamatTA;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton caridataBT;
    private javax.swing.JTextField caridataTF;
    private javax.swing.JButton closeBT;
    private javax.swing.JButton deleteBT;
    private javax.swing.JButton editBT;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JRadioButton ktpRB;
    private javax.swing.JRadioButton lkRB;
    private javax.swing.JTextField namaTF;
    private javax.swing.JTextField noIdentitasTF;
    private javax.swing.JTextField nohpTF;
    private javax.swing.JRadioButton prRB;
    private javax.swing.JButton saveBT;
    private javax.swing.JRadioButton simRB;
    private javax.swing.JTable tblPelanggan;
    private com.toedter.calendar.JDateChooser tglTF;
    // End of variables declaration//GEN-END:variables
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package FORM;
import ClassDatabase.ClassDatabase;
import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import static com.sun.imageio.plugins.common.LZWStringTable.hash;
import java.io.File;
import java.sql.*;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Locale;
import static java.util.Objects.hash;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRParameter;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import static net.sf.jasperreports.engine.util.ObjectUtils.hash;
import net.sf.jasperreports.view.JasperViewer;
import static org.codehaus.groovy.runtime.metaclass.MetaMethodIndex.hash;
import static org.codehaus.groovy.util.ComplexKeyHashMap.hash;
//import org.freixas.jcalendar.JCalendarCombo;
/**
 *
 * @author alfar
 */
public class FormLaporan extends javax.swing.JInternalFrame {

    /**
     * Creates new form FormLaporan
     */
    public FormLaporan() {
        initComponents();
            
            DefaultTableModel tbltampil = new DefaultTableModel();
            tbltampil.addColumn("No. Identitas");
            tbltampil.addColumn("Jenis Identitas");
            tbltampil.addColumn("Nama");
            tbltampil.addColumn("Alamat");
            tbltampil.addColumn("Jenis Kelamin");
            tbltampil.addColumn("No. Telp");
            tbltampil.addColumn("Tanggal");
            
            try {
                Connection c = ClassDatabase.getkoneksi();
                Statement s = c.createStatement();
                String sql = "SELECT * FROM pelanggan";
                ResultSet r = s.executeQuery(sql);
                while (r.next()) {
                    tbltampil.addRow(new Object[] {
                        r.getString(1),
                        r.getString(2),
                        r.getString(3),
                        r.getString(4),
                        r.getString(5),
                        r.getString(6),
                        r.getString(7)
                });
                } tblLaporan.setModel(tbltampil);
            } catch (Exception e) {
                    System.out.println(e);
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        closeBT = new javax.swing.JButton();
        cbLaporan = new javax.swing.JComboBox<>();
        cetakBT = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblLaporan = new javax.swing.JTable();
        tglawalTF = new com.toedter.calendar.JDateChooser();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tglakhirTF = new com.toedter.calendar.JDateChooser();
        cariBT = new javax.swing.JButton();
        tampilkanTF = new javax.swing.JTextField();

        jPanel1.setBackground(new java.awt.Color(255, 51, 51));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("FORM LAPORAN");

        jLabel2.setText("Jenis Laporan");

        closeBT.setText("Close");
        closeBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeBTActionPerformed(evt);
            }
        });

        cbLaporan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pelanggan", "Supplier", "Barang", "Pembelian Barang", "Penjualan Barang", " " }));
        cbLaporan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbLaporanActionPerformed(evt);
            }
        });

        cetakBT.setText("Cetak");
        cetakBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cetakBTActionPerformed(evt);
            }
        });

        tblLaporan.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(tblLaporan);

        jLabel3.setText("Tanggal Awal");

        jLabel4.setText("Tanggal Akhir");

        cariBT.setText("Cari");
        cariBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cariBTActionPerformed(evt);
            }
        });

        tampilkanTF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tampilkanTFKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(cariBT))
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tampilkanTF, javax.swing.GroupLayout.DEFAULT_SIZE, 234, Short.MAX_VALUE)
                    .addComponent(cbLaporan, 0, 234, Short.MAX_VALUE)
                    .addComponent(tglawalTF, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tglakhirTF, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cetakBT)
                .addGap(18, 18, 18)
                .addComponent(closeBT)
                .addGap(30, 30, 30))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 658, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cbLaporan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tglawalTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(tglakhirTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cariBT)
                        .addComponent(tampilkanTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cetakBT)
                        .addComponent(closeBT)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
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
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void closeBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeBTActionPerformed
        int ex = JOptionPane.showConfirmDialog(null, "Apakah anda akan keluar?", "Anda yakin?", JOptionPane.YES_NO_OPTION);
        if (ex == 0){
            dispose();
        }
    }//GEN-LAST:event_closeBTActionPerformed

    private void cetakBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cetakBTActionPerformed
        if (cbLaporan.getSelectedItem().toString().equals("Pelanggan")) {
            try {
            String reportPath = "src/Reports/LaporanPelanggan.jasper";
            Connection c = ClassDatabase.getkoneksi();
            
            HashMap<String, Object> parameters = new HashMap<>();
            JasperPrint jp = JasperFillManager.fillReport(reportPath, parameters, c);
            JasperViewer viewer = new JasperViewer(jp, false);
            viewer.setVisible(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Tidak dapat menampilkan laporan!");
        }
            
        } else if (cbLaporan.getSelectedItem().toString().equals("Supplier")) {
            try {
            String reportPath = "src/Reports/LaporanSupplier.jasper";
            Connection c = ClassDatabase.getkoneksi();
            
            HashMap<String, Object> parameters = new HashMap<>();
            JasperPrint jp = JasperFillManager.fillReport(reportPath, parameters, c);
            JasperViewer viewer = new JasperViewer(jp, false);
            viewer.setVisible(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Tidak dapat menampilkan laporan!");
        }
            
        } else if (cbLaporan.getSelectedItem().toString().equals("Barang")) {
            try {
            String reportpath = "src/Reports/LaporanBarang.jasper";
                Connection c = ClassDatabase.getkoneksi();
                
                HashMap hash = new HashMap(1);
            
            // Mengambil Parameter
            hash.put(JRParameter.REPORT_LOCALE, new Locale("id","ID"));
            File file = new File(reportpath);
            
            JasperReport jasperReport = (JasperReport) JRLoader.loadObjectFromFile(file.getPath());
            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, hash, c);
            JasperViewer.viewReport(jasperPrint, false);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Tidak dapat menampilkan laporan!");
        }
            
        } else if (cbLaporan.getSelectedItem().toString().equals("Pembelian Barang")) {
            java.util.Date tgl_awal = (java.util.Date) this.tglawalTF.getDate();
            java.util.Date tgl_akhir = (java.util.Date) this.tglakhirTF.getDate();
            
            try {
            String reportPath = "src/Reports/LaporanPembelian.jasper";
            Connection c = ClassDatabase.getkoneksi();
            HashMap hash = new HashMap(3);
            
            //Mengambil Parameter
            hash.put("tglawal", tgl_awal);
            hash.put("tglakhir", tgl_akhir);
            hash.put(JRParameter.REPORT_LOCALE, new Locale("id", "ID"));
            File file = new File(reportPath);
            
            JasperReport jasperReport = (JasperReport) JRLoader.loadObjectFromFile(file.getPath());
            
            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, hash, c);
            JasperViewer.viewReport(jasperPrint, false);
        } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Tidak dapat menampilkan laporan!");
        }
            
        } else if (cbLaporan.getSelectedItem().toString().equals("Penjualan Barang")) {
            java.util.Date tgl_awal = (java.util.Date) this.tglawalTF.getDate();
            java.util.Date tgl_akhir = (java.util.Date) this.tglakhirTF.getDate();
            
            try {
            String reportPath = "src/Reports/LaporanPenjualan.jasper";
            Connection c = ClassDatabase.getkoneksi();
            HashMap hash = new HashMap(3);
            
            //Mengambil Parameter
            hash.put("tglawal", tgl_awal);
            hash.put("tglakhir", tgl_akhir);
            hash.put(JRParameter.REPORT_LOCALE, new Locale("id", "ID"));
            File file = new File(reportPath);
            
            JasperReport jasperReport = (JasperReport) JRLoader.loadObjectFromFile(file.getPath());
            
            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, hash, c);
            JasperViewer.viewReport(jasperPrint, false);
        } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Tidak dapat menampilkan laporan!");
        }
        }
    }//GEN-LAST:event_cetakBTActionPerformed

    private void cariBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cariBTActionPerformed
        if (cbLaporan.getSelectedItem().toString().equals("Pelanggan")) {
            DefaultTableModel tbltampil = new DefaultTableModel();
            
            tbltampil.addColumn("No. Identitas");
            tbltampil.addColumn("Jenis Identitas");
            tbltampil.addColumn("Nama");
            tbltampil.addColumn("Alamat");
            tbltampil.addColumn("Jenis Kelamin");
            tbltampil.addColumn("No. Telp");
            tbltampil.addColumn("Tanggal");
            
            try {
                Connection c = ClassDatabase.getkoneksi();
                Statement s = c.createStatement();
                String sql = "SELECT * FROM pelanggan WHERE no_identitas LIKE '%" + tampilkanTF.getText() + "%'" +
                    "OR j_identitas LIKE '%" + tampilkanTF.getText() + "%'" + "OR nama LIKE '%" + tampilkanTF.getText() + "%'" +
                    "OR alamat LIKE '%" + tampilkanTF.getText() + "%'" + "OR jk LIKE '%" + tampilkanTF.getText() + "%'" +
                    "OR nohp LIKE '%" + tampilkanTF.getText() + "%'" + "OR tgl_plg LIKE '%" + tampilkanTF.getText() + "%'";
            ResultSet r=s.executeQuery(sql);
            while (r.next()) {
                tbltampil.addRow(new Object[] {
                    r.getString(1),
                    r.getString(2),
                    r.getString(3),
                    r.getString(4),
                    r.getString(5),
                    r.getString(6),
                    r.getString(7)
                });
                tblLaporan.setModel(tbltampil);
            }
        } catch (Exception e) {
                System.out.println(e);
        }
            
        } else if (cbLaporan.getSelectedItem().toString().equals("Barang")) {
            DefaultTableModel tbltampil = new DefaultTableModel();
            
            tbltampil.addColumn("Kode Barang");
            tbltampil.addColumn("Nama Barang");
            tbltampil.addColumn("Harga Beli");
            tbltampil.addColumn("Harga Jual");
            tbltampil.addColumn("Stok");
            tbltampil.addColumn("Saham");
            
        try {
            Connection c=ClassDatabase.getkoneksi();
            Statement s=c.createStatement();
            String sql = "SELECT * FROM barang WHERE kode_barang LIKE '%" + tampilkanTF.getText() + "%'" +
            "OR nama LIKE '%" + tampilkanTF.getText() + "%'" + "OR harga_beli LIKE '%" + tampilkanTF.getText() + "%'" +
            "OR harga_jual LIKE '%" + tampilkanTF.getText() + "%'" + "OR stok LIKE '%" + tampilkanTF.getText() + "%'" +
            "OR saham LIKE '%" + tampilkanTF.getText() + "%'";
            ResultSet r=s.executeQuery(sql);
            while (r.next()) {
                tbltampil.addRow(new Object[] {
                    r.getString(1),
                    r.getString(2),
                    r.getString(3),
                    r.getString(4),
                    r.getString(5)
                });}
                tblLaporan.setModel(tbltampil);
            } catch (Exception e) {
                System.out.println(e);
            }
        
            } else if (cbLaporan.getSelectedItem().toString().equals("Supplier")) {
               DefaultTableModel tbltampil = new DefaultTableModel();
            
            tbltampil.addColumn("Kode");
            tbltampil.addColumn("Nama");
            tbltampil.addColumn("Alamat");
            tbltampil.addColumn("No. Telp");
            
        try {
            Connection c=ClassDatabase.getkoneksi();
            Statement s=c.createStatement();
            String sql = "SELECT * FROM supplier WHERE kode_supplier LIKE '%" + tampilkanTF.getText() + "%'" +
            "OR nama LIKE '%" + tampilkanTF.getText() + "%'" + "OR alamat LIKE '%" + tampilkanTF.getText() + "%'" +
            "OR notelp LIKE '%" + tampilkanTF.getText() + "%'";
            ResultSet r=s.executeQuery(sql);
            while (r.next()) {
                tbltampil.addRow(new Object[] {
                    r.getString(1),
                    r.getString(2),
                    r.getString(3),
                    r.getString(4)
                });}
                tblLaporan.setModel(tbltampil);
            } catch (Exception e) {
                System.out.println(e);
            }
        
            } else if (cbLaporan.getSelectedItem().equals("Penjualan Barang")) {
                DefaultTableModel tbltampil = new DefaultTableModel();
            
            tbltampil.addColumn("ID");
            tbltampil.addColumn("Kode Acc");
            tbltampil.addColumn("Jumlah Beli");
            tbltampil.addColumn("Total");
            tbltampil.addColumn("Tanggal Jual");
            tbltampil.addColumn("Profit");
            
        try {
            Connection c=ClassDatabase.getkoneksi();
            Statement s=c.createStatement();
            String sql = "SELECT * FROM jualacc WHERE id LIKE '%" + tampilkanTF.getText() + "%'" +
            "OR kodea LIKE '%" + tampilkanTF.getText() + "%'";
            ResultSet r=s.executeQuery(sql);
            while (r.next()) {
                tbltampil.addRow(new Object[] {
                    r.getString(1),
                    r.getString(2),
                    r.getString(3),
                    r.getString(4),
                    r.getString(5),
                    r.getString(6)
                });}
                tblLaporan.setModel(tbltampil);
            } catch (Exception e) {
                System.out.println(e);
            }
        
            } else if (cbLaporan.getSelectedItem().toString().equals("Pembelian Barang")) {
                DefaultTableModel tbltampil = new DefaultTableModel();
            
            tbltampil.addColumn("ID");
            tbltampil.addColumn("No. Beli");
            tbltampil.addColumn("Kode Barang");
            tbltampil.addColumn("Jumlah Beli");
            tbltampil.addColumn("Tanggal Beli");
            tbltampil.addColumn("Kode Supplier");
            
        try {
            Connection c=ClassDatabase.getkoneksi();
            Statement s=c.createStatement();
            String sql = "SELECT * FROM acc WHERE no_beli LIKE '%" + tampilkanTF.getText() + "%'" +
            "OR kodea LIKE '%" + tampilkanTF.getText() + "%'";
            ResultSet r=s.executeQuery(sql);
            while (r.next()) {
                tbltampil.addRow(new Object[] {
                    r.getString(1),
                    r.getString(2),
                    r.getString(3),
                    r.getString(4),
                    r.getString(5),
                    r.getString(6)
                });}
                tblLaporan.setModel(tbltampil);
            } catch (Exception e) {
                System.out.println(e);
            }
        
            }
    }//GEN-LAST:event_cariBTActionPerformed

    private void cbLaporanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbLaporanActionPerformed
        if (cbLaporan.getSelectedItem().toString().equals("Pelanggan")) {
            DefaultTableModel tbltampil = new DefaultTableModel();
            
            tbltampil.addColumn("No. Identitas");
            tbltampil.addColumn("Jenis Identitas");
            tbltampil.addColumn("Nama");
            tbltampil.addColumn("Alamat");
            tbltampil.addColumn("Jenis Kelamin");
            tbltampil.addColumn("No. Telp");
            tbltampil.addColumn("Tanggal");
            
            try {
                Connection c = ClassDatabase.getkoneksi();
                Statement s = c.createStatement();
                String sql = "SELECT * FROM pelanggan";
            ResultSet r=s.executeQuery(sql);
            while (r.next()) {
                tbltampil.addRow(new Object[] {
                    r.getString(1),
                    r.getString(2),
                    r.getString(3),
                    r.getString(4),
                    r.getString(5),
                    r.getString(6),
                    r.getString(7)
                });
                tblLaporan.setModel(tbltampil);
            }
        } catch (Exception e) {
                System.out.println(e);
        }
            
        } else if (cbLaporan.getSelectedItem().toString().equals("Barang")) {
            DefaultTableModel tbltampil = new DefaultTableModel();
            
            tbltampil.addColumn("Kode Barang");
            tbltampil.addColumn("Nama Barang");
            tbltampil.addColumn("Harga Beli");
            tbltampil.addColumn("Harga Jual");
            tbltampil.addColumn("Stok");
            tbltampil.addColumn("Saham");
            
        try {
            Connection c=ClassDatabase.getkoneksi();
            Statement s=c.createStatement();
            String sql = "SELECT * FROM barang";
            ResultSet r=s.executeQuery(sql);
            while (r.next()) {
                tbltampil.addRow(new Object[] {
                    r.getString(1),
                    r.getString(2),
                    r.getString(3),
                    r.getString(4),
                    r.getString(5),
                    r.getString(6)
                });}
                tblLaporan.setModel(tbltampil);
            } catch (Exception e) {
                System.out.println(e);
            }
        
            } else if (cbLaporan.getSelectedItem().toString().equals("Supplier")) {
               DefaultTableModel tbltampil = new DefaultTableModel();
            
            tbltampil.addColumn("Kode");
            tbltampil.addColumn("Nama");
            tbltampil.addColumn("Alamat");
            tbltampil.addColumn("No. Telp");
            
        try {
            Connection c=ClassDatabase.getkoneksi();
            Statement s=c.createStatement();
            String sql = "SELECT * FROM supplier";
            ResultSet r=s.executeQuery(sql);
            while (r.next()) {
                tbltampil.addRow(new Object[] {
                    r.getString(1),
                    r.getString(2),
                    r.getString(3),
                    r.getString(4)
                });}
                tblLaporan.setModel(tbltampil);
            } catch (Exception e) {
                System.out.println(e);
            }
        
            } else if (cbLaporan.getSelectedItem().equals("Penjualan Barang")) {
                DefaultTableModel tbltampil = new DefaultTableModel();
            
            tbltampil.addColumn("ID");
            tbltampil.addColumn("Kode Acc");
            tbltampil.addColumn("Jumlah Beli");
            tbltampil.addColumn("Total");
            tbltampil.addColumn("Tanggal Jual");
            tbltampil.addColumn("Profit");
            
        try {
            Connection c=ClassDatabase.getkoneksi();
            Statement s=c.createStatement();
            String sql = "SELECT * FROM jualacc";
            ResultSet r=s.executeQuery(sql);
            while (r.next()) {
                tbltampil.addRow(new Object[] {
                    r.getString(1),
                    r.getString(2),
                    r.getString(3),
                    r.getString(4),
                    r.getString(5),
                    r.getString(6)
                });}
                tblLaporan.setModel(tbltampil);
            } catch (Exception e) {
                System.out.println(e);
            }
        
            } else if (cbLaporan.getSelectedItem().toString().equals("Pembelian Barang")) {
                DefaultTableModel tbltampil = new DefaultTableModel();
            
            tbltampil.addColumn("ID");
            tbltampil.addColumn("No. Beli");
            tbltampil.addColumn("Kode Barang");
            tbltampil.addColumn("Jumlah Beli");
            tbltampil.addColumn("Tanggal Beli");
            tbltampil.addColumn("Kode Supplier");
            
        try {
            Connection c=ClassDatabase.getkoneksi();
            Statement s=c.createStatement();
            String sql = "SELECT * FROM acc";
            ResultSet r=s.executeQuery(sql);
            while (r.next()) {
                tbltampil.addRow(new Object[] {
                    r.getString(1),
                    r.getString(2),
                    r.getString(3),
                    r.getString(4),
                    r.getString(5),
                    r.getString(6)
                });}
                tblLaporan.setModel(tbltampil);
            } catch (Exception e) {
                System.out.println(e);
            }
        
            }
    }//GEN-LAST:event_cbLaporanActionPerformed

    private void tampilkanTFKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tampilkanTFKeyPressed
        if (cbLaporan.getSelectedItem().toString().equals("Pelanggan")) {
            DefaultTableModel tbltampil = new DefaultTableModel();
            
            tbltampil.addColumn("No. Identitas");
            tbltampil.addColumn("Jenis Identitas");
            tbltampil.addColumn("Nama");
            tbltampil.addColumn("Alamat");
            tbltampil.addColumn("Jenis Kelamin");
            tbltampil.addColumn("No. Telp");
            tbltampil.addColumn("Tanggal");
            
            try {
                Connection c = ClassDatabase.getkoneksi();
                Statement s = c.createStatement();
                String sql = "SELECT * FROM pelanggan WHERE no_identitas LIKE '%" + tampilkanTF.getText() + "%'" +
                    "OR j_identitas LIKE '%" + tampilkanTF.getText() + "%'" + "OR nama LIKE '%" + tampilkanTF.getText() + "%'" +
                    "OR alamat LIKE '%" + tampilkanTF.getText() + "%'" + "OR jk LIKE '%" + tampilkanTF.getText() + "%'" +
                    "OR nohp LIKE '%" + tampilkanTF.getText() + "%'" + "OR tgl_plg LIKE '%" + tampilkanTF.getText() + "%'";
            ResultSet r=s.executeQuery(sql);
            while (r.next()) {
                tbltampil.addRow(new Object[] {
                    r.getString(1),
                    r.getString(2),
                    r.getString(3),
                    r.getString(4),
                    r.getString(5),
                    r.getString(6),
                    r.getString(7)
                });
                tblLaporan.setModel(tbltampil);
            }
        } catch (Exception e) {
                System.out.println(e);
        }
            
        } else if (cbLaporan.getSelectedItem().toString().equals("Barang")) {
            DefaultTableModel tbltampil = new DefaultTableModel();
            
            tbltampil.addColumn("Kode Barang");
            tbltampil.addColumn("Nama Barang");
            tbltampil.addColumn("Harga Beli");
            tbltampil.addColumn("Harga Jual");
            tbltampil.addColumn("Stok");
            tbltampil.addColumn("Saham");
            
        try {
            Connection c=ClassDatabase.getkoneksi();
            Statement s=c.createStatement();
            String sql = "SELECT * FROM barang WHERE kode_barang LIKE '%" + tampilkanTF.getText() + "%'" +
            "OR nama LIKE '%" + tampilkanTF.getText() + "%'" + "OR harga_beli LIKE '%" + tampilkanTF.getText() + "%'" +
            "OR harga_jual LIKE '%" + tampilkanTF.getText() + "%'" + "OR stok LIKE '%" + tampilkanTF.getText() + "%'" +
            "OR saham LIKE '%" + tampilkanTF.getText() + "%'";
            ResultSet r=s.executeQuery(sql);
            while (r.next()) {
                tbltampil.addRow(new Object[] {
                    r.getString(1),
                    r.getString(2),
                    r.getString(3),
                    r.getString(4),
                    r.getString(5)
                });}
                tblLaporan.setModel(tbltampil);
            } catch (Exception e) {
                System.out.println(e);
            }
        
            } else if (cbLaporan.getSelectedItem().toString().equals("Supplier")) {
               DefaultTableModel tbltampil = new DefaultTableModel();
            
            tbltampil.addColumn("Kode");
            tbltampil.addColumn("Nama");
            tbltampil.addColumn("Alamat");
            tbltampil.addColumn("No. Telp");
            
        try {
            Connection c=ClassDatabase.getkoneksi();
            Statement s=c.createStatement();
            String sql = "SELECT * FROM supplier WHERE kode_supplier LIKE '%" + tampilkanTF.getText() + "%'" +
            "OR nama LIKE '%" + tampilkanTF.getText() + "%'" + "OR alamat LIKE '%" + tampilkanTF.getText() + "%'" +
            "OR notelp LIKE '%" + tampilkanTF.getText() + "%'";
            ResultSet r=s.executeQuery(sql);
            while (r.next()) {
                tbltampil.addRow(new Object[] {
                    r.getString(1),
                    r.getString(2),
                    r.getString(3),
                    r.getString(4)
                });}
                tblLaporan.setModel(tbltampil);
            } catch (Exception e) {
                System.out.println(e);
            }
        
            } else if (cbLaporan.getSelectedItem().equals("Penjualan Barang")) {
                DefaultTableModel tbltampil = new DefaultTableModel();
            
            tbltampil.addColumn("ID");
            tbltampil.addColumn("Kode Acc");
            tbltampil.addColumn("Jumlah Beli");
            tbltampil.addColumn("Total");
            tbltampil.addColumn("Tanggal Jual");
            tbltampil.addColumn("Profit");
            
        try {
            Connection c=ClassDatabase.getkoneksi();
            Statement s=c.createStatement();
            String sql = "SELECT * FROM jualacc WHERE id LIKE '%" + tampilkanTF.getText() + "%'" +
            "OR kodea LIKE '%" + tampilkanTF.getText() + "%'";
            ResultSet r=s.executeQuery(sql);
            while (r.next()) {
                tbltampil.addRow(new Object[] {
                    r.getString(1),
                    r.getString(2),
                    r.getString(3),
                    r.getString(4),
                    r.getString(5),
                    r.getString(6)
                });}
                tblLaporan.setModel(tbltampil);
            } catch (Exception e) {
                System.out.println(e);
            }
        
            } else if (cbLaporan.getSelectedItem().toString().equals("Pembelian Barang")) {
                DefaultTableModel tbltampil = new DefaultTableModel();
            
            tbltampil.addColumn("ID");
            tbltampil.addColumn("No. Beli");
            tbltampil.addColumn("Kode Barang");
            tbltampil.addColumn("Jumlah Beli");
            tbltampil.addColumn("Tanggal Beli");
            tbltampil.addColumn("Kode Supplier");
            
        try {
            Connection c=ClassDatabase.getkoneksi();
            Statement s=c.createStatement();
            String sql = "SELECT * FROM acc WHERE no_beli LIKE '%" + tampilkanTF.getText() + "%'" +
            "OR kodea LIKE '%" + tampilkanTF.getText() + "%'";
            ResultSet r=s.executeQuery(sql);
            while (r.next()) {
                tbltampil.addRow(new Object[] {
                    r.getString(1),
                    r.getString(2),
                    r.getString(3),
                    r.getString(4),
                    r.getString(5),
                    r.getString(6)
                });}
                tblLaporan.setModel(tbltampil);
            } catch (Exception e) {
                System.out.println(e);
            }
        
            }
    }//GEN-LAST:event_tampilkanTFKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cariBT;
    private javax.swing.JComboBox<String> cbLaporan;
    private javax.swing.JButton cetakBT;
    private javax.swing.JButton closeBT;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField tampilkanTF;
    private javax.swing.JTable tblLaporan;
    private com.toedter.calendar.JDateChooser tglakhirTF;
    private com.toedter.calendar.JDateChooser tglawalTF;
    // End of variables declaration//GEN-END:variables
}

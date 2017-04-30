package View;

import Control.PegawaiDAO;
import Control.PeminjamDAO;
import Model.Peminjam;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author 1573001, 1573004
 *         Nucky, Adiel
 */
public class ListPeminjam extends javax.swing.JFrame {
    String col[] = {"No Identitas","Jenis Identitas", "Nama", "Alamat", "No.Telp"};
    DefaultTableModel tab = new DefaultTableModel(col,0);
    int a = -1;
    PeminjamDAO daoP = new PeminjamDAO();
    /**
     * Creates new form ListBuku
     */
    public ListPeminjam() {
        initComponents();
        setLocationRelativeTo(null);
        printTable();
    }
    private void clear() {
        identitas.setText("");
        jenis.setSelectedIndex(0);
        nama.setText("");
        alamat.setText("");
        notlp.setText("");
        cari.setText("");
        dasar.setSelectedIndex(0);
        a=-1;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        nama = new javax.swing.JTextField();
        alamat = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        identitas = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        notlp = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jenis = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jButton5 = new javax.swing.JButton();
        cari = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        dasar = new javax.swing.JComboBox<>();
        jButton6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("List Member");

        jLabel1.setFont(new java.awt.Font("Sylfaen", 1, 24)); // NOI18N
        jLabel1.setText("List Peminjam");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Input Peminjam"));

        jLabel5.setText("Alamat");

        jLabel6.setText("Nama Lengkap");

        jButton1.setText("Clear");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Simpan");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Edit");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Hapus");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel7.setText("No Identitas");

        jLabel10.setText("Jenis Identitas");

        jLabel11.setText("No Telpon");

        jenis.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Jenis Identitas", "KTP", "SIM" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5))
                        .addGap(49, 49, 49)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(nama, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
                            .addComponent(alamat)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton4)
                            .addComponent(jButton2)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel10))
                        .addGap(52, 52, 52)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(identitas, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
                            .addComponent(jenis, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel11)
                        .addGap(75, 75, 75)
                        .addComponent(notlp)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButton1, jButton2, jButton3, jButton4});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(identitas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jenis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(nama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(alamat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(notlp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4)
                    .addComponent(jButton3))
                .addContainerGap(117, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jButton1, jButton2, jButton3, jButton4});

        table.setModel(tab);
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table);

        jButton5.setText("Kembali");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel8.setText("Cari");

        jLabel9.setText("Berdasarkan");

        dasar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tampil Semua", "No Identitas", "Jenis Identitas", "Nama Lengkap", "Alamat", "No Telpon" }));

        jButton6.setText("Cari");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 507, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel8))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(dasar, 0, 114, Short.MAX_VALUE)
                                    .addComponent(cari))
                                .addGap(18, 18, 18)
                                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(dasar, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)
                            .addComponent(jButton6))
                        .addGap(4, 4, 4)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        Home h = new Home();
        this.setVisible(false);
        h.setVisible(true);       
    }//GEN-LAST:event_jButton5ActionPerformed
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        clear();
    }//GEN-LAST:event_jButton1ActionPerformed
    public void printTable()
        {
            tab.getDataVector().removeAllElements();
            daoP.getAllPeminjam().stream().forEach((pp) -> {
                tab.addRow(
                        new Object[]
                        {
                            pp.getNomoridentitas(),
                            pp.getJenisidentitas(),
                            pp.getNamalengkap(),
                            pp.getAlamatpeminjam(),
                            pp.getNomorteleponpeminjam()
                        }
                );
        });
            table.repaint();
         }
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            if(identitas.getText().equals(""))
                JOptionPane.showMessageDialog(this, "Masukan Nomor Identitas Peminjam");
            else if(nama.getText().equals(""))
                JOptionPane.showMessageDialog(this, "Masukan Nama Pegawai");
            else if(alamat.getText().equals(""))
                JOptionPane.showMessageDialog(this, "Masukan Alamat Pegawai");
            else if(notlp.getText().equals(""))
                JOptionPane.showMessageDialog(this, "Masukan No Telepon Pegawai");
            else if(jenis.getSelectedIndex() == 0 )
                JOptionPane.showMessageDialog(this, "Masukan Jenis Identitas");
            else {
                Peminjam pp = new Peminjam();
                pp.setNomoridentitas(identitas.getText());
                pp.setJenisidentitas(jenis.getSelectedItem().toString());
                pp.setNamalengkap(nama.getText());
                pp.setAlamatpeminjam(alamat.getText());
                pp.setNomorteleponpeminjam(notlp.getText());
                daoP.simpanAtauUpdatePeminjam(pp);
                JOptionPane.showMessageDialog(this, "Data Telah Disimpan!");
                printTable();
                table.repaint();
            }
        }
        catch(Exception e)
        {
            System.out.println(e.toString());
            JOptionPane.showMessageDialog(this, "Data gagal disimpan");
        }
        
        clear();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try {
            if(identitas.getText().equals(""))
                JOptionPane.showMessageDialog(this, "Masukan Nomor Identitas Peminjam");
            else if(nama.getText().equals(""))
                JOptionPane.showMessageDialog(this, "Masukan Nama Pegawai");
            else if(alamat.getText().equals(""))
                JOptionPane.showMessageDialog(this, "Masukan Alamat Pegawai");
            else if(notlp.getText().equals(""))
                JOptionPane.showMessageDialog(this, "Masukan No Telepon Pegawai");
            else if(jenis.getSelectedIndex() == 0 )
                JOptionPane.showMessageDialog(this, "Masukan Jenis Identitas");
            else {
                try
                {
                    int b = table.getSelectedRow();
                    String id = String.valueOf(table.getModel().getValueAt(b, 0));
                    Peminjam pp = daoP.ambilPeminjamBerdasarkanId(id);
                    pp.setNomoridentitas(identitas.getText());
                pp.setJenisidentitas(jenis.getSelectedItem().toString());
                pp.setNamalengkap(nama.getText());
                pp.setAlamatpeminjam(alamat.getText());
                pp.setNomorteleponpeminjam(notlp.getText());
                    daoP.simpanAtauUpdatePeminjam(pp);
                    JOptionPane.showMessageDialog(this, "Data berhasil di edit!");
                    printTable();
                }
                catch(Exception e)
                {
                    JOptionPane.showMessageDialog(this, "Data gagal diedit!");
                }
            }
        }
        catch(Exception e)
        {
            System.out.println(e.toString());
            JOptionPane.showMessageDialog(this, "Data gagal diedit");
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        int index = table.getSelectedRow();

        identitas.setText(table.getValueAt(index, 0).toString());
        if(table.getValueAt(index,1).toString().equals("KTP"))
            jenis.setSelectedIndex(1);
        else if(table.getValueAt(index,1).toString().equals("SIM"))
            jenis.setSelectedIndex(2);
        nama.setText(table.getValueAt(index, 2).toString());
        alamat.setText(table.getValueAt(index,3).toString());
        notlp.setText(table.getValueAt(index,4).toString());
    }//GEN-LAST:event_tableMouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        a = table.getSelectedRow();
        if(a == -1)
        {
            JOptionPane.showMessageDialog(this, "Pilih data yang akan dihapus!");
        }
        else{
            int btn = JOptionPane.YES_NO_OPTION;
            int dialog = JOptionPane.showConfirmDialog (null, "Hapus Data?","Warning", btn);
             if(dialog == JOptionPane.YES_OPTION){
                String id = String.valueOf(table.getModel().getValueAt(a, 0));
                daoP.hapusPeminjamBerdasarkanId(id);
                JOptionPane.showMessageDialog(this, "Data berhasil dihapus!");
                table.repaint();
             }
             else
            {
                JOptionPane.showMessageDialog(this, "Data tidak dihapus!");
            }
        }
        a = -1;
        printTable();
        clear();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        tab.getDataVector().removeAllElements();
        if(dasar.getSelectedIndex() == 0)
        {
            cari.setText("");
            printTable();
        }
        else if(dasar.getSelectedIndex() == 1)
        {
            for(Peminjam pp : daoP.getAllPeminjam())
            {
                if(cari.getText().equalsIgnoreCase(String.valueOf(pp.getNomoridentitas())))
                {
                    tab.addRow(
                        new Object[]
                        {
                            pp.getNomoridentitas(),
                        pp.getJenisidentitas(),
                        pp.getNamalengkap(),
                        pp.getAlamatpeminjam(),
                        pp.getNomorteleponpeminjam()
                        }
                    );
                }
            }
        }
        else if(dasar.getSelectedIndex() == 2)
        {
            for(Peminjam pp : daoP.getAllPeminjam())
            {
                if(cari.getText().equalsIgnoreCase(String.valueOf(pp.getNamalengkap())))
                {
                    tab.addRow(
                        new Object[]
                        {
                            pp.getNomoridentitas(),
                        pp.getJenisidentitas(),
                        pp.getNamalengkap(),
                        pp.getAlamatpeminjam(),
                        pp.getNomorteleponpeminjam()
                        }
                    );
                }
            }
        }
        else if(dasar.getSelectedIndex() == 3)
        {
            for(Peminjam pp : daoP.getAllPeminjam())
            {
                if(cari.getText().equalsIgnoreCase(String.valueOf(pp.getAlamatpeminjam())))
                {
                    tab.addRow(
                        new Object[]
                        {
                            pp.getNomoridentitas(),
                        pp.getJenisidentitas(),
                        pp.getNamalengkap(),
                        pp.getAlamatpeminjam(),
                        pp.getNomorteleponpeminjam()
                        }
                    );
                }
            }
        }
        else if(dasar.getSelectedIndex() == 4)
        {
            for(Peminjam pp : daoP.getAllPeminjam())
            {
                if(cari.getText().equalsIgnoreCase(String.valueOf(pp.getNomorteleponpeminjam())))
                {
                    tab.addRow(
                        new Object[]
                        {
                            pp.getNomoridentitas(),
                        pp.getJenisidentitas(),
                        pp.getNamalengkap(),
                        pp.getAlamatpeminjam(),
                        pp.getNomorteleponpeminjam()
                        }
                    );
                }
            }
        }
        table.repaint();
    }//GEN-LAST:event_jButton6ActionPerformed

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
            java.util.logging.Logger.getLogger(ListPeminjam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListPeminjam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListPeminjam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListPeminjam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListPeminjam().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField alamat;
    private javax.swing.JTextField cari;
    private javax.swing.JComboBox<String> dasar;
    private javax.swing.JTextField identitas;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> jenis;
    private javax.swing.JTextField nama;
    private javax.swing.JTextField notlp;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables

    
}

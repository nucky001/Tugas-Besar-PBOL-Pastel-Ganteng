package View;


import Control.MobilDAO;
import Control.PegawaiDAO;
import Model.Karyawan;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;

/**
 *
 * @author 1573001, 1573004
 *         Nucky, Adiel
 */
public class ListPegawai extends javax.swing.JFrame {
    String col[] = {"Kode Pegawai", "Jabatan", "Nomor Identitas", "Nama Karyawan", "Alamat Karyawan", "No telpon", "Nomor Identitas SIM"};
    DefaultTableModel tab = new DefaultTableModel(col,0);
    int a = -1;
    PegawaiDAO daoP = new PegawaiDAO();

    public ListPegawai() {
        initComponents();
        setLocationRelativeTo(null);
        printTable();
    }

    public void printTable()
    {
        tab.getDataVector().removeAllElements();
        for (Karyawan pp : daoP.getAllPegawai()) {
            tab.addRow(
                new Object[]
                {
                    pp.getKodepegawai(),
                    pp.getJabatan(),
                    pp.getNomoridentitasktp(),
                    pp.getNamakaryawan(),
                    pp.getAlamatkaryawan(),
                    pp.getNotelpkaryawan(),
                    pp.getNomoridentitassim()
                }
            );
        }
        table.repaint();
     }
    private void clear() {
        kode.setText("");
        jabatan.setSelectedIndex(0);
        identitas.setText("");
        nama.setText("");
        alamat.setText("");
        notelp.setText("");
        cari.setText("");
        sim.setText("");
        a=-1;
        printTable();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        kode = new javax.swing.JTextField();
        nama = new javax.swing.JTextField();
        alamat = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        identitas = new javax.swing.JTextField();
        jabatan = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        notelp = new javax.swing.JTextField();
        sim = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jButton5 = new javax.swing.JButton();
        cari = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        dasar = new javax.swing.JComboBox<>();
        jButton6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("List Pegawai");

        jLabel1.setFont(new java.awt.Font("Sylfaen", 1, 24)); // NOI18N
        jLabel1.setText("List Pegawai");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Input Pegawai"));

        jLabel2.setText("Kode Pegawai");

        jLabel3.setText("Nomor Identitas");

        jLabel5.setText("Alamat Karyawan");

        jLabel6.setText("Nama Karyawan");

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

        jLabel7.setText("No.Telpon");

        jLabel4.setText("Jabatan");

        jabatan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Jabatan", "Admin", "Pegawai" }));

        jLabel10.setText("No Identitas SIM");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(jLabel10))
                        .addGap(52, 52, 52)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(kode)
                            .addComponent(jabatan, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(nama, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
                            .addComponent(identitas, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                            .addComponent(alamat, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
                            .addComponent(notelp)
                            .addComponent(sim))))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButton1, jButton2, jButton3, jButton4});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {alamat, identitas, nama});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(kode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jabatan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel10)
                        .addComponent(sim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(identitas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(alamat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(notelp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addContainerGap(53, Short.MAX_VALUE))
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

        dasar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tampil Semua", "Kode Pegawai", "Jabatan", "Nomor Identitas", "Nama Karyawan", "Alamat Karyawan", "No. Telpon", "No Identitas SIM" }));
        dasar.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                dasarItemStateChanged(evt);
            }
        });

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
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 412, Short.MAX_VALUE)
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
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)))
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

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            if(kode.getText().equals(""))
                JOptionPane.showMessageDialog(this, "Masukan Kode Pegawai");
            else if(jabatan.getSelectedIndex() == 0)
                JOptionPane.showMessageDialog(this, "Masukan Jabatan Pegawai");
            else if(identitas.getText().equals(""))
                JOptionPane.showMessageDialog(this, "Masukan Identitas Pegawai");
            else if(nama.getText().equals(""))
                JOptionPane.showMessageDialog(this, "Masukan Nama Pegawai");
            else if(alamat.getText().equals(""))
                JOptionPane.showMessageDialog(this, "Masukan Alamat Pegawai");
            else if(notelp.getText().equals(""))
                JOptionPane.showMessageDialog(this, "Masukan No Telepon Pegawai");
            else if(sim.getText().equals(""))
                JOptionPane.showMessageDialog(this, "Masukan SIM Pegawai");
            else {
                Karyawan pp = new Karyawan();
                pp.setKodepegawai(kode.getText());
                pp.setJabatan(jabatan.getSelectedItem().toString());
                pp.setNomoridentitasktp(identitas.getText());
                pp.setNamakaryawan(nama.getText());
                pp.setAlamatkaryawan(alamat.getText());
                pp.setNotelpkaryawan(notelp.getText());
                pp.setNomoridentitassim(sim.getText());
                daoP.simpanAtauUpdatePegawai(pp);
                JOptionPane.showMessageDialog(this, "Data Telah Disimpan!");
                printTable();
                table.repaint();
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this, "Data gagal disimpan");
        }
        
        clear();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try {
            if(kode.getText().equals(""))
                JOptionPane.showMessageDialog(this, "Masukan Kode Pegawai");
            else if(jabatan.getSelectedIndex() == 0)
                JOptionPane.showMessageDialog(this, "Masukan Jabatan Pegawai");
            else if(identitas.getText().equals(""))
                JOptionPane.showMessageDialog(this, "Masukan Identitas Pegawai");
            else if(nama.getText().equals(""))
                JOptionPane.showMessageDialog(this, "Masukan Nama Pegawai");
            else if(alamat.getText().equals(""))
                JOptionPane.showMessageDialog(this, "Masukan Alamat Pegawai");
            else if(notelp.getText().equals(""))
                JOptionPane.showMessageDialog(this, "Masukan No Telepon Pegawai");
            else if(sim.getText().equals(""))
                JOptionPane.showMessageDialog(this, "Masukan SIM Pegawai");
            else {
                try
                {
                    int b = table.getSelectedRow();
                    String id = String.valueOf(table.getModel().getValueAt(b, 0));
                    Karyawan pp = daoP.ambilPegawaiBerdasarkanId(id);
                    pp.setKodepegawai(kode.getText());
                    pp.setJabatan(jabatan.getSelectedItem().toString());
                    pp.setNomoridentitasktp(identitas.getText());
                    pp.setNamakaryawan(nama.getText());
                    pp.setAlamatkaryawan(alamat.getText());
                    pp.setNotelpkaryawan(notelp.getText());
                    pp.setNomoridentitassim(sim.getText());
                    daoP.simpanAtauUpdatePegawai(pp);
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
            JOptionPane.showMessageDialog(this, "Data gagal diedit");
        }
        
        
    }//GEN-LAST:event_jButton3ActionPerformed

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
                daoP.hapusPegawaiBerdasarkanId(id);
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

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        int index = table.getSelectedRow();

        kode.setText(table.getValueAt(index, 0).toString());
        if(table.getValueAt(index,5).toString().equals("Admin"))
            jabatan.setSelectedIndex(1);
        else if(table.getValueAt(index,5).toString().equals("Pegawai"))
            jabatan.setSelectedIndex(2);
        identitas.setText(table.getValueAt(index, 2).toString());
        nama.setText(table.getValueAt(index,3).toString());
        alamat.setText(table.getValueAt(index,4).toString());
        notelp.setText(table.getValueAt(index,5).toString());
        sim.setText(table.getValueAt(index,6).toString());
    }//GEN-LAST:event_tableMouseClicked

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        tab.getDataVector().removeAllElements();
        if(dasar.getSelectedIndex() == 0)
        {
            cari.setText("");
            printTable();
        }
        else if(dasar.getSelectedIndex() == 1)
        {
            for(Karyawan pp : daoP.getAllPegawai())
            {
                if(cari.getText().equalsIgnoreCase(String.valueOf(pp.getKodepegawai())))
                {
                    tab.addRow(
                        new Object[]
                        {
                            pp.getKodepegawai(),
                    pp.getJabatan(),
                    pp.getNomoridentitasktp(),
                    pp.getNamakaryawan(),
                    pp.getAlamatkaryawan(),
                    pp.getNotelpkaryawan(),
                    pp.getNomoridentitassim()
                        }
                    );
                }
            }
        }
        else if(dasar.getSelectedIndex() == 2)
        {
            for(Karyawan pp : daoP.getAllPegawai())
            {
                if(cari.getText().equalsIgnoreCase(String.valueOf(pp.getJabatan())))
                {
                    tab.addRow(
                        new Object[]
                        {
                            pp.getKodepegawai(),
                    pp.getJabatan(),
                    pp.getNomoridentitasktp(),
                    pp.getNamakaryawan(),
                    pp.getAlamatkaryawan(),
                    pp.getNotelpkaryawan(),
                    pp.getNomoridentitassim()
                        }
                    );
                }
            }
        }
        else if(dasar.getSelectedIndex() == 3)
        {
            for(Karyawan pp : daoP.getAllPegawai())
            {
                if(cari.getText().equalsIgnoreCase(String.valueOf(pp.getNomoridentitasktp())))
                {
                    tab.addRow(
                        new Object[]
                        {
                            pp.getKodepegawai(),
                    pp.getJabatan(),
                    pp.getNomoridentitasktp(),
                    pp.getNamakaryawan(),
                    pp.getAlamatkaryawan(),
                    pp.getNotelpkaryawan(),
                    pp.getNomoridentitassim()
                        }
                    );
                }
            }
        }
        else if(dasar.getSelectedIndex() == 4)
        {
            for(Karyawan pp : daoP.getAllPegawai())
            {
                if(cari.getText().equalsIgnoreCase(String.valueOf(pp.getNamakaryawan())))
                {
                    tab.addRow(
                        new Object[]
                        {
                            pp.getKodepegawai(),
                    pp.getJabatan(),
                    pp.getNomoridentitasktp(),
                    pp.getNamakaryawan(),
                    pp.getAlamatkaryawan(),
                    pp.getNotelpkaryawan(),
                    pp.getNomoridentitassim()
                        }
                    );
                }
            }
        }
        else if(dasar.getSelectedIndex() == 5)
        {
            for(Karyawan pp : daoP.getAllPegawai())
            {
                if(cari.getText().equalsIgnoreCase(String.valueOf(pp.getAlamatkaryawan())))
                {
                    tab.addRow(
                        new Object[]
                        {
                           pp.getKodepegawai(),
                    pp.getJabatan(),
                    pp.getNomoridentitasktp(),
                    pp.getNamakaryawan(),
                    pp.getAlamatkaryawan(),
                    pp.getNotelpkaryawan(),
                    pp.getNomoridentitassim()
                        }
                    );
                }
            }
        }
        else if(dasar.getSelectedIndex() == 6)
        {
            for(Karyawan pp : daoP.getAllPegawai())
            {
                if(cari.getText().equalsIgnoreCase(String.valueOf(pp.getNotelpkaryawan())))
                {
                    tab.addRow(
                        new Object[]
                        {
                            pp.getKodepegawai(),
                    pp.getJabatan(),
                    pp.getNomoridentitasktp(),
                    pp.getNamakaryawan(),
                    pp.getAlamatkaryawan(),
                    pp.getNotelpkaryawan(),
                    pp.getNomoridentitassim()
                        }
                    );
                }
            }
        }
        else if(dasar.getSelectedIndex() == 7)
        {
            for(Karyawan pp : daoP.getAllPegawai())
            {
                if(cari.getText().equalsIgnoreCase(String.valueOf(pp.getNomoridentitassim())))
                {
                    tab.addRow(
                        new Object[]
                        {
                            pp.getKodepegawai(),
                    pp.getJabatan(),
                    pp.getNomoridentitasktp(),
                    pp.getNamakaryawan(),
                    pp.getAlamatkaryawan(),
                    pp.getNotelpkaryawan(),
                    pp.getNomoridentitassim()
                        }
                    );
                }
            }
        }
        table.repaint();
        
    }//GEN-LAST:event_jButton6ActionPerformed

    private void dasarItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_dasarItemStateChanged
 
    }//GEN-LAST:event_dasarItemStateChanged


    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListPegawai().setVisible(true);
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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> jabatan;
    private javax.swing.JTextField kode;
    private javax.swing.JTextField nama;
    private javax.swing.JTextField notelp;
    private javax.swing.JTextField sim;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables

}

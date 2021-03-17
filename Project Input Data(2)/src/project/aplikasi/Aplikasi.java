package project.aplikasi; //package
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

public class Aplikasi extends javax.swing.JFrame { //class & inheritance
    DefaultTableModel model;

    public Aplikasi () { //constructor
        initComponents();
        setTable();
    }
    
    private void setTable(){ //encapsulation
        Object[] field = {"Nama","Mata Kuliah", "Kehadiran", "Nilai Tugas", "Nilai UTS", "Nilai UAS", "Rata - Rata", "Keterangan"};
        model = new DefaultTableModel(field, 0);
        jTable2.setModel(model);
        JTableHeader th = jTable2.getTableHeader();
        th.setReorderingAllowed(false);
        jTable2.setRowHeight(16);
    }
    
    //non-void method
    private String calculate(String... utm){
        for (int i = 0; i < utm.length; i++){
                if(utm[i].isEmpty()){
                    utm[i] = "0";
                }
        }
        double t1=0,t2=0,t3=0,t4=0;
        for (int i = 0; i < utm.length; i++) {
            double cv = Double.valueOf(utm[i]);
            switch (i) {
                case 0:
                    t1 = cv * 0.1;
                    break;
                case 1:
                    t2 = cv * 0.3;
                    break;
                case 2:
                    t3 = cv * 0.2;
                    break;
                case 3:
                    t4 = cv * 0.4;
                    break;
                default:
                    break;
            }
        }
        double jumlah = t1+t2+t3+t4;
        double as = Math.round(jumlah);
        String cvJumlah = indexOF(as);
        return cvJumlah;
    }
    
    public String indexOF(double b){
        String hsl;
        if(b %1 == 0){
            hsl = String.valueOf(b).substring(0,String.valueOf(b).lastIndexOf("."));
        }else{
            hsl = String.valueOf(b);
        }
        return hsl;
    }
    
    private String calAbjad(String jumlah){
        String nilai = "";
        double b = Double.valueOf(jumlah);
        if(b <= 100 && b >= 80){
            nilai = "A";
        }else if(b <= 79 && b >= 60){
            nilai = "B";
        }else if(b <= 69 && b >= 40){
            nilai = "C";
        }else if(b <= 39){
            nilai = "D";
        }
        return nilai;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        tmatkul = new javax.swing.JTextField();
        tkehadiran = new javax.swing.JTextField();
        ttugas = new javax.swing.JTextField();
        tuts = new javax.swing.JTextField();
        tuas = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Simpan = new javax.swing.JButton();
        jHapus = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        tnama = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel5.setBackground(new java.awt.Color(0, 102, 102));
        jPanel5.setPreferredSize(new java.awt.Dimension(360, 40));

        jLabel14.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(153, 153, 153));
        jLabel14.setText("PROGRAM INPUT NILAI");

        jLabel15.setFont(new java.awt.Font("Tw Cen MT", 1, 36)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("X");
        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel15MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(406, Short.MAX_VALUE)
                .addComponent(jLabel14)
                .addGap(371, 371, 371)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel1.setBackground(new java.awt.Color(255, 204, 51));
        jPanel1.setName(""); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tmatkul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tmatkulActionPerformed(evt);
            }
        });
        jPanel1.add(tmatkul, new org.netbeans.lib.awtextra.AbsoluteConstraints(189, 141, 209, 29));

        tkehadiran.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tkehadiranActionPerformed(evt);
            }
        });
        jPanel1.add(tkehadiran, new org.netbeans.lib.awtextra.AbsoluteConstraints(189, 183, 209, 29));
        jPanel1.add(ttugas, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 99, 199, 30));
        jPanel1.add(tuts, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 141, 199, 29));
        jPanel1.add(tuas, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 182, 199, 30));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setText("Mata Kuliah");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(61, 147, 95, -1));

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("MENGIHITUNG NILAI AKHIR MAHASISWA");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, 615, 40));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setText("Kehadiran");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(61, 190, -1, 14));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setText("Nilai Tugas");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(579, 99, -1, 30));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setText("Nilai UTS");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(579, 141, -1, 29));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setText("Nilai UAS");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(579, 189, -1, -1));

        Simpan.setBackground(new java.awt.Color(0, 0, 0));
        Simpan.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Simpan.setForeground(new java.awt.Color(255, 255, 255));
        Simpan.setText("Simpan");
        Simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SimpanActionPerformed(evt);
            }
        });
        jPanel1.add(Simpan, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 270, 101, 35));

        jHapus.setBackground(new java.awt.Color(0, 0, 0));
        jHapus.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jHapus.setForeground(new java.awt.Color(0, 204, 204));
        jHapus.setText("Reset");
        jHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jHapusActionPerformed(evt);
            }
        });
        jPanel1.add(jHapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 270, 99, 35));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel7.setText("Nama");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(61, 99, -1, -1));
        jPanel1.add(tnama, new org.netbeans.lib.awtextra.AbsoluteConstraints(189, 99, 209, 30));

        jButton4.setBackground(new java.awt.Color(0, 0, 0));
        jButton4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 153, 153));
        jButton4.setText("Keluar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 270, 99, 35));

        jTable2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTable2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nama", "Mata Kuliah", "Kehadiran", "Nilai Tugas", "Nilai UTS", "Nilai UAS", "Rata - Rata", "Keterangan"
            }
        ));
        jScrollPane1.setViewportView(jTable2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 956, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 956, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 35, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 570, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tmatkulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tmatkulActionPerformed
        
    }//GEN-LAST:event_tmatkulActionPerformed

    //acceess modifier (private modifier)
    private void SimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SimpanActionPerformed
        //local variable
        String nama = tnama.getText();
        String MK = tmatkul.getText();
        String hadir = tkehadiran.getText();
        String uts = tuts.getText();
        String tugas = ttugas.getText();
        String uas = tuas.getText();
        
        if(MK.isEmpty()){
            JOptionPane.showMessageDialog(this, "Lengkapi Masukan Anda !");

        }else{
            String[] data = {hadir, uts, tugas, uas};
            
            String jml = calculate(data);
            Object[] data2 = {nama, MK, hadir, uts, tugas, uas, jml, calAbjad(jml)};
            model.addRow(data2);
            JOptionPane.showMessageDialog(this, "    Data Anda Berhasil Disimpan :)\nSilahkan Reset Untuk Menambah Data");
        }
    }//GEN-LAST:event_SimpanActionPerformed

    private void jHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jHapusActionPerformed
        tnama.setText("");
        tmatkul.setText("");
        tkehadiran.setText("");
        tuts.setText("");
        ttugas.setText("");
        tuas.setText("");
    }//GEN-LAST:event_jHapusActionPerformed

    //void method
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
         System.exit(0);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jLabel15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseClicked
        //menutup window
        System.exit(0);
    }//GEN-LAST:event_jLabel15MouseClicked

    private void tkehadiranActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tkehadiranActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tkehadiranActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Aplikasi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Simpan;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jHapus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField tkehadiran;
    private javax.swing.JTextField tmatkul;
    private javax.swing.JTextField tnama;
    private javax.swing.JTextField ttugas;
    private javax.swing.JTextField tuas;
    private javax.swing.JTextField tuts;
    // End of variables declaration//GEN-END:variables
}

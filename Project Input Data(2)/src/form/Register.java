package form; //package

public class Register extends javax.swing.JFrame { //class & inheritance

    public static String username; //static variable
    public static String password; //static variable
    public Register() { //constructor
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        UsernameLabel = new javax.swing.JLabel();
        UsernameInput = new javax.swing.JTextField();
        Invalid = new javax.swing.JLabel();
        Password = new javax.swing.JPasswordField();
        Register = new javax.swing.JButton();
        PasswordLabel1 = new javax.swing.JLabel();
        PasswordLabel2 = new javax.swing.JLabel();
        Retype = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setPreferredSize(new java.awt.Dimension(360, 40));

        jLabel5.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 153, 153));
        jLabel5.setText("PROGRAM INPUT NILAI");

        jLabel3.setFont(new java.awt.Font("Tw Cen MT", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("X");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(371, 371, 371)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setForeground(new java.awt.Color(255, 255, 51));
        jPanel2.setFont(new java.awt.Font("Tw Cen MT", 0, 12)); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tw Cen MT", 1, 40)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("HELLO!");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, 851, 63));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 204, 204));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Insert your Data :");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 851, -1));

        UsernameLabel.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        UsernameLabel.setForeground(new java.awt.Color(255, 255, 51));
        UsernameLabel.setText("Username");
        jPanel2.add(UsernameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 170, 106, 25));

        UsernameInput.setBackground(new java.awt.Color(102, 102, 102));
        UsernameInput.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        UsernameInput.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(UsernameInput, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 170, 149, 25));

        Invalid.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        Invalid.setForeground(new java.awt.Color(153, 0, 0));
        Invalid.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Invalid.setText(" ");
        jPanel2.add(Invalid, new org.netbeans.lib.awtextra.AbsoluteConstraints(337, 259, 320, 25));

        Password.setBackground(new java.awt.Color(102, 102, 102));
        Password.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        Password.setForeground(new java.awt.Color(0, 0, 0));
        Password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasswordActionPerformed(evt);
            }
        });
        jPanel2.add(Password, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 200, 149, 25));

        Register.setBackground(new java.awt.Color(0, 0, 0));
        Register.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        Register.setForeground(new java.awt.Color(0, 204, 204));
        Register.setText("Register");
        Register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegisterActionPerformed(evt);
            }
        });
        jPanel2.add(Register, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 310, -1, -1));

        PasswordLabel1.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        PasswordLabel1.setForeground(new java.awt.Color(255, 255, 51));
        PasswordLabel1.setText("Password");
        jPanel2.add(PasswordLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 210, 106, -1));

        PasswordLabel2.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        PasswordLabel2.setForeground(new java.awt.Color(255, 255, 51));
        PasswordLabel2.setText("Re-Type Password");
        jPanel2.add(PasswordLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 240, -1, -1));

        Retype.setBackground(new java.awt.Color(102, 102, 102));
        Retype.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        Retype.setForeground(new java.awt.Color(0, 0, 0));
        Retype.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RetypeActionPerformed(evt);
            }
        });
        jPanel2.add(Retype, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 230, 150, 25));

        jLabel4.setIcon(new javax.swing.ImageIcon("G:\\2019\\Class\\SEMESTER 3\\PBO\\Project Input Data(2)\\src\\form\\beautiful-university-cartoon-with-green-grass-vector-9890624-removebg-preview.png")); // NOI18N
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 70, 370, 500));

        jLabel6.setIcon(new javax.swing.ImageIcon("G:\\2019\\Class\\SEMESTER 3\\PBO\\Project Input Data(2)\\src\\form\\23356.png")); // NOI18N
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 270, 250));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 950, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //access modifier (private modifier)
    private void PasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasswordActionPerformed
        
    }//GEN-LAST:event_PasswordActionPerformed

    //void method
    private void RegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegisterActionPerformed
        //encapsulation
        if(Retype.getText().equals(Password.getText())){
            //input output
            username = UsernameInput.getText(); //local variable
            password = Password.getText(); //local variable
            
            //kalo berhasil akan beralih ke form login
            Login lg = new Login(); //object
            lg.setVisible(true);
            lg.pack();
            lg.setLocationRelativeTo(null);
            lg.setDefaultCloseOperation(Login.EXIT_ON_CLOSE);
        }
        else{
            Invalid.setText("The Password doesn't match");
        
        }
    }//GEN-LAST:event_RegisterActionPerformed

    private void RetypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RetypeActionPerformed
        
    }//GEN-LAST:event_RetypeActionPerformed

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        //menutup window jika meng-klik label X
        System.exit(0);
    }//GEN-LAST:event_jLabel3MouseClicked

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Invalid;
    private javax.swing.JPasswordField Password;
    private javax.swing.JLabel PasswordLabel1;
    private javax.swing.JLabel PasswordLabel2;
    private javax.swing.JButton Register;
    private javax.swing.JPasswordField Retype;
    private javax.swing.JTextField UsernameInput;
    private javax.swing.JLabel UsernameLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}

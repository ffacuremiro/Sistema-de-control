/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Facu
 */
public class admin_login extends javax.swing.JFrame {

    /**
     * Creates new form admin_login
     */
    public admin_login() {
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
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_pass = new javax.swing.JTextField();
        txt_user = new javax.swing.JTextField();
        atras = new javax.swing.JButton();
        exit1 = new javax.swing.JButton();
        aceptar = new javax.swing.JButton();
        error_msg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(33, 33, 32));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(22, 23, 29));

        jLabel1.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ADMIN ACCESS");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(125, 125, 125)
                .addComponent(jLabel1)
                .addContainerGap(152, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 40));

        jLabel2.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("CONTRASEÑA:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, -1, -1));

        jLabel3.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("USUARIO:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));

        txt_pass.setBackground(new java.awt.Color(41, 46, 73));
        txt_pass.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 12)); // NOI18N
        txt_pass.setForeground(new java.awt.Color(255, 255, 255));
        txt_pass.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_pass.setBorder(null);
        txt_pass.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        jPanel1.add(txt_pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 160, 170, 20));

        txt_user.setBackground(new java.awt.Color(41, 46, 73));
        txt_user.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 12)); // NOI18N
        txt_user.setForeground(new java.awt.Color(255, 255, 255));
        txt_user.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_user.setBorder(null);
        txt_user.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        jPanel1.add(txt_user, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 100, 170, 20));

        atras.setBackground(new java.awt.Color(72, 85, 99));
        atras.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 12)); // NOI18N
        atras.setForeground(new java.awt.Color(255, 255, 255));
        atras.setText("ATRAS");
        atras.setBorderPainted(false);
        atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atrasActionPerformed(evt);
            }
        });
        jPanel1.add(atras, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 100, 20));

        exit1.setBackground(new java.awt.Color(72, 85, 99));
        exit1.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 12)); // NOI18N
        exit1.setForeground(new java.awt.Color(255, 255, 255));
        exit1.setText("SALIR");
        exit1.setBorderPainted(false);
        exit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exit1ActionPerformed(evt);
            }
        });
        jPanel1.add(exit1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 260, 80, 20));

        aceptar.setBackground(new java.awt.Color(72, 85, 99));
        aceptar.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 12)); // NOI18N
        aceptar.setForeground(new java.awt.Color(255, 255, 255));
        aceptar.setText("ACEPTAR");
        aceptar.setBorderPainted(false);
        aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceptarActionPerformed(evt);
            }
        });
        jPanel1.add(aceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 260, 100, 20));

        error_msg.setForeground(new java.awt.Color(255, 255, 255));
        error_msg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(error_msg, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, 250, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void atrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atrasActionPerformed
        
        Consultar1 newframe = new Consultar1();
        newframe.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_atrasActionPerformed

    private void exit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exit1ActionPerformed
        
        dispose();
    }//GEN-LAST:event_exit1ActionPerformed

    private void aceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptarActionPerformed
        
        String user =  "admin644";
        String password = "admin123";
        
        String usuario;
        String pass;
        
        usuario = txt_user.getText();
        pass =  txt_pass.getText();
        
        if(txt_user.getText().equals(user) && txt_pass.getText().equals(password)){
            
            Admin newframe = new Admin();
            newframe.setVisible(true);
            this.dispose();
            
        } else {
        
            error_msg.setText("Usuario y/o contraseña incorrecta");
        }
        
        
        
    }//GEN-LAST:event_aceptarActionPerformed

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
            java.util.logging.Logger.getLogger(admin_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(admin_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(admin_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(admin_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new admin_login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aceptar;
    private javax.swing.JButton atras;
    private javax.swing.JLabel error_msg;
    private javax.swing.JButton exit1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txt_pass;
    private javax.swing.JTextField txt_user;
    // End of variables declaration//GEN-END:variables
}
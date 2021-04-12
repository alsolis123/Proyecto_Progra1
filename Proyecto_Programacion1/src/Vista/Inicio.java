
package Vista;

import Clases.Persona;
import javax.swing.JOptionPane;


public class Inicio extends javax.swing.JFrame {
    public String usuario_inicio;
    
    public Inicio() {
        initComponents();
        setLocationRelativeTo(null);
//        Presionar enter y presionar ingresar
        this.getRootPane().setDefaultButton(ingresar);
        this.usuario_inicio = "";
        
        
        
//        Textfield transparentes
        usuario.setBackground(new java.awt.Color(0,0,0,1));
        contraseña.setBackground(new java.awt.Color(0,0,0,1));
        
//        Trasnparencia botones

        ingresar.setOpaque(false);
        ingresar.setContentAreaFilled(false);
        ingresar.setBorderPainted(false);
        
        registrarse.setOpaque(false);
        registrarse.setContentAreaFilled(false);
        registrarse.setBorderPainted(false);
        
        
        in_btn_cambiar.setOpaque(false);
        in_btn_cambiar.setContentAreaFilled(false);
        in_btn_cambiar.setBorderPainted(false);
        
        salir.setOpaque(false);
        salir.setContentAreaFilled(false);
        salir.setBorderPainted(false);
        
        
        
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        registrarse = new javax.swing.JButton();
        contraseña = new javax.swing.JPasswordField();
        usuario = new javax.swing.JTextField();
        ingresar = new javax.swing.JButton();
        in_btn_cambiar = new javax.swing.JButton();
        salir = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Frame 1 (1).png"))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        registrarse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarseActionPerformed(evt);
            }
        });
        getContentPane().add(registrarse, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 510, 90, 20));

        contraseña.setFont(new java.awt.Font("Open Sans", 1, 14)); // NOI18N
        contraseña.setForeground(new java.awt.Color(237, 240, 248));
        contraseña.setBorder(null);
        getContentPane().add(contraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 290, 240, 40));

        usuario.setFont(new java.awt.Font("Open Sans", 1, 18)); // NOI18N
        usuario.setForeground(new java.awt.Color(237, 240, 248));
        usuario.setBorder(null);
        usuario.setSelectedTextColor(new java.awt.Color(237, 240, 248));
        usuario.setSelectionColor(new java.awt.Color(237, 240, 248));
        getContentPane().add(usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 200, 240, 40));

        ingresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingresarActionPerformed(evt);
            }
        });
        getContentPane().add(ingresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 410, 150, 50));

        in_btn_cambiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                in_btn_cambiarActionPerformed(evt);
            }
        });
        getContentPane().add(in_btn_cambiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 470, 130, 20));

        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });
        getContentPane().add(salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 0, 50, 40));

        jLabel3.setForeground(new java.awt.Color(237, 240, 248));
        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\alsolis\\Desktop\\Imagenes Java\\Frame 1 (1).png")); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 540));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void GetUsuario(){
        
    }
    
    private void registrarseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarseActionPerformed
        Creacion_usuario registrarse = new Creacion_usuario();
        registrarse.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_registrarseActionPerformed

    private void ingresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingresarActionPerformed
        boolean acceso=false;
        Persona p2 = new Persona();
        
        String usuario = this.usuario.getText();
        String contraseña = this.contraseña.getText();
        
        p2.setUsuario(usuario);
        p2.setContraseña(contraseña);
        
        p2.verificar();
        acceso = p2.isAcceso();
        
        if(acceso == true){
            Distribucion dis = new Distribucion();
            this.setVisible(false);
            dis.setVisible(true);
            usuario_inicio = this.usuario.getText();
        }
    }//GEN-LAST:event_ingresarActionPerformed

    private void in_btn_cambiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_in_btn_cambiarActionPerformed
        Cambiar_contraseña change = new Cambiar_contraseña();
        change.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_in_btn_cambiarActionPerformed

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        this.dispose();
    }//GEN-LAST:event_salirActionPerformed

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
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField contraseña;
    private javax.swing.JButton in_btn_cambiar;
    private javax.swing.JButton ingresar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton registrarse;
    private javax.swing.JButton salir;
    private javax.swing.JTextField usuario;
    // End of variables declaration//GEN-END:variables
}

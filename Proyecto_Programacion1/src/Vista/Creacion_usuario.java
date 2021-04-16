
package Vista;

import Clases.Persona;
import com.sun.awt.AWTUtilities;


public class Creacion_usuario extends javax.swing.JFrame {

    public int x,y;
    
    public Creacion_usuario() {
        initComponents();
        setLocationRelativeTo(null);
        
        //Darle movilidad a la ventana
        
        AWTUtilities.setWindowOpaque(this, false);
        
        //        Textfield transparentes
        nom.setBackground(new java.awt.Color(0,0,0,1));
        ape.setBackground(new java.awt.Color(0,0,0,1));
        email.setBackground(new java.awt.Color(0,0,0,1));
        user.setBackground(new java.awt.Color(0,0,0,1));
        password.setBackground(new java.awt.Color(0,0,0,1));
        
//        Trasnparencia botones

        crear.setOpaque(false);
        crear.setContentAreaFilled(false);
        crear.setBorderPainted(false);
        
        cancelar.setOpaque(false);
        cancelar.setContentAreaFilled(false);
        cancelar.setBorderPainted(false);
        
        exit.setOpaque(false);
        exit.setContentAreaFilled(false);
        exit.setBorderPainted(false);
        
        
        
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nom = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        user = new javax.swing.JTextField();
        ape = new javax.swing.JTextField();
        password = new javax.swing.JTextField();
        crear = new javax.swing.JButton();
        cancelar = new javax.swing.JButton();
        exit = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nom.setFont(new java.awt.Font("Open Sans", 1, 14)); // NOI18N
        nom.setForeground(new java.awt.Color(77, 92, 126));
        nom.setBorder(null);
        nom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomActionPerformed(evt);
            }
        });
        getContentPane().add(nom, new org.netbeans.lib.awtextra.AbsoluteConstraints(145, 79, 170, 40));

        email.setFont(new java.awt.Font("Open Sans", 1, 14)); // NOI18N
        email.setForeground(new java.awt.Color(77, 92, 126));
        email.setBorder(null);
        getContentPane().add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(145, 153, 170, 40));

        user.setFont(new java.awt.Font("Open Sans", 1, 14)); // NOI18N
        user.setForeground(new java.awt.Color(77, 92, 126));
        user.setBorder(null);
        getContentPane().add(user, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 255, 160, 30));

        ape.setFont(new java.awt.Font("Open Sans", 1, 14)); // NOI18N
        ape.setForeground(new java.awt.Color(77, 92, 126));
        ape.setBorder(null);
        getContentPane().add(ape, new org.netbeans.lib.awtextra.AbsoluteConstraints(145, 119, 170, 30));

        password.setFont(new java.awt.Font("Open Sans", 1, 14)); // NOI18N
        password.setForeground(new java.awt.Color(77, 92, 126));
        password.setBorder(null);
        getContentPane().add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 310, 130, 30));

        crear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearActionPerformed(evt);
            }
        });
        getContentPane().add(crear, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 400, 130, 40));

        cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarActionPerformed(evt);
            }
        });
        getContentPane().add(cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 440, 60, 30));

        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        getContentPane().add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(327, 2, 40, 40));

        jLabel2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabel2MouseDragged(evt);
            }
        });
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel2MousePressed(evt);
            }
        });
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 370, 480));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\alsolis\\Desktop\\Imagenes Java\\Crear usuario (3).png")); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void crearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearActionPerformed
        
        
        
        
        //Obtener datos de interfaz grafica
        Persona p1 = new Persona();
        String nomb = nom.getText();
        String apell = ape.getText();
        String correo = email.getText();
        String usuario = user.getText();
        String contra = password.getText();
        boolean condicion = false;
        // Enviar a clase
        p1.setNombre(nomb);
        p1.setApellido(apell);
        p1.setCorreo(correo);
        p1.setUsuario(usuario);
        p1.setContraseña(contra);
        // Ejecutar metodo de clase
        p1.ejecutar();
        condicion = p1.isCondicion();
        
        Inicio ini = new Inicio();
        
        if (condicion == true){
            
            ini.setVisible(true);
            this.setVisible(false);
            
        }
        
        
        
        
        
    }//GEN-LAST:event_crearActionPerformed

    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed
        Inicio ini = new Inicio();
        ini.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_cancelarActionPerformed

    private void nomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitActionPerformed

    private void jLabel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MousePressed
        x = evt.getX();
        y = evt.getY();
    }//GEN-LAST:event_jLabel2MousePressed

    private void jLabel2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseDragged
        this.setLocation(this.getLocation().x + evt.getX() - x, this.getLocation().y + evt.getY() - y);
    }//GEN-LAST:event_jLabel2MouseDragged

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
            java.util.logging.Logger.getLogger(Creacion_usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Creacion_usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Creacion_usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Creacion_usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Creacion_usuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ape;
    private javax.swing.JButton cancelar;
    private javax.swing.JButton crear;
    private javax.swing.JTextField email;
    private javax.swing.JButton exit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField nom;
    private javax.swing.JTextField password;
    private javax.swing.JTextField user;
    // End of variables declaration//GEN-END:variables
}

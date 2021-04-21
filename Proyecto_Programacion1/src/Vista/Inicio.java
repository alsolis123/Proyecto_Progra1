
package Vista;

import Clases.Persona;
import com.sun.awt.AWTUtilities;
import javax.swing.JOptionPane;


public class Inicio extends javax.swing.JFrame {
//    public String usuario_inicio;
    public int x,y;
    
    public Inicio() {
        initComponents();
        setLocationRelativeTo(null);
//        Presionar enter y presionar ingresar
        this.getRootPane().setDefaultButton(ingresar);
        
        
        
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
        
        //Darle movilidad a la ventana
        
        AWTUtilities.setWindowOpaque(this, false);
        
        
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        registrarse = new javax.swing.JButton();
        contraseña = new javax.swing.JPasswordField();
        usuario = new javax.swing.JTextField();
        salir = new javax.swing.JButton();
        ingresar = new javax.swing.JButton();
        in_btn_cambiar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
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

        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });
        getContentPane().add(salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 0, 50, 40));

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
        getContentPane().add(in_btn_cambiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 470, 140, 20));

        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabel1MouseDragged(evt);
            }
        });
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel1MousePressed(evt);
            }
        });
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, -4, 410, 550));

        jLabel3.setForeground(new java.awt.Color(237, 240, 248));
        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\alsolis\\Desktop\\Imagenes Java\\Frame 1 (1).png")); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 540));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    private void registrarseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarseActionPerformed
//        Da acceso a crear usuario
        Creacion_usuario registrarse = new Creacion_usuario();
        registrarse.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_registrarseActionPerformed

    private void ingresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingresarActionPerformed
        boolean acceso=false;
//        Aqui se esta creando un objeto de tipo persona
//        Este objeto va a verificar si el usuario y la contraseña si son los correctos
//          Primero va a ver si el usuario si existe y si es asi entonces luego va a
//          confirmar que la contraseña es la correcta
        Persona p2 = new Persona();
        
//        Va a obtener los valores de la interfaz grafica
        String usuario = this.usuario.getText();
        String contraseña = this.contraseña.getText();
        
//        Aca va a enviar el usuario y contraseña a la clase del objeto que se creo
        p2.setUsuario(usuario);
        p2.setContraseña(contraseña);
        
//        Aca se va a ejecutar el metodo verificar para ver si existe verdaderamente
//        el usuario y contraseña, es solo para ejecutar el metodo
        p2.verificar();
//        Una vez se ejecuto se obtiene el valor de acceso que es un booleano
//        si el valor es true entonces va a dar acceso en el if de abajo para que
//        envie al usuario a la pantalla de distribucion
        acceso = p2.isAcceso();
        
//        Si el acceso es true entonces va a enviar al usuario a distribucion
        if(acceso == true){
            Distribucion dis = new Distribucion();
            this.setVisible(false);
            dis.setVisible(true);
        }
    }//GEN-LAST:event_ingresarActionPerformed

    private void in_btn_cambiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_in_btn_cambiarActionPerformed
//        Enviar al usuario a cambiar contraseña
        Cambiar_contraseña change = new Cambiar_contraseña();
        change.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_in_btn_cambiarActionPerformed

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
//        Cuando le de salir arriba a la derecha va a cerrar el programa, dispose no es
//        tan eficiente como esto
        System.exit(0);
    }//GEN-LAST:event_salirActionPerformed

    private void jLabel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MousePressed
//        Obtiene los valor de donde de click en la palatalla, las coordenadas
        x = evt.getX();
        y = evt.getY();
    }//GEN-LAST:event_jLabel1MousePressed

    private void jLabel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseDragged
//       Movera la pantalla en funcion de donde lo arrastre
        this.setLocation(this.getLocation().x + evt.getX() - x, this.getLocation().y + evt.getY() - y);
 
    }//GEN-LAST:event_jLabel1MouseDragged

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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton registrarse;
    private javax.swing.JButton salir;
    private javax.swing.JTextField usuario;
    // End of variables declaration//GEN-END:variables
}

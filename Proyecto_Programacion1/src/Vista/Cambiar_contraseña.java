/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Clases.Persona;
import Configuracion.Conexion;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author alsolis
 */
public class Cambiar_contraseña extends javax.swing.JFrame {

    /**
     * Creates new form Cambiar_contraseña
     */
    public Cambiar_contraseña() {
        initComponents();
        setLocationRelativeTo(null);
        
        //        Textfield transparentes
        usuario.setBackground(new java.awt.Color(0,0,0,1));
        c_actual.setBackground(new java.awt.Color(0,0,0,1));
        c_nueva.setBackground(new java.awt.Color(0,0,0,1));
        
        
//        Trasnparencia botones

        back.setOpaque(false);
        back.setContentAreaFilled(false);
        back.setBorderPainted(false);
        
        cambiar.setOpaque(false);
        cambiar.setContentAreaFilled(false);
        cambiar.setBorderPainted(false);
        
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

        back = new javax.swing.JButton();
        cambiar = new javax.swing.JButton();
        usuario = new javax.swing.JTextField();
        c_actual = new javax.swing.JPasswordField();
        c_nueva = new javax.swing.JPasswordField();
        exit = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        back.setBorder(null);
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        getContentPane().add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 440, 60, 30));

        cambiar.setBorder(null);
        cambiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cambiarActionPerformed(evt);
            }
        });
        getContentPane().add(cambiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 400, 130, 40));

        usuario.setFont(new java.awt.Font("Open Sans", 1, 14)); // NOI18N
        usuario.setForeground(new java.awt.Color(77, 92, 126));
        usuario.setBorder(null);
        getContentPane().add(usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 122, 260, 30));

        c_actual.setFont(new java.awt.Font("Open Sans", 1, 14)); // NOI18N
        c_actual.setForeground(new java.awt.Color(77, 92, 126));
        c_actual.setBorder(null);
        getContentPane().add(c_actual, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 173, 160, 30));

        c_nueva.setFont(new java.awt.Font("Open Sans", 1, 14)); // NOI18N
        c_nueva.setForeground(new java.awt.Color(77, 92, 126));
        c_nueva.setBorder(null);
        c_nueva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c_nuevaActionPerformed(evt);
            }
        });
        getContentPane().add(c_nueva, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 222, 160, 30));

        exit.setBorder(null);
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        getContentPane().add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 2, 50, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\alsolis\\Desktop\\Imagenes Java\\Cambiar contraseña.png")); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cambiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cambiarActionPerformed
        change_password();
    }//GEN-LAST:event_cambiarActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        Inicio ini = new Inicio();
        ini.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_backActionPerformed

    private void c_nuevaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c_nuevaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c_nuevaActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitActionPerformed

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
            java.util.logging.Logger.getLogger(Cambiar_contraseña.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cambiar_contraseña.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cambiar_contraseña.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cambiar_contraseña.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cambiar_contraseña().setVisible(true);
            }
        });
    }
    
    public void change_password(){
        Conexion con1 = new Conexion();
        Connection cn;
        Statement st;
        ResultSet rs;
        DefaultTableModel model;
        String contraseña1 = c_actual.getText();
        String contraseña2 = c_nueva.getText();
        String user = usuario.getText();
        String sql1, sql2, valor = "", id="";
        boolean error;
        
        
        
        if(contraseña1.equals("")||contraseña2.equals("")||user.equals("")){
            JOptionPane.showMessageDialog(null, "Debe de ingresar cada uno de los datos");
        }else{
            sql1 = "Select * from usuario where usuario = '"+user+"';";
            
            try{
                cn= con1.getConnection();
                st= cn.createStatement();
                rs= st.executeQuery(sql1);
            
                
                while(rs.next()){
                    id = rs.getString("id");
                    valor = rs.getString("contraseña");
                }
                if(contraseña1.equals(valor)){
                    
                    sql2 = "update usuario set contraseña = '"+contraseña2+"' where id = '"+id+"';";
                    try{
                        cn = con1.getConnection();
                        st = cn.createStatement();
                        st.executeUpdate(sql2);
                        JOptionPane.showMessageDialog(null,"Contraseña modificada");
                        Inicio ini = new Inicio();
                        ini.setVisible(true);
                        this.setVisible(false);
                    }catch(Exception ex){
                        JOptionPane.showMessageDialog(null, ex);
                    }
                }else{
                    JOptionPane.showMessageDialog(null, "La contraseña ingresada como actual es incorrecta");
                }
                    
                

        }catch(SQLException ex){
            System.out.println(ex);
        }
            
        }
        
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JPasswordField c_actual;
    private javax.swing.JPasswordField c_nueva;
    private javax.swing.JButton cambiar;
    private javax.swing.JButton exit;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField usuario;
    // End of variables declaration//GEN-END:variables
}


package Vista;

import Clases.Countries;
import com.sun.awt.AWTUtilities;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.json.JSONArray;
import org.json.JSONObject;


public class Lista_paises extends javax.swing.JFrame {
    public int x,y;
    
    public Lista_paises() throws IOException{
        initComponents();
        setLocationRelativeTo(null);
        llenar_tabla();
        
        //Darle movilidad a la ventana
        
        AWTUtilities.setWindowOpaque(this, false);
        
        //        Trasnparencia botones

        exit.setOpaque(false);
        exit.setContentAreaFilled(false);
        exit.setBorderPainted(false);
        
        back.setOpaque(false);
        back.setContentAreaFilled(false);
        back.setBorderPainted(false);
        
        
        
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
        jScrollPane1 = new javax.swing.JScrollPane();
        listado = new javax.swing.JTable();
        exit = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        getContentPane().add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 470, 60, 30));

        listado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Capital", "Region", "Subregion", "Poblacion", "Cupo"
            }
        ));
        jScrollPane1.setViewportView(listado);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 680, 349));

        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        getContentPane().add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(627, 10, 40, 40));

        jLabel2.setText("jLabel2");
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
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -4, 680, 520));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\alsolis\\Desktop\\Imagenes Java\\Lista de paises.png")); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        Distribucion dis = new Distribucion();
        dis.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_backActionPerformed

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

    public void llenar_tabla()throws IOException{
        
        Countries paises = new Countries();
        
        JSONArray array = paises.Get_Countries();
        
        JSONObject object =null;
        
        DefaultTableModel model = (DefaultTableModel) listado.getModel();
        
        Object rowData[] = new Object[6];
        
        if (array!=null){
            
            for (int i = 0; i < array.length(); i++) {
                
                
                object = array.getJSONObject(i);
                long poblacion_maxima = 0;
                
                rowData[0]= object.getString("name");
                rowData[1]= object.getString("capital");
                rowData[2]= object.getString("region");
                rowData[3]= object.getString("subregion");
                rowData[4]= object.getLong("population");
                
//                Calculo del cupo permitido por pais
                
                poblacion_maxima = (long) ((long)rowData[4] * 0.000001);
                
//                Fin del calculo

                rowData[5]= poblacion_maxima;
                model.addRow(rowData);
                
            }

        }else{
            JOptionPane.showMessageDialog(null, "No existen datos que mostrar");
        }
        
    }
    
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
            java.util.logging.Logger.getLogger(Lista_paises.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Lista_paises.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Lista_paises.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Lista_paises.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               try{
                new Lista_paises().setVisible(true);
               }catch(IOException e){
                   Logger.getLogger(Lista_paises.class.getName()).log(Level.SEVERE, null, e);
               }
            }
        });
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JButton exit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable listado;
    // End of variables declaration//GEN-END:variables
}

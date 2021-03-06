
package Vista;

import Clases.Capacidad;
import com.sun.awt.AWTUtilities;
import com.sun.prism.paint.Color;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author alsolis
 */
public class Estadisticas extends javax.swing.JFrame {
    public int x,y;
    
    public Estadisticas() {
        initComponents();
        setLocationRelativeTo(null);
        cantidad_total();
        
        //Darle movilidad a la ventana
        
        AWTUtilities.setWindowOpaque(this, false);
        
        
        //        Textfield transparentes
        lista_paises.setBackground(new java.awt.Color(0,0,0,1));
        lista_carreras.setBackground(new java.awt.Color(0,0,0,1));
        pais_ben.setBackground(new java.awt.Color(0,0,0,1));
        lista_total.setBackground(new java.awt.Color(0,0,0,1));
        
        
        
        
        //        Trasnparencia botones

        exit.setOpaque(false);
        exit.setContentAreaFilled(false);
        exit.setBorderPainted(false);
        
        back.setOpaque(false);
        back.setContentAreaFilled(false);
        back.setBorderPainted(false);
        
//        Centrar texto

        lista_paises.setHorizontalAlignment(JTextField.CENTER);
        lista_carreras.setHorizontalAlignment(JTextField.CENTER);
        pais_ben.setHorizontalAlignment(JTextField.CENTER);
        lista_total.setHorizontalAlignment(JTextField.CENTER);


        
        
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lista_total = new javax.swing.JTextField();
        paises = new javax.swing.JComboBox<>();
        lista_carreras = new javax.swing.JTextField();
        carreras = new javax.swing.JComboBox<>();
        lista_paises = new javax.swing.JTextField();
        back = new javax.swing.JButton();
        pais_ben = new javax.swing.JTextField();
        exit = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lista_total.setFont(new java.awt.Font("Open Sans", 1, 18)); // NOI18N
        lista_total.setBorder(null);
        lista_total.setEnabled(false);
        lista_total.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        lista_total.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lista_totalActionPerformed(evt);
            }
        });
        getContentPane().add(lista_total, new org.netbeans.lib.awtextra.AbsoluteConstraints(371, 483, 110, 40));

        paises.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione uno", "Afghanistan", "Åland Islands", "Albania", "Algeria", "American Samoa", "Andorra", "Angola", "Anguilla", "Antarctica", "Antigua and Barbuda", "Argentina", "Armenia", "Aruba", "Australia", "Austria", "Azerbaijan", "The Bahamas", "Bahrain", "Bangladesh", "Barbados", "Belarus", "Belgium", "Belize", "Benin", "Bermuda", "Bhutan", "Bolivia", "Bonaire", "Bosnia and Herzegovina", "Botswana", "Bouvet Island", "Brazil", "British Indian Ocean Territory", "United States Minor Outlying Islands", "Virgin Islands (British)", "Virgin Islands (U.S.)", "Brunei", "Bulgaria", "Burkina Faso", "Burundi", "Cambodia", "Cameroon", "Canada", "Cape Verde", "Cayman Islands", "Central African Republic", "Chad", "Chile", "China", "Christmas Island", "Cocos (Keeling) Islands", "Colombia", "Comoros", "Republic of the Congo", "Democratic Republic of the Congo", "Cook Islands", "Costa Rica", "Croatia", "Cuba", "Curaçao", "Cyprus", "Czech Republic", "Denmark", "Djibouti", "Dominica", "Dominican Republic", "Ecuador", "Egypt", "El Salvador", "Equatorial Guinea", "Eritrea", "Estonia", "Ethiopia", "Falkland Islands", "Faroe Islands", "Fiji", "Finland", "France", "French Guiana", "French Polynesia", "French Southern and Antarctic Lands", "Gabon", "The Gambia", "Georgia", "Germany", "Ghana", "Gibraltar", "Greece", "Greenland", "Grenada", "Guadeloupe", "Guam", "Guatemala", "Guernsey", "Guinea", "Guinea-Bissau", "Guyana", "Haiti", "Heard Island and McDonald Islands", "Holy See", "Honduras", "Hong Kong", "Hungary", "Iceland", "India", "Indonesia", "Ivory Coast", "Iran", "Iraq", "Republic of Ireland", "Isle of Man", "Israel", "Italy", "Jamaica", "Japan", "Jersey", "Jordan", "Kazakhstan", "Kenya", "Kiribati", "Kuwait", "Kyrgyzstan", "Laos", "Latvia", "Lebanon", "Lesotho", "Liberia", "Libya", "Liechtenstein", "Lithuania", "Luxembourg", "Macau", "Republic of Macedonia", "Madagascar", "Malawi", "Malaysia", "Maldives", "Mali", "Malta", "Marshall Islands", "Martinique", "Mauritania", "Mauritius", "Mayotte", "Mexico", "Federated States of Micronesia", "Moldova", "Monaco", "Mongolia", "Montenegro", "Montserrat", "Morocco", "Mozambique", "Myanmar", "Namibia", "Nauru", "Nepal", "Netherlands", "New Caledonia", "New Zealand", "Nicaragua", "Niger", "Nigeria", "Niue", "Norfolk Island", "North Korea", "Northern Mariana Islands", "Norway", "Oman", "Pakistan", "Palau", "Palestine", "Panama", "Papua New Guinea", "Paraguay", "Peru", "Philippines", "Pitcairn Islands", "Poland", "Portugal", "Puerto Rico", "Qatar", "Republic of Kosovo", "Réunion", "Romania", "Russia", "Rwanda", "Saint Barthélemy", "Saint Helena", "Saint Kitts and Nevis", "Saint Lucia", "Saint Martin", "Saint Pierre and Miquelon", "Saint Vincent and the Grenadines", "Samoa", "San Marino", "São Tomé and Príncipe", "Saudi Arabia", "Senegal", "Serbia", "Seychelles", "Sierra Leone", "Singapore", "Sint Maarten", "Slovakia", "Slovenia", "Solomon Islands", "Somalia", "South Africa", "South Georgia", "South Korea", "South Sudan", "Spain", "Sri Lanka", "Sudan", "Suriname", "Svalbard and Jan Mayen", "Swaziland", "Sweden", "Switzerland", "Syria", "Taiwan", "Tajikistan", "Tanzania", "Thailand", "East Timor", "Togo", "Tokelau", "Tonga", "Trinidad and Tobago", "Tunisia", "Turkey", "Turkmenistan", "Turks and Caicos Islands", "Tuvalu", "Uganda", "Ukraine", "United Arab Emirates", "United Kingdom", "United States", "Uruguay", "Uzbekistan", "Vanuatu", "Venezuela", "Vietnam", "Wallis and Futuna", "Western Sahara", "Yemen", "Zambia", "Zimbabwe" }));
        paises.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paisesActionPerformed(evt);
            }
        });
        getContentPane().add(paises, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 180, 180, 50));

        lista_carreras.setFont(new java.awt.Font("Open Sans", 1, 18)); // NOI18N
        lista_carreras.setForeground(new java.awt.Color(0, 0, 0));
        lista_carreras.setBorder(null);
        lista_carreras.setCaretColor(new java.awt.Color(0, 0, 0));
        lista_carreras.setEnabled(false);
        lista_carreras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lista_carrerasActionPerformed(evt);
            }
        });
        getContentPane().add(lista_carreras, new org.netbeans.lib.awtextra.AbsoluteConstraints(572, 304, 110, 40));

        carreras.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una carrera", "Administracion de Empresas", "Animacion", "Arquitectura", "Artes Plasticas", "Biologia", "Comercio Internacional", "Contaduria Publica", "Contaduria Publica", "Derecho", "Diseño Grafico", "Economia", "Enseñanza del Ingles", "Enseñanza preescolar", "Farmacia", "Filosofia", "Fisica teorica fundamental", "Fotografia", "Ingeneria Electromecanica", "Ingeneria Industrial", "Ingenieria Civil", "Ingenieria de alimentos", "Ingenieria del Software", "Ingenieria Electrica", "Ingenieria en Sistemas de Informacion", "Ingenieria Mecatronica", "Matematica teorica fundamental", "Medicina y Cirugia", "Mercadeo", "Odontologia", "Periodismo y Comunicacion", "Psicopedagogia", "Publicidad", "Relaciones Internacionales", "Sociologia", "Terapia Fisica", "Turismo" }));
        carreras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carrerasActionPerformed(evt);
            }
        });
        getContentPane().add(carreras, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 180, 180, 50));

        lista_paises.setFont(new java.awt.Font("Open Sans", 1, 18)); // NOI18N
        lista_paises.setBorder(null);
        lista_paises.setDoubleBuffered(true);
        lista_paises.setEnabled(false);
        lista_paises.setHighlighter(null);
        lista_paises.setInheritsPopupMenu(true);
        lista_paises.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lista_paisesActionPerformed(evt);
            }
        });
        getContentPane().add(lista_paises, new org.netbeans.lib.awtextra.AbsoluteConstraints(184, 304, 110, 40));

        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        getContentPane().add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 620, 50, 40));

        pais_ben.setFont(new java.awt.Font("Open Sans", 1, 14)); // NOI18N
        pais_ben.setBorder(null);
        pais_ben.setEnabled(false);
        getContentPane().add(pais_ben, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 400, 80, 20));

        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        getContentPane().add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(817, 20, 40, 40));

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
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 870, 670));

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\alsolis\\Desktop\\Imagenes Java\\Estadisticas.png")); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    
    
    private void lista_carrerasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lista_carrerasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lista_carrerasActionPerformed

    private void lista_paisesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lista_paisesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lista_paisesActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        Distribucion dis = new Distribucion();
        dis.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_backActionPerformed

    private void paisesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paisesActionPerformed
        
        try {
            cantidad_por_pais();
        } catch (IOException ex) {
            Logger.getLogger(Estadisticas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_paisesActionPerformed

    private void carrerasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carrerasActionPerformed
        cantidad_por_carrera();
    }//GEN-LAST:event_carrerasActionPerformed

    private void lista_totalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lista_totalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lista_totalActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitActionPerformed

    private void jLabel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MousePressed
        x = evt.getX();
        y = evt.getY();
    }//GEN-LAST:event_jLabel1MousePressed

    private void jLabel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseDragged
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
            java.util.logging.Logger.getLogger(Estadisticas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Estadisticas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Estadisticas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Estadisticas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Estadisticas().setVisible(true);
            }
        });
    }
    
    public void cantidad_total(){
        int fila = 0, contador = 0;
        int cantidad;
        String nombre, country;
        Principal prin = new Principal();
        DefaultTableModel model = (DefaultTableModel) prin.TablaDatos.getModel();

        contador = model.getRowCount();
        lista_total.setText(String.valueOf(contador));
    }
    
    public void cantidad_por_pais() throws IOException{
        int fila = 0, contador = 0;
        int cantidad;
        long sin_beneficio;
        String nombre, country = "";
        Principal prin = new Principal();
        DefaultTableModel model = (DefaultTableModel) prin.TablaDatos.getModel();
        

        for (int i = 0; i < model.getRowCount(); i++) {
            
            nombre = (String)prin.TablaDatos.getValueAt(fila,7);
            country = (String)paises.getSelectedItem();
            
            if(nombre.equals(country)){
                contador++;
            }
            fila++;
        }
        lista_paises.setText(String.valueOf(contador));
        
        Capacidad cap = new Capacidad();
        
        sin_beneficio = contador - cap.Capacidad_personas(country);
        
        pais_ben.setText(String.valueOf(sin_beneficio));
    }
    
    public void cantidad_por_carrera(){
        int fila = 0, contador = 0;
        int cantidad;
        String nombre, carrer;
        Principal prin = new Principal();
        DefaultTableModel model = (DefaultTableModel) prin.TablaDatos.getModel();

        for (int i = 0; i < model.getRowCount(); i++) {
            
            nombre = (String)prin.TablaDatos.getValueAt(fila,5);
            carrer = (String)carreras.getSelectedItem();
            
            if(nombre.equals(carrer)){
                contador++;
            }
            fila++;
        }
        lista_carreras.setText(String.valueOf(contador));
    }
    
    
    
    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JComboBox<String> carreras;
    private javax.swing.JButton exit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField lista_carreras;
    private javax.swing.JTextField lista_paises;
    private javax.swing.JTextField lista_total;
    private javax.swing.JTextField pais_ben;
    private javax.swing.JComboBox<String> paises;
    // End of variables declaration//GEN-END:variables
}

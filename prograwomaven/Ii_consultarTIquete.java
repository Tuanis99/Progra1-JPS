/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prograwomaven;

import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author luisg
 */
public class Ii_consultarTIquete extends javax.swing.JFrame {

    /**
     * Creates new form consultarTIquete
     */
    public Ii_consultarTIquete() {
        initComponents();
        cbSorteoConsulta.removeAllItems();
        cbSorteoConsulta.addItem("Loteria");
        cbSorteoConsulta.addItem("Lotto");
        cbSorteoConsulta.addItem("Bingo");
        cbSorteoConsulta.addItem("Tiempos");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel3 = new javax.swing.JLabel();
        cbSorteoConsulta = new javax.swing.JComboBox<>();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Consulta de Tiquetes");

        jButton1.setText("Consultar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setText("Tipo de sorteo");

        jLabel3.setText("Seleccione la fecha del sorteo");

        cbSorteoConsulta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(152, 152, 152)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 117, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(cbSorteoConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(112, 112, 112))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cbSorteoConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 89, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
                //Busca si el dato ingresado coincide con un libro existente
        int encontrado=0;
        //Enviar el current al primer elemento
        A_InicioPrograma.JPSDATA.goToStart();
        A_InicioPrograma.JPSDATA.current = A_InicioPrograma.JPSDATA.current.getNext();
        //Recorre la lista de librerias
        while (A_InicioPrograma.JPSDATA.current != null){
            //Busca la libreria escogida
            if (N_Interfaz_seleccionar_libreria.entrada_name.getText().equals(A_InicioPrograma.JPSDATA.current.getElement().nombre)){
                //Envia el current al primer elemento
                A_InicioPrograma.JPSDATA.current.getElement().libros.goToStart();
                A_InicioPrograma.JPSDATA.current.getElement().libros.current = A_InicioPrograma.JPSDATA.current.getElement().libros.current.getNext();
                //Recorre la lista de libros
                while (A_InicioPrograma.JPSDATA.current.getElement().libros.current != null){
                    //Busca el libro encogido
                    if (A_InicioPrograma.JPSDATA.current.getElement().tiquete.current.getElement().identificador.equals(consultar_identificador.getText())){
                        //Nueva ventana donde se mostrara la informacions
                        X_Interfaz_resultado_consultar_libros  ventana_resultado_libro = new X_Interfaz_resultado_consultar_libros();
                        ventana_resultado_libro.setVisible(true);
                        ventana_resultado_libro.setLocationRelativeTo(null);
                        ventana_resultado_libro.setDefaultCloseOperation(X_Interfaz_resultado_consultar_libros.HIDE_ON_CLOSE);
                        //Asignacion de informacion
                        X_Interfaz_resultado_consultar_libros.identificador.setText(A_InicioPrograma.JPSDATA.current.getElement().libros.current.getElement().identificador);
                        X_Interfaz_resultado_consultar_libros.nombre.setText(A_InicioPrograma.JPSDATA.current.getElement().libros.current.getElement().nombre);
                        X_Interfaz_resultado_consultar_libros.tema.setText(A_InicioPrograma.JPSDATA.current.getElement().libros.current.getElement().tema);
                        X_Interfaz_resultado_consultar_libros.descripcion.setText(A_InicioPrograma.JPSDATA.current.getElement().libros.current.getElement().descripcion);
                        X_Interfaz_resultado_consultar_libros.cantidad_disponible.setText(Integer.toString(A_InicioPrograma.JPSDATA.current.getElement().libros.current.getElement().cantidad_disponible));
                        X_Interfaz_resultado_consultar_libros.cantidad_vendida.setText(Integer.toString(A_InicioPrograma.JPSDATA.current.getElement().libros.current.getElement().cantidad_vendida));
                        X_Interfaz_resultado_consultar_libros.precio.setText(Integer.toString(A_InicioPrograma.JPSDATA.current.getElement().libros.current.getElement().precio));
                        
                        try{
                            ImageIcon ImgIcon = new ImageIcon(A_InicioPrograma.JPSDATA.current.getElement().libros.current.getElement().imagen.toString());

                            Icon icono = new ImageIcon(ImgIcon.getImage().getScaledInstance(X_Interfaz_resultado_consultar_libros.imagen.getWidth(), X_Interfaz_resultado_consultar_libros.imagen.getHeight() , Image.SCALE_DEFAULT));

                            X_Interfaz_resultado_consultar_libros.imagen.setIcon(icono);
                        }catch (Exception ex){
                            JOptionPane.showMessageDialog(null, "El libro aún no posee imagen","Sin foto",JOptionPane.PLAIN_MESSAGE);
                        }
                        encontrado++;
                        this.dispose();
                        return;
                    }
                    A_InicioPrograma.JPSDATA.current.getElement().libros.current = A_InicioPrograma.JPSDATA.current.getElement().libros.current.getNext();
                }
                
            }
            
            
            A_InicioPrograma.JPSDATA.current = A_InicioPrograma.JPSDATA.current.getNext();
        }
        if (encontrado == 0 ){
            JOptionPane.showMessageDialog(null, "No existe libro con ese número de identificador", "Consulta", JOptionPane.PLAIN_MESSAGE);
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

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
            java.util.logging.Logger.getLogger(Ii_consultarTIquete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ii_consultarTIquete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ii_consultarTIquete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ii_consultarTIquete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ii_consultarTIquete().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbSorteoConsulta;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}

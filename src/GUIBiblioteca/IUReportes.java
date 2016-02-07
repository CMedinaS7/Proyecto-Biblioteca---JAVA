/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * IULibro.java
 *
 * Created on 19-dic-2011, 10:57:37
 */
package GUIBiblioteca;

import Util.imgreportes;
import java.awt.BorderLayout;
import java.net.URL;
import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 *
 * @author Carlos J Medina
 */
public class IUReportes extends javax.swing.JFrame {

private Reloj.Hora hora;
    /** Creates new form IULibro */
    public IUReportes() {
        this.setUndecorated(true);
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnatras = new javax.swing.JButton();
        btnlibro = new javax.swing.JButton();
        btnpersonal = new javax.swing.JButton();
        btnprestamo = new javax.swing.JButton();
        btnlector = new javax.swing.JButton();
        btndevolucion = new javax.swing.JButton();
        btnreportes = new javax.swing.JButton();
        btndesarrollador = new javax.swing.JButton();
        lblhora = new javax.swing.JLabel();
        btnNuevo1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        btnatras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Archivos/btnAtras.png"))); // NOI18N
        btnatras.setBorder(null);
        btnatras.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnatras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnatrasActionPerformed(evt);
            }
        });

        btnlibro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Archivos/btnMenuNoActivo.png"))); // NOI18N
        btnlibro.setBorder(null);
        btnlibro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnlibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlibroActionPerformed(evt);
            }
        });

        btnpersonal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Archivos/btnMenuNoActivo.png"))); // NOI18N
        btnpersonal.setBorder(null);
        btnpersonal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnpersonal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpersonalActionPerformed(evt);
            }
        });

        btnprestamo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Archivos/btnMenuNoActivo.png"))); // NOI18N
        btnprestamo.setBorder(null);
        btnprestamo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnprestamo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnprestamoActionPerformed(evt);
            }
        });

        btnlector.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Archivos/btnMenuNoActivo.png"))); // NOI18N
        btnlector.setBorder(null);
        btnlector.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnlector.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlectorActionPerformed(evt);
            }
        });

        btndevolucion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Archivos/btnMenuNoActivo.png"))); // NOI18N
        btndevolucion.setBorder(null);
        btndevolucion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btndevolucion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndevolucionActionPerformed(evt);
            }
        });

        btnreportes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Archivos/btnMenuActivo.png"))); // NOI18N
        btnreportes.setBorder(null);
        btnreportes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        btndesarrollador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Archivos/btnMenuNoActivo.png"))); // NOI18N
        btndesarrollador.setBorder(null);
        btndesarrollador.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        lblhora.setBackground(new java.awt.Color(255, 255, 255));
        lblhora.setFont(new java.awt.Font("Tahoma", 0, 10));
        lblhora.setForeground(new java.awt.Color(255, 255, 255));

        btnNuevo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Archivos/btnSalir.png"))); // NOI18N
        btnNuevo1.setBorder(null);
        btnNuevo1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNuevo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevo1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(btnatras))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(217, 217, 217)
                        .addComponent(lblhora, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(154, 154, 154)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnlibro)
                            .addComponent(btnpersonal)
                            .addComponent(btnprestamo)
                            .addComponent(btnlector)
                            .addComponent(btndevolucion)
                            .addComponent(btnreportes)
                            .addComponent(btndesarrollador)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(233, 233, 233)
                        .addComponent(btnNuevo1)))
                .addContainerGap(191, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(lblhora, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnatras, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(btnlibro)
                .addGap(26, 26, 26)
                .addComponent(btnpersonal)
                .addGap(25, 25, 25)
                .addComponent(btnprestamo)
                .addGap(31, 31, 31)
                .addComponent(btnlector)
                .addGap(25, 25, 25)
                .addComponent(btndevolucion)
                .addGap(28, 28, 28)
                .addComponent(btnreportes)
                .addGap(27, 27, 27)
                .addComponent(btndesarrollador)
                .addGap(175, 175, 175)
                .addComponent(btnNuevo1)
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private int estado=1;
    
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        imgreportes p = new imgreportes();
        this.add( p , BorderLayout.CENTER);
        p.repaint();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        // TODO add your handling code here:
        hora = new Reloj.Hora();/***Inicializar la variable hora***/
        hora.setBounds(0, 0, 150, 15);/*(Ubicacion en eje x, Ubicacion en eje y, Ancho, Alto)*/
       //hora.setFont(new Font("Trebuchet MS",java.awt.Font.BOLD, 10));/*Cambiamos la fuente, estilo y tamaño*/
        this.lblhora.add(hora);/*La agregamos al JFrame*/
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowOpened

    private void btnatrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnatrasActionPerformed
        IUMenu menu=new IUMenu();
        menu.setVisible(true);
        this.setVisible(false);
        this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_btnatrasActionPerformed

    private void btnNuevo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevo1ActionPerformed
        this.dispose();
        System.exit(0);
        // TODO add your handling code here:
        // TODO add your handling code here:
    }//GEN-LAST:event_btnNuevo1ActionPerformed

    private void btnlibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlibroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnlibroActionPerformed

    private void btnpersonalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpersonalActionPerformed
       IUPersonal personal=new IUPersonal();
        personal.setVisible(true);
        this.setVisible(false);
        this.dispose();
        // TODO add your handling code here:        // TODO add your handling code here:
    }//GEN-LAST:event_btnpersonalActionPerformed

    private void btnlectorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlectorActionPerformed
        IULector lector=new IULector();
        lector.setVisible(true);
        this.setVisible(false);
        this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_btnlectorActionPerformed

    private void btnprestamoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnprestamoActionPerformed
        IUPrestamo prestamo=new IUPrestamo();
        prestamo.setVisible(true);
        this.setVisible(false);
        this.dispose();         // TODO add your handling code here:
    }//GEN-LAST:event_btnprestamoActionPerformed

    private void btndevolucionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndevolucionActionPerformed
        IUDevolucion devolucion=new IUDevolucion();
        devolucion.setVisible(true);
        this.setVisible(false);
        this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_btndevolucionActionPerformed
protected ImageIcon createImageIcon(String path,
                                           String description) {
    java.net.URL imgURL = getClass().getResource(path);
    if (imgURL != null) {
        return new ImageIcon(imgURL, description);
    } else {
        System.err.println("No se encuentra el archivo: " + path);
        return null;
    }
}

    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new IUReportes().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnNuevo1;
    private javax.swing.JButton btnatras;
    private javax.swing.JButton btndesarrollador;
    private javax.swing.JButton btndevolucion;
    private javax.swing.JButton btnlector;
    private javax.swing.JButton btnlibro;
    private javax.swing.JButton btnpersonal;
    private javax.swing.JButton btnprestamo;
    private javax.swing.JButton btnreportes;
    private javax.swing.JLabel lblhora;
    // End of variables declaration//GEN-END:variables

}
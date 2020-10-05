/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import java.awt.image.BufferedImage;
import java.io.InputStream;
import javax.imageio.ImageIO;

public class VentanaP extends javax.swing.JFrame {

    public InputStream foto1=this.getClass().getResourceAsStream("/imagenes/fondo6.jpg");

    public VentanaP() {
        initComponents();
        setTitle("Ventana principal");
        //this.setLocationRelativeTo(null);
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        escritorio = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        opcionregistro = new javax.swing.JMenuItem();
        mostrarusuario = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        escritorio.setBackground(new java.awt.Color(0, 51, 102));

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 737, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 484, Short.MAX_VALUE)
        );

        jMenuBar1.setBackground(new java.awt.Color(255, 255, 255));

        jMenu2.setBackground(new java.awt.Color(204, 204, 204));
        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/usuarios24x24.png"))); // NOI18N
        jMenu2.setText("Cliente");

        opcionregistro.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_ENTER, java.awt.event.InputEvent.CTRL_MASK));
        opcionregistro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/nuevo24x24.png"))); // NOI18N
        opcionregistro.setText("Registrar Cliente");
        opcionregistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcionregistroActionPerformed(evt);
            }
        });
        jMenu2.add(opcionregistro);

        mostrarusuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/clientes24x24.png"))); // NOI18N
        mostrarusuario.setText("Mostrar Clientes");
        mostrarusuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrarusuarioActionPerformed(evt);
            }
        });
        jMenu2.add(mostrarusuario);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void opcionregistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcionregistroActionPerformed
        escritorio.removeAll();
        registro r =new registro();
        escritorio.add(r);
        r.show();
        
    }//GEN-LAST:event_opcionregistroActionPerformed

    private void mostrarusuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarusuarioActionPerformed
      /* escritorio.removeAll();
       mostar m = new mostar();
       escritorio.add(m);
       m.setVisible(true);*/
      Listac l = new Listac();
      escritorio.add(l);
      l.setVisible(true);
    }//GEN-LAST:event_mostrarusuarioActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look; and feel */
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
            java.util.logging.Logger.getLogger(VentanaP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaP().setVisible(true);
                
                
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem mostrarusuario;
    private javax.swing.JMenuItem opcionregistro;
    // End of variables declaration//GEN-END:variables
}

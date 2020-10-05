package Interfaces;

import Clases.Cliente;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.awt.Toolkit;
import javax.swing.JOptionPane;

public class registro extends javax.swing.JInternalFrame {
//url="jdbc:mysql://localhost:3306/prueba? useUnicode=true&use"
    // + " JDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";

    private void limpiar() {
        textonombre.setText("");
        textoapellido.setText("");
        textodireccion.setText("");
        textodni.setText("");
        textotelefono.setText("");
        textocorreo.setText("");
    }

    public registro() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        textonombre = new javax.swing.JTextField();
        textodni = new javax.swing.JTextField();
        textodireccion = new javax.swing.JTextField();
        textoapellido = new javax.swing.JTextField();
        textotelefono = new javax.swing.JTextField();
        buscar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        textocorreo = new javax.swing.JTextField();

        setBackground(new java.awt.Color(204, 204, 204));
        setClosable(true);
        setResizable(true);
        setTitle("Registro Usuario");

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setText("Nombre");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setText("Apellido");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setText("Dirección");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setText("Dni o Ruc");

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setText("Teléfono");

        textonombre.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        textonombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textonombreActionPerformed(evt);
            }
        });
        textonombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textonombreKeyTyped(evt);
            }
        });

        textodni.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        textodni.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textodniKeyTyped(evt);
            }
        });

        textodireccion.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        textoapellido.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        textoapellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textoapellidoKeyTyped(evt);
            }
        });

        textotelefono.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        textotelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textotelefonoKeyTyped(evt);
            }
        });

        buscar.setBackground(new java.awt.Color(255, 255, 255));
        buscar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        buscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/guardar24x24.png"))); // NOI18N
        buscar.setText("Registar");
        buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setText("Correo electrónico");

        textocorreo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textocorreoKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(buscar)
                .addGap(225, 225, 225))
            .addGroup(layout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(118, 118, 118)
                        .addComponent(textocorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(194, 194, 194))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addGap(196, 196, 196)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(textoapellido, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textonombre, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(184, 184, 184)
                                .addComponent(textodireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(textodni, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addGap(189, 189, 189)
                            .addComponent(textotelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(58, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(textodni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4)
                        .addGap(16, 16, 16)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel1))
                    .addComponent(textonombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 20, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(textoapellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(textodireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(textotelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel5)))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel6))
                    .addComponent(textocorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(89, 89, 89)
                .addComponent(buscar)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        getAccessibleContext().setAccessibleName("Registro Cliente");
        getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textonombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textonombreKeyTyped
        char validar = evt.getKeyChar();
        if (Character.isDigit(validar)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(null, "Digite solo letras");

        } else if (textonombre.getText().length() >= 30) {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
    }//GEN-LAST:event_textonombreKeyTyped

    private void textodniKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textodniKeyTyped
        char c = evt.getKeyChar();
        if (Character.isLetter(c)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(null, "Solo digite números");
        } else if (textodni.getText().length() >= 13) {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
    }//GEN-LAST:event_textodniKeyTyped

    private void textotelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textotelefonoKeyTyped
        char c = evt.getKeyChar();
        if (Character.isLetter(c)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(null, "Solo digite números");
        } else if (textotelefono.getText().length() >= 10) {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
    }//GEN-LAST:event_textotelefonoKeyTyped

    private void buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarActionPerformed
        Coneccion co;
        PreparedStatement ps;
        Cliente c = new Cliente(textonombre.getText(), textoapellido.getText(),
        textodireccion.getText(), textodni.getText(), textotelefono.getText(), textocorreo.getText());

        // sirve para que el usuario llene todos los comapos
        if (textonombre.getText().equals(" ") || textoapellido.getText().equals(" ") || textodireccion.getText().equals(" ")
                || textotelefono.getText().equals(" ") || textodni.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Llene todos los campos");
            // javax.swing.JOptionPane.showMessageDialog(this, "Llene todos los campos " + javax.swing.JOptionPane.INFORMATION_MESSAGE);
        } else {
            co = new Coneccion();

            Connection con = co.getConexion();
            try {

                
                ps = (PreparedStatement) con.prepareStatement("insert into cliente(nombre_cli,apellido_cli,direccion_cli,dni,telefono_cli,correoElectronico_cli) values(?,?,?,?,?,?)");
                ps.setString(1, textonombre.getText());
                ps.setString(2, textoapellido.getText());
                ps.setString(3, textodireccion.getText());
                ps.setString(4, textodni.getText());
                ps.setString(5, textotelefono.getText());
                ps.setString(6, textocorreo.getText());
                
                int res = ps.executeUpdate();

                if (res > 0) {
                    JOptionPane.showMessageDialog(null, "Usuario guardado con éxito !!!");
                    limpiar();
                } else {
                    JOptionPane.showMessageDialog(null, "error");
                }
                con.close();
            } catch (Exception e) {
            }
        }
    }//GEN-LAST:event_buscarActionPerformed


    private void textoapellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textoapellidoKeyTyped
        char validar = evt.getKeyChar();// sirve para validar que solo ingrese letras
        if (Character.isDigit(validar)) { // para validar que solo ingrese lettras
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(null, "Digite solo letras");
        } else if (textoapellido.getText().length() >= 25) {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();// sirve para hacer un sonido al final
        }
    }//GEN-LAST:event_textoapellidoKeyTyped

    private void textocorreoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textocorreoKeyTyped
        if (textotelefono.getText().length() >= 40) {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
    }//GEN-LAST:event_textocorreoKeyTyped

    private void textonombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textonombreActionPerformed

    }//GEN-LAST:event_textonombreActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buscar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField textoapellido;
    private javax.swing.JTextField textocorreo;
    private javax.swing.JTextField textodireccion;
    private javax.swing.JTextField textodni;
    private javax.swing.JTextField textonombre;
    private javax.swing.JTextField textotelefono;
    // End of variables declaration//GEN-END:variables

}

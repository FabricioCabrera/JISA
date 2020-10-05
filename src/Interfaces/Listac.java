/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.ResultSetMetaData;
import java.sql.ResultSet;

import javax.swing.table.DefaultTableModel;

public class Listac extends javax.swing.JInternalFrame {

    
    public Listac() {
        
        initComponents();

    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        clientes = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(153, 153, 153));
        setClosable(true);

        clientes.setBackground(new java.awt.Color(255, 204, 204));
        clientes.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        clientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nombre", "Apellido", "Dirección", "Dni o Ruc", "Teléfono", "Correo "
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        clientes.setAlignmentX(0.6F);
        clientes.setAlignmentY(0.6F);
        jScrollPane1.setViewportView(clientes);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setText("Lista de clientes registrados");

        jButton1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton1.setText("Mostrar lista de clientes");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 352, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(264, 264, 264))
            .addGroup(layout.createSequentialGroup()
                .addGap(103, 103, 103)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68)
                .addComponent(jButton1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         try {
            DefaultTableModel modelo = new DefaultTableModel(); //declaro un varaible de tipo DefaultTableModel
            
            clientes.setModel(modelo); //llamo a la tabla y le agrego el modelo
            PreparedStatement ps = null; // sirve para preparar la consulta

            ResultSet rs = null;
            
            Coneccion co = new Coneccion(); //creo un objeto de la clase coneccion
            Connection con = co.getConexion(); // creo una variable de tipo Connection y la igualo al metodo de la conecion
            
            //agrego los parametro de la consulta y la ejecuto
            ps = (PreparedStatement) con.prepareStatement("select codigo,nombre_cli,apellido_cli,direccion_cli,dni,telefono_cli,correoElectronico_cli from cliente");
            
            rs = ps.executeQuery(); // trae todo los datos de la consulta
            
            ResultSetMetaData r  = (ResultSetMetaData) rs.getMetaData(); //ñe pasamos el resultado de laconsulta
            
            int cColumnas = r.getColumnCount();
            modelo.addColumn("codigo");
            modelo.addColumn("Nombre");
            modelo.addColumn("Apellido");
            modelo.addColumn("Dirección");
            modelo.addColumn("Dni");
            modelo.addColumn("Teléfono");
            modelo.addColumn("Correo");
            
            
            while(rs.next()){
                Object [] filas = new Object[cColumnas]; // declaro un arreglo de tipo objeto
                for (int i = 0; i < cColumnas; i++) {
                    filas [i] = rs.getObject(i+1);
                    
                }
                 modelo.addRow(filas); //agrego lod datos al modelo
            }
            

           
                
        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable clientes;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}

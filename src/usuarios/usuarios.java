/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usuarios;

import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Victor Rodriguez
 */
public class usuarios extends javax.swing.JInternalFrame {

    /**
     * Creates new form usuarios
     */
    DefaultTableModel mdltabla;
    Vector ca = new Vector();
    user em;
    operacionesusuarios oper = new operacionesusuarios();

    public usuarios() {
        initComponents();
        ca.addElement("ID");
        ca.addElement("Usuario");
        ca.addElement("Contraseña");
        ca.addElement("Tipo");
        mdltabla = new DefaultTableModel(ca, 0);
        this.tabla_usuarios.setModel(mdltabla);
        mostrar();
    }

    public void mostrar() {
        this.tabla_usuarios.setModel(oper.listausuarios());

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnagregar = new javax.swing.JButton();
        btneditar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_usuarios = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Usuarios");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        btnagregar.setBackground(new java.awt.Color(255, 255, 255));
        btnagregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/business_application_addmale_useradd_insert_add_user_client_2312.png"))); // NOI18N
        btnagregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnagregarActionPerformed(evt);
            }
        });

        btneditar.setBackground(new java.awt.Color(255, 255, 255));
        btneditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/businessapplication_edit_male_user_thepencil_theclient_negocio_2321.png"))); // NOI18N
        btneditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneditarActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/delete_delete_deleteusers_delete_male_user_maleclient_2348.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        tabla_usuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tabla_usuarios);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnagregar, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(btneditar, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(166, 166, 166))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 672, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(79, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btneditar, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnagregar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(79, 79, 79)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(156, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnagregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnagregarActionPerformed
        // TODO add your handling code here:
        agregar a = new agregar();
        a.setVisible(true);

    }//GEN-LAST:event_btnagregarActionPerformed

    private void btneditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneditarActionPerformed
        // TODO add your handling code here:
        int fila = tabla_usuarios.getSelectedRow();
        if (fila >= 0) {
            int opc = JOptionPane.showConfirmDialog(null, "¿Desea seleccionar este usuario?", "Pregunta", JOptionPane.OK_CANCEL_OPTION);
            if (opc == 0) {
                modificar m = new modificar();
                //id,usuario.contr.tipo
                modificar.txtid_user.setText(tabla_usuarios.getValueAt(fila, 0).toString());
                modificar.txtusuario.setText(tabla_usuarios.getValueAt(fila, 1).toString());
                modificar.txtcontraseña.setText(tabla_usuarios.getValueAt(fila, 2).toString());
                if (tabla_usuarios.getValueAt(fila, 3).toString().equals("Administrador")) {
                    modificar.cbotipo.setSelectedIndex(1);
                } else if (tabla_usuarios.getValueAt(fila, 3).toString().equals("Empleado")) {
                    modificar.cbotipo.setSelectedIndex(2);

                }
                m.setVisible(true);
            }
        } else {
            JOptionPane.showMessageDialog(null, "No seleciono fila", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btneditarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int fila = tabla_usuarios.getSelectedRow();
        if (fila >= 0) {
            int opc = JOptionPane.showConfirmDialog(null, "¿Desea eliminar este usuario?", "Pregunta", JOptionPane.OK_CANCEL_OPTION);
            if (opc == 0) {
                //id,usuario.contr.tipo
                String id = tabla_usuarios.getValueAt(fila, 0).toString();
                int id_user = Integer.parseInt(id);
                user objAlumnos = new user();
                objAlumnos = oper.buscar("usuarios.txt", id_user);
                //id,usuario.contr.tipo
                if (objAlumnos != null) {
                    if (oper.Eliminar("usuarios.txt", "temp.txt", id_user)) {
                        mostrar();
                        JOptionPane.showMessageDialog(null, "Usuario eliminado", "Mensae", JOptionPane.INFORMATION_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Usuario no exite", "ERROR", JOptionPane.ERROR_MESSAGE);
                }

            }
        } else {
            JOptionPane.showMessageDialog(null, "No seleciono fila", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnagregar;
    private javax.swing.JButton btneditar;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTable tabla_usuarios;
    // End of variables declaration//GEN-END:variables
}

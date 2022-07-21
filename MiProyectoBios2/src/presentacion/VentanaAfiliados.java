/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentacion;

import com.mysql.cj.protocol.Resultset;
import excepciones.ExcepcionCerrarConexion;
import excepciones.ExcepcionConectar;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import logica.Afiliado;
import logica.FachadaLogica;

/**
 *
 * @author Juan Diego
 */
public class VentanaAfiliados extends javax.swing.JFrame {

    /**
     * Creates new form AbmLocales
     */
    public VentanaAfiliados() {
        initComponents();

    }

    public DefaultTableModel columnasTabla() {

        model.addColumn("Cédula");
        model.addColumn("Nombre");
        model.addColumn("Apellido");
        model.addColumn("Negocio");
        return model;

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        botonNuevo = new javax.swing.JButton();
        botonEditar = new javax.swing.JButton();
        botonBorrar = new javax.swing.JButton();
        botonListar = new javax.swing.JButton();
        botonRegresar = new javax.swing.JButton();
        botonTerminar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        botonNuevo.setBackground(new java.awt.Color(204, 255, 204));
        botonNuevo.setText("Nuevo Afiliado");
        botonNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonNuevoActionPerformed(evt);
            }
        });
        jPanel1.add(botonNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 60, -1, -1));

        botonEditar.setBackground(new java.awt.Color(255, 255, 204));
        botonEditar.setText("Editar Afiliado");
        botonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEditarActionPerformed(evt);
            }
        });
        jPanel1.add(botonEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(261, 58, -1, -1));

        botonBorrar.setBackground(new java.awt.Color(255, 204, 204));
        botonBorrar.setText("Borrar Afiliado");
        botonBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBorrarActionPerformed(evt);
            }
        });
        jPanel1.add(botonBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(366, 58, -1, -1));

        botonListar.setText("Buscar");
        botonListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonListarActionPerformed(evt);
            }
        });
        jPanel1.add(botonListar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 110, -1, -1));

        botonRegresar.setText("< Regresar");
        botonRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegresarActionPerformed(evt);
            }
        });
        jPanel1.add(botonRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 390, 104, -1));

        botonTerminar.setText("X Terminar");
        botonTerminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonTerminarActionPerformed(evt);
            }
        });
        jPanel1.add(botonTerminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 390, 105, -1));

        tabla.setModel(columnasTabla());
        jScrollPane1.setViewportView(tabla);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 144, 560, 230));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel1.setText("AFILIADOS");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 20, -1, -1));
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, 140, -1));

        jButton1.setText("Estado de Cuenta");
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 390, -1, -1));

        jButton2.setText("Pagos");
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 390, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 630, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonTerminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonTerminarActionPerformed
        int x = JOptionPane.showConfirmDialog(null, "¿Cerrar aplicación?");
        if (x == 0) {
            System.exit(0);
        }
    }//GEN-LAST:event_botonTerminarActionPerformed

    private void botonRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegresarActionPerformed
        this.dispose();
        VentanaPrincipal p = new VentanaPrincipal();
        p.setLocationRelativeTo(null);
        p.setVisible(true);

    }//GEN-LAST:event_botonRegresarActionPerformed


    private void botonListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonListarActionPerformed

        ResultSet rs = null;
        String[] datos = new String[4];
        try {
            rs = FachadaLogica.listadoAfiliados();
            try {
                while (rs.next()) {
                    datos[0] = rs.getString(1);
                    datos[1] = rs.getString(2);
                    datos[2] = rs.getString(3);
                    datos[3] = rs.getString(9);
                    model.addRow(datos);

                }
            } catch (SQLException ex) {
                Logger.getLogger(VentanaAfiliados.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (ExcepcionConectar ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } catch (ExcepcionCerrarConexion ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }


    }//GEN-LAST:event_botonListarActionPerformed

    private void botonNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonNuevoActionPerformed

        VentanaAfiliadosAlta v = new VentanaAfiliadosAlta();
        v.setVisible(true);
        v.setLocationRelativeTo(null);
        v.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_botonNuevoActionPerformed

    private void botonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEditarActionPerformed

        int fila = tabla.getSelectedRow();
        String cedula = (String) (model.getValueAt(fila, 0));
        Afiliado afiliado = new Afiliado();
        afiliado.setCedula(cedula);
        Afiliado af=null;
        try {
            af=FachadaLogica.consultaAfiliadoPorCedula(afiliado);
        } catch (ExcepcionConectar ex) {
            Logger.getLogger(VentanaAfiliados.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ExcepcionCerrarConexion ex) {
            Logger.getLogger(VentanaAfiliados.class.getName()).log(Level.SEVERE, null, ex);
        }

        VentanaAfiliadosEditar v = new VentanaAfiliadosEditar();
        v.rellenarCampos(af);
        v.setVisible(true);
        v.setLocationRelativeTo(null);

        v.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_botonEditarActionPerformed

    private void botonBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBorrarActionPerformed

        int fila = tabla.getSelectedRow();
        String cedula = (String) model.getValueAt(fila, 0);
        String nombre = (String) model.getValueAt(fila, 1);
        String apellido = (String) model.getValueAt(fila, 2);

        int respuesta = JOptionPane.showConfirmDialog(null, "¿Confirma eliminar al siguiente afiliado?:\n "
                + "CI = " + cedula + "\n"
                + "Nombre = " + nombre + " " + apellido);

//        VentanaAfiliadosBorrar v = new VentanaAfiliadosBorrar();
//        v.setVisible(true);
//        v.setLocationRelativeTo(null);
//        v.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_botonBorrarActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaAfiliados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaAfiliados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaAfiliados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaAfiliados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaAfiliados().setVisible(true);
            }
        });
    }

    DefaultTableModel model = new DefaultTableModel();

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonBorrar;
    private javax.swing.JButton botonEditar;
    private javax.swing.JButton botonListar;
    private javax.swing.JButton botonNuevo;
    private javax.swing.JButton botonRegresar;
    private javax.swing.JButton botonTerminar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables
}

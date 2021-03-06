/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import javax.swing.JTable;
import PedidosLibros.Usuario;
import PedidosLibros.GestionUsuario;
import Tabla.ModeladorTablas;
import estructura.Nodo;


/**
 *
 * @author marip
 */
public class Usuarios extends javax.swing.JFrame {

    /**
     * Creates new form Usuarios
     */


   private GestionUsuario gestion_usuario; // DEBE ESTAR DECLARADO E INICIALIZADO 

    public GestionUsuario getGestion_usuario() {
        return gestion_usuario;
    }

    public void setGestion_usuario(GestionUsuario gestion_usuario) {
        this.gestion_usuario = gestion_usuario;
    }

    /**
     * GENERAR GETTER AND SETTER DE LA TABLA
     *
     * @return
     */
       public JTable getTabla_usuarios() {
        return tabla_usuarios;
    }

    public void setTabla_usuarios(JTable tabla_usuarios) {
        this.tabla_usuarios = tabla_usuarios;
    }
    
    
    /**
     * Creates new form GestiondeLibrerias
     */
    public Usuarios() {
        initComponents();
        this.setLocationRelativeTo(null);
      
    }
    
    
    
    
    /**
     * Permite actualizar la tabla, de modo que va a la lista de gestión y la recorre para llenar la tabla nuevamente
     */
    public void actualizarTabla() {

        ModeladorTablas.vaciarTabla(tabla_usuarios);
        Object[] filaNueva;
        Nodo<Usuario> temp = gestion_usuario.getUsuarios().getInicio();
        for (int i = 0; i < gestion_usuario.getUsuarios().getSize(); i++) {
            filaNueva = new Object[]{temp.getElemento().getCedula(),
                temp.getElemento().getCedula(),
                temp.getElemento().getNombre(),
                temp.getElemento().getDireccion(),
                temp.getElemento().getTelefono(),
                temp.getElemento().getCorreo()};
            ModeladorTablas.nuevaFila(tabla_usuarios, filaNueva);
            temp = temp.getNodoSig();
        }
    }

    /**
     * Cuando se selecciona un dato específico, este será eliminado tanto en la tabla como en la lista enlazada
     * @throws Exception 
     */
    public void eliminarDesdeTabla() throws Exception {
        int rowNum = tabla_usuarios.getSelectedRow();
        String elim = ModeladorTablas.obtenerValorCelda(tabla_usuarios, rowNum, 0);//ModeladorTablas.obtenerValorCelda(tabla_animales, rowNum, 0);
        gestion_usuario.eliminarUsuario(elim);
        actualizarTabla();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_usuarios = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        lblUsuario = new javax.swing.JLabel();
        btnCrear = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tabla_usuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tabla_usuarios);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 450, 150));

        jButton3.setText("Salir");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 320, -1, -1));

        lblUsuario.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        lblUsuario.setText("Usuarios:");
        lblUsuario.setToolTipText("");
        getContentPane().add(lblUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 50, -1, -1));

        btnCrear.setText("Crear Usuario");
        btnCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearActionPerformed(evt);
            }
        });
        getContentPane().add(btnCrear, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 320, -1, -1));

        jButton1.setText("Libro a pedir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 320, -1, -1));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondos-de-colores-lisos-claros.jpg"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 550, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void btnCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearActionPerformed
       CrearUsuario crear = new CrearUsuario(this, rootPaneCheckingEnabled, this);
       crear.setVisible(true);
       crear.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
    }//GEN-LAST:event_btnCrearActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Buscar buscar = new Buscar();
        buscar.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCrear;
    private javax.swing.JLabel fondo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JTable tabla_usuarios;
    // End of variables declaration//GEN-END:variables
}

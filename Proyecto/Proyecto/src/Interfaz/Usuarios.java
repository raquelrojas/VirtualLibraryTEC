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


   public GestionUsuario gestion_usuario; // DEBE ESTAR DECLARADO E INICIALIZADO 

    public GestionUsuario getGestion_usuario() {
        return gestion_usuario;
    }

    public void setGestion_libro(GestionUsuario gestion_usuario) {
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
                temp.getElemento().getNombre(),
                temp.getElemento().getCedula(),
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
        btnAgregar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        lblUsuario = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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

        btnAgregar.setText("Agregar Pedido");

        jButton2.setText("Menú: ");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Salir");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        lblUsuario.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        lblUsuario.setText("Usuarios:");
        lblUsuario.setToolTipText("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(248, 248, 248)
                .addComponent(lblUsuario)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(btnAgregar)
                        .addGap(52, 52, 52)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton3))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(82, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(76, 76, 76))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addComponent(lblUsuario)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(111, 111, 111))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAgregar)
                            .addComponent(jButton2)
                            .addComponent(jButton3))
                        .addGap(32, 32, 32))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Menu menu = new Menu();
        menu.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JTable tabla_usuarios;
    // End of variables declaration//GEN-END:variables
}

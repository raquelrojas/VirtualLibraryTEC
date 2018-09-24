/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import PedidosLibros.GestionPedidos;
import javax.swing.JTable;
import Tabla.ModeladorTablas;
import estructura.Nodo;
import PedidosLibros.Pedidos;

/**
 *
 * @author marip
 */
public class Pedido extends javax.swing.JFrame {

    private GestionPedidos gestion_pedidos; // DEBE ESTAR DECLARADO E INICIALIZADO 

    public GestionPedidos getGestion_Pedidos() {
        return gestion_pedidos;
    }

    public void setGestion_Pedidos(GestionPedidos gestion_pedidos) {
        this.gestion_pedidos = gestion_pedidos;
    }

    /**
     * GENERAR GETTER AND SETTER DE LA TABLA
     *
     * @return
     */
       public JTable getTabla_pedidos() {
        return tabla_pedidos;
    }

    public void setTabla_pedidos(JTable tabla_pedidos) {
        this.tabla_pedidos = tabla_pedidos;
    }
    
   
    public Pedido() {
        initComponents();
        this.setLocationRelativeTo(null);
      
    }
    
     public void actualizarTabla() {

        ModeladorTablas.vaciarTabla(tabla_pedidos);
        Object[] filaNueva;
        Nodo<Pedidos> temp = gestion_pedidos.getPedidos().getHead();
        for (int i = 0; i < gestion_pedidos.getPedidos().getSize(); i++) {
            filaNueva = new Object[]{
                temp.getElemento().getIssn(),
                temp.getElemento().getNombre(),
                temp.getElemento().getTema(),
                temp.getElemento().getLibreria(),
                temp.getElemento().getCantvendida(),
                temp.getElemento().getCantdisponible(),
                temp.getElemento().getDescripcion(),
                temp.getElemento().getPrecio()};
            ModeladorTablas.nuevaFila(tabla_pedidos, filaNueva);
            temp = temp.getNodoSig();
        }
    }

    /**
     * Cuando se selecciona un dato específico, este será eliminado tanto en la tabla como en la lista enlazada
     * @throws Exception 
     */
    public void eliminarDesdeTabla() throws Exception {
        int rowNum = tabla_pedidos.getSelectedRow();
        String elim = ModeladorTablas.obtenerValorCelda(tabla_pedidos, rowNum, 0);//ModeladorTablas.obtenerValorCelda(tabla_animales, rowNum, 0);
        gestion_pedidos.eliminarPedidos(elim);
        actualizarTabla();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_pedidos = new javax.swing.JTable();
        lblNombre = new javax.swing.JLabel();
        btnenviar = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tabla_pedidos.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tabla_pedidos);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 550, 250));

        lblNombre.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        lblNombre.setText("Atención de Pedidos");
        getContentPane().add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 30, -1, -1));

        btnenviar.setText("Enviar Pedido");
        getContentPane().add(btnenviar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 360, -1, -1));

        btnNuevo.setText("Nuevo Pedido");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });
        getContentPane().add(btnNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 360, -1, -1));

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 360, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondos-de-colores-lisos-claros.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 410));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
      Buscar bus = new Buscar();
      bus.setVisible(true);
      this.setVisible(false);
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    /**
     * @param args the command line arguments
     */
 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnenviar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JTable tabla_pedidos;
    // End of variables declaration//GEN-END:variables
}

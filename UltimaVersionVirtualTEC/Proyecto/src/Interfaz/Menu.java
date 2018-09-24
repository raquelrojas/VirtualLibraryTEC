/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import Tabla.ModeladorTablas;
import Libreria.GestionLibrerias;
import Libreria.Libreria;
import Libros.GestionLibro;
import Presentacion.App;

/**
 *
 * @author marip
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Interfaz
     */
    public Menu() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        textField1 = new java.awt.TextField();
        jLabel1 = new javax.swing.JLabel();
        btnLibrerias = new javax.swing.JButton();
        btnLibros = new javax.swing.JButton();
        btnBusqueda = new javax.swing.JButton();
        btnPedidos = new javax.swing.JButton();
        btnAtencion = new javax.swing.JButton();
        btnHolidays = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        textField1.setText("textField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menú");
        setBackground(new java.awt.Color(204, 0, 0));
        setName("menu"); // NOI18N
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Roboto", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 153));
        jLabel1.setText("Menú");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 40, -1, -1));

        btnLibrerias.setBackground(new java.awt.Color(0, 204, 204));
        btnLibrerias.setForeground(new java.awt.Color(255, 255, 255));
        btnLibrerias.setText("Gestión de Librerías");
        btnLibrerias.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLibreriasMouseClicked(evt);
            }
        });
        btnLibrerias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLibreriasActionPerformed(evt);
            }
        });
        getContentPane().add(btnLibrerias, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, -1, -1));

        btnLibros.setBackground(new java.awt.Color(0, 204, 204));
        btnLibros.setForeground(new java.awt.Color(255, 255, 255));
        btnLibros.setText("Gestión de Libros");
        btnLibros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLibrosMouseClicked(evt);
            }
        });
        getContentPane().add(btnLibros, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, -1, -1));

        btnBusqueda.setBackground(new java.awt.Color(0, 204, 204));
        btnBusqueda.setForeground(new java.awt.Color(255, 255, 255));
        btnBusqueda.setText("Búsqueda de Libros");
        btnBusqueda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBusquedaActionPerformed(evt);
            }
        });
        getContentPane().add(btnBusqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, -1, -1));

        btnPedidos.setBackground(new java.awt.Color(0, 204, 204));
        btnPedidos.setForeground(new java.awt.Color(255, 255, 255));
        btnPedidos.setText("Pedidos de Libros");
        btnPedidos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPedidosMouseClicked(evt);
            }
        });
        getContentPane().add(btnPedidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 120, -1, -1));

        btnAtencion.setBackground(new java.awt.Color(0, 204, 204));
        btnAtencion.setForeground(new java.awt.Color(255, 255, 255));
        btnAtencion.setText("Atención de pedidos");
        btnAtencion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtencionActionPerformed(evt);
            }
        });
        getContentPane().add(btnAtencion, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 190, -1, -1));

        btnHolidays.setBackground(new java.awt.Color(0, 204, 204));
        btnHolidays.setForeground(new java.awt.Color(255, 255, 255));
        btnHolidays.setText("Días Festivos");
        btnHolidays.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHolidaysActionPerformed(evt);
            }
        });
        getContentPane().add(btnHolidays, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 260, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondos-de-colores-lisos-claros.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 360));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBusquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBusquedaActionPerformed
        Buscar buscar = new Buscar();
        buscar.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnBusquedaActionPerformed

    private void btnLibreriasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLibreriasMouseClicked

        GestionLibrerias gestion_libreria = new GestionLibrerias();
        this.setVisible(false);
            
        Librerias principal = new Librerias();
        principal.setVisible(true);
        principal.setGestion_libreria(App.gestion_libreria);//lista global
        
        /**
         * EN ESTE CASO SE NECESITAN LAS COLUMNAS DE LOS LIBROS
         */
        Object[] columnasLibreria = new Object[] {"ID","Nombre","País","Ubicacion", "Telefono", "Horario"};        
        principal.getTabla_librerias().setModel(ModeladorTablas.generarModeloDeTabla(6, columnasLibreria));
        principal.getTabla_librerias().setAutoCreateRowSorter(true);
        principal.actualizarTabla();
    
           //Ocultar el menú, boton de devolverse?
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLibreriasMouseClicked

    private void btnLibreriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLibreriasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLibreriasActionPerformed

    private void btnHolidaysActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHolidaysActionPerformed
        Holidays holi = new Holidays();
        holi.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnHolidaysActionPerformed

    private void btnLibrosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLibrosMouseClicked

        this.setVisible(false);
            
        Libro principal = new Libro();
        principal.setVisible(true);
        principal.setGestion_libro(App.gestion_libro);// global lista
        
        Object[] columnasLibros = new Object[] {"Issn","Nombre","Tema","Librerías","Cant Vendida","Cant Disponible", "Descripcion", "Precio"};        
        principal.getTabla_libro().setModel(ModeladorTablas.generarModeloDeTabla(8, columnasLibros));
        principal.getTabla_libro().setAutoCreateRowSorter(true);
        principal.actualizarTabla();
    }//GEN-LAST:event_btnLibrosMouseClicked

    private void btnPedidosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPedidosMouseClicked
           this.setVisible(false);
        
        Usuarios usuario = new Usuarios();
        usuario.setVisible(true);
        usuario.setGestion_usuario(App.gestion_usuario);
        
        Object[] columnasUsuario = new Object[] {"Cedula","Nombre","Direccion", "Telefono", "Correo"};
        usuario.getTabla_usuarios().setModel(ModeladorTablas.generarModeloDeTabla(5, columnasUsuario));
        usuario.getTabla_usuarios().setAutoCreateRowSorter(true);
        usuario.actualizarTabla();
        
       
    }//GEN-LAST:event_btnPedidosMouseClicked

    private void btnAtencionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtencionActionPerformed
        Pedido pedido = new Pedido();
        pedido.setVisible(true);
        Object[] columnasPedidos = new Object[] {"Issn", "Nombre","Vendidos", "Disponibles", "Descripcion", "Precio"};
        pedido.getTabla_pedidos().setModel(ModeladorTablas.generarModeloDeTabla(6, columnasPedidos));
        pedido.getTabla_pedidos().setAutoCreateRowSorter(true);
        pedido.actualizarTabla();
    }//GEN-LAST:event_btnAtencionActionPerformed


   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtencion;
    private javax.swing.JButton btnBusqueda;
    private javax.swing.JButton btnHolidays;
    private javax.swing.JButton btnLibrerias;
    private javax.swing.JButton btnLibros;
    private javax.swing.JButton btnPedidos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private java.awt.TextField textField1;
    // End of variables declaration//GEN-END:variables
}
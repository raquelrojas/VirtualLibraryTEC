/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import javax.swing.JTable;

import Libros.GestionLibro;
import Libros.Libros;
import Interfaz.Usuarios;
import estructura.Nodo;
import Tabla.ModeladorTablas;

import javax.swing.table.DefaultTableModel;
import modelo.enums.CategoriasLibros;


/**
 *
 * @author marip
 */
public class LibroFiltrado extends javax.swing.JFrame {

       public GestionLibro gestion_libro; // DEBE ESTAR DECLARADO E INICIALIZADO 
       
       private Pedido pedido;

    public GestionLibro getGestion_libro() {
        return gestion_libro;
    }
    

    public void setGestion_libro(GestionLibro gestion_libro) {
        this.gestion_libro = gestion_libro;
    }

    /**
     * GENERAR GETTER AND SETTER DE LA TABLA
     *
     * @return
     */
       public JTable getTabla_libro() {
        return tabla_libros;
    }

    public void setTabla_librerias(JTable tabla_libros) {
        this.tabla_libros = tabla_libros;
    }
    
    
    /**
     * Creates new form GestiondeLibrerias
     */
    public LibroFiltrado() {
        initComponents();
        this.setLocationRelativeTo(null);
      
    }
    
    
    
    
    /**
     * Permite actualizar la tabla, de modo que va a la lista de gestión y la recorre para llenar la tabla nuevamente
     */
    public void actualizarTabla() {

        ModeladorTablas.vaciarTabla(tabla_libros);
        Object[] filaNueva;
        Nodo<Libros> temp = gestion_libro.getLibrosFiltrados().getInicio();
        for (int i = 0; i < gestion_libro.getLibrosFiltrados().getSize(); i++) {
            filaNueva = new Object[]{temp.getElemento().getIssn(),
                temp.getElemento().getNombre(),
                temp.getElemento().getTema(),
                temp.getElemento().getCantvendida(),
                temp.getElemento().getCantdisponible(),
                temp.getElemento().getDescripcion(),
                temp.getElemento().getPrecio()};
            ModeladorTablas.nuevaFila(tabla_libros, filaNueva);
            temp = temp.getNodoSig();
        }
    }


    
  

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        btnDetalle = new javax.swing.JButton();
        btnMenu = new javax.swing.JButton();
        lblTitulo = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabla_libros = new javax.swing.JTable();
        btnAgregarPedido = new javax.swing.JButton();
        Fondo = new javax.swing.JLabel();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gestión de Librerías");
        setName("Glibrerias"); // NOI18N
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnDetalle.setBackground(new java.awt.Color(0, 204, 204));
        btnDetalle.setForeground(new java.awt.Color(255, 255, 255));
        btnDetalle.setText("Ver detalle");
        btnDetalle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDetalleActionPerformed(evt);
            }
        });
        getContentPane().add(btnDetalle, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 470, -1, -1));

        btnMenu.setBackground(new java.awt.Color(0, 204, 204));
        btnMenu.setForeground(new java.awt.Color(255, 255, 255));
        btnMenu.setText("Menú");
        btnMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuActionPerformed(evt);
            }
        });
        getContentPane().add(btnMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 470, -1, -1));

        lblTitulo.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        lblTitulo.setText("Libros Filtrados");
        getContentPane().add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 30, -1, -1));

        tabla_libros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tabla_libros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabla_librosMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabla_libros);
        if (tabla_libros.getColumnModel().getColumnCount() > 0) {
            tabla_libros.getColumnModel().getColumn(1).setResizable(false);
        }

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 680, 350));

        btnAgregarPedido.setBackground(new java.awt.Color(0, 204, 255));
        btnAgregarPedido.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregarPedido.setText("Agregar a Pedido");
        btnAgregarPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarPedidoActionPerformed(evt);
            }
        });
        getContentPane().add(btnAgregarPedido, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 470, -1, -1));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondos-de-colores-lisos-claros.jpg"))); // NOI18N
        getContentPane().add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, 537));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDetalleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDetalleActionPerformed

         DefaultTableModel model = (DefaultTableModel)tabla_libros.getModel();
        int indice = tabla_libros.getSelectedRow();
      
        
        int issn = Integer.parseInt(model.getValueAt(indice, 0).toString());
        String nombre = (String)model.getValueAt(indice, 1);
        CategoriasLibros tema = (CategoriasLibros)model.getValueAt(indice, 2);
        //String libreria = (S)
        int vendidos = Integer.parseInt(model.getValueAt(indice,3).toString());
        int disponible = Integer.parseInt(model.getValueAt(indice,4).toString());
        String descripcion = (String)model.getValueAt(indice, 5);
        double precio = Double.parseDouble(model.getValueAt(indice,6).toString());
        
        verDetalle detalle = new verDetalle(issn,nombre,tema,vendidos, disponible, descripcion,precio);
        detalle.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_btnDetalleActionPerformed

    private void btnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuActionPerformed
        Menu menu = new Menu();
        menu.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnMenuActionPerformed

    private void tabla_librosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabla_librosMouseClicked

       
       
    }//GEN-LAST:event_tabla_librosMouseClicked

    private void btnAgregarPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarPedidoActionPerformed
         DefaultTableModel model = (DefaultTableModel)tabla_libros.getModel();
        int indice = tabla_libros.getSelectedRow();
       // CategoriasLibros tema;
        /*
         ModeladorTablas mod = new ModeladorTablas();
        
        Usuarios usu = new Usuarios();
       
         String cedula = mod.obtenerValorCelda(usu.getTabla_usuarios(), 0, 0);
         */
        
        int issn = Integer.parseInt(model.getValueAt(indice, 0).toString());
        String nombre = (String)model.getValueAt(indice, 1);
        
        int vendidos = Integer.parseInt(model.getValueAt(indice,3).toString());
        int disponible = Integer.parseInt(model.getValueAt(indice,4).toString());
        String descripcion = (String)model.getValueAt(indice, 5);
        double precio = Double.parseDouble(model.getValueAt(indice,6).toString());
        
         pedido.getGestion_Pedidos().crearPedido(issn, nombre, vendidos, disponible,descripcion,precio); ////AQUI PUEDO LLAMAR EL METODO DE LA VENTANA PADRE.

           pedido.actualizarTabla();
        
           this.dispose();
    }//GEN-LAST:event_btnAgregarPedidoActionPerformed

 
 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fondo;
    private javax.swing.JButton btnAgregarPedido;
    private javax.swing.JButton btnDetalle;
    private javax.swing.JButton btnMenu;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTable tabla_libros;
    // End of variables declaration//GEN-END:variables
}

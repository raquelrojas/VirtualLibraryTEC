/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import javax.swing.JTable;
import java.util.logging.Level;
import java.util.logging.Logger;
import Libros.GestionLibro;
import Libros.Libros;
import estructura.Lista;
import estructura.Nodo;
import Tabla.ModeladorTablas;
import Interfaz.CrearLibros;
import Libreria.Libreria;
import javax.swing.JOptionPane;
import static javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE;

/**
 *
 * @author marip
 */
public class Libro extends javax.swing.JFrame {

       public GestionLibro gestion_libro; // DEBE ESTAR DECLARADO E INICIALIZADO 

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
    public Libro() {
        initComponents();
        this.setLocationRelativeTo(null);
      
    }
    
    
    
    
    /**
     * Permite actualizar la tabla, de modo que va a la lista de gestión y la recorre para llenar la tabla nuevamente
     */
    public void actualizarTabla() {

        ModeladorTablas.vaciarTabla(tabla_libros);
        Object[] filaNueva;
        Nodo<Libros> temp = gestion_libro.getLibros().getInicio();
        for (int i = 0; i < gestion_libro.getLibros().getSize(); i++) {
            filaNueva = new Object[]{temp.getElemento().getIssn(),
                temp.getElemento().getNombre(),
                temp.getElemento().getTema(),
                temp.getElemento().getLibreria(),
                temp.getElemento().getCantvendida(),
                temp.getElemento().getCantdisponible(),
                temp.getElemento().getDescripcion(),
                temp.getElemento().getPrecio()};
            ModeladorTablas.nuevaFila(tabla_libros, filaNueva);
            temp = temp.getNodoSig();
        }
    }

    /**
     * Cuando se selecciona un dato específico, este será eliminado tanto en la tabla como en la lista enlazada
     * @throws Exception 
     */
    public void eliminarDesdeTabla() throws Exception {
        int rowNum = tabla_libros.getSelectedRow();
        String elim = ModeladorTablas.obtenerValorCelda(tabla_libros, rowNum, 0);//ModeladorTablas.obtenerValorCelda(tabla_animales, rowNum, 0);
        gestion_libro.eliminarLibros(elim);
        actualizarTabla();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnAgregar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnConsultar = new javax.swing.JButton();
        btnMenu = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        lblTitulo = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabla_libros = new javax.swing.JTable();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gestión de Librerías");
        setName("Glibrerias"); // NOI18N
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnAgregar.setBackground(new java.awt.Color(0, 204, 204));
        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        getContentPane().add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 480, -1, -1));

        btnEliminar.setBackground(new java.awt.Color(0, 204, 204));
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 480, -1, -1));

        btnConsultar.setBackground(new java.awt.Color(0, 204, 204));
        btnConsultar.setText("Consultar ");
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });
        getContentPane().add(btnConsultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 480, -1, -1));

        btnMenu.setBackground(new java.awt.Color(0, 204, 204));
        btnMenu.setText("Menú");
        btnMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuActionPerformed(evt);
            }
        });
        getContentPane().add(btnMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 480, -1, -1));

        btnSalir.setBackground(new java.awt.Color(0, 204, 204));
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 480, 80, 30));

        lblTitulo.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        lblTitulo.setText("Gestión de Libros");
        getContentPane().add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 30, -1, -1));

        tabla_libros.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(tabla_libros);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, 570, 350));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondos-de-colores-lisos-claros.jpg"))); // NOI18N
        getContentPane().add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 719, 537));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
       CrearLibros crear_libros = new CrearLibros(this, rootPaneCheckingEnabled, this);
        crear_libros.setVisible(true);
        crear_libros.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE); // SIRVE PARA EVITAR QUE SE CIERRE EL PROGRAMA AL SALIR DE LA VENTANA
       
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
           try {

            eliminarDesdeTabla();

        } catch (Exception ex) {
            //ystem.out.println(ex.getMessage());
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        JOptionPane.showMessageDialog(null, this.gestion_libro.getLibros().toString());
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void btnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuActionPerformed
        Menu menu = new Menu();
        menu.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnMenuActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

 
 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fondo;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnMenu;
    private javax.swing.JButton btnSalir;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTable tabla_libros;
    // End of variables declaration//GEN-END:variables
}

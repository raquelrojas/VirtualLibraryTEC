/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import Libros.Libros;
import javax.swing.JOptionPane;
import modelo.enums.CategoriasLibros;

/**
 *
 * @author jearo
 */
public class CrearLibros extends javax.swing.JDialog {

    /**
     * OJO QUE SIEMPRE SE MANEJA TODO POR INSTANCIAS NUNCA METÍ DENTRO DEL
     * CÓDIGO DE LA INTERFAZ GRÁFICA OTRA COSA QUE NO FUERA DE LA INTERFAZ *
     */
    private final Libro principal; // ESTA INSTANCIA PERMITE A ESTA VENTANA COMUNICARSE CON LA VENTANA PRINCIPAL

    /**
     * Creates new form PantallaCrearAnimal
     * @param parent
     * @param modal
     * @param principal
     */
    public CrearLibros(java.awt.Frame parent, boolean modal, Libro principal) {
        super(parent, modal);
        initComponents();
        //this.setLocationRelativeTo(null);
        this.principal = principal; // MEDIANTE EL CONSTRUCTOR DE LAVENTANA CADA VEZ QUE SE LLAMA ESTA VENTANA
                                    // TRAE CONSIGO LA INSTANCIA DE LA VENTANA MADRE, DE LA CUAL LLAMA LA gestion_animal
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txttitulo = new javax.swing.JTextField();
        txtprecio = new javax.swing.JTextField();
        txtdescripcion = new javax.swing.JTextField();
        txtdisponibles = new javax.swing.JTextField();
        txtvendidos = new javax.swing.JTextField();
        btncrear = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        btnLibros = new javax.swing.JButton();
        lblTema = new javax.swing.JLabel();
        lblvendidos = new javax.swing.JLabel();
        lbltitulo = new javax.swing.JLabel();
        lbldisponibles = new javax.swing.JLabel();
        lbldescripcion = new javax.swing.JLabel();
        lblprecio = new javax.swing.JLabel();
        lblTitulo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtissn = new javax.swing.JTextField();
        boxTema = new javax.swing.JComboBox<>();
        txtlibreria = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();
        txtprecio1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txttitulo.setToolTipText("Tipo de animal");
        getContentPane().add(txttitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, 260, -1));
        getContentPane().add(txtprecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 360, 260, -1));
        getContentPane().add(txtdescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 300, 260, -1));
        getContentPane().add(txtdisponibles, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 250, 260, -1));

        txtvendidos.setToolTipText("Nombre del animal");
        getContentPane().add(txtvendidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 210, 260, -1));

        btncrear.setBackground(new java.awt.Color(0, 204, 204));
        btncrear.setForeground(new java.awt.Color(255, 255, 255));
        btncrear.setText("Crear");
        btncrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncrearActionPerformed(evt);
            }
        });
        getContentPane().add(btncrear, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 390, 70, 30));

        btnSalir.setBackground(new java.awt.Color(0, 204, 204));
        btnSalir.setForeground(new java.awt.Color(255, 255, 255));
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 390, -1, -1));

        btnLibros.setBackground(new java.awt.Color(0, 204, 204));
        btnLibros.setForeground(new java.awt.Color(255, 255, 255));
        btnLibros.setText("Libros");
        btnLibros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLibrosActionPerformed(evt);
            }
        });
        getContentPane().add(btnLibros, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 390, -1, -1));

        lblTema.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        lblTema.setText("Tema:");
        getContentPane().add(lblTema, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, -1, -1));

        lblvendidos.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        lblvendidos.setText("Vendidos:");
        getContentPane().add(lblvendidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, -1, 20));

        lbltitulo.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        lbltitulo.setText("Titulo: ");
        getContentPane().add(lbltitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, -1, -1));

        lbldisponibles.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        lbldisponibles.setText("Disponibles");
        getContentPane().add(lbldisponibles, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, -1, -1));

        lbldescripcion.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        lbldescripcion.setText("Descripción:");
        getContentPane().add(lbldescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, -1, 20));

        lblprecio.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        lblprecio.setText("Precio:");
        getContentPane().add(lblprecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, -1, -1));

        lblTitulo.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        lblTitulo.setText("Agregar Libros");
        getContentPane().add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 30, -1, -1));

        jLabel1.setText("Issn: ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, -1, -1));
        getContentPane().add(txtissn, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, 260, -1));

        boxTema.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "INGENIERIA", "ADMINISTRACION", "CIENCIASNATURALES", "ARTES", "HISTORIA", "FICCION", "LITERATURA", "MATEMATICA" }));
        getContentPane().add(boxTema, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 160, -1, -1));
        getContentPane().add(txtlibreria, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 330, 260, -1));

        jLabel2.setText("Libreria:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, -1, -1));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondos-de-colores-lisos-claros.jpg"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(-40, 0, 500, 520));
        getContentPane().add(txtprecio1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 360, 260, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btncrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncrearActionPerformed

        // ESTAS VARIABLES SIRVEN PARA GUARDAR LA INFORMACION DE LOS TEXTFIELDS.
        String issn, titulo,  descripcion, libreria;
        int vendidos, disponibles;
        double precio = 0;
        CategoriasLibros tema;
        
        if (this.boxTema.getActionCommand().isEmpty() || this.txttitulo.getText().isEmpty() || this.txtissn.getText().isEmpty() || this.txtdescripcion.getText().isEmpty()||
                this.txtvendidos.getText().isEmpty() || this.txtdisponibles.getText().isEmpty() || this.txtprecio.getText().isEmpty() || 
                this.txtlibreria.getText().isEmpty()){
        JOptionPane.showMessageDialog(this, "Debe llenar todos los espacios");
        }else{
        
        issn = this.txtissn.getText();
        titulo = this.txttitulo.getText();
        descripcion = this.txtdescripcion.getText();
        libreria = this.txtlibreria.getText();
        vendidos = Integer.parseInt(this.txtprecio.getText());
        disponibles = Integer.parseInt(this.txtdisponibles.getText());
        tema = CategoriasLibros.valueOf(boxTema.getSelectedItem().toString());
        precio = Integer.parseInt(this.txtprecio.getText());
        
        principal.getGestion_libro().crearLibros(issn, libreria, tema, vendidos, disponibles, descripcion, libreria, precio);
        principal.actualizarTabla();
        
        this.dispose();
        }

         /// ESTO VUELVE A DESAPARECER LA VENTANA
    }//GEN-LAST:event_btncrearActionPerformed

    private void btnLibrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLibrosActionPerformed
       this.setVisible(false);
    }//GEN-LAST:event_btnLibrosActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> boxTema;
    private javax.swing.JButton btnLibros;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btncrear;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblTema;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lbldescripcion;
    private javax.swing.JLabel lbldisponibles;
    private javax.swing.JLabel lblprecio;
    private javax.swing.JLabel lbltitulo;
    private javax.swing.JLabel lblvendidos;
    private javax.swing.JTextField txtdescripcion;
    private javax.swing.JTextField txtdisponibles;
    private javax.swing.JTextField txtissn;
    private javax.swing.JTextField txtlibreria;
    private javax.swing.JTextField txtprecio;
    private javax.swing.JTextField txtprecio1;
    private javax.swing.JTextField txttitulo;
    private javax.swing.JTextField txtvendidos;
    // End of variables declaration//GEN-END:variables
}
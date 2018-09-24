/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

/**
 *
 * @author jearo
 */
public class CrearLibreria extends javax.swing.JDialog {

    /**
     * OJO QUE SIEMPRE SE MANEJA TODO POR INSTANCIAS NUNCA METÍ DENTRO DEL
     * CÓDIGO DE LA INTERFAZ GRÁFICA OTRA COSA QUE NO FUERA DE LA INTERFAZ *
     */
    private Librerias principal; // ESTA INSTANCIA PERMITE A ESTA VENTANA COMUNICARSE CON LA VENTANA PRINCIPAL

    /**
     * Creates new form PantallaCrearAnimal
     */
    public CrearLibreria(java.awt.Frame parent, boolean modal, Librerias principal) {
        super(parent, modal);
        initComponents();
        lblAlerta.setVisible(false);
         this.setLocationRelativeTo(null);
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

        txtid = new javax.swing.JTextField();
        txtnombre = new javax.swing.JTextField();
        txthorario = new javax.swing.JTextField();
        txttelefono = new javax.swing.JTextField();
        txtubicacion = new javax.swing.JTextField();
        txtpais = new javax.swing.JTextField();
        btn_crear = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        btnLibreria = new javax.swing.JButton();
        lblAlerta = new javax.swing.JLabel();
        lblID = new javax.swing.JLabel();
        lblPais = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblUbicacion = new javax.swing.JLabel();
        lblTelefono = new javax.swing.JLabel();
        lblHorario = new javax.swing.JLabel();
        lblTitulo = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtid.setToolTipText("Identificador del animal");
        getContentPane().add(txtid, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, 260, -1));

        txtnombre.setToolTipText("Tipo de animal");
        getContentPane().add(txtnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, 260, -1));
        getContentPane().add(txthorario, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 300, 260, -1));
        getContentPane().add(txttelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 260, 260, -1));
        getContentPane().add(txtubicacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 210, 260, -1));

        txtpais.setToolTipText("Nombre del animal");
        getContentPane().add(txtpais, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 170, 260, -1));

        btn_crear.setBackground(new java.awt.Color(0, 204, 204));
        btn_crear.setForeground(new java.awt.Color(255, 255, 255));
        btn_crear.setText("Crear");
        btn_crear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_crearActionPerformed(evt);
            }
        });
        getContentPane().add(btn_crear, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 350, 70, 30));

        btnSalir.setBackground(new java.awt.Color(0, 204, 204));
        btnSalir.setForeground(new java.awt.Color(255, 255, 255));
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 350, -1, -1));

        btnLibreria.setBackground(new java.awt.Color(0, 204, 204));
        btnLibreria.setForeground(new java.awt.Color(255, 255, 255));
        btnLibreria.setText("Librería");
        btnLibreria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLibreriaActionPerformed(evt);
            }
        });
        getContentPane().add(btnLibreria, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 350, -1, -1));

        lblAlerta.setFont(new java.awt.Font("Roboto Lt", 1, 18)); // NOI18N
        lblAlerta.setForeground(new java.awt.Color(255, 0, 0));
        lblAlerta.setText("Hay campos vacíos");
        getContentPane().add(lblAlerta, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 390, -1, -1));

        lblID.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        lblID.setText("ID: ");
        getContentPane().add(lblID, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, -1, -1));

        lblPais.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        lblPais.setText("País:");
        getContentPane().add(lblPais, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, -1, -1));

        lblNombre.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        lblNombre.setText("Nombre: ");
        getContentPane().add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, -1, -1));

        lblUbicacion.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        lblUbicacion.setText("Ubicación: ");
        getContentPane().add(lblUbicacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, -1, -1));

        lblTelefono.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        lblTelefono.setText("Teléfono:");
        getContentPane().add(lblTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, -1, 20));

        lblHorario.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        lblHorario.setText("Horario:");
        getContentPane().add(lblHorario, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, -1, -1));

        lblTitulo.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        lblTitulo.setText("Agregar Librería");
        getContentPane().add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 30, -1, -1));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondos-de-colores-lisos-claros.jpg"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, 430));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_crearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_crearActionPerformed

        // ESTAS VARIABLES SIRVEN PARA GUARDAR LA INFORMACION DE LOS TEXTFIELDS.
        String id, nombre, pais, ubicacion, telefono, horario;
        id = this.txtid.getText();
        nombre = this.txtnombre.getText();
        pais = this.txtpais.getText();
        ubicacion = this.txtubicacion.getText();
        telefono = this.txttelefono.getText();
        horario = this.txthorario.getText();
        
        if (this.txtid.getText() == "" || this.txtnombre.getText() == "" || this.txtpais.getText() == "" || this.txtubicacion.getText() == "" || this.txttelefono.getText() == "" || this.txthorario.getText() == ""){
            lblAlerta.setVisible(true);
            
        } else{
            
            principal.getGestion_libreria().crearLibreria(id, nombre,pais,ubicacion,telefono,horario); ////AQUI PUEDO LLAMAR EL METODO DE LA VENTANA PADRE.

            principal.actualizarTabla();

        this.dispose();
        }

         /// ESTO VUELVE A DESAPARECER LA VENTANA
    }//GEN-LAST:event_btn_crearActionPerformed

    private void btnLibreriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLibreriaActionPerformed
       this.setVisible(false);
    }//GEN-LAST:event_btnLibreriaActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLibreria;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btn_crear;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel lblAlerta;
    private javax.swing.JLabel lblHorario;
    private javax.swing.JLabel lblID;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblPais;
    private javax.swing.JLabel lblTelefono;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblUbicacion;
    private javax.swing.JTextField txthorario;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JTextField txtpais;
    private javax.swing.JTextField txttelefono;
    private javax.swing.JTextField txtubicacion;
    // End of variables declaration//GEN-END:variables
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PedidosLibros;

import Libreria.Libreria;
import Libros.*;


/**
 *
 * @author Ignacio
 */
public class Compra {
        private Usuario usuario;
        private Libreria libreria;
        private Libros libro;
        private int cantidad;
        private double precioPago;

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Libreria getLibreria() {
        return libreria;
    }

    public void setLibreria(Libreria libreria) {
        this.libreria = libreria;
    }

    public Libros getLibro() {
        return libro;
    }

    public void setLibro(Libros libro) {
        this.libro = libro;
    }

    public Compra(Usuario usuario, Libreria libreria, Libros libro, int cantidad) {
        this.usuario = usuario;
        this.libreria = libreria;
        this.libro = libro;
        this.cantidad = cantidad;
        this.precioPago = libro.getPrecio()*cantidad;
    }
        
        

    
}

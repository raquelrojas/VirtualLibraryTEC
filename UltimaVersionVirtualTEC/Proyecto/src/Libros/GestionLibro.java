/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Libros;

import Libreria.Libreria;
import estructura.Lista;
import Libros.Libros;
import estructura.Nodo;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.enums.CategoriasLibros;

public class GestionLibro{
     private Lista<Libros> libros;
     private Lista<Libros> librosFiltrados;

	public Lista<Libros> getLibros() {
		return libros;
	}
        
        public Lista<Libros> getLibrosFiltrados() {
            return librosFiltrados;
        }

	public void setLibros(Lista<Libros> Libros) {
		this.libros = Libros;
	}

	public GestionLibro() {
		this.libros = new Lista<>();
                Libros libro = new Libros("14", "La Bella y la Bestia", CategoriasLibros.LITERATURA, 40,10,
            "Bella es una joven soñadora y romántica que vive en un pequeño pueblo junto con su padre. Cuando éste es apresado por una terrible Bestia, Bella se ofrece a"
                    + " intercambiarse por su padre, para que él quede en libertad. Encerrada en el castillo de la Bestia, Bella descubrirá que las apariencias engañan,"
                    + " ¡y que la belleza está en el interior!\n", "Internacional", 15000);
                this.libros.insertarDetras(libro);
                libro = new Libros("03", "Ingeniería Económica", CategoriasLibros.INGENIERIA, 7,55,
            "Aquí el ingeniero industrial, potenciara el desarrollo de proyectos de cualquier\n" +
                "índole aplicando casos prácticos guiados paso a paso.", "Lehman", 22000);
                this.libros.insertarDetras(libro);
                libro = new Libros("27", "IMicro-Marketing", CategoriasLibros.ADMINISTRACION, 17,5,
                "es un libro enfocado en pequeñas acciones de mercadeo que pueden generar grandes resultados."
                    + " Se basa en la premisa que ser importante para un pequeño grupo de personas apasionadas"
                    + " es mucho más eficaz que tratar de ser un poco importante a un gran "
                    + "grupo de personas..", "Lehman", 26000);
                this.libros.insertarDetras(libro);
                
	}

	private Libros buscar(String issn) {
        Nodo<Libros> temp = libros.getInicio();
        for (int i = 0; i < libros.getSize(); i++) {
            if (temp.getElemento().getIssn().equals(issn)) {
                break;
            } else {
                temp = temp.getNodoSig();
            }
        }
        return temp.getElemento();
    }

    public void crearLibros(String issn, String nombre, CategoriasLibros tema, int cantvendida, int cantdisponible, String descripcion,String libreria ,double precio) {
        //Libros newLibro = new Libros(String issn, String nombre, CategoriasLibros tema, int cantvendida, int cantdisponible, String descripcion,String libreria, double precio);
        Libros newLibro = new Libros(issn, nombre, tema,cantvendida,cantdisponible,descripcion,libreria,precio);
        this.libros.insertarDetras(newLibro);
    }

    public void eliminarLibros(String issn) throws Exception {
        libros.eliminarNodoEspecifico(buscar(issn));
    }

    public String consultarLibreria() {
        return libros.toString();
    }
    
    private void resetLibreriaFiltrada() {
        this.librosFiltrados = new Lista<>();
    }
    
    public void filtrarLibreria(String nombre, CategoriasLibros tema, String libreria, double precioDesde, double precioHasta) {
        this.resetLibreriaFiltrada();
        Nodo<Libros> temp = libros.getInicio();
        for (int i = 0; i < libros.getSize(); i++) {
            Libros libro = temp.getElemento();
            if (libro.cumpleFiltro(nombre, tema, libreria, precioDesde, precioHasta)) {
                Libros copiaLibro;
                copiaLibro = new Libros(libro.issn, libro.nombre, libro.tema, libro.cantvendida, libro.cantdisponible, libro.descripcion,libro.libreria, libro.precio);
                librosFiltrados.insertarDetras(copiaLibro);
            }
            temp = temp.getNodoSig();
        }
    }
    public String consultarLibreriaFiltrada() {
        return librosFiltrados.toString();
    }
    
    
    
}

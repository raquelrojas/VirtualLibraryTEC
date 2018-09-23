/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Libros;


import estructura.Lista;
import estructura.Nodo;
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

    public void crearLibros(String issn, String nombre, CategoriasLibros tema, int cantvendida, int cantdisponible, String descripcion, double precio) {
        Libros newLibro = new Libros(issn, nombre, tema, cantvendida, cantdisponible, descripcion, precio);
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
                Libros copiaLibro = new Libros(libro.issn, libro.nombre, libro.tema, libro.cantvendida, libro.cantdisponible, libro.descripcion, libro.precio);
                librosFiltrados.insertarDetras(copiaLibro);
            }
            temp = temp.getNodoSig();
        }
    }
    public String consultarLibreriaFiltrada() {
        return librosFiltrados.toString();
    }
    
    
    
}

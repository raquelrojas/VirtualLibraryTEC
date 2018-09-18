/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

/**
 *
 * @author marip
 */
public class GestionLibrerias {
    
    private Lista nuevaLibreria;

	public Lista getLibrerias() {
		return nuevaLibreria;
	}

	public void setLibreria(Lista Librerias) {
		this.nuevaLibreria = Librerias;
	}

	public GestionLibrerias() {
		this.nuevaLibreria = new Lista();
	}

	public void crearLibreria(String nombre, String pais, String ubicacion, String telefono, String horario) {
		libreria nuevalibreria = new libreria(nombre, pais, ubicacion, telefono, horario);
		this.nuevaLibreria.insertarDetras(nuevalibreria);
	}
	
	public void eliminar(libreria libreria) {
		
	}
	
	public String consultar() {
		return nuevaLibreria.toString();
	}
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Libreria;

import estructura.Lista;
import estructura.Nodo;

/**
 *
 * @author marip
 */
public class GestionLibrerias {
    
    private Lista<Libreria> librerias;

	public Lista<Libreria> getLibrerias() {
		return librerias;
	}

	public void setLibreria(Lista<Libreria> Librerias) {
		this.librerias = Librerias;
	}

	public GestionLibrerias() {
		this.librerias = new Lista<Libreria>();
	}

	private Libreria buscar(String id) {
        Nodo<Libreria> temp = librerias.getInicio();
        for (int i = 0; i < librerias.getSize(); i++) {
            if (temp.getElemento().getId().equals(id)) {
                break;
            } else {
                temp = temp.getNodoSig();
            }
        }
        return temp.getElemento();
    }

    public void crearLibreria(String id, String nombre, String pais, String ubicacion, String telefono, String horario) {
        Libreria newLibreria = new Libreria(id, nombre, pais, ubicacion, telefono, horario);
        this.librerias.insertarDetras(newLibreria);
    }

    public void eliminarLibreria(String id) throws Exception {
        librerias.eliminarNodoEspecifico(buscar(id));
    }

    public String consultarLibreria() {
        return librerias.toString();
    }
    
}

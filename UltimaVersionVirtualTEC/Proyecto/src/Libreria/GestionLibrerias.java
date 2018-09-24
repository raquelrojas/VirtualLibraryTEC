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
                Libreria libreria = new Libreria("125F2","Lehman", "Costa Rica","San José","2203-2154","8:00 am - 9:00 pm");
                this.librerias.insertarDetras(libreria);
                libreria = new Libreria("345E1","Internacional", "Costa Rica","Heredia","2345-2954","8:30 am - 8:00 pm");
                this.librerias.insertarDetras(libreria);
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

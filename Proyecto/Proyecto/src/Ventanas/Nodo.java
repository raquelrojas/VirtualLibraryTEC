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
public class Nodo {

    private Object elemento;
	private Nodo nodoSig;
	private Nodo nodoAnt;

	public Object getElemento() {
		return elemento;
	}

	public void setElemento(Object elemento) {
		this.elemento = elemento;
	}

	public Nodo getNodoSig() {
		return nodoSig;
	}

	public void setNodoSig(Nodo nodoSig) {
		this.nodoSig = nodoSig;
	}

	public Nodo getNodoAnt() {
		return nodoAnt;
	}

	public void setNodoAnt(Nodo nodoAnt) {
		this.nodoAnt = nodoAnt;
	}

	public Nodo(Object elemento) {
		this.elemento = elemento;
		this.nodoAnt = null;
		this.nodoSig = null;
	}

	@Override
	public String toString() {
		return elemento.toString() + "\n";
	}
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructura;

/**
 *
 * @author marip
 */
public class Nodo<X> {

  private X elemento;
	private Nodo<X> nodoSig;
	private Nodo<X> nodoAnt;

	public X getElemento() {
		return elemento;
	}

	public void setElemento(X elemento) {
		this.elemento = elemento;
	}

	public Nodo<X> getNodoSig() {
		return nodoSig;
	}

	public void setNodoSig(Nodo<X> nodoSig) {
		this.nodoSig = nodoSig;
	}

	public Nodo<X> getNodoAnt() {
		return nodoAnt;
	}

	public void setNodoAnt(Nodo<X> nodoAnt) {
		this.nodoAnt = nodoAnt;
	}

	public Nodo(X elemento) {
		this.elemento = elemento;
		this.nodoAnt = null;
		this.nodoSig = null;
	}

	@Override
	public String toString() {
		return elemento.toString() + "\n";
	}
    
}

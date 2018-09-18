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
public class Lista {
  
        public Nodo inicio;
	public Nodo fin;
	public int size;

      public Lista() {
          this.inicio = null;
          this.fin = null;
          this.size = 0;
          
    }
         
            public Lista(Nodo inicio, Nodo fin, int size) {
            this.inicio = inicio;
            this.fin = fin;
            this.size= 0;
            
        }

	public Nodo getInicio() {
		return inicio;
	}

	public void setInicio(Nodo inicio) {
		this.inicio = inicio;
	}

	public Nodo getFin() {
		return fin;
	}

	public void setFin(Nodo fin) {
		this.fin = fin;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	@Override
	public String toString() {
		String msg = "";
		Nodo temp = inicio;
		for (int i = 0; i < size; i++) {
			msg += temp.toString();
			temp = temp.getNodoSig();
		}
		return msg;
	}
	
	private boolean esVacia() {
		return size == 0;
	}

	public void insertarDetras(Object elemento) {
		Nodo nuevoNodo = new Nodo(elemento);
		if (esVacia()) {
			inicio = nuevoNodo;
			fin = inicio;
			size++;
		} else {
			fin.setNodoSig(nuevoNodo);
			fin.getNodoSig().setNodoAnt(fin);
			fin = fin.getNodoSig();
			size++;
		}
	}
}

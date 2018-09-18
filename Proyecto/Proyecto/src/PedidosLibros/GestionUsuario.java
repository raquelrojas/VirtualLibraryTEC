/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PedidosLibros;

import estructura.*;


/**
 *
 * @author Ignacio
 * @param <X>
 */
public  class GestionUsuario<X>{
    private DoubleLinkedList<X> listaGestionada;

    public DoubleLinkedList<X> getListaGestionada() {
        return listaGestionada;
    }

    public void setListaGestionada(DoubleLinkedList<X> listaGestionada) {
        this.listaGestionada = listaGestionada;
    }

    @Override
    public String toString() {
        return "GestionGenerica{" + "listaGestionada=" + listaGestionada + '}';
    }

    public  GestionUsuario() {
        this.listaGestionada = new DoubleLinkedList<>();
        
    }
    
    public void agregar(X elemento){
        listaGestionada.insert(elemento);
        
    }    
        public X consultar(X elemento){
        return listaGestionada.consult(elemento);
    }
   public void modificar(X oldElement, X newElement){
     listaGestionada.update(oldElement, newElement);
     }
   
   public void eliminar(X elemento){
        listaGestionada.delete(elemento);
     }

    public void actualizarTabla() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Object getGestion_libreria() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Object getGestion_usuarios() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
    
    
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PedidosLibros;

import Libros.Libros;
import estructura.*;
import modelo.enums.CategoriasLibros;
import estructura.Lista;

/**
 *
 * @author Ignacio
 * @param <X>
 */
public  class GestionUsuario{
    private Lista<Usuario> usuarios;

    public Lista<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(Lista<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    @Override
    public String toString() {
        return "GestionGenerica{" + "listaGestionada=" + usuarios + '}';
    }

    public  GestionUsuario() {
        this.usuarios = new Lista<>();
        
    }
    
    private Usuario buscar(String cedula) {
        Nodo<Usuario> temp = usuarios.getInicio();
        for (int i = 0; i < usuarios.getSize(); i++) {
            if (temp.getElemento().getCedula().equals(cedula)) {
                break;
            } else {
                temp = temp.getNodoSig();
            }
        }
        return temp.getElemento();
    }
    
    public void crearUsuario(String cedula, String nombre, String direccion, String telefono, String correo) {
        Usuario newUsuario = new Usuario(cedula, nombre, direccion, telefono,correo);
        this.usuarios.insertarDetras(newUsuario);
        
    }

    
     public void eliminarUsuario(String cedula) throws Exception {
        usuarios.eliminarNodoEspecifico(buscar(cedula));
    }
}

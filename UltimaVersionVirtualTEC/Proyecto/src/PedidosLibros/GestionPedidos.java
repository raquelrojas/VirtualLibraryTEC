/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PedidosLibros;

import estructura.Nodo;
import modelo.enums.CategoriasLibros;
import estructura.QueueList;

/**
 *
 * @author marip
 */
public class GestionPedidos {
    
     private QueueList<Pedidos> pedidos;

	public QueueList<Pedidos> getPedidos() {
		return pedidos;
	}
        

	public void setPedidos(QueueList<Pedidos> Pedidos) {
		this.pedidos = Pedidos;
	}

	public GestionPedidos() {
		this.pedidos = new QueueList<>();
	}

	/*private Pedidos buscar(int issn) {
        Nodo<Pedidos> temp = pedidos.getHead();
        for (int i = 0; i < pedidos.getSize(); i++) {
            if (temp.getElemento().getIssn().equals(issn)) {
                break;
            } else {
                temp = temp.getNodoSig();
            }
        }
        return temp.getElemento();
    }
*/
    public void crearPedido(int issn, String nombre,  int cantvendida, int cantdisponible, String descripcion, double precio) {
        Pedidos newPedido = new Pedidos(issn, nombre, cantvendida, cantdisponible, descripcion, precio);
        this.pedidos.insert(newPedido);
    }

    public void eliminarPedidos(String cedula) throws Exception {
        //pedidos.delete(buscar(cedula));
    }

    public String consultarPedidos() {
        return pedidos.toString();
    }
    
}

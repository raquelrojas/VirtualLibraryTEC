/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion;

import Interfaz.Librerias;
import Interfaz.Menu;
import Interfaz.Libro;
import Libreria.GestionLibrerias;
import Libros.GestionLibro;

        

/**
 *
 * @author marip
 */
public class App {
    
    public static GestionLibrerias gestion_libreria = new GestionLibrerias();
    public static GestionLibro gestion_libro = new GestionLibro();
    
    public static void main(String args[]) {

         /**
         * SE CREA LA INSTANCIA PARA LLAMAR LA VENTANA PRINCIPAL
         */
        Menu principal = new Menu();
        principal.setVisible(true);
        
        Librerias libreria = new Librerias();
        
        
        Libro libro = new Libro();
        
     
    }
}

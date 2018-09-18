/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion;

import Interfaz.Librerias;
import Interfaz.Menu;
import Interfaz.CrearLibreria;
import Libreria.GestionLibrerias;
import Libreria.Libreria;
import Tabla.ModeladorTablas;
import estructura.Lista;
import estructura.Nodo;
        

/**
 *
 * @author marip
 */
public class App {
    
    public static void main(String args[]) {
     
        GestionLibrerias gestion_libreria = new GestionLibrerias();

         /**
         * SE CREA LA INSTANCIA PARA LLAMAR LA VENTANA PRINCIPAL
         */
        Menu principal = new Menu();
        principal.setVisible(true);
    }
        
     
    }


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Libros;

import Extras.GeneradorCodigos;
import modelo.enums.CategoriasLibros;

public class Libros {
    String issn;
    String nombre, libreria;
     CategoriasLibros tema;
    int cantvendida;
    int cantdisponible;
    String descripcion;
    double precio;
    GeneradorCodigos generadorCodigo;
    
    public Libros(String issn, String nombre, CategoriasLibros  tema, int cantvendida, int cantdisponible, String descripcion, double precio){
        this.nombre = nombre;
        this.tema = tema;
        this.cantvendida = cantvendida;
        this.cantdisponible = cantdisponible;
        this.precio = precio;
        this.descripcion = descripcion;
        this.generadorCodigo = new GeneradorCodigos(5);
        this.issn = tema.getCodigoCategoria().toString()+"-"+generadorCodigo.generarCodigo();
        
    }

        
    //Setters
        public void setIssn(String newissn){
            this.issn = newissn;
        }
    
        public void setCantvendida(int newcant){
            this.cantvendida = newcant;
        }
    
        public void sentCantdisponible(int newdisponible){
            this.cantdisponible = newdisponible;
        }
    
        public void setPrecio(double newprecio){
            this.precio = newprecio;
        }
    
        public void setNombre(String newnombre){
            this.nombre = newnombre;
        }
    
    
        public void setDescripcion(String newdescrip){
            this.descripcion = newdescrip;
        }
        
        public void setTema(CategoriasLibros tema){
            this.tema = tema;
        }
        public void setLibreria(String newissn){
            this.libreria = libreria;
        }
    
        //Getters
        public String getIssn(){
            return issn;
        }
        
        public String getLibreria(){
            return libreria;
        }
    
        public int getCantvendida(){
            return cantvendida;
        }
    
        public int getCantdisponible(){
            return cantdisponible;
        }
    
        public double getPrecio(){
            return precio;
        }
    
        public String getNombre(){
            return nombre;
        }
    
         public String getDescripcion(){
            return descripcion;
            
         }
         
         public CategoriasLibros getTema(){
             return tema;
         }
         
         private boolean cumpleNombre ( String nombre) {
             if (nombre.isEmpty()) {
                 return true;
             }else{
                 return this.nombre.equals(nombre);
             }
         }
         
         private boolean cumpleLibreria( String libreria) {
             if (libreria.isEmpty()) {
                 return true;
             }else{
                 return this.libreria.equals(libreria);
             }
         }
         private boolean cumpleTema ( CategoriasLibros tema) {
             if (tema == null) {
                 return true;
             }else{
                 return this.tema.equals(tema);
             }
         }
         
         // private boolean cumpleLibreria 
         
         //No sirve precios
         private boolean cumplePrecioDesde( double precio) {
             if (precio == 0) {
                 return true;
             }else {
                 return this.precio >= precio;
             }
         }
         
         private boolean cumplePrecioHasta( double precio) {
             if (precio == 0) {
                 return true;
             }else {
                 return this.precio <= precio;
             }
         }
         
         public boolean cumpleFiltro ( String nombre, CategoriasLibros tema, String libreria,
                 double precioDesde, double precioHasta) {
             return (this.cumpleNombre(nombre) &&
                     this.cumpleTema(tema) &&
                     this.cumplePrecioDesde(precioDesde) &&
                     this.cumplePrecioHasta(precioHasta));
         }
    
    
    @Override
    public String toString() {
        return "Issn: " + issn + ", Nombre: "+ nombre + ", Tema: " + tema + ", Cant. vendida =" + cantvendida + ", cant.disponible=" + cantdisponible + ", Descripción"+ descripcion + ", Precio: "+ precio + "\n";
    }

    }

    


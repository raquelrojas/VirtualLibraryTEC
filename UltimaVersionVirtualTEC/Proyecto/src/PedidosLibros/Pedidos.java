
package PedidosLibros;

import Extras.GeneradorCodigos;
import modelo.enums.CategoriasLibros;

/**
 *
 * @author marip
 */
public class Pedidos {
    String cedula;
    int issn;
    String nombre;
     CategoriasLibros tema;
     String libreria;
    int cantvendida;
    int cantdisponible;
    String descripcion;
    double precio;
    GeneradorCodigos generadorCodigo;
    
    public Pedidos(int issn, String nombre,  int cantvendida,int cantdisponible, String descripcion, double precio){
        this.nombre = nombre;
        this.cantvendida = cantvendida;
        this.cantdisponible = cantdisponible;
        this.precio = precio;
        this.descripcion = descripcion;
        this.generadorCodigo = new GeneradorCodigos(5);
        this.issn = issn;
        
    }

        
    //Setters
        
    public void setCedula(String cedula){
        this.cedula = cedula;
    }
        
        public void setIssn(int newissn){
            this.issn = newissn;
        }
    
        
        public void setLibreria (String Libreria){
            this.libreria = Libreria;
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
      
    
        //Getters
        public String getCedula(){
            return this.cedula;
        }
        
        public int getIssn(){
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
         
    
    @Override
    public String toString() {
        return "Cedula: " + cedula + "Issn: " + issn + ", Nombre: "+ nombre + ", Tema: " + tema  + ", Cant. vendida =" + cantvendida + ", cant.disponible=" + cantdisponible + ", Descripción"+ descripcion + ", Precio: "+ precio + "\n";
    }

    
}

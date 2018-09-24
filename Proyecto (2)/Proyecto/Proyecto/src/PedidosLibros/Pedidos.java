
package PedidosLibros;

import Extras.GeneradorCodigos;
import modelo.enums.CategoriasLibros;

/**
 *
 * @author marip
 */
public class Pedidos {
    String issn;
    String nombre;
     CategoriasLibros tema;
    int cantvendida;
    int cantdisponible;
    String descripcion;
    double precio;
    GeneradorCodigos generadorCodigo;
    
    public Pedidos(String issn, String nombre, CategoriasLibros  tema, int cantvendida, int cantdisponible, String descripcion, double precio){
        this.nombre = nombre;
        this.tema = tema;
        this.cantvendida = cantvendida;
        this.cantdisponible = cantdisponible;
        this.precio = precio;
        this.descripcion = descripcion;
        this.generadorCodigo = new GeneradorCodigos(5);
        this.issn = tema.getCodigoCategoria()+"-"+issn;
        
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
      
    
        //Getters
        public String getIssn(){
            return issn;
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
        return "Issn: " + issn + ", Nombre: "+ nombre + ", Tema: " + tema + ", Cant. vendida =" + cantvendida + ", cant.disponible=" + cantdisponible + ", Descripción"+ descripcion + ", Precio: "+ precio + "\n";
    }

    
}

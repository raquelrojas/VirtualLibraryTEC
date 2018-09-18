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
public class libreria {
    
    public String nombre;
    public String pais;
    public String ubicacion;
    public String telefono;
    public String horario;
    
    public libreria(String nombre, String pais, String ubicacion,String telefono,String horario){
    
    this. nombre = nombre;
    this.pais = pais;
    this.ubicacion = ubicacion;
    this.telefono = telefono;
    this.horario = horario;
    
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public void setPais(String pais){
    
        this.pais = pais;
    }
    
    public String getPais(){
        return pais;
    }
    
    public void setUbicacion(String ubicacion){
    
        this.ubicacion = ubicacion;
    }
    
    public String getUbicacion(){
        return ubicacion;
    }
    
    public void setTelefono(String telefono){
        this.telefono = telefono;
    }
    
    public String getTelefono(){
        return telefono;
    }
    
    public void setHorario(String horario){
        this.horario = horario;
    }
    
    public String getHorario(){
        return horario;
    }
    
    @Override
	public String toString() {
		return "Nombre: " + nombre + ", País: " + pais + ", Ubicación: " + ubicacion + ", Teléfono: " + telefono + ", Horario: " + horario + "\n";
	}
        
}

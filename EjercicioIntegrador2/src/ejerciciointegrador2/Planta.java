/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciointegrador2;

/**
 *
 * @author JEFFERSON
 */
public abstract class Planta {
    
    protected String nombre;
    protected double altoTallo;
    protected String tieneHoja;
    protected String climaIdeal;
    
    protected Planta(){ 
        
    }
    
    protected Planta(String nombre, double altoTallo, String tieneHoja, String climaIdeal){
        this.nombre = nombre;
        this.altoTallo = altoTallo;
        this.tieneHoja = tieneHoja;
        this.climaIdeal = climaIdeal;
        
    }
    
    public abstract void mostrarMensaje();

    
    
    
}

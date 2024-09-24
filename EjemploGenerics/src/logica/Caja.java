/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

/**
 *
 * @author JEFFERSON
 * @param <T>
 */
public class Caja <T> {
    
        private T contenido;
    
    public void ponerAlgo( T contenido ){ 
        this.contenido = contenido;
        
    }
    
    
    public T obtenerAlgo(){ 
        return contenido;
    }
    
    
}

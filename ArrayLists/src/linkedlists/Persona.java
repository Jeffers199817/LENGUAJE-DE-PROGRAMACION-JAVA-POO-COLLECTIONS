/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package linkedlists;

/**
 *
 * @author JEFFERSON
 */
public class Persona {
        
    private int num;
    private String nombre;
    private int edad;
    
    public Persona( ){
        
    }
    
    public Persona(int num, String nombre, int edad){ 
        this.num = num;
        this.nombre= nombre;
        this.edad = edad;
    }
    
    
    public void setNum( int num){ 
        this.num = num;
    }
    public int getNum( ){ 
        return num;
    }
    
    public void setNombre(String nombre){ 
        this.nombre = nombre;
    }
    
    public String getNombre( ){ 
        
       return nombre;
    }
    
    public void setEdad( int edad){ 
        this.edad= edad;
    }
    
    public int getEdad( ){ 
        
        return edad;
    }

    @Override
    public String toString() {
        return "Persona{" + "num=" + num + ", nombre=" + nombre + ", edad=" + edad + '}';
    }
    
    
    
    
}

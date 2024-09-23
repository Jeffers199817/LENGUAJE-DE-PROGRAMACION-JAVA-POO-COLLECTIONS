/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package excepciones;

/**
 *
 * @author JEFFERSON
 */
public class Excepciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        try { 
            int resultado = 32/0;
            
        }catch(Exception e){
            System.out.println("No se puede dividir por cero!!!!!!");
        
    }
        
              int edades [ ] = {14,12,23,40};
        
        try{
           System.out.println("La edad de la posición 4 es: " + edades[4]);
        }catch(Exception e){ 
            
            System.out.println("Intentaste acceder a un índice que no existe");
            
        }
     
        
      
    }
    
}

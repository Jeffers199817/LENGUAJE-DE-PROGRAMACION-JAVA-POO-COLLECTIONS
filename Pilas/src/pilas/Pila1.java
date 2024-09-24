/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pilas;

import java.util.Stack;

/**
 *
 * @author JEFFERSON
 */
public class Pila1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Stack<String> pila1 = new Stack<String>();
        
        System.out.println("Pila vacia " + pila1 );
        System.out.println("Está vacia " + pila1.isEmpty());
        
        
        //Agregar contenido a una pila lifo
        
        
        pila1.push("Jefferson");
        pila1.push("Bernardo");
        pila1.push("Tania");
        pila1.push("Yolanda");
        pila1.push("Jose");
        
        
        //Reocorrer la pila 
        
        for( String pilita : pila1){
            System.out.println("El contenido es : " + pilita);  
        }
        
        //Mostrar 
        
        System.out.println("Pila" + pila1);
        System.out.println("Pila vacia . " + pila1.isEmpty());
        
        
        //Elimina el último registro de la pila 
        
        pila1.pop();
        
        System.out.println("Pila : " + pila1);
        
        System.out.println("Está Jefferson en la pila  ? " + pila1.search("Yolanda"));
        
        System.out.println("Última agregado: " + pila1.peek());
    }
    
}

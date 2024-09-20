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
public class Pilas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        Stack<Integer> pila = new Stack<Integer>();
        
        System.out.println("Pila vacia " + pila);
        System.out.println("Está vacía? " + pila.isEmpty());
        
        //Agregar
        
        pila.push(1);
        pila.push(2);
        pila.push(3);
        pila.push(4);
        pila.push(5);
        
        
        //Recorrido 
        
        for( Integer Pila : pila){ 
            System.out.println(Pila);
        }
        
        //Mostrar
        
        
        System.out.println("Pila " + pila);
        System.out.println("Pila vacia? " + pila.isEmpty());
        
        pila.pop();//elimina el último registro de la pila 
        
         System.out.println("Pila " + pila);
        
        System.out.println("Está el 3 ? " + pila.search(4));
        System.out.println("último agregado: " + pila.peek());
        
        
    }
    
}
 m 
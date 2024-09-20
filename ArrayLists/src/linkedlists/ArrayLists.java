/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package linkedlists;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayLists {
    
    
    
    public static void main( String[] args){
        //ARRAYS LIST
        
        List<Persona> listaArray = new ArrayList<Persona>();
        
        listaArray.add(new Persona(1,"Jefferson", 34));
        listaArray.add(new Persona(2,"Bernardo", 4));
        listaArray.add(new Persona(3,"Edison", 22));
        listaArray.add(new Persona(4,"Javier", 11));
        
        
        // LINKEDLIST
        
        LinkedList<Persona> listaLinkedList = new LinkedList<Persona>();
        
        listaLinkedList.add(new Persona(3,"Jefferson",3));
        listaLinkedList.add(new Persona(2,"Bernardo", 4));
        listaLinkedList.add(new Persona(3,"Edison", 22));
        listaLinkedList.add(new Persona(4,"Javier", 11));
        
        
        // REMOVE EN ARRAYLIST
        
        listaArray.remove(1);
        
        //REMOVE EN LINKEDLIST
        
        String nombreBorrar = "Bernardo";
        
        for(Persona persona2 : listaLinkedList){ 
            if(persona2.getNombre().equals(nombreBorrar)){
                listaLinkedList.remove(persona2);
                break;
            }
        }
        
        System.out.println("--------------------------------LUEGO DE ELIMINAR ");
        
        
        
        System.out.println("==================== ARRAYLIST");
        
        for( Persona persona: listaArray){ 
            
            System.out.println("Prueba " + persona.getNombre());
        }
        
        
        System.out.println("============linkedList");
        
        
        for( Persona persona : listaLinkedList){ 
            
            System.out.println("Prueba " + persona.getNombre());
        }
        
        
        
        
        //TAMAÑO DE LA LISTA 
            System.out.println("===========Qué tamaño tienen las Listas ==============");
        
        System.out.println("Tamaño de la lista ArrayList: " + listaArray.size());
        System.out.println("Tanaño de la lista LinkedList: " + listaLinkedList.size());
        
        
        //OBTENER PRIMER OBJETO 
        
        
        System.out.println("=============Primer y último Objeto (solo para LINKEDLIST) =========");
        
        System.out.println("El primer objeto de linkedlist es: "   + listaLinkedList.getFirst().toString());
        System.out.println("El último objeto de linkedlist es: "   + listaLinkedList.getLast().toString());

        
        //BORRAR TODA LA LIST 
        
        System.out.println("==========BORRANDO TODA LA LISTA========================= ");
        
        listaArray.clear();
        listaLinkedList.clear();
        
        
        System.out.println(" ============ESTÁ VACÍA ALGUNA LISTA================");
        
        
        System.out.println("ArrayList : " + listaArray.isEmpty() );
        System.out.println("LinkedList: "  +  listaLinkedList.isEmpty());
        
        
        
    }
    
}

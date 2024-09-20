/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arraylists;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author JEFFERSON
 */
public class ArrayLists {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        List<Persona> lista = new ArrayList<Persona>();
        
        
        /* Persona perso = new Persona(1,"Bernardo" ,304);
        
        lista.add(perso); // manera rapida de crear un persona 
        */
        
        //Manera rápida
        
        lista.add(new Persona( 1, "Jefferson", 30));
         lista.add(new Persona( 2, "Eduardo", 20));
          lista.add(new Persona( 3, "Erick", 40));
           lista.add(new Persona( 4, "Sebas", 50));
           
           
           //Recorrer por indice 
           System.out.println("===============================FOR");
           
           for( int i=0; i<lista.size(); i++){ 
               System.out.println("Prueba: " + lista.get(i).getNombre() + "Su edad es : " + lista.get(i).getEdad());
           }
           
           System.out.println("================================FOR-EACH");
           
           
           //Reccorrer elemento por elemento foreach
           
           for( Persona perso: lista){ 
               System.out.println("prueba: " + perso.getNombre());
           }
    }
    
}

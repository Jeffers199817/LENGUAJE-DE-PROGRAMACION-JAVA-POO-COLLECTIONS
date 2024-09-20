/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pruebahashmap;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author JEFFERSON
 */
public class PruebaHashMap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        Map<Integer,String> mapaEmpleados = new HashMap<>();
        
        
        mapaEmpleados.put(1423, "Jefferson Alquinga");
        mapaEmpleados.put(1424, "Bernardo alquinga");
        mapaEmpleados.put(1425, "Tania Alquinga");
        mapaEmpleados.put(1426, "Tania Alquinga2");
        mapaEmpleados.put(1427, "Tania Alquinga3");
                        
                                
                             //   mapaEmpleados.remove(1723);
                        
      //boolean estaono=   mapaEmpleados.containsValue("Jefferson Alquinga");
        boolean estaono = mapaEmpleados.containsKey(1423);
      
      
        if(estaono == true){ 
            System.out.println("El valor buscado está");
        }else{ 
            System.out.println("El valor buscado no está ");
        }
        
        
         System.out.println(mapaEmpleados.keySet());   
         System.out.println(mapaEmpleados.values());
                 
         //almacaenar en una variable apartir de la cable con get 
         
         
         String nombre = mapaEmpleados.get(1423);
         System.out.println("El empleado es: " + nombre);
    }
    
}

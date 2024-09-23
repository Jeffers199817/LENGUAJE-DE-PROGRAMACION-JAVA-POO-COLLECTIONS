/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package relaciones;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author JEFFERSON
 */
public class Relaciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        Auto aut = new Auto();
        
        aut.setId(2L);
        aut.setMarca("Renault");
        aut.setModelo("Duster");
        
        
        List<Propietario> listaPropietarios = new ArrayList<Propietario>();
        
       Propietario prop1 = new Propietario();
       Propietario prop2 = new Propietario();
       
       prop1.setId(34L);
       prop1.setNombre("Jefferson");
       prop1.setApellido("Alquinga");
       
       
              prop2.setId(4L);
       prop2.setNombre("Jefferson2");
       prop2.setApellido("Alquinga2");
       
       listaPropietarios.add(prop1);
       listaPropietarios.add(prop2);
       
       aut.setListaPropietarios(listaPropietarios);
       
        System.out.println("El auto : " + aut.getMarca() + " " + aut.getModelo() + "  tiene como propietarios a: " + aut.getListaPropietarios().toString());
       
       
       
       
        
    }
    
}

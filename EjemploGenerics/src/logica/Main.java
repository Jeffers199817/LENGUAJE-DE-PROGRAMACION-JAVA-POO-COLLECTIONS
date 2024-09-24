package logica;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author JEFFERSON
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Caja<String> cajaString = new Caja<>();
        cajaString.ponerAlgo("Jefferson Alquinga");
        String contenido = cajaString.obtenerAlgo();
        
        
        System.out.println("Contenido de mi caja String es: " + contenido );
        
        
        Caja<Integer>cajaInteger = new Caja<>();
        
        cajaInteger.ponerAlgo(3234);
        
        Integer entero = cajaInteger.obtenerAlgo();
        
        System.out.println("Contenido de mi caja Integer es: " + entero);
        
        
    }
    
}

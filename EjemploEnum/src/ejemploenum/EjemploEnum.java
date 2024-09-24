/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemploenum;

/**
 *
 * @author JEFFERSON
 */
public class EjemploEnum {
    
    enum Color{
        ROJO, AZUL, VERDE, AMARILLO, ANARANJADO, NEGRO, BLANCO
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Color color = Color.ROJO;
        
        
        System.out.println("El color es: " + color);
        
        // podemos declararlo como un array
        
        for(Color color1: Color.values()){
            System.out.println("El color es: " + color1);
        }
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package conversiones;

/**
 *
 * @author JEFFERSON
 */
public class Conversiones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       double num = 1.67;
       
       //casteo a entero 
       
       int numInt = (int) num;
       
       //casteo a long
       
       long numLong = ( long) num;
       
        System.out.println("double: " + num);
        System.out.println("int: " + numInt);
        System.out.println("long: " + numLong);
        
        
        
        //supongo que tengo un string y un usuario ingresa un numero y un precio
        
        String cantidad = "14";
        String precio = "140.23";
        
        int cantidadInt = Integer.parseInt(cantidad);
        double precioDouble = Double.parseDouble(precio);
        
        System.out.println(" cantida: " + cantidad + " precio: " + precio + " su valor total es: " + (cantidadInt* precioDouble));
        
        
        
        int edad = 30;
        double estatura = 1.67;
        
        String edadString = String.valueOf(edad);
        String estaturaString = String.valueOf(estatura);
        System.out.println("Edad: " + edadString + " Estatura: " + estaturaString);
        
    }
    
}

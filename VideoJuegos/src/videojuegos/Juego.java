/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package videojuegos;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author JEFFERSON
 */
public class Juego {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //1. CREAR UNA ARRAYLIST DE TIPO VIDEOJUEGOS . 
        List<VideoJuegos> videoJuegos = new ArrayList<VideoJuegos>();
        
        
        // CREAR 5 VIDEOJUEGOS Y GUARDARLOS EN LA COLLECTION 
        
        videoJuegos.add(new VideoJuegos(1,"God of war", "Nintendo 64", 3, "aventura"));
        videoJuegos.add(new VideoJuegos(2,"Prince of Persia", "Ubisoft", 4, "aventura"));
        videoJuegos.add( new VideoJuegos(3, "Fifa23", "Konami", 4, "deportes"));
        videoJuegos.add(new VideoJuegos(4, "King kong", "Nintendo 64", 4, "aventura"));
        videoJuegos.add( new VideoJuegos(5, "Rapidos y furiosos", "Nintendo 64", 5, "autos"));
        
        //RECORRER LA ARRAYLIST CREADA Y MOSTRAR POR PANTALLA EL TÍTULO, CONSOLA Y CANTIDAD DE JUGADORES DE LOS VIDEOJUEGOS ALMACENADOS
        
        System.out.println("=====================Video Juegos PARTE 2 =====================");
        for( VideoJuegos videojuegos : videoJuegos){ 
            
            System.out.println("Juego número :" + videojuegos.getCodigo() + " Título: " + videojuegos.getTitulo() + " consola: " + videojuegos.getConsola() + " cantidad de jugadores: " + videojuegos.getCantidadJugadores() );
          
        }
        
        
        //CAMBIAR ELNOMBRE Y LA CANTIDAD DE JUGADORES DE DOS VIDEOJUEGOS.
        
        videoJuegos.get(0).setTitulo("Ragnarod");
        videoJuegos.get(0).setCantidadJugadores(5);
        
        videoJuegos.get(3).setTitulo("The Return");
        videoJuegos.get(3).setCantidadJugadores(12);
        
        //MOSTRAR POR PANTALLA LOS DATOS DE TOSOS LOS VIDEOJUEGOS LUEGO DEL CAMBIO 
        
        
           
        System.out.println("=====================Video Juegos PARTE 3 =====================");
        for( VideoJuegos videojuegos : videoJuegos){ 
            
            System.out.println("Juego número :" + videojuegos.getCodigo() + " Título: " + videojuegos.getTitulo() + " consola: " + videojuegos.getConsola() + " cantidad de jugadores: " + videojuegos.getCantidadJugadores() );
          
        }
        
        //FINALIZAMOS 
        
        
           
        System.out.println("=====================Video Juegos PARTE 4=====================");
        
        for(int i =0 ;i<videoJuegos.size(); i++){ 
            
            if(videoJuegos.get(i).getConsola().equals("Nintendo 64")){ 
                
                System.out.println(videoJuegos.get(i).toString());
                System.out.println(" ");
               System.out.println("Juego número :" + videoJuegos.get(i).getCodigo()+ " Título: " + videoJuegos.get(i).getTitulo() + " consola: " + videoJuegos.get(i).getConsola() + " cantidad de jugadores: " + videoJuegos.get(i).getCantidadJugadores() );  
            
                System.out.println("  +++++++++++++++++++++++++++++++++++++++++++");
            
            }
           
          
        }
        
        
        System.out.println("GRACIAS POR PREFERIRNOS.");
        
    }
    
}

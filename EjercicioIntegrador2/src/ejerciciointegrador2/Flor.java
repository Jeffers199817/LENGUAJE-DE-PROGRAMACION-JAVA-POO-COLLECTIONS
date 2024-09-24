/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciointegrador2;

/**
 *
 * @author JEFFERSON
 */
public class Flor extends Planta {

    
    
    private String colorPetalos;
    private double cantidadPromedioPetalos;
    private String colorDelPistilo;
    private String colorDePetalos;
    private String variedadDeFlor;
    private String estacionQueFlorece;
    
    
    public Flor(){ 
        
    }

    public Flor(String colorPetalos, double cantidadPromedioPetalos, String colorDelPistilo, String colorDePetalos, String variedadDeFlor, String estacionQueFlorece, String nombre, double altoTallo, String tieneHoja, String climaIdeal) {
        super(nombre, altoTallo, tieneHoja, climaIdeal);
        this.colorPetalos = colorPetalos;
        this.cantidadPromedioPetalos = cantidadPromedioPetalos;
        this.colorDelPistilo = colorDelPistilo;
        this.colorDePetalos = colorDePetalos;
        this.variedadDeFlor = variedadDeFlor;
        this.estacionQueFlorece = estacionQueFlorece;
    }

    public String getColorPetalos() {
        return colorPetalos;
    }

    public void setColorPetalos(String colorPetalos) {
        this.colorPetalos = colorPetalos;
    }

    public double getCantidadPromedioPetalos() {
        return cantidadPromedioPetalos;
    }

    public void setCantidadPromedioPetalos(double cantidadPromedioPetalos) {
        this.cantidadPromedioPetalos = cantidadPromedioPetalos;
    }

    public String getColorDelPistilo() {
        return colorDelPistilo;
    }

    public void setColorDelPistilo(String colorDelPistilo) {
        this.colorDelPistilo = colorDelPistilo;
    }

    public String getColorDePetalos() {
        return colorDePetalos;
    }

    public void setColorDePetalos(String colorDePetalos) {
        this.colorDePetalos = colorDePetalos;
    }

    public String getVariedadDeFlor() {
        return variedadDeFlor;
    }

    public void setVariedadDeFlor(String variedadDeFlor) {
        this.variedadDeFlor = variedadDeFlor;
    }

    public String getEstacionQueFlorece() {
        return estacionQueFlorece;
    }

    public void setEstacionQueFlorece(String estacionQueFlorece) {
        this.estacionQueFlorece = estacionQueFlorece;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getAltoTallo() {
        return altoTallo;
    }

    public void setAltoTallo(double altoTallo) {
        this.altoTallo = altoTallo;
    }

    public String getTieneHoja() {
        return tieneHoja;
    }

    public void setTieneHoja(String tieneHoja) {
        this.tieneHoja = tieneHoja;
    }

    public String getClimaIdeal() {
        return climaIdeal;
    }

    public void setClimaIdeal(String climaIdeal) {
        this.climaIdeal = climaIdeal;
    }
    
    
    
    
    
    
    
    @Override
    public void mostrarMensaje() {
        System.out.println("Hola desde Flor");
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciointegrador2;

/**
 *
 * @author JEFFERSON
 */
public class Arbusto extends Planta{
    
    private Double anchoArbusto;
    private String esDomestico;
    private String variedadDeArbusto;
    private String colorDeHojas;
    private boolean sePodaoOno;
    
    public Arbusto(){ 
        
    }

    public Arbusto(Double anchoArbusto, String esDomestico, String variedadDeArbusto, String colorDeHojas, boolean sePodaoOno, String nombre, double altoTallo, String tieneHoja, String climaIdeal) {
        super(nombre, altoTallo, tieneHoja, climaIdeal);
        this.anchoArbusto = anchoArbusto;
        this.esDomestico = esDomestico;
        this.variedadDeArbusto = variedadDeArbusto;
        this.colorDeHojas = colorDeHojas;
        this.sePodaoOno = sePodaoOno;
    }

    public Double getAnchoArbusto() {
        return anchoArbusto;
    }

    public void setAnchoArbusto(Double anchoArbusto) {
        this.anchoArbusto = anchoArbusto;
    }

    public String getEsDomestico() {
        return esDomestico;
    }

    public void setEsDomestico(String esDomestico) {
        this.esDomestico = esDomestico;
    }

    public String getVariedadDeArbusto() {
        return variedadDeArbusto;
    }

    public void setVariedadDeArbusto(String variedadDeArbusto) {
        this.variedadDeArbusto = variedadDeArbusto;
    }

    public String getColorDeHojas() {
        return colorDeHojas;
    }

    public void setColorDeHojas(String colorDeHojas) {
        this.colorDeHojas = colorDeHojas;
    }

    public boolean isSePodaoOno() {
        return sePodaoOno;
    }

    public void setSePodaoOno(boolean sePodaoOno) {
        this.sePodaoOno = sePodaoOno;
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
        System.out.println("Hola desde Arbusto");
    }
    
}

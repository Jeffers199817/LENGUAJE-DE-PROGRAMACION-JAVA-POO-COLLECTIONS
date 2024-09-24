/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciointegrador2;

/**
 *
 * @author JEFFERSON
 */
public class Arbol extends Planta{
    
    private String variedad;
    private String tipoDeTronco;
    private String radioDeTronco;
    private String color;
    private String tipoDeHojas;
    
    public Arbol(){ 
        
    }
    
    public Arbol(String nombre, double altoTallo, String tieneHoja, String climaIdeal,String variedad, String tipoDeTronco, String radioDeTronco, String color, String tipoDeHojas){
        super(nombre,altoTallo,tieneHoja,climaIdeal);
        this.variedad=variedad;
        this.tipoDeTronco = tipoDeTronco;
        this.radioDeTronco = radioDeTronco;
        this.color = color;
        this.tipoDeHojas = tipoDeHojas;
        
    }

    public String getVariedad() {
        return variedad;
    }

    public void setVariedad(String variedad) {
        this.variedad = variedad;
    }

    public String getTipoDeTronco() {
        return tipoDeTronco;
    }

    public void setTipoDeTronco(String tipoDeTronco) {
        this.tipoDeTronco = tipoDeTronco;
    }

    public String getRadioDeTronco() {
        return radioDeTronco;
    }

    public void setRadioDeTronco(String radioDeTronco) {
        this.radioDeTronco = radioDeTronco;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTipoDeHojas() {
        return tipoDeHojas;
    }

    public void setTipoDeHojas(String tipoDeHojas) {
        this.tipoDeHojas = tipoDeHojas;
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
    protected void mostrarMensaje() {
        System.out.println("Hola soy una árbol");
    }
    
}

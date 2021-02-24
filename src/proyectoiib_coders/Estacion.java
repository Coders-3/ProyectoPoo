/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoiib_coders;

/**
 *
 * @author USER
 */
public class Estacion  extends AgenciaAeronautica{
    
    private double Altitud;

    public double getAltitud() {
        return Altitud;
    }

    public void setAltitud(double Altitud) {
        this.Altitud = Altitud;
    }

    public boolean verificarAltitud(){
        return false;
    }
    
    
}

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
public class Estacion extends AgenciaAeronautica{
    
    public double altitud;

    public Estacion(String name, double altitud) {
        super(name);
        this.altitud=altitud;
    }

    public double getAltitud() {
        return altitud;
    }

    public void setAltitud(double Altitud) {
        this.altitud = Altitud;
    }

    public boolean verificarAltitud(){
        //aqui se verifica
        return false;
    }
    
    
}

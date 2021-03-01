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
public class Nave extends AgenciaAeronautica implements Viaje {
    
    private double combustible;
    private Hora horaDespegue;
    private Hora horaLlegada;
    private double radioOrbita;
    private double velocidad;
    private double periodoOrbita;

    public Nave(String name) {
        super(name);
    }

    public double getCombustible() {
        return combustible;
    }

    public void setCombustible(double combustible) {
        this.combustible = combustible;
    }

    public Hora getHoraDespegue() {
        return horaDespegue;
    }

    public void setHoraDespegue(Hora horaDespegue) {
        this.horaDespegue = horaDespegue;
    }

    public Hora getHoraLlegada() {
        return horaLlegada;
    }

    public void setHoraLlegada(Hora horaLlegada) {
        this.horaLlegada = horaLlegada;
    }

    public double getRadioOrbita() {
        return radioOrbita;
    }

    public void setRadioOrbita(double radioOrbita) {
        this.radioOrbita = radioOrbita;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }

    public double getPeriodoOrbita() {
        return periodoOrbita;
    }

    public void setPeriodoOrbita(double periodoOrbita) {
        this.periodoOrbita = periodoOrbita;
    }

    @Override
    public void calcularRadioOrbita() {
        //code
    }

    @Override
    public void calcularVelocidad() {
        //code
    }

    @Override
    public void calcularPerido() {
        //code
    }

    @Override
    public void calcularTiempo() {
        //code
    }
    
    
    
    
    
    
    
}

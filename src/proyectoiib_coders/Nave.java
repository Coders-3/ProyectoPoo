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
    
    private double tiempofinal;
    private Hora horaDespegue;
    private Hora horaLlegada;
    private double radioOrbita;
    private double velocidad;
    private double periodoOrbita;

    public Nave(String name) {
        super(name);
    }

    public double getTiempofinal() {
        return tiempofinal;
    }
    public void setTiempofinal(double tiempofinal) {
        this.tiempofinal = tiempofinal;
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
        radioOrbita=(6378.137+400)*1000;
    }
    
    @Override
    public void calcularVelocidad() {
        double EARTHMASS=5.9729*Math.pow(10,24);
        double G=6.673*Math.pow(10,-11);
        velocidad=Math.sqrt((G*EARTHMASS)/radioOrbita);  
    }

    @Override
    public void calcularPerido() {
        double PI=3.14159;
        periodoOrbita=(2*PI*radioOrbita)/velocidad;
    }

    @Override
    public void calcularTiempo() {
        double dryMass=120187.59;
        double grossMass=1230000;
        tiempofinal=(velocidad+Math.log(dryMass/grossMass))/9.81;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoiib_coders;

/**
 *
 * @author David Mena, Ricardo Teran, Xavier Tintin
 */
public class Nave extends AgenciaAeronautica implements Viaje {
    
    private double tiempoFinal;
    private double radioOrbita;
    private double velocidad;
    private double velocidadFinal;
    private double periodoOrbita;
    double v0=0;
    double dryMass=120187.59;
    double grossMass=1320000;
    double propMass=grossMass-dryMass;
    private double aceleracion, momentum;

    public Nave(String name) {
        super(name);
    }
    public Nave (String name, double tiempoFinal, double radioOrbita, double velocidad, double periodoOrbita){
        super(name);
        this.tiempoFinal= tiempoFinal;
        this.radioOrbita=radioOrbita;
        this.velocidad=velocidad;
        this.periodoOrbita=periodoOrbita;
    }

    public double getTiempoFinal() {
        return tiempoFinal;
    }
    public void setTiempoFinal(double tiempoFinal) {
        this.tiempoFinal = tiempoFinal;
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
    public double getVelocidadFinal() {
        return velocidadFinal;
    }
    public void setVelocidadFinal(double velocidadFinal) {
        this.velocidadFinal = velocidadFinal;
    }
    public double getAceleracion() {
        return aceleracion;
    }
    public void setAceleracion(double aceleracion) {
        this.aceleracion = aceleracion;
    }
    public double getV0() {
        return v0;
    }
    public void setV0(double v0) {
        this.v0 = v0;
    }
    public double getDryMass() {
        return dryMass;
    }
    public void setDryMass(double dryMass) {
        this.dryMass = dryMass;
    }
    public double getGrossMass() {
        return grossMass;
    }
    public void setGrossMass(double grossMass) {
        this.grossMass = grossMass;
    }
    public double getPropMass() {
        return propMass;
    }
    public void setPropMass(double propMass) {
        this.propMass = propMass;
    }
    public double getMomentum() {
        return momentum;
    }
    public void setMomentum(double momentum) {
        this.momentum = momentum;
    }
    
    @Override
    public void calcularRadioOrbita() {
        radioOrbita=(6378.137+400)*1000;
    }
    
    @Override
    public void calcularVelocidadFinal() {
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
    public void calcularTiempoFinal() {
        tiempoFinal=(velocidad+Math.log(dryMass/grossMass))/9.81;
    }
    
    @Override
    public void calcularVelocidad(int t) {
        if(t<getTiempoFinal()){      //mientras estan prendidos los propulsores
            v0=getVelocidad();
            grossMass=1320000-(t*(propMass/getTiempoFinal()));  //el peso de la nave en cada instante dado una expulsion de combustible uniforme
            setVelocidad(3200*Math.log((grossMass+((t-1)*(propMass/getTiempoFinal())))/grossMass)-(9.81));
            aceleracion=getVelocidad()-v0;
        }
        else{           //se apagan los propulsores
            setVelocidad(3200*Math.log((grossMass+((getTiempoFinal()-1)*(propMass/getTiempoFinal())))/grossMass)-(9.81));
            aceleracion=0;
        }
    }
}

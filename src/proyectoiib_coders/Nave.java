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
    
    private double tiempoFinal;
    private Hora horaDespegue;
    private Hora horaLlegada;
    private double radioOrbita;
    private double velocidad;
    private double velocidadFinal;
    private double periodoOrbita;
    double v0=0;
    double dryMass=120187.59;
    double grossMass=1320000;
    double propMass=grossMass-dryMass;
    private double aceleracion;

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
        double dryMass=120187.59;
        double grossMass=1230000;
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

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoiib_coders;

/**
 *
 * @author alextintin
 */
public class Hora {
    
    private double hora;
    private double minutos;
    private double segundos;
    private double tiempoLanzamiento;

    public Hora(double hora, double min, double seg, double tiempoLanzamiento) {
        this.hora=hora;
        this.minutos=min;
        this.segundos=seg;
        this.tiempoLanzamiento=tiempoLanzamiento;
    }
    public double getHora() {
        return hora;
    }
    public void setHora(double hora) {
        this.hora = hora;
    }
    public double getMinutos() {
        return minutos;
    }
    public void setMinutos(double minutos) {
        this.minutos = minutos;
    }
    public double getSegundos() {
        return segundos;
    }
    public void setSegundos(double segundos) {
        this.segundos = segundos;
    } 
    
    public String establecerHora(){
        return String.valueOf((int) hora)+":"+String.valueOf((int) minutos)+":"+String.valueOf((int) segundos);
    }
    
    public String verificarHora(){
        double minFinal, segFinal;
        tiempoLanzamiento=Math.floor(tiempoLanzamiento);
        
        segFinal=((tiempoLanzamiento/60)-Math.floor(tiempoLanzamiento/60))*60;
        minFinal=Math.floor(tiempoLanzamiento/60);
        
        segundos+=segFinal;
        minutos+=minFinal;
        
        if(segundos>=60){
            segundos-=60;
            minutos++;
        }
        if(minutos>=60){
            minutos-=60;
            hora++;
        }
        if(hora>=24){
            hora-=24;
        }
        return String.valueOf((int) hora)+":"+String.valueOf((int) minutos)+":"+String.valueOf((int) segundos);
    }
    
    
}

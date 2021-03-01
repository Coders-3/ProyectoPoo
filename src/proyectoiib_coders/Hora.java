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
public class Hora {
    
    private int hora=1;
    private int minutos=1;
    private int segundos=1;
    
    public boolean verificarHora(){
        minutos=(int) (((hora-Math.floor(hora)*100)*60)/100);
        
        return false;//false temporal *eliminar al implemental el codigo*       //return int 
    }
    
    
}

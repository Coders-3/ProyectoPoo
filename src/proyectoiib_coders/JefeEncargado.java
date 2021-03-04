/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoiib_coders;

/**
 *
 * @author Ricardo
 */
 class JefeEncargado extends AgenciaAeronautica{
    
    private String claveAcceso;

    public String getClaveAcceso() {
        return claveAcceso;
    }

    public void setClaveAcceso(String claveAcceso) {
        this.claveAcceso = claveAcceso;
    }
    
    //Constructores
    public JefeEncargado(String name, String passWord){
        super(name);
        this.claveAcceso = passWord;
    }
    
    public  void mensaje(){
        System.out.println("este es un mensaje la clave es: "+this.claveAcceso);
    }
    
    //codigo para validar la clave del jefe  
    public boolean validateKeyV2(String clave){
        boolean a = false;
        if(clave.equals(this.claveAcceso)){
            a = true;
        }
        System.out.println(clave);
        System.out.println(this.claveAcceso);
        return a;   
    }
    
}

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
    public boolean validateKey(String clave){
        
        char[] caracteres = this.claveAcceso.toCharArray(); //pasando la clave de Acceso a un array de caracteres
        char[] caracteres2 = clave.toCharArray(); // pasando la clave ingresada a un array de caracteres
        boolean verif = false;
        int cont = 0;
        do{
            if(caracteres[cont] == caracteres2[cont]){
                verif = true;
            }else{
                verif = false;
            }
            cont ++;
            
        }while(verif == true && cont < caracteres.length);
        
        return verif;
    }
    
}

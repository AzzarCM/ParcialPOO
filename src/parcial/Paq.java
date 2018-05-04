/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial;

import java.util.ArrayList;


/**
 *
 * @author Mi PC
 */
public class Paq {
    public String nombrePaquete;
    public int precioPaquete;
    public ArrayList<String> servicioPaquete;

    
    public Paq(){
        Servicio server = new Servicio();
    }
    
    public Paq(String nombrePaquete, int precioPaquete, ArrayList<String> servicioPaquete){
        this.nombrePaquete = nombrePaquete;
        this.precioPaquete = precioPaquete;
        this.servicioPaquete = servicioPaquete;
    }
    
    public String getNombrePaquete(){
        return this.nombrePaquete;
    }
    
   public void setNombrePaquete(String nombrePaquete){
       this.nombrePaquete = nombrePaquete;
   }

    public int getPrecioPaquete() {
        return this.precioPaquete;
    }

    public void setPrecioPaquete(int precioPaquete) {
        this.precioPaquete = precioPaquete;
    }

    public ArrayList<String> getServicioPaquete() {
        return this.servicioPaquete;
    }

    public void setServicioPaquete(ArrayList<String> servicioPaquete) {
        this.servicioPaquete = servicioPaquete;
    }
    
    
   
}

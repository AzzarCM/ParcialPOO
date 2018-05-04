/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial;




/**
 *
 * @author Mi PC
 */
public class Paq {
    public String nombrePaquete;
    public int precioPaquete;

    
    public Paq(){}
    
    public Paq(String nombrePaquete, int precioPaquete){
        this.nombrePaquete = nombrePaquete;
        this.precioPaquete = precioPaquete;
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
   
}

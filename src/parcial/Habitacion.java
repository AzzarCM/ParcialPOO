/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial;

/**
 *
 * @author rodol
 */
public class Habitacion {
    boolean estado,habilitacion;
    int numero;
    String tipo;
    
    public Habitacion(boolean estado, int numero){
        this.estado = estado;
        this.numero = numero;
        
        //verificamos el tipo de habitacion que es DOBLE O SENCILLA
        
        this.tipo = (numero%2)==0 ? "Doble":"Sencilla";
        
    
    }

    public boolean getEstado() {
        return this.estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public int getNumero() {
        return this.numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    
    
    
    
}

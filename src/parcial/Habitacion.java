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
    String tipo, piso;
   
    public boolean getEstado() {
        return this.estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public String getPiso() {
        return this.piso;
    }

    public void setPiso(String piso) {
        this.piso = piso;
    }

    
    public boolean getHabilitacion() {
        return this.habilitacion;
    }

    public void setHabilitacion(boolean habilitacion) {
        this.habilitacion = habilitacion;
    }

    public int getNumero() {
        return this.numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    
    
    
    
    
}

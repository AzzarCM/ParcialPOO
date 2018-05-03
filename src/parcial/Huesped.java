/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial;
import java.util.ArrayList;
/**
 *
 * @author Margarita
 */
public class Huesped {

    Nombre nombres;
    int Dui;
    boolean reserva = false;

    public Nombre getNombres() {
        return nombres;
    }

    public void setNombres(Nombre nombres) {
        this.nombres = nombres;
    }
    
    public boolean getReserva(){
        return this.reserva;
    }

    public void setReserva(boolean reserva){
        this.reserva = reserva;
    }

    public int getDUI() {
        return this.Dui;
    }

    public void setDUI(int Dui) {
        this.Dui = Dui;
    }
    
    
    
}
        
    

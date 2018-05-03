/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial;

import java.util.ArrayList;

/**
 *
 * @author cmundo
 */
public class Piso {
    
    boolean habilidado = true;
    ArrayList<Habitacion> habitaciones;
        // clase piso la cual resibe su nivel.. A B C D E F 
    
        public void Piso(String nivel){
            
            this.habilidado = true;
            habitaciones = new ArrayList<>();
            
            //Creamos un arrayList de habitaciones y las agregamos 
            
            Habitacion hab;
            hab = new Habitacion(false,1);
            habitaciones.add(hab);
            hab = new Habitacion(false,2);
            habitaciones.add(hab);
            hab = new Habitacion(false,3);
            habitaciones.add(hab);
            hab = new Habitacion(false,4);
            habitaciones.add(hab);
            hab = new Habitacion(false,5);
            habitaciones.add(hab);
            hab = new Habitacion(false,6);
            habitaciones.add(hab);
            hab = new Habitacion(false,7);
            habitaciones.add(hab);
            hab = new Habitacion(false,8);
            habitaciones.add(hab);
            hab = new Habitacion(false,9);
            habitaciones.add(hab);
            hab = new Habitacion(false,10);
            habitaciones.add(hab);     
        
        }
        
        
    
}

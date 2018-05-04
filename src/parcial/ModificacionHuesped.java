/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Margarita
 */
public class ModificacionHuesped {
    
    private ArrayList<Huesped> Huesp;

    Nombre name = new Nombre();
    Scanner lectura = new Scanner(System.in);
    Verificador verfi;
    
    public ModificacionHuesped(){
    Huesp = new ArrayList<>();

    
}
    
    public void agregarhuesped(Nombre nombre, Verificador Dui){
        
        Huesped nuevo = new Huesped();
        Huesp.add(nuevo);
        System.out.println("Ingrese Nombres: ");
        name.setNombres(lectura.nextLine());
        System.out.println("Ingrese Apellidos: ");
        name.setApellidos(lectura.nextLine());
        nuevo.setNombres(name);
        while(true){
            System.out.println("Ingrese DUI: ");
            int id_temp = lectura.nextInt();
            if(verfi.VerificadorTF(id_temp)){
                nuevo.setDUI(id_temp);
                break;
            }
        }
        Huesp.add(nuevo);

}
    
   
    public void eliminarhuesped(int Dui, Habitacion hab){
        for(Huesped user : Huesp){
            if(Integer.toString(user.getDUI()).equals(Integer.toString(Dui))){
               Huesp.remove(user);
               hab.setEstado(true);
            }
            
        }
    }
            
}
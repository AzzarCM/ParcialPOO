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
    Habilitar_Habitacion SearchHab;
    
    public ModificacionHuesped(){
    Huesp = new ArrayList<>();

    
}
    
    public int agregarhuesped(){
        int id_temp;
        Huesped nuevo = new Huesped();
        Huesp.add(nuevo);
        System.out.println("Ingrese Nombres: ");
        name.setNombres(lectura.nextLine());
        System.out.println("Ingrese Apellidos: ");
        name.setApellidos(lectura.nextLine());
        nuevo.setNombres(name);
        while(true){
            System.out.println("Ingrese DUI: ");
             id_temp = lectura.nextInt();
            if(verfi.VerificadorTF(id_temp)){
                nuevo.setDUI(id_temp);
                break;
            }
        }
        Huesp.add(nuevo);
        return id_temp;

}
    
   
    public int eliminarhuesped(){
        int dui_aux;
        boolean banderita = true;
        System.out.println("Ingrese el dui del huesped a eliminar: ");
        dui_aux = lectura.nextInt();
        
        for(Huesped user : Huesp){
            if(Integer.toString(user.getDUI()).equals(Integer.toString(dui_aux))){
               Huesp.remove(user);
               return dui_aux;
            }
            banderita = false;
            
        }
        if(!banderita){
            System.out.println("No existe el usuario a eliminar");
            
        }
        return 0;
    }
            
}
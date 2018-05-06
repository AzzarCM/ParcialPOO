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
public class Habilitar_Habitacion {
     
   String Piso;
   int numero;
   boolean estado;
   private ArrayList<ArrayList<Habitacion>> pisoList;
   private ArrayList<Habitacion> habList;
   Scanner lectura = new Scanner(System.in);
   

   
    public void agregarHabitacion(int indice){
        Habitacion hab = new Habitacion();
        hab.setEstado(true);
        System.out.println("Ingrese el numero de la habitacion: ");
        hab.setNumero(indice);
        switch(miniMenu()){
            case 1:
                hab.setTipo("Sencilla");
                break;
            case 2:
                hab.setTipo("Doble");
                break;
            default:
                System.out.println("Ingrese una opcion valida");
                break;
        }
        habList.add(hab);
    }
    
    public void agregarPiso(){
        System.out.println("Cuantas habitaciones tendra el nuevo piso: MAXIMO 10");
        int aux = lectura.nextInt();
        if(aux > 10){
            System.out.println("No se puede ingresar mas de 10");
        }
        else if(aux <= 0){
            System.out.println("No se puede ingresar habitaciones con numero menor a 1");
        }
        for(int i = 0; i < 10; i++){
            
        }
    }
 
    public int miniMenu(){
        System.out.println("Ingrese el tipo de habitacion: ");
        System.out.println("1. Sencilla");
        System.out.println("2. Doble");
        return lectura.nextInt();
    }
    
    public void habilitarHabitacion(String piso, int numero){
        
    
    }
    public void deshabilitarHabitacion(String piso, int numero){
    
    }
    public void habilitarPiso(String piso){
    
    }
    public void deshabilitarPiso(String piso){
    
    }
    public void liberarReserva(String piso, int numero){
    
    }
}

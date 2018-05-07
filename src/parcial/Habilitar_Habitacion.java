/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author DavidVallecios
 */
public class Habilitar_Habitacion {
   String Piso;
   int numero;
   boolean estado;
   private ArrayList<ArrayList<Habitacion>> pisoList;
   private ArrayList<Habitacion> habList;
   List <String> codPiso;
   String [] pisos = {"A","B","C","D","E","F"};
   Scanner lectura = new Scanner(System.in);
   

   public Habilitar_Habitacion(){
       List <String> codPiso = new ArrayList<String>();
    }
   
   
    public Habitacion CrearHabitacion(int indice, String piso){
        Habitacion hab = new Habitacion();
        hab.setEstado(true);
        System.out.println("Ingrese el numero de la habitacion: ");
        hab.setNumero(indice);
        hab.setPiso(piso);
        if(indice%2 == 0){
            hab.setTipo("Doble");
        }
        else{
            hab.setTipo("Sencilla");
        }
        return hab;
    }
    
    public void agregarPiso(){
        int aux;
        String pisoAux;
        
        while(true){
            System.out.println("Ingrese el piso");
            pisoAux = lectura.nextLine();
            if(AnadiendoPisoArray(ValidarCodigoPiso(pisoAux))){
                System.out.println("Intentelo de nuevo");
            }
            else{
                break;
            }
        }
        
        while(true){
            System.out.println("Cuantas habitaciones tendra el nuevo piso: MAXIMO 10");
            aux = lectura.nextInt();
            if(aux > 10){
                System.out.println("No se puede ingresar mas de 10");
            }
            else if(aux <= 0){
                System.out.println("No se puede ingresar habitaciones con numero menor a 1");
            }
            else{
                break;
            }
        }
        for(int i = 1; i < 11; i++){
            habList.add(CrearHabitacion(i,pisoAux));
        }
        pisoList.add(habList);
        
    }
    
    
    public String ValidarCodigoPiso(String codigo_piso){
        
        while(true){
                if(codigo_piso.length() > 1){
                    System.out.println("El identificador del piso debe ser una letra.");
                    System.out.println("Intente de nuevo");
                }
                else if(codigo_piso.isEmpty()){
                    System.out.println("No ingrese datos vacios");
                }
                else{
                    return codigo_piso;
                }
            }
    }
    
    public boolean AnadiendoPisoArray(String piso){
        codPiso = Arrays.asList(pisos);
        boolean flag = false;
        for(String item: codPiso){
            if(item.equals(piso)){
                System.out.println("Ese piso ya existe.");
                flag = true;
                break;
            }
        }
        return flag;
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

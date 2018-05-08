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
   public String Piso;
   public int numero;
   public boolean estado;
   public ArrayList<ArrayList<Habitacion>> pisoList;
   public ArrayList<Habitacion> habList;
   public List <String> codPiso;
   public String [] pisos = {"A","B","C","D","E","F"};
   Scanner lectura = new Scanner(System.in);
   

   public Habilitar_Habitacion(){
       List <String> codPiso = new ArrayList<String>();
       pisoList = new ArrayList<>();
       habList = new ArrayList<>();
    }
   
   
    public Habitacion CrearHabitacion(int indice, String piso, int  id_user){
        Habitacion hab = new Habitacion();
        hab.setId_user(id_user);
        hab.setEstado(true);
        hab.setNumero(indice);
        hab.setPiso(piso);
        if(indice%2 == 0){
            hab.setTipo("Doble");
        }
        else{
            hab.setTipo("Sencilla");
        }
        System.out.println("Habitacion creada");
        habList.add(hab);
        return hab;
    }
    

    
    
    public void mostrarHab(){
        for(Habitacion hab_aux : habList){
            System.out.println("Habitacion: ");
            System.out.println(hab_aux.getId_user());
            System.out.println(hab_aux.getNumero());
            System.out.println(hab_aux.getTipo());
            System.out.println(hab_aux.getPiso());
        }
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
            habList.add(CrearHabitacion(i,pisoAux, 0));
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
 
    public void habilitarLiberarHabitacion(int id_user){
        System.out.println("Longitud del array: ");
        System.out.println(pisoList.size());
        for(ArrayList<Habitacion> auxPiso: pisoList){
            for(int i = 0; i<10; i++){
                if((auxPiso.get(i).getId_user() == id_user)){
                    auxPiso.get(i).setEstado(true);
                }
            }
            
        }
    
    }
    public void deshabilitarReservarHabitacion(String piso, int numeroHab){
        for(ArrayList<Habitacion> auxPiso: pisoList){
            for(int i = 1; i<11; i++){
                if((auxPiso.get(i).getNumero() == numeroHab) && (auxPiso.get(i).getPiso().equals(piso))){
                    auxPiso.get(i).setEstado(false);
                }
            }
            
        }
    }
    
    public double EnQuePisoEstoy(String piso){
        int flag = 0;
        for(int j = 0; j<pisoList.size()-2; j++){
            for(int i = 0; i<10; i++){
               if(pisoList.get(j).get(i).getPiso().equals(piso)){
                   flag = 2;
                   break;
               }
            }
        }
        if(flag == 0){
            return 0.10;
        }
        else{
            return 1;
        }
    }
    
    
    public void habilitarPiso(String piso){
        for(ArrayList<Habitacion> auxPiso: pisoList){
            for(int i = 1; i<11; i++){
                if((auxPiso.get(i).getPiso().equals(piso))){
                    auxPiso.get(i).setEstado(true);
                }
            }
            
        }
    }
    public void deshabilitarPiso(String piso){
        for(ArrayList<Habitacion> auxPiso: pisoList){
            for(int i = 1; i<11; i++){
                if((auxPiso.get(i).getPiso().equals(piso))){
                    auxPiso.get(i).setEstado(false);
                }
            }
            
        }
    }
}

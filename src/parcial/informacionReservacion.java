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
 * @author cmundo
 */
public class informacionReservacion {
    

    
    private ArrayList<Reservacion> infoReserv;
    Scanner read = new Scanner(System.in);
    public informacionReservacion(){
        infoReserv = new ArrayList<>();
    }
    
    public void AgregarReservacion(){
        
        
        Reservacion lista = new Reservacion();
        
        infoReserv.add(lista);
        System.out.println("Ingrese el nombre del cliente \n");
        lista.setNombre(read.nextLine());
        
        System.out.println("Ingrese el numero de DUI del cliente \n");
        lista.setIdHuesped(read.nextLine());
        
        System.out.println("Ingrese la habitacion del cliente \n");
        lista.setHabitacion(read.nextLine());
        
        System.out.println("Ingrese la fecha de entrada del cliente por favor: \n");
        lista.setFechaEntrada(read.nextLine());
        
        System.out.println("Ingrese la fecha de salidad del cliente por favor: \n");
        lista.setFechaSalida(read.nextLine());
        
        System.out.println("Ingrese el numero de tarjeta de credito del cliente \n");
        lista.setNumeroTarjeta(read.nextLine());
        
        
    }
    
    public void eliminarReservacion(int Dui){
        
        for(int i = 0; i < infoReserv.size(); i++){
            if(infoReserv.get(i).getIdHuesped().equals(Dui)){
                
                infoReserv.remove(i);
                
            }
        }
        
    }
    
    public void verReservaciones(){
        System.out.println("Las reservaciones que hay para la semana son: ");
        
        for(int i = 0; i < infoReserv.size(); i++){
            System.out.println(infoReserv.get(i));
            
            
        }
    }
    
    public void modidicarHabitacion(Habitacion habitacion){
        
        int opcion = 4;
        while(opcion!=3){
            
            System.out.println("Que desea hacer? ");
            System.out.println("1- cambiar habitacion");
            System.out.println("2- cambiar fecha");
            System.out.println("3- salir al menu");
            opcion = read.nextInt();
            
            switch (opcion) {

                case 1:
                    String nuevaHabitacion;
          
                        for (int i = 0; i < infoReserv.size(); i++) {

                            if (infoReserv.get(i).getHabitacion().equals(habitacion) && habitacion.getEstado()) {
                                System.out.println("Ingrese la nueva habitacion para el cliente");
                                
                                nuevaHabitacion = read.nextLine();

                                infoReserv.get(i).setHabitacion(nuevaHabitacion);
                                habitacion.setEstado(false);
                                break;
                            }

                        }
                case 2:
                    

                    }
        
        
               
               
            }
            
        }
       
    
    
    
    
    
    
    
    
}

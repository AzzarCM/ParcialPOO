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
    Fecha nuevaFecha = new Fecha();
    public informacionReservacion(){
        infoReserv = new ArrayList<>();
    }
    
    public boolean consultarReservacion(Habitacion hab, Nombre nombre){
        
        
        for(int i=0; i<infoReserv.size(); i++){
            
            if(infoReserv.get(i).getHabitacion().equals(hab) && infoReserv.get(i).getIdHuesped().equals(nombre)){
                
                return true;
            }
          
        }
        return false;  
        
    }
    
    public void AgregarReservacion(){
        
        
        Reservacion lista = new Reservacion();
        
        infoReserv.add(lista);
        
        
        System.out.println("Ingrese el numero de DUI del cliente \n");
        lista.setIdHuesped(read.nextLine());
        
        System.out.println("Ingrese la habitacion del cliente \n");
        lista.setHabitacion(read.nextLine());
        
        System.out.println("Ingrese la fecha de entrada del cliente por favor: \n");
        lista.setFechaEntrada(Integer.parseInt(read.nextLine()));
        
        System.out.println("Ingrese la fecha de salidad del cliente por favor: \n");
        lista.setFechaSalida(Integer.parseInt(read.nextLine()));
        
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
    
    public void modificarHabitacion(){
        int numHab;
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
                    System.out.println("Ingrese el numero de Habitacion: "); 
                    numHab = read.nextInt();
                    Habitacion habitacion = new Habitacion(true, numHab); //el numero se lo pedieremos (numero de habitacion)
                                        
                    System.out.println("Ingrese la nueva habitacion para el cliente");
                                
                    nuevaHabitacion = read.nextLine();
          
                        for (int i = 0; i < infoReserv.size(); i++) {

                            if (infoReserv.get(i).getHabitacion().equals(nuevaHabitacion) && habitacion.getEstado()) {
                                

                                infoReserv.get(i).setHabitacion(nuevaHabitacion);
                                habitacion.setEstado(false);
                                break;
                            }
                            
                            System.out.println("La habitacion ya esta ocupada ");

                        }
                case 2:
                    
                    Reservacion lis = new Reservacion();
                    System.out.println("Ingrese la habitacion a cambiarle fecha: ");
                    numHab = read.nextInt();
                    Habitacion hab = new Habitacion(true, numHab);
                    
                    for(int i = 0; i < infoReserv.size(); i++){
                        
                        if(infoReserv.contains(hab) && hab.getEstado()){
                           
                            
                            lis.setFechaEntrada(Integer.parseInt(nuevaFecha.toString()));
                
                            System.out.println("Ingrese el nuevo Dia \n");
                            nuevaFecha.setDia(Integer.parseInt(read.nextLine()));
                            System.out.println("Ingrese el nuevo mes \n ");
                            nuevaFecha.setMes(Integer.parseInt(read.nextLine()));
                        }
                    }
                }     
            }  
        }  
}

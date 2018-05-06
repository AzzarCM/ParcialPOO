/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author cmundo
 */
public class Menu {
    
   private static Menu menu;
    //private ArrayList<String> proveedores;

    private Menu() {
    }

    public static Menu getInstance() {
        if (menu == null) {
            menu = new Menu();
        }
        return menu;
    }
    
    public void opciones() {
        System.out.println("-------- Menu --------");
        System.out.println("1. Opciones para modificar Huesped");
        System.out.println("2. Opciones para agregar/modificar reservaciones");
        System.out.println("3. Opciones para agregar/modificar temporada del anio");
        System.out.println("4. Opciones de agregar/modificar una reservacion");
        System.out.println("5. Salir");
    }
    
    public void mostrar(){
        int opcion = 4;
        int opcionHuesped, opcionReservacion;
        String dato;
        Scanner leer = new Scanner(System.in);
        ModificacionHuesped hues = new ModificacionHuesped();
        informacionReservacion reserv = new informacionReservacion();
        String hab;
        

        while (opcion != 7) {
            opciones();
            try {
                opcion = leer.nextInt();
                switch (opcion) {
                    case 1:
                        System.out.println("------ BIENVENIDO A HUESPED --------");
                        System.out.println("Que desea realizar?  \n");
                        System.out.println("1. Agregar un Huesped");
                        System.out.println("2. Eliminar un Huesped");
                        System.out.println("3. Salir ");
                        opcionHuesped = leer.nextInt();
                        
                        switch(opcionHuesped){
                            case 1:
                                System.out.println("Bienvenido a Agregar un huesped");
                                hues.agregarhuesped(nombre, Dui);
                                break;
                            case 2:
                                System.out.println("Bienvendio a Eliminar un Huesped");
                                hues.eliminarhuesped(opcion, hab);
                                break;
                                
                            default:
                                System.out.println("Ingrese una opcion valida por favor.. ");
                                       
                            
                        }
                        
                       
                    case 2:
                        
                        System.out.println("-------- BIENVENIDO A RESERVACON ---------");
                        System.out.println("Que desea hacer? ");
                        System.out.println("1- Agregar una reservacion ");
                        System.out.println("2- Eliminar una reservacion ");
                        System.out.println("3- Ver reservaciones ");
                        System.out.println("4- Modificar Reservacion ");
                        System.out.println("5- Consultar Reservacion ");
                        System.out.println("6- Salir ");
                        opcionReservacion = leer.nextInt();
                        switch(opcionReservacion){
                            case 1:
                                reserv.AgregarReservacion();
                                break;
                            case 2:
                                reserv.eliminarReservacion(dui);
                            case 3:
                                reserv.verReservaciones();
                            case 4:         
                                reserv.modificarHabitacion();
                            case 5:
                                reserv.consultarReservacion(hab, nombre);
                                
                        }
                       
                        
                       
                    case 3:
                        
                    case 4:
                        
                    case 5:
                       
                    case 6:
                        
                    case 7:
                        
                    default:
                        System.out.println("Por favor ingrese una opcion valida");
                }
            } catch (InputMismatchException e) {
                System.err.println("Ingrese un numero valido porfavor...");
                leer.nextLine();
            }
        }
    }
}


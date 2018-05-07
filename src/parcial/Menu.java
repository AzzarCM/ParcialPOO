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
 * @author DavidVallecios
 */
public class Menu {
    
   private static Menu menu;
   

    private Menu() {
       
    }

    public static Menu getInstance() {
        if (menu == null) {
            menu = new Menu();
        }
        return menu;
    }
    
    public void opciones() {
        System.out.println("------------ Menu ------------");
        System.out.println("1. Agregar Huesped");
        System.out.println("1. Opciones para modificar Huesped");
        System.out.println("2. Opciones para agregar/modificar reservaciones");
        System.out.println("3. Opciones para agregar/modificar temporada del anio");
        System.out.println("4. Opciones de agregar/modificar una reservacion");
        System.out.println("5. Salir");
    }
    
    
    public void mostrar(){
         Scanner leer = new Scanner(System.in);
        int opcion = 4;
        int opcionHuesped, opcionReservacion, opcionTemporada;
        String dato, cod_temp="";
        Fecha ConsulTemp = new Fecha();
        ModificacionHuesped hues = new ModificacionHuesped();
        informacionReservacion reserv = new informacionReservacion();
        Habilitar_Habitacion room = new Habilitar_Habitacion();
        Temporada2 tempo = new Temporada2();
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
                                hues.agregarhuesped();
                                break;
                            case 2:
                                System.out.println("Bienvendio a Eliminar un Huesped");
                                room.habilitarLiberarHabitacion(hues.eliminarhuesped());
                                break;
                                
                            default:
                                System.out.println("Ingrese una opcion valida por favor... ");    
                                break;
                        }
                        break;

                    case 2:

                        System.out.println("-------- BIENVENIDO A RESERVACON ---------");
                        System.out.println("Que desea hacer? ");
                        System.out.println("1- Agregar una reservacion ");
                        System.out.println("2- Eliminar una reservacion ");
                        System.out.println("3- Ver reservaciones ");
                        System.out.println("4- Modificar Reservacion ");
                        System.out.println("5- Consultar Reservacion ");
                        System.out.println("6- regresar ");
                        opcionReservacion = leer.nextInt();
                        switch(opcionReservacion){
                            case 1:
                                reserv.AgregarReservacion();
                                break;
                            case 2:
                                reserv.eliminarReservacion();
                                break;
                            case 3:
                                reserv.verReservaciones();
                                break;
                            case 4:         
                                reserv.modificarHabitacion();
                                break;
                            case 5:
                                reserv.consultarReservacion();
                                break;
                            case 6:
                                menu.mostrar();
                                break;
                            default:
                                System.out.println("No se puede");
                                break;
    
                        }
                        break;

                    case 3:

                        System.out.println("-------- BIENVENIDO A TEMPORADA ---------");
                        System.out.println("Que desea hacer? ");
                        System.out.println("1- Agregar temporada  ");
                        System.out.println("2- Consultar temporada ");
                        System.out.println("3- Modificar temporada ");
                        System.out.println("4- Elimimar temporada ");
                        System.out.println("6- Salir ");
                        opcionTemporada = leer.nextInt();
                        switch(opcionTemporada){
                            case 1:
                                tempo.agregarTemporada();
                                break;
                            case 2:
                                int dia_temp,mes_temp,anio_temp;
                                System.out.println("Ingrese la fecha actual: ");
                                System.out.println("Ingrese el dia: ");
                                dia_temp = leer.nextInt();
                                System.out.println("Ingrese el mes: ");
                                mes_temp = leer.nextInt();
                                tempo.consultarTemporada(ConsulTemp);
                                break;
                            case 3:
                                String cod_tep;
                                System.out.println("Ingrese el codigo de la temporada: ");
                                cod_tep = leer.nextLine();
                                tempo.modificarTemporada(cod_tep);
                                break;
                            case 4:
                                String cod_tem;
                                System.out.println("Ingrese el codigo de la temporada: ");
                                cod_tem = leer.nextLine();
                                tempo.eliminarTemporada(cod_tem);
                                break;
                        }
                        break;
                
                        
                    default:
                        System.out.println("Por favor ingrese una opcion valida");
                        break;
                }
            } catch (InputMismatchException e) {
                System.err.println("Ingrese un numero valido porfavor...");
                leer.nextLine();
            }
        }
    }
}


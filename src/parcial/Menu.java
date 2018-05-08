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
        System.out.println("1. Menu de resevaciones");
        System.out.println("2. Menu de temporadas");
        System.out.println("3. Menu de Paquetes");
        System.out.println("4. Salir");
    }

    public void mostrar() {
        Scanner leer = new Scanner(System.in);
        int opcion = 4, precioTotal;
        int opcionHuesped, opcionReservacion, opcionTemporada;
        String dato, cod_temp = "";
        Fecha ConsulTemp = new Fecha();
        ModificacionHuesped hues = new ModificacionHuesped();
        informacionReservacion reserv = new informacionReservacion();
        Habilitar_Habitacion room = new Habilitar_Habitacion();
        Temporada2 tempo = new Temporada2();
        String hab;
        Paquetes paquetes = new Paquetes();

        while (opcion != 7) {
            opciones();
            try {
                opcion = leer.nextInt();
                switch (opcion) {
                    case 1:
                        System.out.println("-------- BIENVENIDO A RESERVACON ---------");
                        System.out.println("Que desea hacer? ");
                        System.out.println("1- Agregar una reservacion ");
                        System.out.println("2- Eliminar una reservacion ");
                        System.out.println("3- Ver reservaciones ");
                        System.out.println("4- Modificar Reservacion ");
                        System.out.println("5- Consultar Reservacion ");
                        System.out.println("6- Precio total");
                        System.out.println("7- regresar ");
                        opcionReservacion = leer.nextInt();
                        switch (opcionReservacion) {
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
                                System.out.println("Ingrese el id del huesped: ");
                                reserv.PrecioTotal(leer.nextInt());
                                break;
                            case 7:
                                menu.mostrar();
                                break;
                            default:
                                System.out.println("No se puede");
                                break;
                        }
                        break;

                    case 2:

                        System.out.println("-------- BIENVENIDO A TEMPORADA ---------");
                        System.out.println("Que desea hacer? ");
                        System.out.println("1- Agregar temporada  ");
                        System.out.println("2- Consultar temporada ");
                        System.out.println("3- Modificar temporada ");
                        System.out.println("4- Elimimar temporada ");
                        System.out.println("5- Salir ");
                        opcionTemporada = leer.nextInt();
                        switch (opcionTemporada) {
                            case 1:
                                tempo.agregarTemporada();
                                break;
                            case 2:
                                int dia_temp,
                                 mes_temp,
                                 anio_temp;
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
                            case 5:
                                System.exit(0);
                                break;
                            default:
                                System.out.println("Ingrese una opcion valida");
                                break;
                        }
                    case 3:
                        System.out.println("-------- BIENVENIDO A PAQUETES ---------");
                        System.out.println("Que desea hacer? ");
                        System.out.println("1- Agregar paquete");
                        System.out.println("2- Eliminar Paquete");
                        System.out.println("3- Modificar Paquete");
                        System.out.println("4- Mostrar paquetes ");
                        System.out.println("5- Salir ");
                        switch (leer.nextInt()) {
                            case 1:
                                paquetes.agregarPaquete();
                                break;
                            case 2:
                                System.out.println("Ingrese el nombre del paquete: ");
                                paquetes.eliminarPaquete(leer.nextLine());
                                break;
                            case 3:
                                System.out.println("Que desea modificar del paquete? ");
                                System.out.println("1. Modificar nombre del paquete");
                                System.out.println("2. Modificar el precio del paquete");
                                System.out.println("3. Agregar servicios al paquete");
                                switch (leer.nextInt()) {
                                    case 1:
                                        System.out.println("Ingrese el nombre del paquete a cambiar: ");
                                        paquetes.cambiarNombrePaquete(leer.nextLine());
                                        break;
                                    case 2:
                                        System.out.println("Ingrese el nombre del paquete a modificar el precio: ");
                                        paquetes.modificarPrecio(leer.nextLine());
                                        break;
                                    case 3:
                                        System.out.println("Ingrese el nombre del paquete a agregar servicios: ");
                                        paquetes.agregarServicios(leer.nextLine());
                                        break;
                                    default:
                                        System.out.println("Ingrese una opcion valida");
                                        break;
                                }
                                break;
                            case 4:
                                paquetes.mostrarPaquetes();
                                break;
                            default:
                                System.out.println("Ingrese una opcion valida");
                                break;
                        }
                        break;
                    
                    case 5:
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Ingrese una opcion valida");
                        break;

                }
            } catch (InputMismatchException e) {
                System.err.println("Ingrese un numero valido porfavor...");
                leer.nextLine();
            }
        }
    }
}

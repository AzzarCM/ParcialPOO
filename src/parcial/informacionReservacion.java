/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.InputMismatchException;


/**
 *
 * @author cmundo
 */
public class informacionReservacion {
    

    
    private ArrayList<Reservacion> infoReserv;
    Scanner read = new Scanner(System.in);
    Fecha nuevaFecha = new Fecha(), fechaAuxEntrada = new Fecha(),fechaAuxSalida = new Fecha();
    Habilitar_Habitacion liberar = new Habilitar_Habitacion();
    
    
    public informacionReservacion(){
        infoReserv = new ArrayList<>();
    }
    
    public boolean consultarReservacion(){
        int id_user,numHab;
        String piso;
        System.out.println("Ingrese el numero de habitacion: ");
        //id_user = read.nextInt();
        numHab = read.nextInt();
        System.out.println("Ingrese el numero de piso ");
        piso = read.nextLine();

        
        
        for(int i=0; i<infoReserv.size(); i++){
            
            if(infoReserv.get(i).getHab().getNumero() == numHab && infoReserv.get(i).getHab().getPiso().equals(piso)){
                System.out.println("Esta ocupada ");
                
                return true;
            }
          
        }
        System.out.println("No esta ocupada");
        return false;  
        
    }
    
    public void AgregarReservacion() {
        Habilitar_Habitacion nueva = new Habilitar_Habitacion();
        Paquetes paq = new Paquetes();
        Habitacion auxHab = new Habitacion();
        Reservacion lista = new Reservacion();
        String piso;
        int nHab, num_tarjeta, auxEntradaDia, auxEntradaMes, auxEntradaAnio;
        ModificacionHuesped mod_hues = new ModificacionHuesped();

        infoReserv.add(lista);

        int id_aux = mod_hues.agregarhuesped();
        lista.setIdHuesped(id_aux);

        System.out.println("Ingrese la habitacion del cliente \n");
        System.out.println("En que piso lo desea?: ");
        piso = read.nextLine();
        System.out.println("Ingrese el numero de habitacion: ");
        nHab = read.nextInt();
        auxHab = nueva.CrearHabitacion(nHab, piso, id_aux);
        lista.setHab(auxHab);

        System.out.println("Ingrese la fecha de entrada del cliente por favor: \n");
        System.out.println("Ingrese el dia: ");
        try{
            auxEntradaDia = read.nextInt();
            if(auxEntradaDia <= 31 && auxEntradaDia > 0){
                fechaAuxEntrada.setDia(auxEntradaDia);
            }
        }catch(InputMismatchException error){
            System.err.println("Ingrese un dia menor a 31 o mayor a 0 ");
        }
        fechaAuxEntrada.setDia(read.nextInt());
        System.out.println("Ingrese el mes: ");
        fechaAuxEntrada.setMes(read.nextInt());
        System.out.println("Ingrese el anio: ");
        fechaAuxEntrada.setAnio(read.nextInt());
        lista.setFechaEntrada(fechaAuxEntrada);

        System.out.println("Ingrese la fecha de salidad del cliente por favor: \n");
        System.out.println("Ingrese el dia: ");
        fechaAuxSalida.setDia(read.nextInt());
        System.out.println("Ingrese el mes: ");
        fechaAuxSalida.setMes(read.nextInt());
        System.out.println("Ingrese el anio: ");
        fechaAuxSalida.setAnio(read.nextInt());
        lista.setFechaSalida(fechaAuxSalida);

        System.out.println("Desea algun paquete?: ");
        try {
            if (read.nextLine().equals("Y")) {
                paq.mostrarPaquetes();
                System.out.println("Que paquete elegira: ");
                lista.setPaquete(paq.PrecioPaquete(read.nextInt() - 1));
            }
        } catch (InputMismatchException erro) {
            System.err.println("Ingrese la letra correcta... ");
            read.nextLine();
        }
        System.out.println("Ingrese el numero de tarjeta de credito del cliente \n");
        //System.out.println("La tarjeta de Credito consta de 4 digitos... \n");
        num_tarjeta = read.nextInt();
        lista.setNumeroTarjeta(num_tarjeta);
      
             
        
        nueva.mostrarHab();

    }
    
    public void eliminarReservacion(){
        
        int id_aux;
        System.out.println("Ingrese el id del usuario a salir: ");
        id_aux = read.nextInt();
        
        for(int i = 0; i < infoReserv.size(); i++){
            if(infoReserv.get(i).getIdHuesped() == id_aux){
                infoReserv.remove(i);
                liberar.habilitarLiberarHabitacion(id_aux);
                
            }
        }
        
    }
    
    public void verReservaciones(){
        System.out.println("Las reservaciones que hay son: ");
        for(int i = 0; i < infoReserv.size(); i++){
            System.out.println("Numero de Habitacion : ");
            System.out.println(infoReserv.get(i).getHab().getNumero());
            System.out.println("Piso : ");
            System.out.println(infoReserv.get(i).getHab().getPiso());
            System.out.println("Id Huesped: ");
            System.out.println(infoReserv.get(i).getIdHuesped());
            System.out.println("La fecha de entrada es: ");
            System.out.println(infoReserv.get(i).getFechaEntrada().getDia()+ "-" + infoReserv.get(i).getFechaEntrada().getMes() + "-" + infoReserv.get(i).getFechaEntrada().getAnio());
            System.out.println("La fecha de salida del cliente es: ");
            System.out.println(infoReserv.get(i).getFechaSalida().getDia()+ "-" + infoReserv.get(i).getFechaSalida().getMes() + "-" + infoReserv.get(i).getFechaSalida().getAnio());
            System.out.println("La tarjeta de credito del cliente es: ");
            System.out.println(infoReserv.get(i).getNumeroTarjeta());
           
        }
    }
    
    public void PrecioTotal(int id_user){
        Habilitar_Habitacion auxHab = new Habilitar_Habitacion();
        int acum=0, aux = 0, precio_temp = 0, precioPaq=0;
        double porcentaje_extra, precioFinal=0;
        for(int i = 0; i<infoReserv.size(); i++){
            if(infoReserv.get(i).getIdHuesped() == id_user){
                if(infoReserv.get(i).getFechaEntrada().getAnio() == infoReserv.get(i).getFechaSalida().getAnio()){
                    if(infoReserv.get(i).getFechaEntrada().getMes() == infoReserv.get(i).getFechaSalida().getMes()){
                       acum += (infoReserv.get(i).getFechaSalida().getDia()-infoReserv.get(i).getFechaEntrada().getDia());
                       System.out.println("Ingrese el piso de la habitacion: ");
                       porcentaje_extra = auxHab.EnQuePisoEstoy(read.nextLine());
                       precio_temp = auxHab.tipoHabi(id_user);
                       precioPaq = infoReserv.get(i).getPaquete().getPrecioPaquete();
                       precioFinal = (acum*precio_temp*porcentaje_extra)+(acum*precioPaq);
                       break;
                        }
                }
            }

            }
        System.out.println("El precio final es: $" + String.valueOf(precioFinal));
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
                    Habitacion habitacion = new Habitacion(); //el numero se lo pedieremos (numero de habitacion)
                                        
                    System.out.println("Ingrese la nueva habitacion para el cliente");
                                
                    nuevaHabitacion = read.nextLine();
          
                        for (int i = 0; i < infoReserv.size(); i++) {

                            if (infoReserv.get(i).getHab().equals(nuevaHabitacion) && habitacion.getEstado()) {
                                

                                infoReserv.get(i).getHab().setEstado(true);
                                habitacion.setEstado(false);
                                break;
                            }
                            
                            System.out.println("La habitacion ya esta ocupada ");

                        }
                case 2:
                    
                    Reservacion lis = new Reservacion();
                    System.out.println("Ingrese la habitacion a cambiarle fecha: ");
                    numHab = read.nextInt();
                    Habitacion hab = new Habitacion();
                    
                    for(int i = 0; i < infoReserv.size(); i++){
                        
                        if(infoReserv.contains(hab) && hab.getEstado()){
                          
                            lis.setFechaEntrada(nuevaFecha);
                
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

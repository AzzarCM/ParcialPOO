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
 * @author rodol
 */
public class Temporada2 {
    private ArrayList<Temporada> temporadaList = new ArrayList<>();
    Temporada temporadita = new Temporada();
    Fecha FechaInicio = new Fecha();
    Fecha FechaFin = new Fecha();
    Scanner lectura= new Scanner(System.in);
    boolean banderita = true;
    
 
    
    public void agregarTemporada(){
        Temporada tempo = new Temporada();
        while(true){
            System.out.println("Ingrese el codigo de la temporada: ");
            String aux = lectura.nextLine();
            if(VerificarCodigoTemp(aux)){
                tempo.setCodigo(aux);
                break;
            }
        }
        System.out.println("Ingrese el nombre de la temporada: ");
        tempo.setNombre(lectura.nextLine());
        ValidarFechaInicio();
        ValidarFechaFin();
        tempo.setFechaInicio(FechaInicio);
        tempo.setFechaFin(FechaFin);

    }
    
    
    private boolean VerificarCodigoTemp(String codigo){
        for(Temporada temp : temporadaList){
            if(temp.getCodigo().equals(codigo)){
                return false;
            }
        }
        return true;
    }
    
    public void ValidarFechaInicio(){
        System.out.println("Ingrese la fecha de inicio de temporada: ");
        while(true){
            System.out.println("Ingrese el dia: ");
            FechaInicio.setDia(lectura.nextInt());
            if(FechaInicio.getDia() <= 31){
                while(FechaInicio.getDia() == 31){
                    System.out.println("Ingrese un mes con 31 dias: ");
                    FechaInicio.setMes(lectura.nextInt());
                    if( FechaInicio.getMes() == 1 || FechaInicio.getMes() == 3 || FechaInicio.getMes() == 5 || FechaInicio.getMes() == 7 || FechaInicio.getMes() == 8 || FechaInicio.getMes() == 10 || FechaInicio.getMes() == 12){
                        banderita = false;
                        break;
                    }
                    System.out.println("Ese mes no existe o no tiene 31 dias. ");
                }
            
                while((FechaInicio.getDia() == 28 || FechaInicio.getDia() == 29) && banderita){
                    System.out.println("Ingrese un mes con 28 o 29 dias: ");
                    FechaInicio.setMes(lectura.nextInt());
                    if(FechaInicio.getMes() == 2){
                        banderita = false;
                        break;
                    }
                    System.out.println("Ese mes tiene mas dias o no existe. ");
                }

                while(FechaInicio.getDia() <= 30 && banderita){
                    System.out.println("Ingrese un mes con 30 dias: ");
                    FechaInicio.setMes(lectura.nextInt());
                    if( FechaInicio.getMes() == 4 || FechaInicio.getMes() == 6 || FechaInicio.getMes() == 7 || FechaInicio.getMes() == 9 || FechaInicio.getMes() == 11 ){
                        banderita = false;
                        break;
                    }
                    System.out.println("Ese mes no existe o no tiene 30 dias. ");
                }
                break;
            }
            

        }
    }
    
    
    public void ValidarFechaFin(){
        banderita = true;
        System.out.println("Ingrese la fecha de fin de temporada: ");
        while(true){
            System.out.println("Ingrese el dia: ");
            FechaFin.setDia(lectura.nextInt());
            if(FechaFin.getDia() <= 31){
                while(FechaFin.getDia() == 31){
                    System.out.println("Ingrese un mes con 31 dias: ");
                    FechaFin.setMes(lectura.nextInt());
                    if( FechaFin.getMes() == 1 || FechaFin.getMes() == 3 || FechaFin.getMes() == 5 || FechaFin.getMes() == 7 || FechaFin.getMes() == 8 || FechaFin.getMes() == 10 || FechaFin.getMes() == 12){
                        banderita = true;
                        break;
                    }
                    System.out.println("Ese mes no existe o no tiene 31 dias. ");
                }
            
                while((FechaFin.getDia() == 28 || FechaFin.getDia() == 29) && banderita){
                    System.out.println("Ingrese un mes con 28 o 29 dias: ");
                    FechaFin.setMes(lectura.nextInt());
                    if(FechaFin.getMes() == 2){
                        banderita = false;
                        break;
                    }
                    System.out.println("Ese mes tiene mas dias o no existe. ");
                }

                while(FechaFin.getDia() <= 30 && banderita){
                    System.out.println("Ingrese un mes con 30 dias: ");
                    FechaFin.setMes(lectura.nextInt());
                    if( FechaFin.getMes() == 4 || FechaFin.getMes() == 6 || FechaFin.getMes() == 7 || FechaInicio.getMes() == 9 || FechaFin.getMes() == 11 ){
                        banderita = false;
                        break;
                    }
                    System.out.println("Ese mes no existe o no tiene 30 dias. ");
                }
                break;
            }
            
            
            
           
        }
    }
    
    public String consultarTemporada(Fecha fecha){
        for(Temporada temp : temporadaList)
            if((fecha.getDia() >= temp.getFechaInicio().dia && fecha.getDia() <= temp.getFechaFin().dia) && (fecha.getMes() >= temp.getFechaInicio().mes && fecha.getMes() <= temp.getFechaFin().mes)){
                return temp.getCodigo();
            }
        return "ERROR";
    }
    
    public void modificarTemporada(String codigo){
        for(Temporada temp : temporadaList){
            if(codigo.equals(temp.getCodigo())){
                switch(miniMenu()){
                    case 1: 
                        System.out.println("Ingrese el nuevo codigo de temporada: ");
                        temp.setCodigo(lectura.nextLine());
                        break;
                    case 2:
                        System.out.println("Ingrese el  nuevo nombre de la temporada: ");
                        temp.setNombre(lectura.nextLine());
                        break;
                    case 3:
                        System.out.println("Ingrese la nueva fecha de inicio de la temporada: ");
                        ValidarFechaInicio();
                        break;
                    case 4:
                        System.out.println("Ingrese la nueva fehca de fin de temporada: ");
                        ValidarFechaFin();
                        break;
                    default:
                        System.out.println("Ingrese una opcion valida");
                        break;
                }
                break;
            }
        }
    }
    
    public int miniMenu(){
            System.out.println("-------BIENVENIDO AL MENU DE MODIFICAR TEMPORADA-----------");
            System.out.println("1. Modificar codigo");
            System.out.println("2. Modificar nombre");
            System.out.println("3. Modificar Fecha de inicio: ");
            System.out.println("4. Modificar Fecha de fin: ");
            System.out.println("Ingrese una opcion: ");
            return lectura.nextInt();
    }
    
    public void eliminarTemporada(String codigo){
        for(Temporada temp : temporadaList){
            if(codigo.equals(temp.getCodigo())){
                temporadaList.remove(temp);
            }
        }
        
    }
    
}


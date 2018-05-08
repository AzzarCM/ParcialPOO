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
public class Paquetes {
    public String idPaquete;
    public float precio;
    public ArrayList<Paq>  paquetes;
    public ArrayList<String> servicios;
    Scanner lectura = new Scanner(System.in);
    
    public Paquetes(){
        paquetes = new ArrayList<>(); 
        servicios = new ArrayList<>();
    }
 
    public void agregarPaquete(){
        Paq nuevo_paq = new Paq();
        System.out.println("Ingrese el nombre del paquete: ");
        nuevo_paq.setNombrePaquete(lectura.nextLine());
        System.out.println("Ingrese el precio del paquete: ");
        nuevo_paq.setPrecioPaquete(lectura.nextInt());
        while(true){
            System.out.println("Ingrese el nombre del servicio: ");
            servicios.add(lectura.nextLine());
            System.out.println("Agregara mas servicios al paquete? Y/N");
            if(!(lectura.nextLine().equals('Y'))){
                break;
            }
        }
        nuevo_paq.setServicioPaquete(servicios);
    }
    
    public void modificarPrecio(String nombrePaq){
        for(Paq temp: paquetes){
            if(temp.getNombrePaquete().equals(nombrePaq)){
                System.out.println("Ingrese el nuevo precio: ");
                temp.setPrecioPaquete(lectura.nextInt());
            }
        }
    }
    public void cambiarNombrePaquete(String nombrePaq){
        for(Paq temp: paquetes){
            if(temp.getNombrePaquete().equals(nombrePaq)){
                System.out.println("Ingrese el nueo nombre: ");
                temp.setNombrePaquete(lectura.nextLine());
            }
        }
    }
    public void agregarServicios(String nombrePaq){
        for(Paq temp: paquetes){
            if(temp.getNombrePaquete().equals(nombrePaq)){
                while(true){
                    System.out.println("Ingrese el nuevo servicio: ");
                    servicios = temp.getServicioPaquete();
                    servicios.add(lectura.nextLine());
                    System.out.println("Seguira Ingresando? Y/N");
                    if(!lectura.nextLine().equals('Y')){
                        break;
                    }
                }
                temp.setServicioPaquete(servicios);
                
            }
        }
    }
    
    public void mostrarPaquetes(){
        int cont = 1;
        for(Paq id : paquetes){
            System.out.println("Paquete N"+ Integer.toString(cont));
            System.out.println("Nombre del paquete: "+ id.getNombrePaquete());
            System.out.println("Servicios del paquete: ");
            for(String serv : id.getServicioPaquete()){
                System.out.println("- "+ serv);
            }
            System.out.println("Precio del paquete: $" + Integer.toString(id.getPrecioPaquete())+ " por dia");
            cont++;
        }
    }
    
    public Paq PrecioPaquete(int indice){
        return paquetes.get(indice);
    }
    
    public void eliminarPaquete(String nombrePaq){
        for(Paq temp: paquetes){
            if(temp.getNombrePaquete().equals(nombrePaq)){
                paquetes.remove(temp);
                break;
            }
        }
    }   
}
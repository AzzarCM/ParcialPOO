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
    String idPaquete, codeTemporada;
    float precio;
    private ArrayList<Paq>  paquetes;
    ArrayList<String> servicios;
    Scanner lectura = new Scanner(System.in);



    public Paquetes(){
        paquetes = new ArrayList<>(); 
        servicios = new ArrayList<>();
    }
 
    private void agregarPaquete(){
        Paq nuevo_paq = new Paq();
        System.out.println("Ingrese el nombre del paquete: ");
        nuevo_paq.setNombrePaquete(lectura.nextLine());
        System.out.println("Ingrese el precio del paquete: ");
        nuevo_paq.setPrecioPaquete(lectura.nextInt());
        while(true){
            System.out.println("Ingrese el nombre del paquete: ");
            servicios.add(lectura.nextLine());
            System.out.println("Agregara mas servicios al paquete? Y/N");
            if(lectura.nextLine().equals('Y')){
                break;
            }
        }
        nuevo_paq.setServicioPaquete(servicios);
    }
    
    private void modificarPrecio(String nombrePaq){
        for(Paq temp: paquetes){
            if(temp.getNombrePaquete().equals(nombrePaq)){
                System.out.println("Ingrese el nuevo precio: ");
                temp.setPrecioPaquete(lectura.nextInt());
            }
        }
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
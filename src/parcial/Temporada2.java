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
    private ArrayList<Temporada> tempor;
    
    Temporada code = new Temporada();
    Fecha feshaini = new Fecha();
      Fecha feshafin = new Fecha();
    Scanner lectura= new Scanner(System.in);
    
    
    
    private void agregarTemporada(Fecha fecha, String codigoTemp){
        Temporada tempo = new Temporada();
        tempor.add(tempo);
        System.out.println("Ingrese el nombre de la Temporada");
        code.setCodigo(lectura.nextLine());
        System.out.println("Ingrese fecha de inicio");
        feshaini.setDia(Integer.parseInt(lectura.nextLine()));
        feshaini.setMes(Integer.parseInt(lectura.nextLine()));
        feshaini.setAnio(Integer.parseInt(lectura.nextLine()));
        System.out.println("Ingrese fecha de final");
        feshafin.setDia(Integer.parseInt(lectura.nextLine()));
        feshafin.setMes(Integer.parseInt(lectura.nextLine()));
        feshafin.setAnio(Integer.parseInt(lectura.nextLine()));
        
        
        
        
    }
    
    private void consultarTemporada(Fecha fecha){
        
        
    }
    
    private void modificarTemporada(Nombre nombre){
        
    }
    
    private void eliminarTemporada(Nombre nombre){
        
        
    }
    
}


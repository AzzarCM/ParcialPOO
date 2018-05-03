/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial;

import java.util.ArrayList;

/**
 *
 * @author rodol
 */
public class Paquetes {
    String idPaquete, codeTemporada;
    float precio;
    private ArrayList<ArrayList<String>>  paqPrinc;
    private ArrayList<String>  paq;
    private ArrayList<String>  paq2;
    private ArrayList<String>  paq_new;
    
    public Paquetes(){
        paq = new ArrayList<>();
        paq2 = new ArrayList<>();
        
        paqPrinc = new ArrayList<>();
        paq.add("Basico");
        paq.add("10");
        paq2.add("Premium");
        paq2.add("150");
        paqPrinc.add(paq);
        paqPrinc.add(paq2);
        
    }
 
    private void agregarPaquete(String nombrePaq, int PrecioPaq){
        paq_new = new ArrayList<>();
        paq_new.add(nombrePaq);
        paq_new.add(Integer.toString(PrecioPaq));
        paqPrinc.add(paq_new);
 
    }
    
    private void modificarPrecio(String nombrePaq, int newPrice){
        for(int i = 0; i<paqPrinc.size(); i++){
            ArrayList referen = (ArrayList) paqPrinc.get(i);
            for(int j = 0; j<referen.size()-1; j++){
                if(nombrePaq.equals(referen.get(j))){
                    referen.set(1, newPrice);
                    break;
                }
            }
            break;
        }
    }
    
    private void eliminarPrecio(){
        
    }
    
    
    
    
}
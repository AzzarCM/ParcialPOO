/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial;

/**
 *
 * @author Margarita
 */
public class Verificador {
    
    public Verificador(){}
    
    public boolean VerificadorTF(int dui){
        if(Integer.toString(dui).length() == 8){
            return true;
        }
        return false;
    }
}

    
    
    


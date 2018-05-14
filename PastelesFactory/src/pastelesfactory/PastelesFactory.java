/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pastelesfactory;

/**
 *
 * @author Margarita
 */
public class PastelesFactory {
    
    public static Pasteles getPasteles(PastelesType Type){
        switch (Type){
            case DELICIOSO:
                return new PastelVainilla();        
        
            case RICO:
                return new PastelFresa();    
        
            case EMPALAGOSO:
                return new PastelChocolate();
            default:
                return null;
        }
    }
    
}
    





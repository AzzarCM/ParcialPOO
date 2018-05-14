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
public class FactoryPatternExample {
    
    public static void main(String[] args) {
        
        Pasteles pasteles = PastelesFactory.getPasteles(PastelesType.DELICIOSO);
        pasteles.speak();
        pasteles = PastelesFactory.getPasteles(PastelesType.RICO);
        pasteles.speak();
        pasteles = PastelesFactory.getPasteles(PastelesType.EMPALAGOSO);
        pasteles.speak();
        
                
    }
    
}

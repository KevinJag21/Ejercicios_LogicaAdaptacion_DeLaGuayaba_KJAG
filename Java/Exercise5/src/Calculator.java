
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kevin Araya Granados
 */
public class Calculator {
 
    public Calculator(){}
    
    public String calculateOcurrency (int [] arrayNumber){
                
        Number maxOcurrency = new Number( 0, 0);
        
        for (int i = 0; i < arrayNumber.length; i++) {
            
            Number number = new Number (arrayNumber[i],0);
            
            for (int j = i; j < arrayNumber.length; j++) {
                
                if(number.getNumber() == arrayNumber[j]){
                    number.setOcurrency(number.getOcurrency()+1);
                }else{
                    break;
                }
            }
            
            if(number.getOcurrency() >= maxOcurrency.getOcurrency()){
                maxOcurrency = number;
            }
        }
        return maxOcurrency.toString();
    }
}

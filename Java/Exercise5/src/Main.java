
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kevin Araya Granados
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Calculator calculator = new Calculator();
        int [] arrayNumber = {1,2,2,2,4,4,4,4};
        int [] myArray = {1,2,2,5,4,6,7,8,8,8};
        
        System.out.println(calculator.calculateOcurrency(arrayNumber));
        System.out.println(calculator.calculateOcurrency(myArray));
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kevin Araya Granados
 */
public class Number {
 
    private int ocurrency;
    private int number;
    
    public Number(){}
    
    public Number(int number, int ocurrency){
        this.number = number;
        this.ocurrency = ocurrency;
    }
    
    public int getNumber(){
        return this.number;
    }
    
    public void setNumber(int number){
        this.number = number;
    }
    
    public int getOcurrency(){
        return this.ocurrency;
    }
    
    public void setOcurrency(int ocurrency){
        this.ocurrency = ocurrency;
    }
    @Override
    public String toString(){
        String print = "";
        print += "Número: "+this.number+"\n";
        print += "Ocurrencia: "+this.ocurrency;
        return print;
    }
}

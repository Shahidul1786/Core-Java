/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP.polymorphism.Overloading;




public class MainClass {
    
    public static void main(String[] args) {
        
        Developer dev = new Developer();
        System.out.println(dev.sum(10, 15));
        System.out.println(dev.sum(10, 20, 30));
        
        
        
        
    }
    
}

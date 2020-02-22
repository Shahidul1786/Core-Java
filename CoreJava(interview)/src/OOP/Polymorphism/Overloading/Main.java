/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP.Polymorphism.Overloading;

/**
 *
 * @author Shahidul
 */
public class Main {
    
    public static void main(String[] args) {
        
        Developer d = new Developer();
        System.out.println("sum = "+d.sum(10, 15));
        System.out.println("sum = "+d.sum(10, 15,20));
    }
    
}

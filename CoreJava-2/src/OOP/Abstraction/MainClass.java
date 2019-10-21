/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP.Abstraction;




public class MainClass {
    
    public static void main(String[] args) {
        
       AndroidDev androidDev = new AndroidDev();
       
        System.out.println("Total salary = "+androidDev.getSalary());
        
        WebDev dev = new WebDev();
        System.out.println("Total salary ="+dev.getSalary());
        
    }
    
}

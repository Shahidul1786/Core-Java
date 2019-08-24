/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UpCastingAndDownCasting;

/**
 *
 * @author Shahidul
 */
public class Main {
    
    public static void main(String[] args) {
        
        //UPCASTING: parent class and child class er modhe je gulo common show korbe or neoa jabe;
        
        Developer developer = new AndroidDev();
        
        System.out.println("Total salary = "+developer.getSalary());
        
        Developer d = new WebDev();
        
         System.out.println("Total salary = "+d.getSalary());
         
        
        
       // AndroidDev androidDev = new AndroidDev();
        //System.out.println(androidDev.getBonus());
        
        //DOWNCASTING: parent class contains in child reference;
        
        AndroidDev ad = (AndroidDev) developer;
        
        System.out.println("Total salary = "+ad.getSalary());
        
    }
    
}

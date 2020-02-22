/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP.Abstraction;

/**
 *
 * @author Shahidul
 */
public class Main {
    
    public static void main(String[] args) {
        AndroidDev ad = new AndroidDev();
        System.out.println("total salary = "+ad.getTotalSalary());
        
        WebDev wd = new WebDev();
        System.out.println("total salary = "+wd.getTotalSalary());
    }
    
}

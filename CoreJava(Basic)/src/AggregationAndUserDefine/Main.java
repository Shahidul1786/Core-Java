/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AggregationAndUserDefine;

import java.util.ArrayList;
import java.util.List;


public class Main {
    
    public static void main(String[] args) {
        
        Address ad1 = new Address("Dhanmondi", "Dhaka", "BD");
        Address ad2 = new Address("Banani", "Dhaka", "BD");
        
        
        Employee emp1 = new Employee(100, "shahidul", ad1);
        Employee emp2 = new Employee(101, "nazmul", ad2);
        
        emp1.Display();
        emp2.Display();
        
      
       
        
        
    }
    
    
    
}

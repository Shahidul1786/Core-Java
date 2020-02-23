/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HashMapDemo;

import java.util.HashMap;

/**
 *
 * @author Shahidul
 */
public class Customer {
    
    public static void main(String[] args) {
        
        HashMap<Integer,String> customer = new HashMap<>();
        customer.put(100, "shahidul");
        customer.put(101, "taj");
        customer.put(102, "naz");
        customer.put(103, "kohi");
        
        System.out.println(customer.get(100)+" "+customer.get(102));
        
    }
    
}

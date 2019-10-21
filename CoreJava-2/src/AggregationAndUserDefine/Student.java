/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AggregationAndUserDefine;

/**
 *
 * @author Shahidul
 */
public class Student {
    
    int id;
    String name;
    Address address;

    public Student(int id, String name, Address address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }
    
    
    
    
    void display(){
        
        System.out.print(id+" "+name);
        System.out.print(address.thana+" "+address.city+" "+address.country);
    }
    
}

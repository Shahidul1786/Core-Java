/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConstructorChaining;

/**
 *
 * @author Shahidul
 */
public class Student {
    
    int id;
    String name;
    String email;
    String phoneNumber;
    String subject;
    String address;
    
    public Student() {
    }
    
    public Student(int id, String name, String email, String phoneNumber, String subject) {
        
        //Constructor Chaining;
        
        this(); // default Constructor;
        
        this.id = id;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.subject = subject;
    }
    
    public Student(int id, String name, String email, String phoneNumber, String subject, String address) {
        
       //Constructor Chaining;
        
        
        this(id, name, email, phoneNumber, subject);  //Parameterize Constructor;
        
        this.address = address;
    }
    
}

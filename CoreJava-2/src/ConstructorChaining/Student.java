/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConstructorChaining;


public class Student {
    int id;
    String name;
    String email;
    String address;

    public Student() {
    }

    public Student(int id, String student, String email) {
        this();
        this.id = id;
        this.name = student;
        this.email = email;
    }

    public Student(int id, String name, String email, String address) {
        
        this(id, name, email);
        this.address = address;
    }
    
    
}

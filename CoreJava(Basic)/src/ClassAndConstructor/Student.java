/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassAndConstructor;

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

    public Student() {
    }

    public Student(int id, String name, String email, String phoneNumber, String subject) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.subject = subject;
    }
    
    
    
}

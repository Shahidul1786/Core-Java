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
public class Main {
    
    public static void main(String[] args) {
        
        Student student  = new Student(100, "taj", "tj@gmail.com", "0185545644", "C#", "ghior");
        
        System.out.println(student.id + " "+student.name+" "+student.email+" "+student.phoneNumber+" "+student.subject+" "+student.address);
        
        
    }
    
}

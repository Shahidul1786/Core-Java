/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP.Encapsulation;

/**
 *
 * @author Shahidul
 */
public class Main {
    
    public static void main(String[] args) {
        
        Student student = new Student();
        student.id=100;
        //after setter& getter method
        student.setName("shahid");
        student.setSubject("java");
        
        System.out.println(student.id+" "+student.getName()+" "+student.getSubject());
       
    }
    
}

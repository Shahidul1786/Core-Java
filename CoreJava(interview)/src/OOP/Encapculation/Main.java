/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP.Encapculation;

/**
 *
 * @author Shahidul
 */
public class Main {
    public static void main(String[] args) {
       
        Student s1 = new Student();
        s1.setId(100);
        s1.setName("shahid");
        s1.setEmail("st@gmail.com");
        System.out.println("id = "+s1.getId());
        System.out.println("name = "+s1.getName());
        System.out.println("email = "+s1.getEmail());
       
        
    }
    
}

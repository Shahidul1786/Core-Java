/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP.Polymorphism.Encapsulation;


public class Main {

    public static void main(String[] args) {
        Student s = new Student();
        s.setId(1001);
        s.setName("Shahid");
        s.setSubject("java");
        System.out.println(s.getId() + " " + s.getName() + " " + s.getSubject());

        Student s2 = new Student();
        s2.setId(101);
        s2.setName("Taj");
        s2.setSubject("C#");
        System.out.println(s2.getId() + " " + s2.getName() + " " + s2.getSubject());

        
    }

}

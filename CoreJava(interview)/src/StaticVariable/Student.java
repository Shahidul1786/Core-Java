/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StaticVariable;

/**
 *
 * @author Shahidul
 */
public class Student {
    
    int roll;
    String name;
    static String college = "Debenda college";
    static Double  fee = 5000.00;
    
     //static variable er kno object or constructor create korte hoy na;

    public Student(int r, String n) {
        this.roll = r;
        this.name = n;
    }
    
    
    void display(){
        
        System.out.println("roll : "+roll);
         System.out.println("name : "+name);
          System.out.println("college : "+college);
           System.out.println("fee : "+fee);
    }
    
    public static void main(String[] args) {
         Student s1 = new Student(1, "shahidul");
         Student s2 = new Student(2, "taj");
         
         s1.display();
         Student.college="Dhaka University"; //value change kora jay and porer value e thake;
         Student.fee=8000.00;
         
         s1.display(); // object create korte hoy na tai storage save hoy;
         
         s2.display();
         
         
         
         
    }
    
    
    
    
}

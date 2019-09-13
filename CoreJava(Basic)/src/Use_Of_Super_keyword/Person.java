/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Use_Of_Super_keyword;

/**
 *
 * @author Shahidul
 */
public class Person {
    
    String name,address;
    int age;

    public Person(String name, String address, int age) {
        this.name = name;
        this.address = address;
        this.age = age;
    }
    
    
    
}

class Employee extends Person{
    
    float salary ;

    public Employee(float salary, String name, String address, int age) {
        
        
        super(name, address, age);
        this.salary = salary;
    }
    
    
   
    }



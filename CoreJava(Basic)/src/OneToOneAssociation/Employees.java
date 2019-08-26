/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OneToOneAssociation;

/**
 *
 * @author Shahidul
 */
public class Employees {
    
    public double salary;
    public String name;

    public Employees() {
    }

    public Employees(double salary, String name) {
        this.salary = salary;
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

  
    
    
    
}

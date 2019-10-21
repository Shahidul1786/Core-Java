/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP.Abstraction;



/**
 *
 * @author Shahidul
 */
public class AndroidDev extends Developer{
    
    double salary=50000;
    double bonus = 10000;

    @Override
    public double getSalary() {
    
        return salary+bonus;
    }
    
    
}

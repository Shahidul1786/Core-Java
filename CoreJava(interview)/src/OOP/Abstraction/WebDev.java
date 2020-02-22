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
public class WebDev extends Developer{
    
    int salary = 35000;
    int bonus = 3500;

    @Override
    public int getTotalSalary() {
       
        return salary+bonus;
    }
    
    
}

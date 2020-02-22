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
    
    int salary = 50000;
    int bonus = 10000;

    @Override
    public int getTotalSalary() {
       
        return salary+bonus;
    }

  

  
    
    
    
    
}

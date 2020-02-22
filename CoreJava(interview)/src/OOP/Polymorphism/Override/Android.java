/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP.Polymorphism.Override;

/**
 *
 * @author Shahidul
 */
public class Android extends Developer{
    
    int bonus = 15000;

    @Override
    public int getSalary() {
       int totalsalary = super.getSalary()+bonus;
        return totalsalary; //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}

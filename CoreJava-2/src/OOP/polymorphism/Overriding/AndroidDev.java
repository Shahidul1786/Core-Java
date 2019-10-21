/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP.polymorphism.Overriding;





/**
 *
 * @author Shahidul
 */
public class AndroidDev extends Developer{
    
    double bonus=15000;
    
    
    @Override
    public double getSalary(){
        double mainSalary = super.salary+bonus;
        
        return mainSalary;
    }
    
    
}

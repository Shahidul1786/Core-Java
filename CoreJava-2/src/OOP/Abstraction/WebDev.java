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
public class WebDev  extends Developer{
    
     double salary=40000;
    double bonus = 8000;

    @Override
    public double getSalary() {
        return salary+bonus;
    }
    
}

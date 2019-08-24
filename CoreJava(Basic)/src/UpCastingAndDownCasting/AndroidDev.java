/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UpCastingAndDownCasting;

/**
 *
 * @author Shahidul
 */
public class AndroidDev extends Developer{
    
    int bonus = 15000;

    @Override
    public int getSalary() {
        return super.getSalary()+ bonus; //To change body of generated methods, choose Tools | Templates.
    }
    
    public int getBonus(){
        return bonus;
    }
    
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BreakAndContinueStatement;

/**
 *
 * @author Shahidul
 */
public class ContinueStatement {
    
    public static void main(String[] args) {
        
        for (int i = 1; i <=20; i++) {
            
            if (i ==10) {
                continue;// condition match hole loop a fire jabe and conditional value skip korbe
                
            }
            System.out.println(i);
            
        }
    }
    
}

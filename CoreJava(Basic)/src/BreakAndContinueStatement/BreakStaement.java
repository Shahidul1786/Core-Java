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
public class BreakStaement {
    
    public static void main(String[] args) {
        
        for (int i =2; i < 10; i=i+2) {
            
            if (i==8) {
                
                break;
                
            }
            System.out.println(i);
            
        }
    }
    
    
    
}

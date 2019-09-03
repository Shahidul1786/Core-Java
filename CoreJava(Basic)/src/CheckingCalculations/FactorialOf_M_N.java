/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CheckingCalculations;

import java.util.Scanner;

/**
 *
 * @author Shahidul
 */
public class FactorialOf_M_N {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int num,fact = 1;
        
        System.out.println("Enter positive number : ");
        
        num =sc.nextInt();
        
        for (int i = num; i>= 1;i--) {
            
            fact = fact*i;
            
            
        }
        
        System.out.println("Factorial of "+num+" is : "+fact);
    }
    
}

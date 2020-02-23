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
public class PrimeNumber {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a positive number : ");
        
        int a  = sc.nextInt();
        int c = 0;
        
        for (int i = a; i >= 1; i--) {
            
            if (a%i ==0) {
                c++;
                
            }  
        }
        
        if (c==2) {
            System.out.println("Number is prime");
            
        }
        else{
              System.out.println("Number is not prime");
        }
        
    }
    
}

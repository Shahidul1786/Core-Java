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
public class FibonacciDemo {
    
    public static void main(String[] args) {
        
        Scanner sc  = new Scanner(System.in);
        
        System.out.println("Enter a positive number : ");
        int n = sc.nextInt();
        
        int first = 0;
        int second = 1;
        
        int fib;
        
        System.out.print(first+" "+second);
        
        for (int i = 3; i <=n; i++) {
            
            fib= first+second;
            
            System.out.print(" "+fib);
            
            first = second;
            second = fib;
            
            
        }
        System.out.println("");
        
    }
    
}

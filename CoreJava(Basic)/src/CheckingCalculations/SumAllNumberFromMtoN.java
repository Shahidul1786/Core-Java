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
public class SumAllNumberFromMtoN {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = 0;
        int m, n;

        System.out.println("Enter initial number : ");

        m = sc.nextInt();

        System.out.println("Enter final number : ");

        n = sc.nextInt();
        
        for (int i = m; i <= n; i++) {
            
            if (i%2==0) {
               sum = sum+i;
               
                System.out.print(" "+i);
            }
            
           
            
        }
        
        System.out.println("");
        System.out.println("sum is : "+sum);
    }

}

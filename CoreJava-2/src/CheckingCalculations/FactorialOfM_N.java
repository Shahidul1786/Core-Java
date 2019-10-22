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
public class FactorialOfM_N {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int fact = 1;
        int num = 1;

        System.out.println("Enter positive numer : ");
        num = sc.nextInt();

        for (int i = num; i >= 1; i--) {

            fact = fact * i;

        }
        
        System.out.println("factorial  : "+num+" is "+fact);
    }

}

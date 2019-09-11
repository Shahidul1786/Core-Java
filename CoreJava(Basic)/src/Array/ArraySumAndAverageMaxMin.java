/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Array;

import java.util.Scanner;

/**
 *
 * @author Shahidul
 */
public class ArraySumAndAverageMaxMin {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double sum = 0;
        double average = 0;

        double[] number = new double[5];

        System.out.println("Enter five number :");

        // for input number
        for (int i = 0; i < number.length; i++) {

            number[i] = sc.nextDouble();

        }

        //for sum of number
        for (int i = 0; i < number.length; i++) {

            sum = sum + number[i];

        }

        //sum = number[0]+number[1]+number[2]+number[3]+number[4];
        System.out.println("The sum is : " + sum);

        average = sum / number.length;

        System.out.println("Average is  :" + average);
        
        
        double max = number[0];
        double min = number[0];
        
        for (int i = 1; i < number.length; i++) {
            
            if (max < number[i]) {
                
                max = number[i];
                
            }
            
             if (min > number[i]) {
                
                min = number[i];
                
            }
            
        }
        
        System.out.println("Maximum : "+max);
        System.out.println("Minimum : "+min);
       

    }

}

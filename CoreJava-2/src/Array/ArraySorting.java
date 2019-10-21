/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Array;

import java.util.Arrays;

/**
 *
 * @author Shahidul
 */
public class ArraySorting {
    
    public static void main(String[] args) {
        
          int[] number = {10, -3, 18, 5, 25};
          
          Arrays.sort(number);
          
        System.out.println("Acending : ");

        for (int i = 0; i < 5; i++) {

            System.out.print(" " + number[i]);

        }
        
        
        
        System.out.println("decending : ");

        for (int i = 4; i>=0; i--) {

            System.out.print(" " + number[i]);

        }
          
          
    }
    
}

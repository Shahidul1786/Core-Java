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
        
        int [] number = {10,-2,15,99,22};
        
        Arrays.sort(number);
        
         System.out.println("acending :");
        
//        System.out.println(" ascending : "+number.length);

        for (int i = 0; i <5; i++) {
            
            System.out.println(" "+number[i]);
            
        }
        
        System.out.println("decending :");
        
        for (int i = 4; i >=0; i--) {
            
            System.out.println(" "+number[i]);
            
        }
        
        
    }
    
}

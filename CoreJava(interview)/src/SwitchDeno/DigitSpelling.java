/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SwitchDeno;

import java.util.Scanner;

public class DigitSpelling {
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         
         int digit;
         
         System.out.println("Enter digit : ");
         digit = sc.nextInt();
         
         switch(digit){
             
             case 0:
                 System.out.println("zero");
                 break;
                 case 01:
                 System.out.println("one");
                 break;
                 case 2:
                 System.out.println("two");
                 break;
                 case 3:
                 System.out.println("three");
                 break;
                 default:
                     System.out.println("no digit");
                     

         }
         
         
         
        
    }
    
}

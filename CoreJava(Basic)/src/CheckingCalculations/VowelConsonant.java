/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CheckingCalculations;

import java.util.Scanner;
import jdk.nashorn.internal.parser.TokenType;

/**
 *
 * @author Shahidul
 */
public class VowelConsonant {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       
       char ch;
       
        System.out.println("Enter any chracter : ");
        
        ch = sc.next().charAt(0);
        
        if (ch == 'a' || ch == 'A') {
            
            System.out.println("Vowel");
            
        } else if(ch == 'e' || ch == 'E') {
            System.out.println("Vowel");
            
            
        }
        else if(ch == 'i' || ch == 'I') {
            
           System.out.println("Vowel"); 
        }
        else if(ch == 'o' || ch == 'O') {
            
           System.out.println("Vowel"); 
        }
        else if(ch == 'u' || ch == 'U') {
            
          System.out.println("Vowel");  
            
        }else{
            System.out.println("Consonant");
        }
        
        
        
        
    }
    
}

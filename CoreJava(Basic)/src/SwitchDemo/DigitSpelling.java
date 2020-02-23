
package SwitchDemo;

import java.util.Scanner;


public class DigitSpelling {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int digit;
        System.out.println("Enter digit :");
        
        digit =sc.nextInt();
        
        switch(digit){
            
            case 0:
                System.out.println("Zero");
                break;
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("two");
                break;
            case 3:
                System.out.println("three");
                break;
            case 4:
                System.out.println("four");
                break;
            case 5:
                System.out.println("five");
                break;
            default:
                System.out.println("Not a digit");
                
                 
        }
    }
    
    
    
}


package CheckingCalculations;

/**
 *
 * @author Shahidul
 */
public class FactorialUsingRecursive {
    
    int fact(int n){
        
        if (n==1) {
            return 1;
            
        }else{
            
            return n*fact(n-1);
        }
         
    }
    
    public static void main(String[] args) {
        
        FactorialUsingRecursive ob = new FactorialUsingRecursive();
        
        int result = ob.fact(5);
        
        System.out.println("Factorial of 5 is : "+result);
        
        result = ob.fact(4);
        
        System.out.println("Factorial of 4 is : "+result);
        
    }
    
}

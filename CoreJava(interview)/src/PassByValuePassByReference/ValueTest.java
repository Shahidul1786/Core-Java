/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PassByValuePassByReference;

public class ValueTest {
    
    public static void main(String[] args) {
        
        PassByValue byValue = new PassByValue();
        
        int x = 10;
        
        System.out.println("x before call : "+x);
        
        byValue.change(x);
        System.out.println("x after call : "+x);
        
    }
    
}

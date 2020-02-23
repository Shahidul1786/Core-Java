/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PassByValuePassByReference;

/**
 *
 * @author Shahidul
 */
public class referenceTest {
    public static void main(String[] args) {
        
        PassByReference reference = new PassByReference();
        reference.name="taj";
        System.out.println("before call : "+reference.name);
        
        reference.change(reference); // value change
        
         System.out.println("after call : "+reference.name);
        
        
    }
    
}

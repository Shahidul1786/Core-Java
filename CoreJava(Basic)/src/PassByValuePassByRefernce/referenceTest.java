/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PassByValuePassByRefernce;

/**
 *
 * @author Shahidul
 */
public class referenceTest {
    
    public static void main(String[] args) {
        
        PassByreference r1  = new PassByreference();
        r1.name = "taj";
        
        System.out.println(" before call : "+r1.name);
        
        r1.change(r1);// value cahnge
        
        System.out.println("after call : "+r1.name);
        
    }
    
}

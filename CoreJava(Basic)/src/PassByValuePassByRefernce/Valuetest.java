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
public class Valuetest {
    
    public static void main(String[] args) {
        
        PassByValue pv = new PassByValue();
        
        int x = 10; //primitive value not change
        
        System.out.println("X before call : "+x);
        
        pv.change(x);// value not change
        
        System.out.println("x after call : "+x);
    }
    
}

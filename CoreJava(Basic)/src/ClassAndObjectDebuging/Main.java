/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassAndObjectDebuging;

/**
 *
 * @author Shahidul
 */
public class Main {
    
    public static void main(String[] args) {
        
        // Data debuging : by step over= step by step debug and by step into inside code debug;
        
        User user = new User();
        user.firstName = "MD.";
        user.middleName = "Shahidul";
        user.lastName = "Islam";
        
        String fullName = user.getFullName();
        
        System.out.println(fullName);
        
    }
    
}

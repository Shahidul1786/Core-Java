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
public class User {
    
    // parameterize constructor sara data get kora jay by public data type and method;
    
   public String firstName;
   public String middleName;
   public String lastName;
        
    
   
   public String getFullName(){
       
       return firstName+" "+middleName+" "+lastName;
   }
    
}

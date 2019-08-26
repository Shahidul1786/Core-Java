/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArrayListOFUserDefine;


public class Person {
    
    public String firstName;
    public String MiddleName;
    public String lastName;
    public Address personAddress;
    
    public String getFullName (){
        
        return firstName+" " +MiddleName+" " +lastName;
    }
    
}

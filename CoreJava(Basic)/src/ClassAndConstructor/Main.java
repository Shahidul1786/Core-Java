/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassAndConstructor;


public class Main {
    
    public static void main(String[] args) {
     Student st =   new Student(100, "shahid", "st@gmail.com", "01757941255", "java");
     
        System.out.println(st.id+" "+st.name+" "+st.email+" "+st.phoneNumber+" "+st.subject);
        
        
    }
    
}

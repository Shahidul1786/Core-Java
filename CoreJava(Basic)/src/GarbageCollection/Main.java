/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GarbageCollection;

/**
 *
 * @author Shahidul
 */
public class Main {
    
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new  Student();
        
        //set data
        s1.setData(5, 7);
        s2.setData(10, 12);
        //show data
       // s1.showData();
        s2.showData();
        
        Student s3;
        
        //s1 is eligible for Garbage collection
        
        s3 = s1;
        
       // s3.showData();
        s1 = null; //    -----Garbage collection-----
       // s1.showData();
        
        s3.showData();
        
    }
    
}

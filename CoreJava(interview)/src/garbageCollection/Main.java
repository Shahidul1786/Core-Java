/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package garbageCollection;

/**
 *
 * @author Shahidul
 */
public class Main {
    
    public static void main(String[] args) {
        
        Student s1 = new Student();
        Student s2 = new Student();
        
        s1.setData(10, 20);
        s2.setData(100, 200);
        
        s1.showData();
        s2.showData();
        
        Student s3;
        
        s3 = s1; //s1 is eligible for garbage collection;
        s1=null; //Garbage collection
        
        s3.showData();
        
        
    }
    
}

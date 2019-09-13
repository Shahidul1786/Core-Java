/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package String_StringBuffer_StringBuilder;

/**
 *
 * @author Shahidul
 */
public class StringDemo {
    public static void main(String[] args) {
        
        String s = " Shahidul islam";
        
        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());
        System.out.println(s.trim());
        System.out.println(s.startsWith("ha"));
        System.out.println(s.endsWith("m"));
        System.out.println(s.trim().charAt(0));
        System.out.println(s.charAt(5));
        System.out.println(s.length());
        
        
        // je kono type theke String a convert kore;
        int a = 10;
        
        String s1 = String.valueOf(a);
        System.out.println(s1+10);
        
        
        String s2 = "java is a programming language";
        
        System.out.println(s2.replaceAll("java", "C#"));
        
        
        
        
    }
    
}

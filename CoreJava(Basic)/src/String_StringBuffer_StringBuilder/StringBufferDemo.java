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
public class StringBufferDemo {

    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer("Hello ");
        sb.append("Java");

        System.out.println(sb);//print Hello Java;

        sb.insert(0, "Java ");

        System.out.println(sb);//print Java Hello java;Store According to index;

        sb.replace(1, 3, "Red");

        System.out.println(sb);//print JReda Hello Java;
        
        sb.delete(1, 3);

        System.out.println(sb);//print Jda Hello Java;
        
        sb.reverse();

        System.out.println(sb);//print avaJ olleH adJ;
        

    }

}

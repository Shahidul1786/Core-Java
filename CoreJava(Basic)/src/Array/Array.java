/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Array;

/**
 *
 * @author Shahidul
 */
public class Array {
    
    
    public static void main(String[] args) {
        int[] number = new int[5];
        number[0] = 10;
        number[1] = 20;
        number[2] = 30;
        number[3] = 40;
        
       int size = number.length;
       
        System.out.println(" size : "+size);
        
        int sum = number[0]+number[1]+number[2]+number[3];
        
        System.out.println("sum : "+sum);
    }
}

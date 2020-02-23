/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Shahidul
 */
public class ArrayListSorting {
    
    public static void main(String[] args) {
        
        List<Integer> number = new ArrayList<>();
        number.add(10);
        number.add(50);
        number.add(30);
        number.add(-2);
        number.add(11);
        number.add(99);
        
        System.out.println(" before sorting: "+number.get(1));
        
        Collections.sort(number);
         System.out.println(" after ascending sorting: "+number);
         Collections.sort(number, Collections.reverseOrder());
         
         System.out.println(" after descending sorting: "+number);
        
    }
    
}

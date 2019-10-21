/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javafx.print.Collation;

/**
 *
 * @author Shahidul
 */
public class ArrayListSorting {
    
    public static void main(String[] args) {
        
        List<Integer> number = new ArrayList<>();
        number.add(10);
        number.add(15);
        number.add(-9);
        number.add(30);
        number.add(-12);
        
        System.out.println("before sorting"+number);
        System.out.println("before sorting"+number.get(0));
        
        Collections.sort(number);
        
        System.out.println("after sorting acending"+number);
        Collections.sort(number, Collections.reverseOrder());
        
        System.out.println("after sorting data desending" +number);
    }
    
}

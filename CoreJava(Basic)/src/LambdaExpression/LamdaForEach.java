/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LambdaExpression;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Shahidul
 */
public class LamdaForEach {
    
    public static void main(String[] args) {
        
        List<Integer> values = Arrays.asList(4,5,6,7);
        
        values.forEach(i-> System.out.println(i)); //Lamda expression
    }
    
    
    
}

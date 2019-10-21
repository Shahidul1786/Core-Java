
package Array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class ArrayListSorting {
    
    public static void main(String[] args) {
        List<Integer> number = new ArrayList<>();
        number.add(10);
        number.add(5);
        number.add(-3);
        number.add(92);
        number.add(27);
        number.add(0);
        
        System.out.println("before sorting : "+number.get(0));
        
        Collections.sort(number);
        
        System.out.println("After sorting Ascending : "+number);
        
        Collections.sort(number,Collections.reverseOrder());
        
          System.out.println("After sorting Descending : "+number);
        
    }
    
}

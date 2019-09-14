
package HashMapDemo;

import java.util.HashMap;


public class Customer {
    
    public static void main(String[] args) {
        
        //put & get
        
       HashMap<Integer,String> customer = new HashMap<>();
       
       //key er under a value store kore
       customer.put(100, "Shahid");
       customer.put(101, "Taj");
       customer.put(102, "Fazar");
       customer.put(103, "Kohinur");
       customer.put(104, "Rina");
       
        System.out.println(customer.get(100)+" "+customer.get(101)+" "+customer.get(102));
    }
    
}

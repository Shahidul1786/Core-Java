/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NewDateTime;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;

/**
 *
 * @author Shahidul
 */
public class NewDateTimeDemo {
    
    public static void main(String[] args) {
        
//        LocalDate d = LocalDate.of(1988, Month.NOVEMBER, 10);
//        System.out.println(d);

//        LocalTime d = LocalTime.now();
//        System.out.println(d);

//        for(String s : ZoneId.getAvailableZoneIds())
//        {
//            
//            System.out.println(s);
//        }
        
         LocalTime d = LocalTime.now(ZoneId.of("GMT"));
       System.out.println(d);

    }
    
    
    
}

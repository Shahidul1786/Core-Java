/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArrayListOFUserDefine;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Address address1 = new Address();
        address1.district = "Dhaka";
        address1.houseNo = "270/5";
        address1.roadNo = "8/A";
        address1.sector = "15";
        address1.thana = "Dhanmondi";
        
        System.out.println(address1.houseNo);

        Address address2 = new Address();
        address2.district = "Dhaka";
        address2.houseNo = "209/3";
        address2.roadNo = "11/A";
        address2.sector = "19";
        address2.thana = "Mirpur";

        Person person1 = new Person();
        person1.firstName = "Md.";
        person1.MiddleName = "Shahidul";
        person1.lastName = "Islam";
        person1.personAddress = address1;

        Person person2 = new Person();
        person2.firstName = "Md.";
        person2.MiddleName = "Imran";
        person2.lastName = "hosen";
        person2.personAddress = address2;
        
        List<Person> personlist = new ArrayList<>();
        
        personlist.add(person1);
        personlist.add(person2);
        
        for (Person person : personlist) {
            
            
            System.out.println(person.getFullName());
            System.out.println(person.personAddress.houseNo+" "+person.personAddress.roadNo+" "+person.personAddress.sector+" "+person.personAddress.thana);
            
        }
    }

}

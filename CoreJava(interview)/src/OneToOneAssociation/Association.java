/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OneToOneAssociation;

/**
 *
 * @author Shahidul
 */
public class Association {
    
    public static void main(String[] args) {
        
        Bank bank = new Bank("bangladesh bank");
        
        Branch branch = new Branch("Dhanmondi");
        
        Employee employee = new Employee("Md.Shahidul islam",50000.00);
        
        System.out.println("bank : "+bank.bankName);
        System.out.println("branch : "+branch.branchName);
        System.out.println("employee name: "+employee.name);
        System.out.println("employee salary: "+employee.salary);
        
    }
}

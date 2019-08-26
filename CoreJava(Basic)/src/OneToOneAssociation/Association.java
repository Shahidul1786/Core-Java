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
        Bank bank = new Bank("sonali bank Ltd.");
        Branch branch = new Branch("Dhanmondi-15");
        
         Employees employees1 = new Employees(25000.00,"MD.Shahidul Islam");
        
     
        
        System.out.println("Bank name is "+bank.bankName+" brach name is "+branch.branchName+" employee name is "+employees1.name+" salary is "+employees1.salary);
        
    }
    
}

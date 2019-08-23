
package OOP.Polymorphism.Override;


public class AndroidDev extends Developer{
    
    int bonus = 10000;

    @Override
    public int getSalary() {
        int mainSalary = super.getSalary()+ bonus;
        
            return mainSalary; //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
}

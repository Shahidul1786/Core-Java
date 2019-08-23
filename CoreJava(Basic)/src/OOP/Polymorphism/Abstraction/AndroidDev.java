
package OOP.Polymorphism.Abstraction;


public class AndroidDev extends Developer{
    
    int salary = 40000;
    int bonus = 10000;

    @Override
    public int getSalary() {
        return salary+bonus;
    }

  
    
    
    
}

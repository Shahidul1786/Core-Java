
package OOP.Polymorphism.Abstraction;


public class WebDev extends Developer{
    
 private int  salary = 35000;
 private int  bonus = 10000;

    @Override
    public int getSalary() {
       return salary+bonus;
    }

  
 
    
}

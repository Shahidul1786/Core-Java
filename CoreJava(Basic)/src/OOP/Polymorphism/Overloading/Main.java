
package OOP.Polymorphism.Overloading;

public class Main {
    
    public static void main(String[] args) {
        
        Developer d = new Developer();
        System.out.println(d.sum(5, 10));
        System.out.println(d.sum(5, 10, 15));
        
    }
    
}

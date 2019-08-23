
package OOP.Polymorphism.Abstraction;


public class Main {
    
    public static void main(String[] args) {
        AndroidDev androidDev  = new AndroidDev();
        System.out.println("Total salary = "+androidDev.getSalary());
        
        WebDev dev = new WebDev();
        System.out.println("Total salary = "+dev.getSalary());
    }
    
}


package Interface;


public class Demo  implements FirstInterface,SecondInterface{

    @Override
    public void myMethod() {
        
        System.out.println("First Interface...");
        
    }

    @Override
    public void MyOtherMethod() {
        
        System.out.println("Second Interface...");
        
    }
        
    
}

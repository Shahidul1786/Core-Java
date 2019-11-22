
package LambdaExpression;

interface A {
    
    void show(int i);
}

//class xyz implements A{
//    public void show(){
//        System.out.println("hello");
//    }
//}

public class LamdaDemo {
    
    public static void main(String[] args) {
        
//        A obj;
//        obj = new xyz(){
//          public void show(){
//        System.out.println("hello");
//    }  
//        };


        A obj;
//        obj = new A(){
//          public void show(){
//        System.out.println("hello");
//          }  
//        };

       //obj = (int i)->System.out.println("hello"+"="+i);
       obj =  i->System.out.println("hello"+"="+i);

        
        obj.show(6);
    }
    
}

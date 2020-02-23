
package StaticVariable;

public class Student {

    int rollNo;
    String name;
    static String college = "Debenda";
    static double fee = 2000.0;
    
    
    //static variable er kno object or constructor create korte hoy na;

    public Student(int r, String n) {
        this.rollNo = r;
        this.name = n;
    }

    void Display() {

        System.out.println(rollNo + " " + name + " " + college + " " + fee);
    }

    public static void main(String[] args) {
        Student s1 = new Student(1, "shahidul");
        Student s2 = new Student(2, "Firoj");

        
        
        Student.college = "Dhahka university";
        
        //value change kora jay and porer value e thake;
        
        Student.fee = 2500.0;
        s1.Display();

        //Student.fee = 1900.0;
        s2.Display();
        
        // object create korte hoy na tai storage save hoy;

    }

}

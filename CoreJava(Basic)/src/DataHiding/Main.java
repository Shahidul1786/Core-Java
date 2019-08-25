
package DataHiding;


public class Main {
    
    public static void main(String[] args) {
        
        // when user create setter method, menually data set not need;
        
       // Student student = new Student(100, "shahid", "st@gmail.com", "017570000", "java", "dhanmondi-15");
       
       Student student2 = new Student();
       
       
       student2.setId(100);
       student2.setName("shahid");
       student2.setEmail("st@gmail.com");
       student2.setPhoneNumber("01757000");
       student2.setSubject("java");
       student2.setAddress("dhanmondi-15");
       
        
        System.out.println(student2.id);
        System.out.println(student2.name);
        System.out.println(student2.email);
        System.out.println(student2.phoneNumber);
        System.out.println(student2.subject);
        System.out.println(student2.address);
        
        
        
    }
    
}

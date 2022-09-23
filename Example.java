package pack1;
import pack2.Student;
public class Example {
    public static void main(String[] args) {
        
    
    Student s1= new Student();
    s1.rollno(111);
    s1.name("Shiva");
    //s1.getRollNo();
    //s1.getName();
    System.out.println("rollno. is " + s1.RollNo());
    System.out.println("name is " + s1.Name());
    }
}

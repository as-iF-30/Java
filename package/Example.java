package pack1;
import pack2.Student;
public class Example
{
  public static void main(String []args)
 {
   Student s1=new Student();
   s1.setro(4);
   s1.setna("Asif");
   System.out.println("Roll-"+s1.showro());
   System.out.println("Name-"+s1.showna());
 }
   
}
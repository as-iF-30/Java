import java.util.*;
interface Student
{
void Display_Grade();
void Attendance();
}
class PG implements Student
{
 Scanner s =new Scanner (System.in);
 String g; 
int a;
 public void get_grade()
{
  System.out.println("Enter Grade for PG:");
  g=s.nextLine();
}
public void Get_Attendance()
{
  System.out.println("Enter Attendance of PG:");
  a=s.nextInt();
}
public void Display_Grade()
{
 System.out.println("Grade for PG:"+g);
}
public void Attendance()
{
System.out.println("Attendance of PG:"+a+"%");
}
}
class UG implements Student
{
 Scanner s0 =new Scanner (System.in);
String g; 
int a;
public void get_grade()
{
  System.out.println("Enter Grade for UG:");
  g=s.nextLine();
}
public void Get_Attendance()
{
  System.out.println("Enter Attendance of UG:");
  a=s.nextInt();
}
public void Display_Grade()
{
 System.out.println("Grade for UG:"+g);
}
public void Attendance()
{
System.out.println("Attendance of UG:"+a+"%");
}
}
public class UQ8
{
public static void main(String []args)
{
  PG o1=new PG();
 o1.get_grade();
 o1.Get_Attendance();
 UG o2=new UG();
o2.get_grade();
 o2.Get_Attendance();
 System.out.println( );
 System.out.println("****Display****");
o1.Display_Grade();
o1.Attendance();
o2.Display_Grade();
o2.Attendance();
}
}
import java.util.*;
class Rectangle
{
Rectangle()
{
System.out.println("\n****Enter specification for RECTANGLE****");
 color();
 set_length();
 set_width();
  find_area();
}
int w,l;
double a;
String c;
Scanner s =new Scanner(System.in);
public void color()
{
 System.out.println("Enter color:");
 c=s.nextLine();
}
public void set_length()
{
 System.out.println("Enter length:");
  l=s.nextInt();
}
public void set_width()
{
 System.out.println("Enter width:");
  w=s.nextInt();
}
public void find_area()
{
  a=w*l;
 System.out.println("Area:"+a);
}
}
public class UQ4
{
public static void main(String []args)
{
Rectangle o1=new Rectangle();
Rectangle o2= new Rectangle();
if(o1.a==o2.a&&(o1.c).equalsIgnoreCase(o2.c))
{
 System.out.println("Matching Rectangles");
}
else
{
 System.out.println("Non Matching Rectangles");
}
}
}
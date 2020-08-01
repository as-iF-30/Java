class A 
{
static int y=4;
public static void f1()
{
System.out.println("A1");
}
}
class B extends A
{
static int y=5;//it will hide data;
static
{
y=6;
}
public static void f1()
{
System.out.println("Data hide");
}
}
public class Stinheritance
{
public static void main(String[] args)
{
 B.f1();
B o1=new B();
o1.f1();
System.out.println(B.y);
}
}
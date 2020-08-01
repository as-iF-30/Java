class A
{
int a;
 public A(int x)
{
a=x;
System.out.println("A");
}
}
class B extends A
{
int b;
public B()
{
this(4);
System.out.println("B");
}
public B(int y)
{
super(6);
System.out.println(y);
}
}
public class Cinheritance
{
public static void main(String[]  args)
{
B o1=new B();
}
}
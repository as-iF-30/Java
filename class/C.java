import java.util.*;
class A
{
public void H()
{
System.out.println("Hello");
}
}
class B
{
A a=new A()
{
public void H()
{
System.out.println("Hi");
}
};
}
public class C
{
public static void main(String []args)
{
B b=new B();
b.a.H();
}
}

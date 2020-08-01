interface I1
{
void f1();
}
interface I2 extends I1
{
void f2();
}
class A implements I2
{
public void f1()
{
 System.out.println("F1");
}
public void f2()
{
 System.out.println("F2");
}
public void f3()
{
System.out.println("A");
}
}
public class Interface
{
public static void main(String []args)
{
I1 o1=new A();
o1.f1();
//o1.f2();
//o1.f3();
}
}

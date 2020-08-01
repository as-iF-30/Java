class  A
{
int z;
public void f1()
{
System.out.println("A"+z);
}
}
class B extends A
{
int z;
public void f1()
{
 System.out.println("B");
 super.f1();
}
public void f2()
{
int z;
z=2;
this.z=3;
super.z=4;
}
}
public class Super
{
public static void main(String[] args)
{
B o1=new B();
o1.f1();
o1.f2();
o1.f1();
}
}
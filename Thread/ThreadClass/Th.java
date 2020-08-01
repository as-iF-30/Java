class A extends Thread
{
public void  run()
{
int i;
for(i=1;i<10;i++)
{
System.out.println("ThreadA"+i);
}
}
}
class B extends Thread
{
public void run()
{
int i;
for(i=1;i<10;i++)
{
System.out.println("ThreadB"+i);
}
}
}
public class Th
{
public static  void main(String []args)
{
A o1=new A();
B o2=new B();
o1.start();
o2.start();
}
}

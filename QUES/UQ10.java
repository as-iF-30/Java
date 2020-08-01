class A extends Thread
{
public void run()
{
for(int i=1;i<=50;i++)
{
 System.out.print(3*i+" ");
 if(i%5==0)
 {
 	try
{
	Thread.sleep(100);
}
catch(Exception e)
 	{}
 }
}
}
}
class B extends Thread
{
public void run()
{
for(int j=1;j<=50;j++)
{
System.out.print(5*j+" ");
if(j%5==0)
{
	try
{
 Thread.sleep(100);
}
catch(Exception e)
{}
System.out.println();
}
}
}
}
public class UQ10
{
public static void main(String []args)
{
A o1=new A();
B o2=new B();
o1.start();
o2.start();
}
}

System.out.println
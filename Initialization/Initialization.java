public class Initialization
{
private int x;
{
System.out.println("instance block"+x);
x=5;
}
public Initialization()
{
System.out.println("constructor"+x);
}
public static void main(String[] args)
{
 Initialization i1=new Initialization();
 Initialization i2=new Initialization();
}
}
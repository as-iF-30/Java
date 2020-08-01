public class Excep2
{
public static void main(String []args)
{
int b=5000;
int w=6000;
try
{
if(b<w)
{
throw new ArithmeticException("chl gya");
}
b=b-w;
System.out.println("hi");
}
catch(ArithmeticException e)
{
System.out.println("yo:"+e.getMessage());
}
System.out.println("cont....");
}
}
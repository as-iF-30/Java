public class Sinitialization
{
private static int x;
static
{
System.out.println("stinstance block"+x);
x=10;
}
public static void main(String[] args)
{
 new Sinitialization();
}
}
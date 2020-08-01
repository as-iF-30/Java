import java.util.*;
public class Excep
{
public static void main(String[] args)
{
try
{
System.out.println(3/0);
System.out.println("try");
}
//catch(NullPointerException o1)
//{
//System.out.println("Exceptoin:"+o1.getMessage());
//}
catch(ArithemeticException o1)
{
System.out.println("Exception:"+o1.getMessage());
}
finally
{
System.out.println("bye");
}
System.out.prinln("olo");
}
}


































}
}
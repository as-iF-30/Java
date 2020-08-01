import java.util.*;
public class Array 
{
public static void main(String[] args)
{
int []a=new int[5];
Scanner sc=new Scanner(System.in);
System.out.println("Enter 5 number");
for(int i=0;i<5;i++)
{
a[i]=sc.nextInt();
}
for(int i=0;i<5;i++)
{
System.out.println("a["+i+"]="+a[i]);
}
System.out.println("length:"+a.length);
}
}
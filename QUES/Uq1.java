import java.util.*;
public  class Uq1
{
public static void main(String []args)
{
Scanner s=new Scanner(System.in);
System.out.print("Enter value of a:");
int a=s.nextInt();
System.out.print("Enter value of b:");
int b=s.nextInt();
int w,x,y,z;
w=(a<<2)+(b<<1);
x=a|b;
y=(a+b*100)/10;
z=a&b;
System.out.println("1. (a<<2)+(b<<1):  "+w);
System.out.println("2. a|b:             "+x);
System.out.println("3. (a+b*100)/10:   "+y);
System.out.println("4. a&b:             "+z);
}
}

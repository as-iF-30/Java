import java.util.*;
public class Input
{
public static void main(String[] args)
{
System.out.println("Enter your name:");
Scanner sc=new Scanner(System.in);
String name=sc.next();
System.out.println("Enter your age:");
int age=sc.nextInt();
System.out.println("Name:"+name+"\n"+"Age:"+age);
}
}
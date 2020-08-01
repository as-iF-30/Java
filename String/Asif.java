import java.util.*;
public class Asif
{
public static void main(String[] args)
{
Scanner s1=new Scanner(System.in);
String a=s1.nextLine();
System.out.println(a);
String b=a.toUpperCase();
System.out.println("Uppeer case:"+b);
String c=a.toLowerCase();
System.out.println("Lower case:"+c);
int i=a.indexOf('s',1);
int j=a.indexOf("sif");
System.out.println(i);
System.out.println(j);
String e=a.substring(4);
String d=a.substring(2,4);
System.out.println(e);
System.out.println(d);
} 
} 
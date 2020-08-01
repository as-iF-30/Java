import java.util.*;
public class UQ6
{
public static void main(String []args)
{
 String o1 ="asif ali";
 System.out.println(o1.length());
 int j=0;
System.out.println("Location of occurance:");
 for(int i=0;i<o1.length();i++)
{
  if(o1.charAt(i)=='a')
  {
       j++;
    System.out.println(i);
  }
}
System.out.println("Total no of occurance"+j);
}
} 

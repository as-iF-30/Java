class Sat
 {
   int x;       //instance varible
   static int  y;   //staic mamber variable 
   public static void fun()  //static member function
    {
       System.out.println(y);
       y=4;
     System.out.println(y);
   }
static class Test   //inner static class
{
  public static String country="India";
}
}
public class Hello
{
  public static void main(String[] args)
{
 Sat o1=new Sat();
  Sat.y=5;
 Sat.fun();
  System.out.println(Sat.Test.country);//class.class.static variable
}
}
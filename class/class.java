class Class
{
  private int le,br,he;
 public void  set(int l, int b, int h)
     {
        le=l;
        br=b;
        he=h;
     }
public  void  show()
    {
      System.out.println("L:"+le);
      System.out.println("B"+br);
     System.out.println("H"+he);
     }
}
class example
{
   public static void main(String[] args)
    {
         Class b1=new Class();
         b1.set(4,5,6);
        b1.show();
    
    }
}
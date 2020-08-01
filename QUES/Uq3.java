import java.util.*;
public class Uq3
{
public static void main(String []args)
{
Scanner s=new Scanner(System.in);
int i,j,k;
int [][]a=new int[3][3];
int [][]b=new int[3][3];
int [][]c=new int[3][3];
System.out.println("enter the array A:");
for(i=1;i<=3;i++)
{
  for(j=1;j<=3;j++)
 {
   a[i][j]=s.nextInt();
 }
}
System.out.println("enter the array A:");
for(i=1;i<=3;i++)
{
  for(j=1;j<=3;j++)
 {
   b[i][j]=s.nextInt();
 }
}
for(i=1;i<=3;i++)
{
for(j=1;j<=3;j++)
{
c[i][j]=0;
for(k=1;k<=3;k++)
{
c[i][j]=c[i][j]+a[i][k]*b[k][j];
}
}
}
for(i=1;i<=3;i++)
{
for(j=1;j<=3;j++)
{
System.out.println(c[i][j]);
}
}
}
}




class Array2
{
public static void main(String []args)
{
int a[][]=new int [3][3];
int i,j,k=0;
for(i=0;i<3;i++)
{
for(j=0;j<3;j++)
{
a[i][j]=k;
k++;
}
}
for(i=1;i<=3;i++)
{
for(j=1;j<=3;j++)
{
System.out.println(a[i][j]+" ");
}
}
}
}
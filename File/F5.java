import java.io.*;
public class F5
{
public static void main(String []args) throws IOException
{
int i;
FileReader f1=new FileReader("./name4.txt");
BufferedReader b=new BufferedReader(f1);
while((i=b.read())!=-1)
{
System.out.print((char)i);
}
b.close();
}
}

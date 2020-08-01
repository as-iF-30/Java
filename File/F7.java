import java.io.*;
public class F7
{
public static void main(String []args) throws IOException
{
char []s=new char[20];
FileReader f1=new FileReader("./name4.txt");
BufferedReader b=new BufferedReader(f1);
b.read(s,0,13);
System.out.println(s);
b.close();
}
}

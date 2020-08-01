import java.io.*;
public class F6
{
public static void main(String []args) throws IOException
{
String s;
FileReader f1=new FileReader("./name4.txt");
BufferedReader b1=new BufferedReader(f1);
s=b1.readline();
System.out.println(s);
b1.close();
}
}

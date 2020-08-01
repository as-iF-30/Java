import java.io.*;
public class F4
{
public static void main(String []args) throws IOException
{
int i;
FileWriter f1=new FileWriter("./name4.txt",true);
BufferedWriter b=new BufferedWriter(f1);
b.write("computer");
b.close();
}
}

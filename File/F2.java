import java.io.*;
public class F2
{
public static void main(String []args) throws IOException
{
int i;
FileOutputStream f1=new FileOutputStream("./name2.txt",true);
String s="AsIf";
char ch[]=s.toCharArray();
for(i=0;i<s.length();i++)
{
f1.write(ch[i]);
}
f1.close();
}
}

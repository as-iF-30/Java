import java.io.File;
import java.io.IOException;
import java.util.*;
public class F1
{
public static void main(String []args) throws IOException
{
File f1=new File("C:/Users/Allha/Desktop/Java/File/name1.txt");
f1.createNewFile();
System.out.println("is Exist:"+f1.exists());
System.out.println("File name:"+f1.getName());
System.out.println("length of file:"+f1.length());
System.out.println("is readeable:"+f1.canWrite());
}
} 
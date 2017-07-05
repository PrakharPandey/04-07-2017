import java.io.*;
public class stat
{
static int count=0;
public static void main(String[] args)
{

stat obj=new stat();
obj.count++;
stat obj1=new stat();
obj1.count++;
stat obj2=new stat();
obj2.count++;
stat obj3=new stat();
obj3.count++;
System.out.println(count);
}
}
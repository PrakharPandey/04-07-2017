import java.io.*;
public class Person
{
private String name;
Person()
{
}
Person(String n)
{
name=n;
}
void setname(String n)
{
name=n;
}
void getname()
{
System.out.println(name);
}
public static void main(String[] args)
{
Person obj=new Person();
Person obj1=new Person("Prakhar"); 
obj.setname("Default");
obj.getname();
obj1.getname();
}
}
import java.io.*;
public class pyramid
{
public static void main(String[] args)
{
int n=Integer.parseInt(args[0]);
if(n%2==0)
n-=1;
int l=n/2-1,b=1,i,a;

while(b<=n/2+1)
{
a=l--;
while(a>=0)
{
System.out.print(" ");
a--;

}
i=1;
while(i<=b*2-1)
{
System.out.print("*");
i++;
}
System.out.println();
b++;
}
}
}
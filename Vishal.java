
import java.util.*;
import java.io.*;
class Vishal
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int a[]=new int[n*2];
for(int i=0;i<(n*2);i++)
{
a[i]=sc.nextInt();
}
if(n%2==0)
{
System.out.println(n-1);
}
else
{
System.out.println(n-2);
}
}
}

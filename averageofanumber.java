import java.util.*;
import java.io.*;
class average
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n,res=0;
n=sc.nextInt();
int a[]=new int[n];
for(int i=0;i<n;i++)
a[i]=sc.nextInt();
for(int i=0;i<n;i++)
res=res+a[i];
System.out.println(res/n);
}
}


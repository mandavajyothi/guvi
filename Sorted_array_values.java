import java.util.*;
import java.io.*;
class Sorted_array
{
public static void main(String args[])
{
int n,temp;
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
int a[]=new int[n];
for(int i=0;i<n;i++)
{
a[i]=sc.nextInt();
}
for(int i=0;i<n;i++)
{
for(int j=i+1;j<n;j++)
{
if(a[i]>a[j])
{
temp=a[i];
a[i]=a[j];
a[j]=temp;
}
}
}
for(int i=0;i<n-1;i++)
{
System.out.print(a[i]+" ");
}
System.out.print(a[n-1]);
}
}


import java.util.*;
import java.io.*;
class SumOffAllNumbers
{
public static void main(String args[])
{
int n,sum=0;
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
int a[]=new int[n];
for(int i=0;i<n;i++)
{
a[i]=sc.nextInt();
}
for(int i=0;i<n;i++)
{
sum+=a[i];
}
System.out.println(sum);
}
}

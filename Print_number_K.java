import java.util.*;
import java.io.*;
class Number_k
{
public static void main(String args[])
{
int n,k;
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
k=sc.nextInt();
int a[]=new int[n];
for(int i=1;i<n;i++)
{
	a[i]=sc.nextInt();
}
System.out.println(a[k]);
}
}

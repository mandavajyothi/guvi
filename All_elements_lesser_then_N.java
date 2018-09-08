import java.util.*;
import java.io.*;
class Print_all_elements_lesser_then_N
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
for(int j=0;j<n;j++)
{
	if(a[j]<n)
	{
		System.out.print(a[j]+" ");
	}
	
}
}
}

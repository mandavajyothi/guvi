import java.util.*;
class LargestNumber
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n,max;
n=sc.nextInt();
int a[]=new int[n];
for(int i=0;i<n;i++)
{
a=sc.nextInt();
}
max=a[0];
for(i=0;i<n;i++)
{
if(max<a[i])
max=a[i];
}
System.out.println(max);
}
}


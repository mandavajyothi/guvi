import java.util.*;
class Smallest_number
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n,min;
n=sc.nextInt();
int a[]=new int[n];
for(int i=0;i<n;i++)
{
a[i]=sc.nextInt();
}
min=a[0];
for(int i=0;i<n;i++)
{
if(min>a[i])
{
min=a[i];
}
}
System.out.println(min);
}
}

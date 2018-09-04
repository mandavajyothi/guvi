import java.util.*;
import java.io.*;
class Minimum_number
{
public static void main(String args[])
{
int smallest=0;
int large=0;
int num;
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
num=sc.nextInt();
smallest=num;
for(int i=2;i<n;i++)
{
num=sc.nextInt();
if(num<smallest)
{
smallest=num;
}
}
System.out.println(smallest);
}
}

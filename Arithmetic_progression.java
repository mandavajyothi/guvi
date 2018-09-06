import java.util.*;
import java.io.*;
class Arithmetic_progression
{
public static void main(String args[])
{
int n,a,b;
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
a=sc.nextInt();
b=sc.nextInt();
System.out.println((n*((2*a)+(n-1)*b))/2);
}
}

import java.util.*;
import java.io.*;
class Even_Odd
{
public static void main(String args[])
{
int num1,num2,sum;
Scanner sc=new Scanner(System.in);
num1=sc.nextInt();
num2=sc.nextInt();
sum=num1+num2;
if(sum%2==0)
{
System.out.println("even");
}
else
{
System.out.println("odd");
}
}
}

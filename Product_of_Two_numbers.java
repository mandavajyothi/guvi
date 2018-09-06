import java.util.*;
import java.io.*;
class Product_of_two_numbers
{
public static void main(String args[])
{
int num1,num2,pro;
Scanner sc=new Scanner(System.in);
num1=sc.nextInt();
num2=sc.nextInt();
pro=num1*num2;
if(pro%2==0)
{
System.out.println("even");
}
else
{
System.out.println("odd");
}
}
}

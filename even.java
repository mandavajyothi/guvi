import java.util.*;
class Demo
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int number;
number=sc.nextInt();
if(number%2==0)
System.out.println("Even");
else if(number%2!=0)
System.out.println("Odd");
else 
System.out.println("Invalid");
}
}

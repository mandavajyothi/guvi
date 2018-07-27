public class Demo
{
public static void main(String[] args)
{
Scanner sc=new Scannner(System.in);
int number;
System.out.println("enter a number");
number=sc.newInt();
if(number>0)
System.out.println("given number is positive");
else if(number<0)
System.out.println("given number is negative");
else
System.out.println("given number is zero");
}
}

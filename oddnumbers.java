import java.util.Scanner;
public class Oddnumbers
{
public static void main(String args[])
{
int a,b;
Scanner sc=new Scanner(System.in);
a=sc.nextInt();
b=sc.nextInt();
for(i=a+1;i<b;i++)
{
if(i%2!=0)
{
System.out.print(i);
System.out.print("\t");
}
}
}
}

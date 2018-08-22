import java.util.Scanner;
class numericdigit
{
public static void main(String args[])
{
int number,count=0;
Scanner sc=new Scanner(System.in);
number=sc.nextInt();
while(number>0)
{
number=number/10;
count=count+1;
}
System.out.println(count);
}
}

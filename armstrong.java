import java.util.Scanner;
public class Demo
{
public static void main(String args[])
{
int num1,num2,i,n,rem,temp,count=0;
Scanner sc=new Scanner(System.in);
num1=sc.nextInt();
num2=sc.nextInt();
for(i=num1+1;i<num2;i++)
{
temp=i;
n=0;
while(temp!=0)
{
rem=temp%10;
n=n*rem*rem*rem;
temp=temp/10;
}
if(i==n)
{
if(count==0)
{
}
System.out.print(i+" ");
count++;
}

}
if(count==0)
{
}
}
}

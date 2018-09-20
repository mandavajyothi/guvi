import java.util.*;
class Demo
{
public static void main(String args[])
{
int count=0,num;
Scanner sc=new Scanner(System.in);
num=sc.nextInt();
while(num!=0)
{
num/=10;
++count;
}
System.out.println(count);
}
}

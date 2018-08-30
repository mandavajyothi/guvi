import java.util.*;
class SumOffAllDigits
{
public static void main(String args[])
{
int n,m,sum=0;
Scanner sc=new Scanner(System.in);
m=sc.nextInt();
while(m>0)
{
n=m%10;
sum=sum+n;
m=m/10;
}
System.out.println(sum);
}
}

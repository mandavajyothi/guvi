import java.util.*;
class Simple_interest
{
public static void main(String args[])
{
int p,r,t,si;
Scanner sc=new Scanner(System.in);
p=sc.nextInt();
r=sc.nextInt();
t=sc.nextInt();
si=(p*t*r)/(100);
System.out.print(si);
}
}

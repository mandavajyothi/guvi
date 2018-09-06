import java.util.*;
import java.io.*;
class Subtract_abs
{
public static void main(String args[])
{
int a,b,c,d,e,f;
Scanner sc=new Scanner(System.in);
a=sc.nextInt();
b=sc.nextInt();
c=sc.nextInt();
d=sc.nextInt();
e=Math.abs(a-c);
f=Math.abs(b-d);
System.out.println(e+" "+f);
}
}

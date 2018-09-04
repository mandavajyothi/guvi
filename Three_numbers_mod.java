import java.util.*;
import java.io.*;
class Three_numbers_mod
{
public static void main(String args[])
{
int a,b,c,s;
Scanner sc=new Scanner(System.in);
a=sc.nextInt();
b=sc.nextInt();
c=sc.nextInt();
s=(a*b)%c;
System.out.println(s);
}
}

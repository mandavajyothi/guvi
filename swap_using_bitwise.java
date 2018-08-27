import java.util.Scanner;
class SwapUsingBitwise
{
public static void main(String args[])
{
int m,n;
Scanner sc=new Scanner(System.in);
m=sc.nextInt();
n=sc.nextInt();
m=m^n;
n=m^n;
m=m^n;
System.out.print(m);
System.out.print("\t");
System.out.print(n);
}
}


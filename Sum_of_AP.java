import java.util.*;
import java.lang.*;
import java.io.*;


class Sum_of_AP
{
	public static void main (String[] args)
	{

		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int d=sc.nextInt();
		int n=sc.nextInt();
		int ap=n*(2*a+(n-1)*d)/2;
		System.out.println(ap);
		}
}

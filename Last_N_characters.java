import java.util.*;
import java.lang.*;
import java.io.*;

class Last_n_characters
{
	public static void main (String[] args) throws java.lang.Exception
	{
	
		String str;
		Scanner sc=new Scanner(System.in);
		str=sc.next();
		int n,m;
		m=sc.nextInt();
		n=str.length();
		for(int i=(n-m);i<n;i++){
			System.out.print(str.charAt(i));
			
		}
	}
}

import java.util.*;
class Characters_in_the_string101
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		int n=sc.nextInt();
	
		int i;
		for(i=0;i<n;i++)
		{
		
	            System.out.print(str.charAt(str.length() - 1));
		}
	}
}

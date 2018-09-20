import java.util.*;
class First_K_integers
{
	public static void main(String args[])
	{
		int n,k,sum=0;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		k=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<k;i++)
		{
			sum=sum+a[i];
		
		}
		System.out.println(sum);
	}
}

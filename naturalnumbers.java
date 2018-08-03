public class Natural
{
public static void main(String args[])
{
int x,i=0;
int sum=0;
System.out.println("Enter number of items");
Scanner sc=new Scanner(System.in);
x=sc.nextInt();
while(i<=x)
{
sum=sum+i;
i++;
}
System.out.println("sum of"+x+"numbers is"+sum);
}
}


import java.util.Scanner;
public class JavaExample
{
public static void main(String args[])
{
int number;
Scanner scanner=new Scanner(System.in);
number=scanner.nextInt();
scanner.close();
long fact=1;
int i=1;
while(i<=number)
{
fact=fact*i;
i++;
}
System.out.println(fact);
}
}


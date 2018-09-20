import java.util.*;
class Demo
{
public static void main(String[] args)
{
char  c;
 Scanner sc=new Scanner(System.in);
 c=sc.next().charAt(0);
if((c>='a'&&c<='z')||(c>='A'&&c<='Z'))
System.out.println("Alphabet");
else
System.out.println("No");
}
}


import java.util.*;
class Number_of_lines
{
public static void main(String args[])
{
int count=0,i;
Scanner sc=new Scanner(System.in);
String c=sc.nextLine();
for(int i=0;i<c.length();i++)
if(c.charAt(i)=='.')
{
count++;
}
count=count+1;
System.out.println(count);
}
}

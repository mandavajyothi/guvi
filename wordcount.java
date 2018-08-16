import java.util.Scanner;
class Wordcount
{
public static void main(String args[])
{
Scanner sc=new scanner(system.in);
String s;
s=sc.nextLine();
int count=1;
for(int i=0;i<s.length()-1;i++)
{
if((s.charAt(i)==' ')&&(s.charAt(i+1)!==' '))
{
count++;
}
}
System.out.println(count);
}
}

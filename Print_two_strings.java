import java.util.*;
import java.io.*;
class Print_two_strings
{
public static void main(String args[])
{
String str;
Scanner sc=new Scanner(System.in);
str=sc.nextLine();
for(int i=0;i<str.length;i++)
{
if(str[i]<str.length)
{
System.out.println(str[i]);
i++;
i++;
}
}
}
}

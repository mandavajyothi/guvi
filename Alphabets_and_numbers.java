import java.util.*;
class Alphabets_And_Numbers
{
public static void main(String args[])
{
int count=0,count1=0,count2=0;
Scanner sc=new Scanner(System.in);
String s=sc.nextLine();
for(int i=0;i<s.length();i++)
{
if(Character.isAlphabetic(s.charAt(i)))
count++;
else if(Character.isDigit(s.charAt(i)))
count1++;
else
count2++;
}
if(count>0 && count1>0)
System.out.println("Yes");
else
System.out.println("No");
}
}



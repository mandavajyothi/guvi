import java.util.*;
import java.io.*;
class Odd_and_even_positions
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String str=sc.nextLine();
String even="";
String odd="";
for(int i=0;i<str.length();i++)
{
if(i%2==0)
even=even+str.charAt(i);
else
odd=odd+str.charAt(i);
}
System.out.println(even+" "+odd);
}
}

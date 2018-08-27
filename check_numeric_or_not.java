import java.util.*;
class Numeric_OrNot
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String string=sc.nextLine();
boolean numeric=true;
try
{
Double num=Double.parseDouble(string);
}
catch(NumberFormatException e)
{
numeric=false;
}
if(numeric)
System.out.println("yes");
else
System.out.println("no");
}
}

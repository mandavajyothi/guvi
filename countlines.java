import java.util.Scanner;
public class CountLines
{
public static void main(String args[])
{
Scanner input=new Scanner(System.in);
printLines(input);
}
public static void printLines(Scanner x)
{
int lines=0;
while(x.hasNextLine())
{
lines++;
x.nextLine();
}
System.out.println(lines);
}
}

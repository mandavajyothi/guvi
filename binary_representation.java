import java.uutil.*;
import java.io.*;
class Binary_representation
{
public static void main(String args[])
{
int r=0;c=0;num,b;
Scanner s1=new Scanner(System.in);
num=s1.nextInt();
b=num;
while(num>0)
{
if((num%10==0)||(num%10==1))
 c++;
 r++;
 num=num/10;
 }
 if(c==r)
 System.out.println("yes");
 else
 System.out.println("no");
 }
 }
 
 
 

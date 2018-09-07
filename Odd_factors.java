import java.util.*;
class Odd_factors 
{
public static void main(String[] args) 
{
    Scanner sc=new Scanner(System.in);
        int number = sc.nextInt();
        for(int i = 2; i <number; ++i) 
        {
            if (number % i == 0) 
            {
            	if(i%2!=0)
            	{
           
                            System.out.printf(i+" ");
                        }
            }
        }
    }
}

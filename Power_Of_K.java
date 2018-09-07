import java.util.*;
import java.io.*;
class GFG  
{ 
    static boolean isPower(int x,  
                           int y) 
    { 
     
       
        int res1 = (int)Math.log(y) /  
                   (int)Math.log(x); 
                     
                 
        double res2 = Math.log(y) /  
                      Math.log(x);  
      
     
        return (res1 == res2); 
    } 
      
   
    public static void main(String args[])  
    { 
    	Scanner sc=new Scanner(System.in);
    	int n,k;
    	k=sc.nextInt();
            n=sc.nextInt();
           if(isPower(n,k)) 
            System.out.println("yes"); 
        else
            System.out.println("no"); 
    } 
} 

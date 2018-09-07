import java.util.Scanner;

class Remove_extra_spaces
{
   public static void main(String args[])
   {
        String str, strWithoutSpace;
        int i;
        Scanner scan = new Scanner(System.in);
        
        
        str = scan.nextLine();
 
        
 
        strWithoutSpace = str.replaceAll(" ", "");
 
        System.out.println(strWithoutSpace);
 
      
 
        char[] strArray = str.toCharArray();
 
        StringBuffer sb = new StringBuffer();
 
        for (i = 0; i < strArray.length; i++)
        {
            if( (strArray[i] != ' ') && (strArray[i] != '\t') )
            {
                sb.append(strArray[i]);
            }
        }
 
        
   }
}

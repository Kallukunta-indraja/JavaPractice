//Write a java program to print Mirror Lower Star Triangle pattern?
import java.util.Scanner;

public class MirrorLowerStarTrianglepattern
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of rows: ");
        int rows = sc.nextInt();
        for(int i=rows;i>0;i--) 
        {
    	   for(int j=1;j<=rows-i;j++) 
    	   {
    		   System.out.print(" ");
    	   }
    	   for(int k=1;k<=i;k++) 
    	   {
    	   System.out.print("* ");
           }
    	   System.out.println();     
	   }
       for(int i=1;i<=rows;i++) 
       {
    	   for(int j=1;j<=rows-i;j++) 
    	   {
    		   System.out.print(" ");
    	   }
    	   for(int k=1;k<=i;k++) 
    	   {
    		   System.out.print("* ");
    	   }
    	   System.out.println();  
       }
       sc.close();
   }
}

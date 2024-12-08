//Write a java program to print prime numbers within range?
import java.util.Scanner;

public class PrimeNumbers 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter starting number: ");
		int n1 = sc.nextInt();
		System.out.println("Enter ending number: ");
	        int n2 = sc.nextInt();
	        while(n1<=n2) 
	        {
	    	     int count = 0;
	    	     for(int i=1;i<=n1;i++)   
	    	     {
	    		   if(n1%i==0) 
	    		   {
	    			count=count+1;
	    		   }
	    	      }
	        if(count==2) 
	        {
	    	   System.out.println(n1);
	    	}
	     n1++;
	    }
	    sc.close();
	}
}

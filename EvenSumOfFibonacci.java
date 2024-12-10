//Write a java program to find sum of fibonacci series at even indexes?
import java.util.Scanner;

public class EvenSumOfFibonacci
{
	    public static void main(String[] args) 
	    {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter the range of Fibonacci series: ");
	        int r = sc.nextInt();
	        System.out.println("Enter the number of even index sum: ");
	        int n = sc.nextInt();
	        
	        int n1 = 0, n2 = 1, sum = 0;
	        int index = 0;  
	        int count = 0;  

	        while (index < r) 
	        {
	            if (index % 2 == 0 && count < n) 
	            {  
	                sum += n1;
	                count++;
	            }
	            int n3 = n1 + n2;  
	            n1 = n2;
	            n2 = n3;
	            index++;  
	        }
	        System.out.println("Sum of Fibonacci numbers at even indexes is: " + sum);
	        sc.close();
	    }
	}



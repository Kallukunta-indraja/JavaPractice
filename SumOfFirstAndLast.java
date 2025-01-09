// Write a Program to print sum of first and last digit in a number
import java.util.Scanner;
public class SumOfFirstAndLast 
{
	public static void main(String[] args) 
	{
	   Scanner sc = new Scanner(System.in);
	   System.out.println("Enter a number: ");
	   int num = sc.nextInt();
	   int lastDigit = num%10;
	   int firstDigit = num;
	   while(firstDigit>=10) 
	   {
		  firstDigit/=10;
	   }
	  System.out.println("The sum of first and last digits in a number is : "+(lastDigit+firstDigit));
	 sc.close();
	}
	
}
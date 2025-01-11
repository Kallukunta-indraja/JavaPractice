//Write a java program to check whether the given number is palindrome or not?
import java.util.Scanner;
public class Palindrome 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		int originalNum = num;
		int reverse = 0;
		while(num!=0) 
		{
			int ld = num%10;
			reverse = reverse*10+ld;
			num=num/10;
		}
		if( originalNum == reverse) 
		{
			System.out.println(originalNum+" is a palindrome.");
		}
		else 
		{
			System.out.println(originalNum+" is not a palindrome.");
		}
		sc.close();
	}
}

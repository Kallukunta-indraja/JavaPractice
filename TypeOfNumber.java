//Write a java program to verify whether given number is positive or negitive or zero?
import java.util.Scanner;

public class TypeOfNumber 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = sc.nextInt();
		if(n<0) 
		{
			System.out.println(n+" is a negitive number");
		}
		else if(n>0) 
		{
			System.out.println(n+" is a positive number");
		}
		else if(n==0) 
		{
			System.out.println(n+" is a zero");
		}
		sc.close();

	}

}
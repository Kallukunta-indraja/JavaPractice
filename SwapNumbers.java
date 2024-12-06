//Write a java Program to swap two numbers?
import java.util.Scanner;

public class SwapNumbers 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st number");
		int n1 = sc.nextInt();
		System.out.println("Enter 2nd number");
		int n2 = sc.nextInt();
		int temp;
		System.out.println("Numbers before swapping: "+n1+" "+n2);
		temp = n1;
		n1=n2;
		n2 = temp;
		System.out.println("Numbers after swapping: "+n1+" "+n2);
		sc.close();
	}

}
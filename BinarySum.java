//Write a java program to add two Binary Strings?
import java.util.Scanner;

public class BinarySum 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st binary number");
		String s1 = sc.nextLine();
		System.out.println("Enter 2nd binary number");
		String s2 = sc.nextLine();
		int b1 = Integer.parseInt(s1,2);
		int b2 = Integer.parseInt(s2,2);
		int sum = b1+b2;
		String s = Integer.toBinaryString(sum);
		System.out.println(s);
		sc.close();
	}

}

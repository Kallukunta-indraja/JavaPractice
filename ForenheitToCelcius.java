//Write a program to convert forenheit to celcius?
import java.util.Scanner;

public class ForenheitToCelcius
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of F: ");
		double f = sc.nextDouble();
		double c = (f-32)*5/9;
		System.out.println(c);

	}

}
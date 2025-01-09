//Write a program to print reverse of a given number?
import java.util.Scanner;
public class ReverseOfNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number: ");
		int number = sc.nextInt() ;
		int reversedNum = 0;
		while(number!=0) {
			int r=number%10;
			reversedNum = reversedNum*10+r;
			number/=10;
		}
		System.out.println("The reversed number is: "+reversedNum);
        sc.close();
	}

}
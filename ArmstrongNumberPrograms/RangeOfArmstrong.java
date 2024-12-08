//Write a java program to print range of Armstrong numbers?
import java.util.Scanner;

public class RangeOfArmstrong 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the starting number: ");
		int num1 = sc.nextInt();
		System.out.println("Enter the ending number: ");
		int num2 = sc.nextInt();
		for(int number=num1;number<=num2;number++) 
		{
			int original = number;
			String s = Integer.toString(number);
		    int len = s.length();
		    int temp =number;
		    int result=0;
			while(temp>0) 
			{
				int digit = temp%10;
				result=result+(int)Math.pow(digit,len);
				temp=temp/10;
			}
		    if(result==original) 
		    {
		    System.out.println(result);
		    }
		}
		sc.close();
	}

}

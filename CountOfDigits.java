//Write a java program to calculate how many times a digit occurs in the number.
import java.util.Scanner;

public class CountOfDigits
{

	public static void main(String[] args)
        {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		System.out.println("Enter the number to search: ");
		int n = sc.nextInt();
		String m = Integer.toString(num);
		String  s= Integer.toString(n);
		int count=0;
		for(int i=0;i<m.length();i++) 
                {
			String sub = m.substring(i,i+1);
			 if(s.compareTo(sub)==0) 
                         {
				 count++;
			 }
		}
		System.out.println("The total count of "+n+" is "+count);

	}

}

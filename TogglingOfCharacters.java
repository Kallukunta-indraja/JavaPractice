//Write a java program to toggle characters of given string?
import java.util.Scanner;

public class TogglingOfCharacters 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String s = sc.nextLine();
		for(int i=0;i<s.length();i++) 
		{
		 char c = s.charAt(i);
		if(Character.isUpperCase(c)) 
		{
			System.out.println(Character.toLowerCase(c));
		}
		else if(Character.isLowerCase(c)) 
		{
			System.out.println(Character.toUpperCase(c));
		}
		
		}
		
		sc.close();

	}

}

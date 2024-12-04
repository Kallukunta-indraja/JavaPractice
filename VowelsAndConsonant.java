//Write a java program to check whether the given character is vowel or consonant?
import java.util.Scanner;

public class VowelsAndConsonants 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the character: ");
		char s = sc.nextLine().charAt(0);
		s = Character.toUpperCase(s);
		if(Character.isLetter(s) ) 
		{
			if(s=='A' || s=='E' || s=='I' || s=='O' || s=='U') 
			{
				System.out.println(s+" is an vowel");
			}
			else 
			{
				System.out.println(s+ " is a consonant");
			}
		}
		else 
		{
			System.out.println("Invalid Character");
		}
		
		sc.close();
	}

}

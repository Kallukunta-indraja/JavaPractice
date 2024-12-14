//Write a java program to print reverse pyramid pattern of stars?
import java.util.Scanner;

public class ReversePyramid 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of rows: ");
		int rows = sc.nextInt();
		for(int i=rows;i>=0;i--) 
		{
			for(int k=0;k<=rows-i;k++) 
			{
				System.out.print(" ");
			}
			for(int j=1;j<=2*i-1;j++) 
			{
				System.out.print("*");
			}
			System.out.println();
		}
		sc.close();
	}
}

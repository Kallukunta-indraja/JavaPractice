//Write a java program to print Downward Triangle Star Pattern?
import java.util.Scanner;

public class DownwardTriangleStarPattern
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of rows: ");
		int rows = sc.nextInt();
		for(int i=0;i<=rows;i++) 
		{
			for(int j=rows;j>=i;j--) 
			{
				System.out.print("*");
			}
			System.out.println();
		}
		sc.close();
	}
}
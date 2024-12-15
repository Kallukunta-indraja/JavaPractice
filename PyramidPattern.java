//Write a java program to print pyramid star pattern?
import java.util.Scanner;
public class PyramidPattern
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of rows: ");
		int rows = sc.nextInt();
		for(int i=1;i<=rows;i++) 
		{
			for(int j=1;j<=rows-i;j++) 
			{
				System.out.print(" ");
			}
			for(int k=1;k<=2*i-1;k++) 
			{
				System.out.print("*");
			}
			System.out.println();
		}
        sc.close();
	}
}
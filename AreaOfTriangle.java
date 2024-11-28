//Write a java program to find area of the triangle?
import java.util.Scanner;

public class AreaOfTriangle
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of breadth: ");
		int breadth = sc.nextInt();
		System.out.println("Enter the value of height: ");
		int height = sc.nextInt();
		double area = 0.5*breadth*height;
		System.out.println("area of the triangle: "+area);
		
	}

}
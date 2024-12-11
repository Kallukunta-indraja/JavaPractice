//Write a java program to find perimeter of a rectangle?
import java.util.Scanner;

public class PerimeterOfRectangle 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of rectangle: ");
		int length = sc.nextInt();
		System.out.println("Enter the breadth of rectangle: ");
		int breadth = sc.nextInt();
		int perimeter = 2*(length+breadth);
        System.out.println("The perimeter of a rectangle is: "+perimeter);
        sc.close();
	}

}
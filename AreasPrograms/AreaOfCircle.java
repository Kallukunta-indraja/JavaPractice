//Write a java program to find area of the circle?

import java.util.Scanner;

public class AreaOfCircle 
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Radius of a circle: ");
		float radius = sc.nextFloat();
		double area = 3.14*radius*radius;
		System.out.println("The area of circle is: "+area);
		sc.close();
		
	}

}

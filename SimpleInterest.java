//Write a java program to calculate Simple Interest?
import java.util.Scanner;

public class SimpleInterest 
{
	public static void main(String[] args) 
	{ 
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter the principal amount: ");
          double p = sc.nextDouble();
          System.out.println("Enter the rate of interest: ");
          double r =sc.nextDouble();
          System.out.println("Enter the time (in years): ");
          double t = sc.nextDouble();
          double si = p*t*r/100;
          System.out.printf("The simple interest is %.2f%n",si);
          sc.close();		 
	}

}

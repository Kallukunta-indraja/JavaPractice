//Write a Java program to check whether a given number is even or not

import java.util.Scanner;

public class EvenNumber
{
	public static void main(String[] args)
	{
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter any Number: ");
            int num = scan.nextInt();
	    if(
            if(num%2==0)
            {
            	System.out.println(num+" is an Even Number");
            }
            else
            {
            	System.out.println(num+"  is not an Even Number");
            }
            scan.close();
	}

}

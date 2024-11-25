import java.util.Scanner;

public class OddNumber
{

	public static void main(String[] args)
	{
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter any Number: ");
            int num = scan.nextInt();
            if(num%2=0)
            {
            	System.out.println(num+" is an odd Number");
            }
            else
            {
            	System.out.println(num+"  is not an odd Number");
            }
            
		

	}

}
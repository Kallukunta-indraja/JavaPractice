//Write a program to verify given number is ArmStrong or not?
import java.util.Scanner;

public class Armstrong 
{

   public static void main(String[] args) 
   {
	  Scanner sc = new Scanner(System.in);
	  System.out.println("Enter the number: ");
	  int userin = sc.nextInt();
	  int num1=userin;
	  String s = Integer.toString(num1);
          int len = s.length();
          int mul=0;
          while(num1!=0) 
          {
                int digit=num1%10;
                mul=mul+(int)Math.pow(digit,len);
                num1=num1/10;
           }
           if(userin==mul) 
           {
                System.out.println(mul+" is an armstrong number");
           }
           else
           {
    	       System.out.println(mul+" is not an armstrong number");
           }
           sc.close();
   }
}

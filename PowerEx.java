import java.util.Scanner;
class PowerEx
{
 public static void main(String ar[])
 {
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter the number(base): ");
   int x= sc.nextInt();
   System.out.println("Enter the power(Exponent): ");
   int p = sc.nextInt();
   int power=1;
   for(int i=1;i<=p;i++) 
   {
    power = power*x;
   }
   System.out.println(power);
 }
}
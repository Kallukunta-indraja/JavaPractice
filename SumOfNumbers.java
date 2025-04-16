import java.util.Scanner;
class SumOfNumbers
{
    static int addition(int a)
    {
      if(a==1)
       {
        return 1;
       }
      return  a+addition(a-1);
    }
  public static void main(String ar[])
  {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the number");
      int n = sc.nextInt(); 
      int sum = addition(n);
      System.out.println("sum is: "+sum);
      sc.close();
  }
}
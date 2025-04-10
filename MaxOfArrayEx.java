//Program to find Maximum number in an array 
import java.util.Scanner;
class MaxOfArrayEx
 {
   public static void main(String ar[])
   {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the total no of elements in an array :");
      int n = sc.nextInt();
      System.out.println("Enter the array elements one by one :");
      int array[] = new int[n];
      for(int i=0;i<n;i++){
        array[i]=sc.nextInt();
      }
     int max = array[0];
     for(int i=0;i<n;i++){
     if(array[i]>max){
        max = array[i];
     }
   }
   System.out.println("max number is "+max);
 }
}
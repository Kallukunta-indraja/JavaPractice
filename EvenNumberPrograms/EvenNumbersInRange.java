//Write a java program to print even numbers within range?
import java.util.Scanner;

public class EvenNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the starting number: ");
		int s = sc.nextInt();
		System.out.println("Enter the ending number: ");
		int e = sc.nextInt();
		while(s<=e) {
			if(s%2==0) {
				System.out.println(s);	
			}
			s++;
		}
		sc.close();
		
	}

}
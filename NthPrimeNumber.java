import java.util.Scanner; 
public class NthPrimeNumber{
	public static void main(String args[]){
	    Scanner sc = new Scanner(System.in);
	     System.out.println("Enter the no of prime number: ");
	     int no = sc.nextInt();
	    int c = 0;
	    int n=2;
	    while(c<no){
	     int count = 0;
	     for(int i=1;i<=n;i++){
	        if(n%i==0){
	           count++;	       
		}
	      }	
	     if(count==2){
	       c = c+1;
             if(c==no){
              System.out.println(n);
             }
             }
             n++;	
	    }
	    sc.close();
      }
}		
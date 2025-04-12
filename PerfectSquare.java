import java.util.Scanner;
class PerfectSquare {
  public static void main(String ar[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number:");
    int n = sc.nextInt();
    boolean isPerfect = false;

    for (int i = 1; i * i <= n; i++) {
      if (i * i == n) {
        isPerfect = true;
        break;
      }
    }

    if (isPerfect) {
      System.out.println(n + " is a perfect square");
    } else {
      System.out.println(n + " is not a perfect square");
    }
  }
}

import java.util.Scanner;

public class factorialFunc {

   public static int factorial(int n) {
      int fact=1;
      for(int i=1;i<=n;i++)
      {
        fact=fact*i;
      }
      return fact;
   }

   public static void main(String[] var0) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the number");
      int n=sc.nextInt();
      int fact=factorial(n);
      System.out.println("Factorial= " + fact);
   }
}

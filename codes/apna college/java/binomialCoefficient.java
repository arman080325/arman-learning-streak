import java.util.Scanner;

public class binomialCoefficient {
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
      System.out.println("Enter the numbers n and r");
      int n=sc.nextInt();
      int r=sc.nextInt();
      int binomialCoeff=factorial(n)/(factorial(r)*factorial(n-r));
      System.out.println("Binomial Coefficient nCr= " + binomialCoeff);
   } 
}

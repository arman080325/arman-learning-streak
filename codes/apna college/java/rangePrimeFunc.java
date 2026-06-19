import java.util.Scanner;


public class rangePrimeFunc {

    public static boolean checkPrime(int n) {
        boolean isPrime = true;
        //corner cases
        if (n == 2) {
            return true;
        } else {
            for (int i = 2; i <= Math.sqrt(n); i++) {//Math is a class and sqrt is a function in it
                if (n % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }
    public static void rangePrime(int n) {
        for(int i=2;i<=n;i++)
        {
        if (checkPrime(i)) {
            System.out.print(i+" ,");
        }
    }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter the range from 2 to to check for prime");
        n = sc.nextInt();
        rangePrime(n);
    }
}


import java.util.Scanner;

public class primeFunc {

    public static void checkPrime(int n) {
        boolean isPrime = true;
        //corner cases
        if (n == 2) {
            System.out.println(n + " is a Prime Number");
        } else {
            for (int i = 2; i <= n-1; i++) {
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println(n + " is a Prime Number");
            } else {
                System.out.println(n + " is a Composite Number");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter the number to check for prime");
        n = sc.nextInt();
        checkPrime(n);
    }
}

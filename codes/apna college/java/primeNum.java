import java.util.*;

public class primeNum {
    public static void main(String args[]) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter a number to check if it is prime or not: ");
        num = sc.nextInt();
        boolean isPrime = true;
        if (num == 2) {
            System.out.println(num + " is a prime number");
        } else {
            for (int i = 2; i <= num - 1; i++) {
                if (num % i == 0) { //num is a multiple of i(i is not equal to 1 or num)
                    isPrime = false;
                }
            }
            if (isPrime == true) {
                System.out.println(num + " is a prime number");
            } else {
                System.out.println(num + " is not a prime number");
            }
        }
    }
}

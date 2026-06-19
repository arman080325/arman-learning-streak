import java.util.*;

public class function1 {

    public static void printHelloWorld() {
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
        return;
    }

    public static int calculateSum(int a, int b) {//function definition : Parameters or Formal Parameters
        int sum = a + b;
        return sum;
    }

    public static void main(String[] args) {
        printHelloWorld();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a and b");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int totalSum = calculateSum(a, b);//Function Call : Arguments or Actual Parameters
        System.out.println("Sum of a and b= "+totalSum);

    }
}
// A Function is also called a method as we write the functions inside the class
// but in c++ we write anywhere.
// Basically Functions=Method
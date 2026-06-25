import java.util.*;
//Brute Force Approach O(n^3)

public class sumsubArrays {
    public static void sumSubArrays(int arr[]) {
        int minSum = Integer.MAX_VALUE;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k] + " ");
                    sum = sum + arr[k];
                }
                System.out.println("-> Sum = " + sum);
                if (sum < minSum)
                    minSum = sum;
                if (sum > maxSum)
                    maxSum = sum;
            }
            System.out.println();
        }
        System.out.println("Minimum Subarray Sum: " + minSum);
        System.out.println("Maximum Subarray Sum: " + maxSum);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of the array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        sumSubArrays(arr);
    }
}
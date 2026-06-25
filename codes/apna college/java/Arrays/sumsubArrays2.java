import java.util.*;

//Prefix Sum Approach  O(n^2)
public class sumsubArrays2 {
    public static void sumSubArrays(int arr[]) {
        int minSum = Integer.MAX_VALUE;
        int maxSum = Integer.MIN_VALUE;

        int prefixArray[] = new int[arr.length];
        prefixArray[0] = arr[0];
        for (int i = 1; i < prefixArray.length; i++) {
            prefixArray[i] = prefixArray[i - 1] + arr[i];
        }

        for (int i = 0; i < arr.length; i++) {
            int start = i;
            for (int j = i; j < arr.length; j++) {
                int end = j;

                int currSum = start == 0 ? prefixArray[i] : prefixArray[end] - prefixArray[start - 1];
                if (currSum > maxSum)
                    maxSum = currSum;
            }
        }
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
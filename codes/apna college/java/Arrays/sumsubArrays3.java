import java.util.*;

//Kadane's Algorithm  O(n) - Most Optimized Algorithm to find the Max Subarray Sum
public class sumsubArrays3 {
    public static void kadanes(int arr[]) {
        int maxSum = Integer.MIN_VALUE;
        int currSum=0;

        for(int i=0;i<arr.length;i++)
        {
            currSum+=arr[i];
            maxSum=Math.max(currSum, maxSum);//Special case : If all elements are negative then Update BEFORE resetting
            if(currSum<0)
            {
                currSum=0;  // reset after saving to maxSum
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
        kadanes(arr);
    }
}
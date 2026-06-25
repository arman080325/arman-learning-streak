import java.util.*;

public class pairsArray {
    public static void pairsArray(int arr[]) {
        int totPairs=0;
        for (int i = 0; i < arr.length; i++) {
            int current = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                System.out.print("(" + current + "," + arr[j] + ")");
                totPairs++;
            }
            System.out.println();
        }
        System.out.println("Total Pairs : "+totPairs);
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
        pairsArray(arr);
    }
}

/**
 * Bubble Sort Algorithm
 *
 * PROBLEM STATEMENT:
 * Sort an array in ascending order by repeatedly comparing adjacent
 * elements and swapping them if they are in the wrong order.
 *
 * CONCEPT (Think visually):
 * Like bubbles rising to the surface — larger elements "bubble up"
 * to their correct position at the end of the array in each pass.
 *
 * Pass 1: [9, 7, 5, 4, 3, 2] → [7, 5, 4, 3, 2, 9]  ← 9 bubbled to end
 * Pass 2: [7, 5, 4, 3, 2, 9] → [5, 4, 3, 2, 7, 9]  ← 7 bubbled to end
 * Pass 3: [5, 4, 3, 2, 7, 9] → [4, 3, 2, 5, 7, 9]  ...and so on
 *
 * WHY arr.length-1-i in inner loop?
 * After each pass, the last i elements are already sorted.
 * No need to compare them again — saves unnecessary iterations.
 *
 *  Pass 0: compare till index 4 (length-1-0)  [9 bubbles to end]
 *  Pass 1: compare till index 3 (length-1-1)  [7 bubbles to end]
 *  Pass 2: compare till index 2 (length-1-2)  ...
 *
 * TIME COMPLEXITY  : O(n²) - two nested loops
 * SPACE COMPLEXITY : O(1)  - sorting is done in-place
 */
public class bubbleSort {

    public static void bubbleSort(int arr[]) {

        // Outer loop: controls how many passes we make
        // We need n-1 passes to fully sort n elements
        for (int i = 0; i < arr.length - 1; i++) {

            // Inner loop: compares adjacent pairs in each pass
            // arr.length-1-i → last i elements are already sorted, skip them
            for (int j = 0; j < arr.length - 1 - i; j++) {

                if (arr[j] > arr[j + 1]) {
                    // ---------------------------------------------------
                    // SWAP: current element is greater than next element
                    // → They are in wrong order, swap them
                    //
                    // Example: [9, 7] → temp=9, arr[0]=7, arr[1]=9 → [7, 9]
                    // ---------------------------------------------------
                    int temp   = arr[j];
                    arr[j]     = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = { 9, 7, 5, 4, 3, 2 };
        System.out.println("Sorted Array: ");
        bubbleSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
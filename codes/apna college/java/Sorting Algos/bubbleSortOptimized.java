/**
 * Optimized Bubble Sort Algorithm
 *
 * PROBLEM WITH BASIC BUBBLE SORT:
 * Even if the array gets sorted early (e.g after pass 2 of 5),
 * the basic version keeps making useless passes till the end.
 *
 * Example: arr = [1, 2, 3, 4, 5] (already sorted)
 * Basic version still runs ALL n-1 passes → wasteful!
 *
 * OPTIMIZATION: Use a boolean flag "swapped"
 * - If NO swaps happened in an entire pass
 *   → Array is already sorted!
 *   → STOP early, no need for more passes
 *
 * VISUAL EXAMPLE (already sorted):
 *
 * arr = [1, 2, 3, 4, 5]
 *
 * Pass 1:
 *   Compare 1,2 → no swap
 *   Compare 2,3 → no swap
 *   Compare 3,4 → no swap
 *   Compare 4,5 → no swap
 *   swapped = false → STOP immediately ✅
 *
 * Without optimization → would do 4 more useless passes
 * With optimization    → stops after just 1 pass!
 *
 * TIME COMPLEXITY:
 *   Best Case  : O(n)   → already sorted, only 1 pass needed
 *   Worst Case : O(n²)  → reverse sorted, all passes needed
 * SPACE COMPLEXITY : O(1) - in-place sorting
 */
public class bubbleSortOptimized {

    public static void bubbleSortOptimized(int arr[]) {

        for (int i = 0; i < arr.length - 1; i++) {

            // ------------------------------------------------------------
            // FLAG: tracks whether any swap happened in this pass
            // Reset to false at the START of every pass
            // If it stays false after full inner loop → array is sorted!
            // ------------------------------------------------------------
            boolean swapped = false;

            for (int j = 0; j < arr.length - 1 - i; j++) {

                if (arr[j] > arr[j + 1]) {
                    // Swap adjacent elements
                    int temp   = arr[j];
                    arr[j]     = arr[j + 1];
                    arr[j + 1] = temp;

                    swapped = true;    // ← mark that a swap occurred in this pass
                }
            }

            // ------------------------------------------------------------
            // EARLY EXIT CHECK:
            // If no swaps happened in the entire inner loop,
            // the array is already fully sorted → no need for more passes
            // ------------------------------------------------------------
            if (!swapped) {  // means swapped == false
                System.out.println("Array was sorted! Early exit at pass: " + (i + 1));
                break;   // no swaps happened → array is sorted → STOP
            }
        }
    }

    public static void main(String[] args) {

        // Test Case 1: Unsorted array
        // Expected passes: multiple passes needed
        int arr1[] = { 9, 7, 5, 4, 3, 2 };
        System.out.println("Test 1 - Unsorted Array:");
        bubbleSortOptimized(arr1);
        for (int i = 0; i < arr1.length; i++) System.out.print(arr1[i] + " ");
        System.out.println("\n");

        // Test Case 2: Already sorted array
        // Expected: exits after just 1 pass (the optimization in action!)
        int arr2[] = { 1, 2, 3, 4, 5 };
        System.out.println("Test 2 - Already Sorted Array:");
        bubbleSortOptimized(arr2);
        for (int i = 0; i < arr2.length; i++) System.out.print(arr2[i] + " ");
    }
}
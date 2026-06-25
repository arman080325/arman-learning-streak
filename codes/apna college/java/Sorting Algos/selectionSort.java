/**
 * Selection Sort Algorithm
 *
 * PROBLEM STATEMENT:
 * Sort an array in ascending order by repeatedly SELECTING the
 * minimum element from the unsorted portion and placing it at
 * the beginning of the unsorted portion.
 *
 * CONCEPT (Think visually):
 * Divide array into two parts:
 * | SORTED PORTION  |  UNSORTED PORTION  |
 * | 2, 3, 4,        |  5, 7, 9           |
 *
 * Each pass: find minimum in unsorted → swap it to end of sorted
 *
 * EXAMPLE WALKTHROUGH: [9, 7, 5, 4, 3, 2]
 *
 * Pass 0: unsorted=[9,7,5,4,3,2]  min=2(pos 5) → swap 9,2 → [2, 7,5,4,3,9]
 * Pass 1: unsorted=[7,5,4,3,9]    min=3(pos 4) → swap 7,3 → [2,3, 5,4,7,9]
 * Pass 2: unsorted=[5,4,7,9]      min=4(pos 3) → swap 5,4 → [2,3,4, 5,7,9]
 * Pass 3: unsorted=[5,7,9]        min=5(pos 3) → no swap  → [2,3,4,5, 7,9]
 * Pass 4: unsorted=[7,9]          min=7(pos 4) → no swap  → [2,3,4,5,7, 9]
 * Done! ✅
 *
 * WHY i goes till n-1?
 * After n-1 passes, last element is automatically in correct position.
 * No need to process it separately.
 *
 * WHY j starts from i+1?
 * Elements before i are already SORTED, no need to look at them again.
 *
 * TIME COMPLEXITY  : O(n²) - two nested loops, always runs fully
 * SPACE COMPLEXITY : O(1)  - sorting done in-place, only temp variable used
 *
 * NOTE: Selection Sort has NO optimization for already sorted arrays.
 * It ALWAYS runs all passes regardless → unlike Bubble Sort (swapped flag)
 */
public class selectionSort {

    public static void selectionSort(int arr[]) {

        int n = arr.length;

        // Outer loop: represents the boundary of sorted | unsorted portion
        // After each pass, sorted portion grows by 1 element
        // i = starting index of unsorted portion
        for (int i = 0; i < n - 1; i++) {

            // -------------------------------------------------------
            // ASSUME: current position i has the minimum element
            // We will scan the rest to verify or update this assumption
            // -------------------------------------------------------
            int minPos = i;              // position of minimum element found so far

            // Inner loop: scan the entire UNSORTED portion to find true minimum
            // starts at i+1 because arr[i] is already considered as minPos
            for (int j = i + 1; j < n; j++) {

                if (arr[minPos] > arr[j]) {
                    // ---------------------------------------------------
                    // Found a smaller element at position j
                    // Update minPos to point to this new minimum
                    //
                    // NOTE: we only store the POSITION, not the value
                    // This avoids unnecessary swaps inside the inner loop
                    // ---------------------------------------------------
                    minPos = j;          // update minimum position
                }
            }

            // -----------------------------------------------------------
            // SWAP: place the minimum element at position i
            // (beginning of unsorted portion = end of sorted portion)
            //
            // Example:
            //   i=0, arr=[9,7,5,4,3,2], minPos=5 (value 2)
            //   temp=2, arr[5]=9, arr[0]=2
            //   arr=[2,7,5,4,3,9] → 2 is now in its correct position ✅
            //
            // NOTE: swap happens OUTSIDE inner loop (only once per pass)
            // This is why Selection Sort makes fewer swaps than Bubble Sort
            // Bubble Sort: up to O(n²) swaps
            // Selection Sort: exactly O(n) swaps
            // -----------------------------------------------------------
            int temp      = arr[minPos];
            arr[minPos]   = arr[i];
            arr[i]        = temp;
        }
    }

    public static void main(String[] args) {

        // Test case walkthrough:
        //
        // Initial : [9, 7, 5, 4, 3, 2]
        // Pass 0  : min=2(i=5) → swap with 9 → [2, 7, 5, 4, 3, 9]
        // Pass 1  : min=3(i=4) → swap with 7 → [2, 3, 5, 4, 7, 9]
        // Pass 2  : min=4(i=3) → swap with 5 → [2, 3, 4, 5, 7, 9]
        // Pass 3  : min=5(i=3) → already here→ [2, 3, 4, 5, 7, 9]
        // Pass 4  : min=7(i=4) → already here→ [2, 3, 4, 5, 7, 9]
        // Output  : 2 3 4 5 7 9 ✅

        int arr[] = { 9, 7, 5, 4, 3, 2 };
        System.out.println("Sorted Array: ");
        selectionSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
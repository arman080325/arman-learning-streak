/**
 * Trapping Rainwater Problem
 *
 * PROBLEM STATEMENT:
 * Given an array of heights (like a bar chart), calculate how much
 * rainwater can be trapped between the bars after it rains.
 *
 * CONCEPT (Think visually):
 *
 *        |
 *    |   |     |
 *    |   |  |  |
 *    | ~ | ~~ ~|  <- ~ = trapped water
 *    |___|_____|
 *   4  2  0  6  3  2  5   <- height array
 *
 * LOGIC:
 * Water trapped at any bar = min(leftMax, rightMax) - height[i]
 * Because water can only fill up to the SHORTER boundary wall.
 *
 * APPROACH: Pre-compute left and right max boundaries using helper arrays
 * TIME COMPLEXITY  : O(n) - three separate single loops
 * SPACE COMPLEXITY : O(n) - two extra arrays (leftMax, rightMax)
 */
public class trappingRainwater {

    public static int trappedRainwater(int height[]) {

        int h = height.length;

        // ---------------------------------------------------------------
        // STEP 1: Build LEFT MAX array
        // leftMax[i] = tallest bar from index 0 to i (including itself)
        // This tells us the LEFT WALL height for each position
        //
        // Example: height  = [4, 2, 0, 6, 3, 2, 5]
        //          leftMax  = [4, 4, 4, 6, 6, 6, 6]
        //                      ^           ^
        //                  starts as    updates when a taller bar is found
        //                  height[0]
        // ---------------------------------------------------------------
        int leftMax[] = new int[h];
        leftMax[0] = height[0];                           // first bar has no bar to its left
        for (int i = 1; i < h; i++) {
            leftMax[i] = Math.max(height[i], leftMax[i - 1]);
            //                    ^current    ^previous max
            // keep whichever is taller: current bar OR previous left max
        }

        // ---------------------------------------------------------------
        // STEP 2: Build RIGHT MAX array
        // rightMax[i] = tallest bar from index i to end (including itself)
        // This tells us the RIGHT WALL height for each position
        //
        // Example: height   = [4, 2, 0, 6, 3, 2, 5]
        //          rightMax  = [6, 6, 6, 6, 5, 5, 5]
        //                                        ^
        //                                    starts as height[h-1]
        //                                    (last bar, no bar to its right)
        // ---------------------------------------------------------------
        int rightMax[] = new int[h];
        rightMax[h - 1] = height[h - 1];                 // last bar has no bar to its right
        for (int i = h - 2; i >= 0; i--) {               // traverse RIGHT to LEFT
            rightMax[i] = Math.max(height[i], rightMax[i + 1]);
            //                     ^current    ^previous max (from right side)
        }

        // ---------------------------------------------------------------
        // STEP 3: Calculate trapped water at each bar
        //
        // At every index i:
        //   - Water level = min(leftMax[i], rightMax[i])
        //     WHY MIN? Water spills over the SHORTER wall, so the shorter
        //     wall decides how high water can stand.
        //
        //   - Water trapped at i = waterLevel - height[i]
        //     WHY SUBTRACT? The bar itself takes up space, water sits
        //     only in the remaining gap above the bar.
        //
        // Example at index 2 (height = 0):
        //   leftMax[2]  = 4
        //   rightMax[2] = 6
        //   waterLevel  = min(4, 6) = 4
        //   water at i  = 4 - 0    = 4 units
        // ---------------------------------------------------------------
        int trappedWater = 0;
        for (int i = 0; i < h; i++) {

            int waterLevel = Math.min(leftMax[i], rightMax[i]);  // effective water height

            trappedWater += waterLevel - height[i];              // accumulate trapped water
            // Note: this never goes negative because waterLevel >= height[i]
            // always (since leftMax and rightMax include height[i] itself)
        }

        return trappedWater;
    }

    public static void main(String args[]) {

        // Test case visualization:
        //
        //  6           |
        //  5   |       |        |
        //  4   |       |        |
        //  3   |   ~   |  |     |
        //  2   |   ~   |  |  |  |
        //  1   |   ~   |  |  |  |
        //      4   2   0  6  3  2  5
        //      i=0 i=1 i=2 ...     i=6
        //
        // Expected trapped water = 11 units

        int height[] = { 4, 2, 0, 6, 3, 2, 5 };
        System.out.println("Total Rainwater Trapped is : " + trappedRainwater(height));
        // Output: Total Rainwater Trapped is : 11
    }
}
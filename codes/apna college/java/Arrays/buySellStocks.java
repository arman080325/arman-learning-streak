/**
 * Buy and Sell Stocks Problem (Single Transaction)
 *
 * PROBLEM STATEMENT:
 * Given an array of stock prices where prices[i] = price on day i,
 * find the MAXIMUM PROFIT you can make by buying on one day and
 * selling on a LATER day. (You can only do ONE transaction)
 *
 * CONSTRAINT: You must BUY before you SELL
 *
 * CONCEPT (Think visually):
 *
 * Price
 *   7 |*
 *   6 |          *
 *   5 |      *
 *   4 |              *
 *   3 |          *        <- not best sell
 *   2 |
 *   1 |   *  <- best buy day
 *       Day: 0  1  2  3  4  5
 *  prices = [7, 1, 5, 3, 6, 4]
 *
 *  Best case: Buy at 1 (day 1), Sell at 6 (day 4) = Profit of 5
 *
 * LOGIC:
 * - Track the MINIMUM price seen so far as buyPrice
 * - At each day, calculate profit if we sold TODAY
 * - Keep track of the MAXIMUM profit seen so far
 *
 * KEY INSIGHT:
 * We don't need to check every buy-sell pair (that would be O(n²))
 * We just track the lowest price so far and calculate profit greedily.
 *
 * TIME COMPLEXITY  : O(n) - single loop
 * SPACE COMPLEXITY : O(1) - no extra arrays, just two variables
 */
public class buySellStocks {

    public static int buySellStocks(int prices[]) {

        // Start with highest possible value so any real price
        // will immediately become the first buyPrice
        int buyPrice = Integer.MAX_VALUE;

        int maxProfit = 0;   // if no profit possible, return 0 (no transaction)

        for (int i = 0; i < prices.length; i++) {

            if (buyPrice < prices[i]) {
                // -------------------------------------------------------
                // CASE 1: Today's price is HIGHER than our buy price
                // → This means we can make a profit if we sell today
                //
                // Example:
                //   buyPrice = 1, prices[i] = 5
                //   profit   = 5 - 1 = 4
                //   Is 4 > maxProfit(0)? YES → update maxProfit = 4
                // -------------------------------------------------------
                int profit = prices[i] - buyPrice;               // profit if sold today
                maxProfit = Math.max(maxProfit, profit);         // keep best profit so far

            } else {
                // -------------------------------------------------------
                // CASE 2: Today's price is LOWER than or EQUAL to buyPrice
                // → Found a cheaper price to buy! Update buyPrice.
                //
                // WHY? Buying at a lower price gives MORE profit on future days
                //
                // Example:
                //   prices = [7, 1, ...]
                //   Day 0: buyPrice = 7 (initialized from MAX_VALUE)
                //   Day 1: prices[1]=1 < buyPrice=7 → update buyPrice = 1
                //          Now we're looking for a sell price > 1
                // -------------------------------------------------------
                buyPrice = prices[i];                            // found cheaper buy day
            }
        }

        return maxProfit;
    }

    public static void main(String[] args) {

        // Test case walkthrough:
        //
        // prices = [7,  1,  5,  3,  6,  4]
        // day       0   1   2   3   4   5
        //
        // Day 0: buyPrice=MAX → 7 not < MAX  → update buyPrice = 7
        // Day 1: buyPrice=7  → 1 not > 7    → update buyPrice = 1  (cheaper!)
        // Day 2: buyPrice=1  → 5 > 1        → profit = 4, maxProfit = 4
        // Day 3: buyPrice=1  → 3 > 1        → profit = 2, maxProfit = 4 (no change)
        // Day 4: buyPrice=1  → 6 > 1        → profit = 5, maxProfit = 5 ✅
        // Day 5: buyPrice=1  → 4 > 1        → profit = 3, maxProfit = 5 (no change)
        //
        // Output: Maximum Profit is : 5

        int prices[] = { 7, 1, 5, 3, 6, 4 };
        System.out.println("Maximum Profit is : " + buySellStocks(prices));
    }
}
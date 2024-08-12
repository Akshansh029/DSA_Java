// You are given an array prices where prices[i] is the price of a given stock on the ith day. You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock. Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.

public class BuySellStocks {

    public static int maxProfit(int[] prices) {
        int minValue = Integer.MAX_VALUE;
        int maxValue = Integer.MIN_VALUE;
        int minIndex = -1;

        for (int i = 0; i < prices.length; i++) {
            minValue = Math.min(prices[i], minValue);
        }
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] == minValue) {
                minIndex = i;
            }
        }

        for (int i = minIndex; i < prices.length; i++) {
            maxValue = Math.max(maxValue, prices[i]);
        }

        return maxValue - minValue;
    }

    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        int[] prices1 = {2, 4, 1};
        System.out.println(maxProfit(prices1));
    }
}

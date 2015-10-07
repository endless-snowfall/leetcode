package leetcode.problems.problem00122;

public class Solution {

    public int maxProfit(int[] prices) {
        if (prices == null || prices.length < 2) {
            return 0;
        }

        int result = 0;
        int min = prices[0];
        int max = prices[0];

        for (int i = 1; i < prices.length; i++) {
            int currentPrice = prices[i];

            if (currentPrice > max) {
                max = currentPrice;
            }

            if (currentPrice < max || i == prices.length - 1) {
                result += max - min;
                min = currentPrice;
                max = currentPrice;
            }
        }

        return result;
    }
}

package leetcode.problems.problem00121;

public class Solution {

    public int maxProfit(int[] prices) {
        if (prices == null || prices.length < 2) {
            return 0;
        }

        int result = 0;
        int min = prices[0];

        for (int i = 1; i < prices.length; i++) {
            int currentPrice = prices[i];

            result = Math.max(result, currentPrice - min);

            if (currentPrice < min) {
                min = currentPrice;
            }
        }

        return result;
    }
}

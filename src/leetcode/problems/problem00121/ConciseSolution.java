package leetcode.problems.problem00121;

public class ConciseSolution {

    public int maxProfit(int[] prices) {
        if (prices == null || prices.length < 2) {
            return 0;
        }

        int result = 0;
        int minIndex = 0;

        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < prices[minIndex]) {
                minIndex = i;
            }

            result = Math.max(result, prices[i] - prices[minIndex]);
        }

        return result;
    }
}

public class BuySellStocks {
    public int maxProfit(int[] prices) {
        int minPrices = Integer.MIN_VALUE;
        int profit = 0;
        for (int i = 0; i < prices.length; i++) {
            minPrices = Integer.min(minPrices, prices[i]);
            profit = Integer.max(profit, prices[i] - minPrices);
        }
        return profit;
    }
}

class Solution {
    public int maxProfit(int[] prices) {
        int lowestBuyingPrice = prices[0];
        int highestSellingPrice = 0;
        int maxProfit = 0;
        for (int sell : prices) {
            maxProfit = Math.max(maxProfit, sell - lowestBuyingPrice);
            lowestBuyingPrice = Math.min(lowestBuyingPrice, sell);
        }


        return maxProfit > 0 ? maxProfit : 0;
    }
}

class Solution {
    public int maxProfit(int[] prices) {
        int lowestBuyingPrice = prices[0];
        int highestSellingPrice = 0;
        int currentProfit = 0;
        int maxProfit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (i < prices.length - 1 && prices[i] < lowestBuyingPrice) {
                lowestBuyingPrice = prices[i];
                highestSellingPrice = lowestBuyingPrice;
            } else if (prices[i] > highestSellingPrice) {
                highestSellingPrice = prices[i];
            }
            currentProfit = highestSellingPrice - lowestBuyingPrice;
            if (currentProfit > maxProfit) {
                maxProfit = currentProfit;
            }
        }


        return maxProfit > 0 ? maxProfit : 0;
    }
}

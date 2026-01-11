public class bestTimeBuySellStock {
    // LeetCode Easy
    // Time Complexity: O(n)
    // Find the smallest buy price and max profit in one for loop. 
    // Assume the prices array is at least of size one. 

    public int maxProfit(int[] prices){
        int buy = prices[0];
        int profit = 0;
        for (int i = 1; i < prices.length; i++)
        {
            buy = Math.min(buy, prices[i]);
            profit = Math.max(profit, prices[i] - buy);
        }
        return profit;
    }
    public static void main(String[] args) {
        System.out.println("BEST TIME TO BUY AND SELL STOCK");
    }
}
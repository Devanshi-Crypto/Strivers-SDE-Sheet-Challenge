public class stockBuySell {
    public static int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for(int i = 0; i < prices.length; i++) {
            if(prices[i] < minPrice) {
               minPrice = prices[i];
            }
            else if(prices[i] - minPrice > maxProfit) {
                maxProfit = prices[i] - minPrice;
            }
        }
        return maxProfit;
    }
    
    // Driver Code 
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
    }
}

/* alternate approach
 * public static int maximumProfit(ArrayList<Integer> prices){
 * // Write your code here.
 * int minPrice = Integer.MAX_VALUE;
 * int maxProfit = 0;
 * 
 * for (int price : prices) {
 * if (price < minPrice) {
 * minPrice = price; // Update the minimum price
 * } else if (price - minPrice > maxProfit) {
 * maxProfit = price - minPrice; // Update the maximum profit
 * }
 * }
 * 
 * return maxProfit;
 * }
 */
package Solutions;

public class Solution121BestTimeToBuyAndSellStock {
	public int maxProfit(int[] prices) {
        int accumulateProfit = 0;
        int maxProfit = 0;
        for(int i = 1 ; i < prices.length ; i++){
        	accumulateProfit = Math.max(0, accumulateProfit + prices[i] - prices[i -1]);
            maxProfit = Math.max(maxProfit, accumulateProfit);
        }
        return maxProfit;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution121BestTimeToBuyAndSellStock test  = new Solution121BestTimeToBuyAndSellStock();
		int[] prices = {7,1,5,3,6,4};
		System.out.println(test.maxProfit(prices));
	}

}

class Solution {
    public int maxProfit(int[] prices) {
        int l = 0;
        int r = 1;
        int ans = 0;
        while(r<prices.length){
            int profit = prices[r]-prices[l];
            if(profit>ans){
                ans = profit;
                r++;
            }else if(prices[l]>prices[r]){
                l = r;
                r++;
            }else{
                r++;
            }
        }
        return ans;
    }

}

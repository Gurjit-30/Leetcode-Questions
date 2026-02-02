class Solution {
    public int maxProfit(int[] prices) {
        int mi=prices[0];
        int pro=0;
        for(int i=1;i<prices.length;i++){
            if(mi>prices[i]){
                mi=prices[i];
            }else{
                if(prices[i]-mi>0){
  pro=Math.max(prices[i]-mi,pro);
                }
              
            }
        }
        return pro;
    }
}
class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int mi=prices[0];
        int m=0;
        for(int i=1;i<n;i++){
            if(mi>prices[i]){
               mi= prices[i];

            }else{
                m+=prices[i]-mi;
                mi=prices[i];

            }
        }
        return m;
    }
}
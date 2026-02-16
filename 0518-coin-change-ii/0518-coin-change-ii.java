class Solution {
    public int change(int amount, int[] coins) {

        int[] dp=new int[amount+1];
        dp[0]=1;
        for(int ele:coins){
            for(int i=ele;i<=amount;i++){
                dp[i]+=dp[i-ele];
            }
        }
        return dp[amount];
    }
}
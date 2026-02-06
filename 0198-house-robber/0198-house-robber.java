class Solution {
    public static int r(int i,int[] nums,int dp[]){
        if(i>nums.length || i==nums.length){
           
            return 0;

        }
        if(dp[i]!=-1){
            return dp[i];
        }
       dp[i]= Math.max(r(i+1,nums,dp),nums[i]+r(i+2,nums,dp));
       return dp[i];
    }

    
    public int rob(int[] nums) {
        int[] dp=new int[nums.length+1];
        Arrays.fill(dp,-1);
        return r(0,nums,dp);
    }
}
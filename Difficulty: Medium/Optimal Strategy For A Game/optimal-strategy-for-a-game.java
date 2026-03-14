
class Solution {
    public int help(int s,int l,int[]arr,int[][] dp){
        if(l<s){
            return 0;
        }
        if(dp[s][l]!=-1){
            return dp[s][l];
        }
        int first=arr[s]+Math.min(help(s+2,l,arr,dp),help(s+1,l-1,arr,dp));
        int last=arr[l]+Math.min(help(s,l-2,arr,dp),help(s+1,l-1,arr,dp));
        dp[s][l]=Math.max(first,last);
        return dp[s][l];
        
    }
    public int maximumAmount(int arr[]) {
        int n=arr.length;
        // code here
        int[][] dp=new int[arr.length][arr.length];
        for(int[] r:dp){
            Arrays.fill(r,-1);
        }
        return help(0,n-1,arr,dp);
    }
}

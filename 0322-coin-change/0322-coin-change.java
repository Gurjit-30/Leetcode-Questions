class Solution {
    public static int cg(int[] coins,int tar,int[] arr){
         if(tar==0){
            return 0;
        }
        if(tar<0){
            return Integer.MAX_VALUE;

        }
        if(arr[tar]!=-1){
            return arr[tar];
        }
         int mi=Integer.MAX_VALUE;
        for(int i=0;i<coins.length;i++){
           
            int ans=cg(coins,tar-coins[i],arr);
           
            if(ans!=Integer.MAX_VALUE){
                 
                mi=Math.min(mi,ans+1);

            }
        }
        arr[tar]=mi;
        return arr[tar];
    }
    public int coinChange(int[] coins, int tar) {
        int[] arr=new int[tar+1];
        Arrays.fill(arr,-1);
        if(cg(coins,tar,arr)!=Integer.MAX_VALUE){
            return cg(coins,tar,arr);
        }else{
            return -1;
        }

       
    }
}
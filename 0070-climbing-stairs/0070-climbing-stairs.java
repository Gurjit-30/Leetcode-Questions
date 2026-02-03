class Solution {
    // public static int cs(int n,int[] arr){
    //     if(n==0){
    //         return 1;
    //     }
    //     if(n<0){
    //         return 0;
    //     }
    //     if(arr[n]!=-1){
    //         return arr[n];
    //     }
    //     arr[n]= cs(n-1,arr)+cs(n-2,arr);
    //     return arr[n];

    // }
    public int climbStairs(int n) {
        int[] arr=new int[n+1];
        Arrays.fill(arr,-1);
        if(n==0 ||n==1){
            return 1;
        }
       arr[0]=1;
       arr[1]=1;
        for(int i=2;i<=n;i++){
            arr[i]=arr[i-1]+arr[i-2];
        }
        return arr[n];
    }
}
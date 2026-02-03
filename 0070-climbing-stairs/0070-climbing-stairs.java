class Solution {
    public static int cs(int n,int[] arr){
        if(n==0){
            return 1;
        }
        if(n<0){
            return 0;
        }
        if(arr[n]!=-1){
            return arr[n];
        }
        arr[n]= cs(n-1,arr)+cs(n-2,arr);
        return arr[n];

    }
    public int climbStairs(int n) {
        int[] arr=new int[n+1];
        Arrays.fill(arr,-1);
        return cs(n,arr);
        
    }
}
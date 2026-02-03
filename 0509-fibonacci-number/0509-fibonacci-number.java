class Solution {
    public static int f(int n,int[] arr){
        if(n==0 || n==1){
            return n;

        }
        if(arr[n]!=-1){
            return arr[n];
        }
        arr[n]=f(n-1,arr)+f(n-2,arr);
        return arr[n];
    }
    public static int fib(int n){
        int[] arr=new int[n+1];
        Arrays.fill(arr,-1);
        return f(n,arr);
       
         
       
        
        

        
    }
}
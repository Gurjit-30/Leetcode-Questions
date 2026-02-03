class Solution {
    
        // if(n==0 || n==1){
        //     return n;

        // }
        // if(arr[n]!=-1){
        //     return arr[n];
        // }
        // arr[n]=f(n-1,arr)+f(n-2,arr);
        // return arr[n];
    
    public static int fib(int n){
        int[] arr=new int[n+1];
        Arrays.fill(arr,-1);
       if(n==0 || n==1){
        return n;
       }
        arr[0]=0;
        arr[1]=1;


       
       for(int i=2;i<=n;i++){
        arr[i]=arr[i-1]+arr[i-2];
        
       }
       return arr[n];

       
         
       
        
        

        
    }
}
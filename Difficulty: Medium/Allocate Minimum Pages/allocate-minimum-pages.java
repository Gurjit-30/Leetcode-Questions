class Solution {
    boolean ispos(int[] arr,int k,int mid){
        int pages=0;
        int stc=1;
        for(int i=0;i<arr.length;i++){
            if(pages+arr[i]<=mid){
                pages+=arr[i];

            }else{
                stc++;
                pages=arr[i];
                 if(stc>k ||arr[i]>mid){
                return false;
            }
            }
           
        }
        return true;
    }
    public int findPages(int[] arr, int k) {
        if(arr.length<k)return -1;
        // code here
        int s=Integer.MAX_VALUE;
        int su=0;
        for(int i=0;i<arr.length;i++){
            su+=arr[i];
            s=Math.min(s,arr[i]);
        }
        int e=su;
        int ans=-1;
        int mid=(s+e)/2;
        while(s<=e){
            if(ispos(arr,k,mid)){
                ans=mid;
                e=mid-1;
                 
            }else{
                s=mid+1;
            }
             mid=(s+e)/2;
             
        }
        return ans;
        
    }
}
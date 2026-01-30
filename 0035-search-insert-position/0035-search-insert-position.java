class Solution {
    public int searchInsert(int[] nums, int target) {
        int s=0,n=nums.length,e=n-1;
        int mid=0;
        while(s<=e){
            mid=s+(e-s)/2;
            if(nums[mid]==target){
                 return mid;
            }else if(nums[mid]<target){
                s=mid+1;
            }else{
                e=mid-1;
            }
        }
        return s;
       
        
    }
}
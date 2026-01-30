class Solution {
    public int search(int[] nums, int target) {
        int n=nums.length;
        int s=0,e=n-1;
        int mid=0;
          while(s<=e){
            mid=e+(s-e)/2;
            if(nums[mid]==target){
                return mid;
            }else if(nums[mid]<target){
                s=mid+1;
            }else{
                e=mid-1;
            }

          }
          return -1;
        

        }
    }

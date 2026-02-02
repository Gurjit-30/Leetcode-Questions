class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n=nums1.length, nn=nums2.length;
        int[] arr=new int[n+nn];
        System.arraycopy(nums1,0,arr,0,nums1.length);
        System.arraycopy(nums2,0,arr,nums1.length,nums2.length);
        Arrays.sort(arr);
        double ans=0.0;
        int mid=(0+arr.length)/2;
        if(arr.length%2==0){
           
            ans=(arr[mid]+arr[mid-1])/2.0;

        }else{
            ans=arr[mid];
        }
        return  ans;

    }
}
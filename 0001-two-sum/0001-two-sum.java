class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> ar=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int com=target-nums[i];
            if(ar.containsKey(com)){
                return new int[]{ar.get(com),i};
            }
            ar.put(nums[i],i);
        }
        return new int[]{-1,-1};
    }
}


import java.util.*;
class Solution {
    public List<Integer> majorityElement(int[] nums) {
        Set<Integer> ans=new HashSet<>();
        HashMap<Integer,Integer> s=new HashMap<>();
        for(int num:nums){
            s.put(num,s.getOrDefault(num,0)+1);
            if(s.get(num)>nums.length/3){
                ans.add(num);
            }
        }
        
         return new ArrayList<>(ans);
    }
}
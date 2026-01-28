class Solution {
    public void help(List<List<Integer>> ans,int[] arr,int i,List<Integer> curr){
        if(i>=arr.length){
            ans.add(new ArrayList<>(curr));
            return ;
        }
        curr.add(arr[i]);
        help(ans,arr,i+1,curr);
        curr.remove(curr.size()-1);
        help(ans,arr,i+1,curr);

    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> curr=new ArrayList<>();
        help(ans,nums,0,curr);
        return ans;

        
    }
}
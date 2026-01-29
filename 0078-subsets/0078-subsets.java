class Solution {
    public void rec(List<List<Integer>> ans,int[] arr, List<Integer> cur,int i){
        if(i==arr.length){
            ans.add(new ArrayList<>(cur));
            return;
        }
        cur.add(arr[i]);
        rec(ans,arr,cur,i+1);
        cur.remove(cur.size()-1);
        rec(ans,arr,cur,i+1);

    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> cur=new ArrayList<>();
        rec(ans,nums,cur,0);
        return ans;


        
    }
}
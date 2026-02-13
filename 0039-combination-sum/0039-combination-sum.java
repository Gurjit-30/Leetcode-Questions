class Solution {
    public void help(int[] arr,int tar,int s,List<List<Integer>> ans,List<Integer> cur){
        if(tar==0){
            ans.add(new ArrayList<>(cur));
            return ;
        } 
        if(tar<0){
            return ;
        }
        for(int i=s;i<arr.length;i++){
            cur.add(arr[i]);
            help(arr,tar-arr[i],i,ans,cur);
            cur.remove(cur.size() - 1);
        }
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans=new ArrayList<>();
        help(candidates,target,0,ans,new ArrayList<>());
        return ans;
        
    }
}
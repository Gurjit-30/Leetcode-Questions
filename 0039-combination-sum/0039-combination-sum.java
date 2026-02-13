class Solution {
    HashSet<List<Integer>> se=new HashSet<>();
    public void help(int[] arr,int tar,int i,List<Integer> cur,List<List<Integer>>ans){
        if(i==arr.length || tar<0){
            return ;
        }
        if(tar==0){
            if(se.contains(cur)){
 return;
            }
            ans.add(new ArrayList<>(cur));
 se.add(cur);
 
            return;
        }
       
            cur.add(arr[i]);
            help(arr,tar-arr[i],i+1,cur,ans);
            help(arr,tar-arr[i],i,cur,ans);
            cur.remove(cur.size()-1);
            help(arr,tar,i+1,cur,ans);
        
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
         List<List<Integer>> ans=new ArrayList<>();
         help(candidates,target,0,new ArrayList<>(),ans);
         return ans;
    }
}
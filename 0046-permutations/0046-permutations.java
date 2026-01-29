class Solution {
    public void rec(List<List<Integer>>ans,List<Integer> cur,int[] arr,boolean[] vi){
        if(cur.size()==arr.length){
            ans.add(new ArrayList<>(cur));
            return;
        }

    for(int i=0;i<arr.length;i++){
        if(vi[i]) continue;
        cur.add(arr[i]);
        vi[i]=true;
        rec(ans,cur,arr,vi);
        cur.remove(cur.size()-1);
        vi[i]=false;

    }
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
       
        rec(ans,new ArrayList<>(),nums,new boolean[nums.length]);
        return ans;

    }
}
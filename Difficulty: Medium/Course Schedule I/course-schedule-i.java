class Solution {
    public boolean dfs(int i,  ArrayList<ArrayList<Integer>> adj,boolean[] vis,boolean[] rop){
        vis[i]=true;
        rop[i]=true;
        for(int neigh:adj.get(i)){
            if(!vis[neigh]){
               if(  dfs(neigh,adj,vis,rop)==false)return false ;
            }else if(rop[neigh])return false;
        }
        rop[i]=false;
        return true;
    }
    public boolean canFinish(int n, int[][] pre) {
        // code here
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        for(int[] r:pre){
            int u=r[0];
            int v=r[1];
            adj.get(u).add(v);
        }
        boolean[] rop=new boolean[n];
        boolean[] vis=new boolean[n];
        for(int i=0;i<n;i++){
            if(!vis[i]){
               if(  dfs(i,adj,vis,rop)==false)return false;
            }
        }
        return true;
    }
}
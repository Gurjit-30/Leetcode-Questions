class Solution {
    public boolean dfs(ArrayList<ArrayList<Integer>> adj,boolean[] vis,int node ,int par){
        vis[node]=true;
        for(int neighbour:adj.get(node)){
            if(!vis[neighbour]){
                if(dfs(adj,vis,neighbour,node))return true;
            }else if(neighbour != par)return true;
            
        }
        return false;
    }
    
    public boolean isCycle(int V, int[][] edges) {
        // Code here
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        for(int i=0;i<V;i++){
            adj.add(new ArrayList<>());
        }
        boolean[] vis=new boolean[V];
        for(int[] e:edges){
            int u=e[0];
            int v=e[1];
            adj.get(u).add(v);
            adj.get(v).add(u);
            
        }
        for(int i=0;i<V;i++){
            if(!vis[i]){
                           if(dfs(adj,vis,i,-1))return true; 
            }

        }
        return false;
    }
}
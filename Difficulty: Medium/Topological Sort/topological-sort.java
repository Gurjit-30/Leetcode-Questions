class Solution {
    
    
    public void dfs(int i,ArrayList<ArrayList<Integer>>adj,Stack<Integer> st,boolean[] vis){
        vis[i]=true;
        for(int j:adj.get(i)){
            if(!vis[j]){
                dfs(j,adj,st,vis);
                
                
            }
        }
         st.push(i);
    
    }
    public ArrayList<Integer> topoSort(int V, int[][] edges) {
        // code here
        
       ArrayList< ArrayList<Integer>> adj=new ArrayList<>();
       for(int i=0;i<V;i++){
           adj.add(new ArrayList<>());
       }
        for(int[] e:edges){
            int u=e[0];
            int v=e[1];
            adj.get(u).add(v);
            
        }
        boolean[] vis=new boolean[V];
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<V;i++){
            if(!vis[i]){
                            dfs(i,adj,st,vis);

            }
        }
        ArrayList<Integer> ans=new ArrayList<>();
        while(!st.isEmpty()){
            ans.add(st.pop());
        }
        return ans;
    }
}
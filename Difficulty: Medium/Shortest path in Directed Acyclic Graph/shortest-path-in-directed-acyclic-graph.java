// User function Template for Java
class Solution {
    class pair{
        int n;
        int w;
        pair(int n,int w){
            this.n=n;
            this.w=w;
        }
    }
    public void dfs(int i, ArrayList<ArrayList<pair>>adj,Stack<Integer> st,boolean[] vis){
        vis[i]=true;
        for(pair ne:adj.get(i)){
            if(!vis[ne.n]){
                dfs(ne.n,adj,st,vis);
            }
        }
        st.push(i);
    }

    public int[] shortestPath(int V, int E, int[][] edges) {
        // Code here
        ArrayList<ArrayList<pair>>adj=new ArrayList<>();
        for(int i=0;i<V;i++){
            adj.add(new ArrayList<pair>());
            
        }
        for(int[] e:edges){
            int u=e[0];
            int v=e[1];
            int w=e[2];
            adj.get(u).add(new pair(v,w));
            
        }
        Stack<Integer> st=new Stack<>();
        boolean[] vis=new boolean[V];
        for(int i=0;i<V;i++){
            if(!vis[i]){
                dfs(i,adj,st,vis);
            }
        }
        int dist[]=new int[V];
        Arrays.fill(dist,(int)1e9);
        dist[0]=0;
        while(!st.isEmpty()){
            int u=st.pop();
            if(dist[u]!=1e9){
                for(pair ne:adj.get(u)){
                    int n=ne.n;
                    int w=ne.w;
                    if(dist[u]+w<dist[n]){
                        dist[n]=dist[u]+w;
                    }
                }
            }
        }
        for(int i=0;i<V;i++){
            if(dist[i]==1e9){
                dist[i]=-1;
            }
        }
        return dist;
       
    }
}
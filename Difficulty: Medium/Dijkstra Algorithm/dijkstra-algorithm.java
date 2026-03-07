class Solution {
    class pair{
        int n;
        int w;
        pair(int n,int w){
            this.n=n;
            this.w=w;
        }
    }
    public int[] dijkstra(int V, int[][] edges, int src) {
        // code here
        ArrayList<ArrayList<pair>> adj=new ArrayList<>();
        for(int i=0;i<V;i++){
            adj.add(new ArrayList<pair>());
        }
        for(int[] r:edges){
            adj.get(r[0]).add(new pair(r[1],r[2]));
            adj.get(r[1]).add(new pair(r[0], r[2]));
        }
        PriorityQueue<pair>pq=new PriorityQueue<>((a,b)->a.w-b.w);
        int[] dis=new int[V];
        Arrays.fill(dis,(int)1e9);
        dis[src]=0;
        pq.add(new pair(src,0));
        while(!pq.isEmpty()){
            pair it=pq.poll();
            int u=it.n;
            int di=it.w;
            for(pair ne:adj.get(u)){
                if(dis[u]+ne.w<dis[ne.n]){
                    dis[ne.n]=dis[u]+ne.w;
                    pq.add(new pair(ne.n,dis[ne.n]));
                }
            }
        }
        for(int i=0;i<V;i++){
            if(dis[i]==1e9)dis[i]=-1;
        }
        return dis;
        
    }
}
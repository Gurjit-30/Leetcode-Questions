class Solution {
    class Pair{
        int r;
        int c;
        Pair(int r,int c){
            this.r=r;
            this.c=c;
        }
    }
    public void bfs(int r,int c,char[][] g){
        int n=g.length;
        int m=g[0].length;
        int directions[][]={{1,0},{-1,0},{0,1},{0,-1}};
        Queue<Pair> q=new LinkedList<>();
        q.add(new Pair(r,c));

        while(!q.isEmpty()){
            Pair current=q.poll();
            int row=current.r;
            int col=current.c;

            for(int direction[]:directions){
                int newRow=row+direction[0];
                int newCol=col+direction[1];

                if(newRow>=0 && newCol>=0 && newRow<n && newCol<m && g[newRow][newCol]=='1'){
                    q.offer(new Pair(newRow,newCol));
                    g[newRow][newCol]='0';
                }
            }
        }
        
    }
    public int numIslands(char[][] grid) {
        int n=grid.length,m=grid[0].length;
        // boolean[][] vis=new boolean[n][m];
        int c=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]=='1'){
                    bfs(i,j,grid);
                    c++;
                }

            }
        }

        return c;
        
    }
}
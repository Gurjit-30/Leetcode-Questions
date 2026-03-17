class Solution {
    public boolean valid(int r,int c,int[][]mat,int num){
        //row 
        for(int i=0;i<9;i++){
            if(mat[i][c]==num){
                return false;
            }
        }
        //column
        for(int i=0;i<9;i++){
            if(mat[r][i]==num){
                return false;
            }
        }
        //square
        int sr=(r/3)*3;
        int sc=(c/3)*3;
        for(int i=sr;i<sr+3;i++){
            for(int j=sc;j<sc+3;j++){
                if(mat[i][j]==num){
                    return false;
                }
            }
        }
        return true;
        
        
        
    }
    public boolean solve(int[][] mat) {
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat.length;j++){
                if(mat[i][j]==0){
                     for(int k=1;k<=9;k++){
                         if(valid(i,j,mat,k)){
                             mat[i][j]=k;
                            if( solve(mat)) return true;
                             mat[i][j]=0;
                             
                             
                         }
            
        }
        return false;
                }
            }
        }
        return true ;
    }
        // code here
        public void solveSudoku(int[][] mat){
            if(solve(mat)){
            return ;
            }
        }
        
    
}
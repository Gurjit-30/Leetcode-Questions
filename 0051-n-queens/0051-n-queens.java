class Solution {
    public boolean safe(int r,int c,char[][] b){
        for(int i=r;i>=0;i--){
            if(b[i][c]=='Q')return false;
        }
        for(int i=r,j=c;i>=0 && j>=0;i--,j--){
            if(b[i][j]=='Q')return false;
        }
        for(int i=r,j=c;i>=0 && j<b.length;i--,j++){
            if(b[i][j]=='Q')return false;

        }
        return true;
    }
    public List<String> cons(char[][] b){
        List<String> res=new ArrayList<>();
        for(int r=0;r<b.length;r++){
            res.add(new String(b[r]));
        }
        return res;
    }
    public void solve(int r,char[][] b,List<List<String>>ans){
        if(r==b.length){
            ans.add(cons(b));
            return;

        }
        for(int c=0;c<b.length;c++){
            if(safe(r,c,b)){
                b[r][c]='Q';
                solve(r+1,b,ans);
                b[r][c]='.';
            }
        }
    }

    public List<List<String>> solveNQueens(int n) {
        List<List<String>> res=new ArrayList<>();
        char[][] b=new char[n][n];
        for(char[] r:b){
            Arrays.fill(r,'.');
        }

        solve(0,b,res);
        return res;
    }
}
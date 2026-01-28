class Solution {
    public void help(List<String> ans,int n,int o,int c,StringBuilder s){
        if(s.length()==2*n){
            ans.add(s.toString());
            return ;
        }
        if(o<n){
            s.append("(");
            help(ans,n,o+1,c,s);
            s.deleteCharAt(s.length()-1);

        }
         if(c<o){
            s.append(")");
            help(ans ,n,o,c+1,s);
            s.deleteCharAt(s.length()-1);
        }
    }
    public List<String> generateParenthesis(int n) {
        List<String> ans=new ArrayList<>();
        StringBuilder s=new StringBuilder();
        help(ans,n,0,0,s);
        return ans;
        
    }
}
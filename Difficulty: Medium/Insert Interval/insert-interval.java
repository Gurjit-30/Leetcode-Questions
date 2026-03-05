class Solution {
    class pair{
        int s;
        int e;
        pair(int s,int e){
            this.s=s;
            this.e=e;
            
        }
    }
    public ArrayList<int[]> insertInterval(int[][] intervals, int[] ne) {
        // code here
        ArrayList<pair> ar=new ArrayList<>();
        for(int[] r:intervals){
            ar.add(new pair(r[0],r[1]));
        }
        ArrayList<int[]> ans=new ArrayList<>();
        ar.add(new pair(ne[0],ne[1]));
        Collections.sort(ar,(a,b)->a.s-b.s);
        int sf=ar.get(0).s;
        int sl=ar.get(0).e;
        for(int i=1;i<ar.size();i++){
            if(ar.get(i).s<=sl){
                sl=Math.max(sl,ar.get(i).e);
            }else{
                ans.add(new int[]{sf,sl});
                sl=ar.get(i).e;
                sf=ar.get(i).s;
                
            }
            
        }
        ans.add(new int[]{sf, sl});
        return ans;
        
    }
}

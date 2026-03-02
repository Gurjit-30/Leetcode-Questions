class Solution {
    class pair{
        int s;
        int e;
        pair(int s,int e){
            this.s=s;
            this.e=e;
            
        }
    }
    public int activitySelection(int[] start, int[] finish) {
        // code here
        ArrayList<pair> arr=new ArrayList<>();
        for(int i=0;i<start.length;i++){
            arr.add(new pair(start[i],finish[i]));
        }
        Collections.sort(arr,(a,b)->{
            if(a.e==b.e){
                return a.s-b.s;
            }
                return a.e-b.e;
            });
           
        int c=1;
        int la=arr.get(0).e;
        for(int i=1;i<arr.size();i++){
            if(arr.get(i).s>la){
                c++;
                la=arr.get(i).e;
            }
        }
        return c;
        
        
    }
}

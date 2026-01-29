class Solution {
    public int trap(int[] h) {
        int n=h.length;
        int[] p=new int[n];
        int[] s=new int[n];
        p[0]=0;
    
        for(int i=1;i<n;i++){
            p[i]=Math.max(h[i-1],p[i-1]);

        }
        s[n-1]=0;
       
        for(int i=n-2;i>=0;i--){
            s[i]=Math.max(h[i+1],s[i+1]);
        }
        int su=0;
        for(int i=0;i<n;i++){
            int wt=Math.min(p[i],s[i])-h[i];
            if(wt>0){
                su+=wt;
            }

        }
        return su;
        
    }
}
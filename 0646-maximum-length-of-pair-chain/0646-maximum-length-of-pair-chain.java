class Pair{
    int x;
    int y;
    Pair(int x,int y){
        this.x=x;
        this.y=y;
    }
}


class Solution {
    public int findLongestChain(int[][] pairs) {
     Arrays.sort(pairs,(a,b)-> Integer.compare(a[1],b[1]));
     int c=0,end=Integer.MIN_VALUE;
     for(int i=0;i<pairs.length;i++){
        if(end<pairs[i][0]){
            c++;
            end=pairs[i][1];
        }
     }
     return c;

    }
}
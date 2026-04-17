/*
class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}
*/
class pair{
    int hd;
    Node n;
    pair(int hd,Node n ){
        this.hd=hd;
        this.n=n;
    }
}

class Solution {
    public void iss(Node root,ArrayList<Integer> arr){
        Queue<pair>q=new LinkedList<>();
        TreeMap<Integer,Integer> m=new TreeMap<>();
        q.add(new pair(0,root));
        while(!q.isEmpty()){
            int n=q.size();
            for(int i=0;i<n;i++){
                pair cur=q.poll();
                m.put(cur.hd,cur.n.data);
                 if(cur.n.left!=null){
                    q.add(new pair(cur.hd-1,cur.n.left));
                }
                if(cur.n.right!=null){
                    q.add(new pair(cur.hd+1,cur.n.right));
                }
            }
        }
        for(int i:m.values()){
            arr.add(i);
        }
    }
    public ArrayList<Integer> bottomView(Node root) {
        // code here
        ArrayList<Integer> arr=new ArrayList<>();
        iss(root,arr);
        return arr;
        
    }
}
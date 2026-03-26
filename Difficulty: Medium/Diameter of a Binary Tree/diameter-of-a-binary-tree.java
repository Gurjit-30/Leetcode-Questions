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
} */

class Solution {
    int max=0;
    public int hei(Node root){
        if(root==null){
            return 0;
            
        }
        int left=hei(root.left);
        int right=hei(root.right);
        max=Math.max(max,left+right);
        return Math.max(left,right)+1;
        
    }
    public int diameter(Node root) {
        // code here
         hei(root);
         return max;
        
    }
}
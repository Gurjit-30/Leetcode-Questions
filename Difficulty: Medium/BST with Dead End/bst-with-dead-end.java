/*
class Node {
        int data;
        Node left, right;

        Node(int item) {
            data = item;
            left = right = null;
        }
}*/

class Solution {
    public boolean help(Node root,int min,int max){
        if(root==null)return false;
        if(max==min){
            return true;
        }
        return (help(root.left,min,root.data-1))||(help(root.right,root.data+1,max));
    }
    public boolean isDeadEnd(Node root) {
        // Code here.
        return(help(root,1,(int)1e9));
        
    }
}
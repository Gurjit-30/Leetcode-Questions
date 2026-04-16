/*
class Node {
    int data;
    Node left, right;

    public Node(int d)
    {
        data = d;
        left = right = null;
    }
}
*/

class Solution {
    int c=0;
    public void iss(Node root,int l,int h){
        if(root==null){
            return ;
        }
        iss(root.left,l,h);
        if(root.data>=l && root.data<=h){
            c++;
        }
        iss(root.right,l,h);
    }
    int getCount(Node root, int l, int h) {
        // Your code here
        iss(root,l,h);
        return c;
        
    }
}
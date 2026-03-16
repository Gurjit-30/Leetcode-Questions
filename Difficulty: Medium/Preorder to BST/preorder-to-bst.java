// User function Template for Java

/*
class Node {
    int data;
    Node left, right;

    Node(int d) {
        data = d;
        left = right = null;
    }
}
*/

class Solution {
    // Function that constructs BST from its preorder traversal.
    int i=0;
    public Node help(int[] pre,int up){
        if(i==pre.length  || pre[i]>up){
            return null;
        }
        Node root=new Node(pre[i++]);
        root.left=help(pre,root.data);
        root.right=help(pre,up);
        
        return root ;
    }
    public Node Bst(int pre[], int size) {
        // code here
        return help(pre,(int)1e9);
       
        
    }
}
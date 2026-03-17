/*Structure of the node class is
class Node
{
    int data;
    Node left, right;
    Node(int item){
        data = item;
        left = right = null;
    }
} */

class Solution {
    // The given root is the root of the Binary Tree
    public void help(Node root, ArrayList<Integer> ans){
        if(root==null)return ;
        ans.add(root.data);
        help(root.left,ans);
        help(root.right,ans);
        
    }
    int i=0;
    Node aa(Node root, ArrayList<Integer>ans){
        if(root==null)return null;
        aa(root.left,ans);
        root.data=ans.get(i++);
        aa(root.right,ans);
        return root;
    }
    // Return the root of the generated BST
    Node binaryTreeToBST(Node root) {
        // Your code here
        ArrayList<Integer> ans=new ArrayList<>();
        help(root,ans);
        Collections.sort(ans);
        return aa(root,ans);
        
    }
}
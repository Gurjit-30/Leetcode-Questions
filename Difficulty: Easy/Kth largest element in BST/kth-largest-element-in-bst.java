/*
class Node
{
    int data;
    Node left;
    Node right;
    Node(int data)
    {
        this.data = data;
        left=null;
        right=null;
    }
}
*/
class Solution {
    // return the Kth largest element in the given BST rooted at 'root'
    public void iss(Node root,List<Integer> arr){
        if(root==null){
            return ;
        }
        iss(root.left,arr);
        arr.add(root.data);
        iss(root.right,arr);
        
    }
    public int kthLargest(Node root, int k) {
        // Your code here
        List<Integer> arr=new ArrayList<>();
        iss(root,arr);
        return arr.get(arr.size()-k);
        
    }
}
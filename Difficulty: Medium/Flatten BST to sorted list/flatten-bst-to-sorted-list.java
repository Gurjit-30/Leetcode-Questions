/*
class Node {
    int data;
    Node left, right;

    Node(int val) {
        data = val;
        left = right = null;
    }
}
*/

class Solution {
    
    public Node iss(List<Integer>arr,int i){
        if(i<arr.size()){
            Node root=new Node(arr.get(i));
            root.left=null;
            root.right=iss(arr,i+1);
            return root;
        }
        return null;
    }
    public void tra(Node root,List<Integer>arr){
        if(root==null){
            return ;
        }
        tra(root.left,arr);
        arr.add(root.data);
        tra(root.right,arr);
    }
    public Node flattenBST(Node root) {
        List<Integer> arr=new ArrayList<>();
        tra(root,arr);
        return iss(arr,0);
        // code here
        
    }
}

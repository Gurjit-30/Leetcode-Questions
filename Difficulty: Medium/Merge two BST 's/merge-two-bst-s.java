/*
class Node {
    int data;
    Node left, right;

    public Node(int val)
    {
        data = val;
        left = right = null;
    }
}
*/

class Solution {
    public void tra(Node root,ArrayList<Integer> arr){
        if(root==null){
            return ;
        }
        tra(root.left,arr);
        arr.add(root.data);
        tra(root.right,arr);
        
    }
    public ArrayList<Integer> merge(Node root1, Node root2) {
        ArrayList<Integer> arr=new ArrayList<>();
        tra(root1,arr);
        tra(root2,arr);
                Collections.sort(arr);
                return arr;
        // code here
        
    }
}
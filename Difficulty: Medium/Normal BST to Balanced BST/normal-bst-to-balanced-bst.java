/*
class Node
{
    int data;
    Node right, left;
    Node(int item)
    {
        data = item;
        left = right = null;
    }
}*/

class Solution {
    public Node build(List<Integer> arr,int s,int e){
     
       if(s<=e){
            int mid=(s+e)/2;
            Node root=new Node(arr.get(mid));
            root.left=build(arr,s,mid-1);
            root.right=build(arr,mid+1,e);
            return root;
       }
       return null;
        
    }
    public void tra(Node root,List<Integer> arr){
        if(root==null){
            return ;
        }
        tra(root.left,arr);
        arr.add(root.data);
        tra(root.right,arr);
    }
    Node balanceBST(Node root) {
        List<Integer> arr=new ArrayList<>();
        tra(root,arr);
       return  build(arr,0,arr.size()-1);
        // Add your code here.
    }
}
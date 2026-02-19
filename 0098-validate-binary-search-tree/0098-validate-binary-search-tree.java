/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean help(TreeNode root ,long minn,long maxx){
        if(root ==null)return true;
        if(root.val<=minn || root.val >=maxx){
            return false;
        }
        return (help(root.left,minn,root.val)&&help(root.right,root.val,maxx));
    }
    public boolean isValidBST(TreeNode root) {
        return help(root,Long.MIN_VALUE,Long.MAX_VALUE);
     
    }
}
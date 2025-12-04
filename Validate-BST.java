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
    private TreeNode prev;
    private boolean flag;
    public boolean isValidBST(TreeNode root) {
        this.flag = true;
        if(root==null) return false;
        helper(root);
        return flag;
    }
    //void based recursion
    private void helper(TreeNode root){
        //base
        if(root == null) return;

        //logic inorder
        //left
        helper(root.left);
        //root
        //breach condition
        if(prev!=null && prev.val >= root.val ){
            flag = false;
        }
        //System.out.println(root.val);
        prev = root;

        //right
        helper(root.right);

    }
}
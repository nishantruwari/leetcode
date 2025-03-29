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
    public int minDepth(TreeNode root) {
        if(root==null){
            return 0;
        }

        //if left subtree is null calculate from other
      
        if(root.left==null){
            return 1+minDepth(root.right);
        }

        if(root.right==null){
            return 1+minDepth(root.left);
        }
            
        //if both subtree exists 
        return 1+Math.min(minDepth(root.left),minDepth(root.right));
        
    }
}

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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root==null){
            return false;
        }


        return check(0, root,  targetSum);
        

        
        
    }

    boolean check (int sum,TreeNode root, int targetSum){
        if(root==null){

            
            if(sum==targetSum){
                return true;
            }else{
                return false;
            }
        }
        sum+=root.val;

        if(root.left==null){
            
            return check(sum,root.right,targetSum);
        }
        if(root.right==null){
            
            
            return check(sum,root.left,targetSum);
        }

        return check(sum,root.right,targetSum)||check(sum,root.left,targetSum);
        
    }
}

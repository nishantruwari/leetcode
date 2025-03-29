class Solution {
    public int maxDepth(TreeNode root) {
        if(root==null){
            return 0;
        }
        //if left subtree is null

        if(root.left==null){
            return 1+maxDepth(root.right);

        }

        // if right subtreee is null

        if(root.right==null){

            return 1+maxDepth(root.left);

        }

        return 1+Math.max(maxDepth(root.left),maxDepth(root.right));
        
    }
}

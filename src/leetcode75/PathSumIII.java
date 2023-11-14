package leetcode75;

import leetcode75.MaximumDepthBinaryTree.TreeNode;

public class PathSumIII {
    public int pathSum(TreeNode root, long targetSum) {
        if(root == null) return 0;
        return pathSumFrom(root, targetSum) + pathSum(root.left, targetSum) + pathSum(root.right, targetSum);
    }

    public int pathSumFrom(TreeNode root, long sum){
        if(root == null){
            return 0;
        }
        return(root.val == sum ? 1 : 0) + pathSumFrom(root.left, sum - root.val) + pathSumFrom(root.right, sum - root.val);
    }
}

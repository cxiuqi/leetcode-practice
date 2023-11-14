package leetcode75;

import leetcode75.MaximumDepthBinaryTree.TreeNode;

public class CountGoodNodes {

    private Integer counter = 0;

    public int goodNodes(TreeNode root) {
        dfs(Integer.MIN_VALUE, root);
        return counter;
    }

    public void dfs(int max, TreeNode root){
        if(root == null){
            return;
        }
        if(root.val >= max){
            counter++;
            max = root.val;
        }
        dfs(max, root.left);
        dfs(max, root.right);
    }
}

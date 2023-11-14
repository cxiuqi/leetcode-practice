package leetcode75;

import leetcode75.MaximumDepthBinaryTree.TreeNode;

public class LongestZigZag {
    int max = 0;
    public int longestZigZag(TreeNode root) {
        dfs(root, false, 0);
        return max;
    }
    // true - right, false - left
    public void dfs(TreeNode node, boolean goRight, int count){
        if(node == null){
            return;
        }
        if(max < count){
            max = count;
        }

        if(goRight){
            dfs(node.left, false, count+1);
            dfs(node.right, true, 1);
        }
        else{
            dfs(node.left, false, 1);
            dfs(node.right, true, count+1);
        }

    }
}

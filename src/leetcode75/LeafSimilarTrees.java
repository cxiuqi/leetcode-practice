package leetcode75;

import java.util.LinkedList;
import java.util.Queue;

import leetcode75.MaximumDepthBinaryTree.TreeNode;

public class LeafSimilarTrees {
	
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();
        dfs(q1, root1);
        dfs(q2, root2);
        return q1.equals(q2);
    }

    public void dfs(Queue<Integer> q, TreeNode root){
        if(root == null) return;
        if(root.left == null & root.right == null){
            q.offer(root.val);
        }
        dfs(q, root.left);
        dfs(q, root.right);
    }

}

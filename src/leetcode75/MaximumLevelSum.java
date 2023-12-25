package leetcode75;

import java.util.LinkedList;
import java.util.Queue;

import leetcode75.MaximumDepthBinaryTree.TreeNode;

public class MaximumLevelSum {
	int maxLevel = 0;
    int max = Integer.MIN_VALUE;
    public int maxLevelSum(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        int level = 0;
        while(!q.isEmpty()){
            int n = q.size();
            int sum = 0;
            for(int i = 0; i < n; i++){
                TreeNode node = q.peek();
                q.poll();
                if(node.left!=null){
                    q.offer(node.left);
                }
                if(node.right!=null){
                    q.offer(node.right);
                }
                sum+=node.val;
            }
            level++;
            if(sum > max){
                max = sum;
                maxLevel = level;
            }
        }
        return maxLevel;
    }
}

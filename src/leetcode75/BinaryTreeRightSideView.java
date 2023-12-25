package leetcode75;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import leetcode75.MaximumDepthBinaryTree.TreeNode;

public class BinaryTreeRightSideView {

	public List<Integer> rightSideView(TreeNode root) {
        List<Integer> count = new ArrayList<>();
        bfs(root, count);
        return count;
    }
    public void bfs(TreeNode root, List<Integer> count){
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        if(root == null){
            return;
        }
        queue.offer(root);
        while(!queue.isEmpty()){            
            int n = queue.size();
            for(int i = 0; i < n; i++){
                TreeNode node = queue.peek();
                queue.poll();
                if(node.right != null){
                    queue.offer(node.right);
                }
                if(node.left != null){
                    queue.offer(node.left);
                }
                if(i == 0){
                    count.add(node.val);
                }
            }
            
        }
    }
}

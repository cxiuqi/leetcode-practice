package leetcode75;

import leetcode75.MaximumDepthBinaryTree.TreeNode;

public class DeleteNodeInBST {
	public TreeNode deleteNode(TreeNode root, int key) {
        if(root == null) return root;
        
        if(root.val > key){
            root.left = deleteNode(root.left, key);
            return root;
        } else if(root.val < key){
            root.right = deleteNode(root.right, key);
            return root;
        }

        if(root.left == null){
            TreeNode temp = root.right;
            return temp;
        }
        else if(root.right == null){
            TreeNode temp = root.left;
            return temp;
        }
        else{
            TreeNode succParent = root;
            TreeNode succ = root.right;
            while(succ.left != null){
                succParent = succ;
                succ = succ.left;
            }
            if (succParent != root)
                succParent.left = succ.right;
            else
                succParent.right = succ.right;
 
            // Copy Successor Data to root
            root.val = succ.val;
 
            // Delete Successor and return root
            return root;
        }
    }
}

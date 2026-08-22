package lec_45;

import java.util.List;

public class BinaryTreeRightSideView199 {
	
//	  Definition for a binary tree node.
	  public class TreeNode {
	      int val;
	      TreeNode left;
	      TreeNode right;
	      TreeNode() {}
	      TreeNode(int val) { this.val = val; }
	      TreeNode(int val, TreeNode left, TreeNode right) {
	          this.val = val;
	          this.left = left;
	          this.right = right;
	      }
	  }
	 
	class Solution {
		int max_depth = 0;
	    public List<Integer> rightSideView(TreeNode root) {
	        
	    }
	    public void rightView(TreeNode root, List<Integer> ll, int currlevel) {
	    	if(root == null) {
	    		return;
	    	}
	    	if(max_depth < currlevel) {
	    		max_depth = currlevel;
	    		ll.add(root.val);
	    	}
	    	rightView(root.right, ll, currlevel+1);
	    	rightView(root.left, ll, currlevel+1);
	    }
	}
}

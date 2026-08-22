package lec_46;

public class Diameter_of_BinaryTree2 {
	class Solution{
		public int diameterOfBinaryTree(TreeNode root) {
			return diameter(root).dia;
		}
		public DiaPair diameter(TreeNode root) {
			if(root == null) {
				return new DiaPair();
			}
			DiaPair ldp = diameter(root.left);
			DiaPair rdp = diameter(root.right);
			int sd = ldp.ht + rdp.ht +2;
			DiaPair sdp = new DiaPair();
			sdp.ht = Math.max(ldp.ht, rdp.ht)+1;
			sdp.dia = Math.max(sd, Math.max(ldp.dia, rdp.dia));
			return sdp;
		}
	}
	
	class DiaPair{
		int dia = 0;
		int ht = -1;
	}
}

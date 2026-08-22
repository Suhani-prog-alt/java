package lec_46;

public class BinarySearchTree {
	class Node{
		int val;
		Node left;
		Node right;
		public Node(int val) {
			this.val = val;
		}
	}
	private Node root;
	public BinarySearchTree( int [] in) {
		root = creatTree(in, 0, in.length -1);
	}
	private Node creatTree(int [] in, int si, int ei) {
		if(si>ei) {
			return null;
		}
		int mid = (si+ei)/2;
		Node node = new Node(in[mid]);
		node.left = creatTree(in,si, mid-1);
		node.right = creatTree(in, mid+1, ei);
		return node;
	}
}

package lec_43;



import java.util.*;

public class BinaryTree {
	private class Node{
		int val;
		Node left;
		Node right;
		public Node(int val) {
			this.val = val;
		}
	}
	private Node root;
	Scanner sc = new Scanner(System.in);
	public BinaryTree() {
		root = CreateTree();
	}
	
	private Node CreateTree() {
		int val = sc.nextInt();
		Node nn  = new Node(val);
		boolean hlc = sc.nextBoolean();
		if(hlc) {
			nn.left = CreateTree();
		}
		boolean hrc = sc.nextBoolean();
		if(hrc) {
			nn.right = CreateTree();
		}
		return nn;
	}
	
	public void Display() {
		Display(root);
	}
	
	private void Display(Node nn) {
		if(nn == null) {
			return;
		}
		String s = "<-"+nn.val+"->";
		if(nn.left!=null) {
			s = nn.left.val+s;
		}else {
			s="."+s;
		}
		
		if(nn.right!=null) {
			s  = s+nn.right.val;
		}else {
			s=s+".";
		}
		System.out.println(s);
		Display(nn.left);
		Display(nn.right);
	} 
	
	public int max() {
		return max(root);
	}
	private int max(Node node) {
		if(node == null) {
			return Integer.MIN_VALUE;
		}
		int left = max(node.left);
		int right = max(node.right);
		return Math.max(node.val,Math.max(left, right));
	}
	
	public boolean find(int item) {
		return find(root, item);
	}
	private boolean find(Node node, int item) {
		if(node == null) {
			return false;
		}
		if(node.val == item) {
			return true;
		}
		boolean left = find(node.left, item);
		boolean right = find(node.right, item);
		return left || right;
	}
	
	//Height - maximum distance between root node to leaf node
	//hey recursion left or right vale ki ky h, vo bta de
	public int ht() {
		return ht(root);
	}
	
	private int ht(Node node) {
		if(node == null) {
			return -1;
		}
		int left = ht(node.left);
		int right = ht(node.right);
		return Math.max(left, right)+1;
	}
	
	public void PreOrder() {
		PreOrder(root);
		System.out.println();
	}
	private void PreOrder(Node node) {
		if(node == null) {
			return ;
		}
		System.out.print(node.val+" ");
		PreOrder(node.left);
		PreOrder(node.right);
	}
	
	public void PostOrder() {
		PostOrder(root);
		System.out.println();
	}
	private void PostOrder(Node node) {
		if(node == null) {
			return;
		}
		PostOrder(node.left);
		PostOrder(node.right);
		System.out.println(node.val+" ");
	}
	
	public void LevelOrder() {
		Queue<Node> q = new LinkedList<>();
		q.add(root);
		while(!q.isEmpty()) {
			Node r = q.poll();
			System.out.println();
			if(r.left!=null) {
				q.add(r.left);
			}
			if(r.right!=null) {
				q.add(r.right);
			}
		}
		System.out.println();
	}
	
}

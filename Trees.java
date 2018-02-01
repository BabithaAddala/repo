package codility;

import java.util.Scanner;

class Node {
	Node left;
	Node right;
	int data;

	Node(int data) {
		this.data = data;
		left = null;
		right = null;
	}
}

class Trees {
	
	static int height(Node root) {
      	// Write your code here.
		
		//height of the tree
        if(root==null)
        	return -1;
        int lefth=height(root.left);
        int righth=height(root.right);
        if(lefth>righth){
        	return lefth+1;
        }else{
        	return righth+1;
        }
        
    }

	public static Node insert(Node root, int data) {
		if (root == null) {
			return new Node(data);
		} else {
			Node cur;
			if (data <= root.data) {
				cur = insert(root.left, data);
				root.left = cur;
			} else {
				cur = insert(root.right, data);
				root.right = cur;
			}
			return root;
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		Node root = null;
		while (t-- > 0) {
			int data = scan.nextInt();
			root = insert(root, data);
		}
		scan.close();
		int height = height(root);
		System.out.println(height);
	}
}

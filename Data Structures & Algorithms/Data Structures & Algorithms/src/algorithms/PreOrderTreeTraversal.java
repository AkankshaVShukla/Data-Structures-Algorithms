package algorithms;

import java.util.Stack;

public class PreOrderTreeTraversal {

	class Node {
		int data;
		Node left;
		Node right;
	}

	void preOrder(Node root) {
		if(root==null) return;
		System.out.print(root.data +" ");
		preOrder(root.left);
		preOrder(root.right);
	}


	void preOrderIterative(Node root){
		Stack<Node> stack = new Stack<Node>();
		if(root==null)return;
		while(root!=null){
			System.out.print(root.data + " ");
			if(root.right!=null){
				stack.push(root.right);
			}
			if(root.left!=null){
				root =root.left;
			}else if(!stack.isEmpty()){
				root=stack.pop();
			}else{
				root=null;
			}
		}
	}
}

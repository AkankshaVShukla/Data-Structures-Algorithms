package algorithms;


public class BST_lca {
	class Node {
		int data;
		Node left;
		Node right;
	}
	static Node lca(Node root,int v1,int v2)
    {
        while(root!=null){
            if(root.data<v1 && root.data<v2){
                root = root.right;
            }else if(root.data>v1 && root.data>v2){
                root = root.left;
            }else{
                break;
            }
        }
        return root;
    }
}

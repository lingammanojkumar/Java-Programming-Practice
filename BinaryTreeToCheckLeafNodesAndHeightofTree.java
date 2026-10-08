package datastructures;
//program to print leaf nodes and height of a tree 
class NodeLeaf{
	int data;
	NodeLeaf right,left;
	NodeLeaf(int data){
		this.data=data;
		right=null;
		left=null;
	}

static void preorder(NodeLeaf root)
{
	if(root==null) return;
	System.out.print(root.data+" ");
	preorder(root.left);
	preorder(root.right);
}
static void inorder(NodeLeaf root)
{
	if(root==null) return;
	inorder(root.left);
	System.out.print(root.data+" ");
	inorder(root.right);
}
static void postorder(NodeLeaf root) {
	if(root==null) return;
	postorder(root.left);
	postorder(root.right);
	System.out.print(root.data+" ");
}
static int leafCount(NodeLeaf root) {
	if(root==null) return 0;
	if(root.left==null && root.right==null) {
		return 1;
	}
	int l=leafCount(root.left);
	int r=leafCount(root.right);
	return l+r;
}
static int height(NodeLeaf root) {
	if(root==null) return 0;
	int l=height(root.left);
	int r=height(root.right);
	return Math.max(l, r)+1;
}
}
public class BinaryTreeToCheckLeafNodesAndHeightofTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NodeLeaf root=new NodeLeaf(10);
		 root.left=new NodeLeaf(20);
		  root.left.left=new NodeLeaf(30);
		  root.left.right=new NodeLeaf(40);
		  root.right=new NodeLeaf(50);
		  root.right.left=new NodeLeaf(60);
		  root.right.right=new NodeLeaf(70);
		  System.out.println("Preorder Traversal: ");
		  NodeLeaf.preorder(root);
		  System.out.println();
		  System.out.println("Inorder Traversal: ");
		  NodeLeaf.inorder(root);
		  System.out.println();
		  System.out.println("Postorder Traversal: ");
		  NodeLeaf.postorder(root);
		  System.out.println();
		  System.out.println("The leaf nodes is tree are: "+NodeLeaf.leafCount(root));
		  System.out.println("The height of a tree is: "+NodeLeaf.height(root));
	}

}
/*
 * Preorder Traversal: 
10 20 30 40 50 60 70 
Inorder Traversal: 
30 20 40 10 60 50 70 
Postorder Traversal: 
30 40 20 60 70 50 10 
The leaf nodes is tree are: 4
The height of a tree is: 3
*/

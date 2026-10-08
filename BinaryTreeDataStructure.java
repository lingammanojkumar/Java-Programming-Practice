package datastructures;
class NodeTree{
	int data;
	NodeTree right,left;
	NodeTree(int data){
		this.data=data;
		right=null;
		left=null;
	}

static void preorder(NodeTree root)
{
	if(root==null) return;
	System.out.print(root.data+" ");
	preorder(root.left);
	preorder(root.right);
}
static void inorder(NodeTree root)
{
	if(root==null) return;
	inorder(root.left);
	System.out.print(root.data+" ");
	inorder(root.right);
}
static void postorder(NodeTree root) {
	if(root==null) return;
	postorder(root.left);
	postorder(root.right);
	System.out.print(root.data+" ");
}
}
public class BinaryTreeDataStructure {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  NodeTree root=new NodeTree(10);
  root.left=new NodeTree(20);
  root.left.left=new NodeTree(30);
  root.left.right=new NodeTree(40);
  root.right=new NodeTree(50);
  root.right.left=new NodeTree(60);
  root.right.right=new NodeTree(70);
  System.out.println("Preorder Traversal: ");
  NodeTree.preorder(root);
  System.out.println();
  System.out.println("Inorder Traversal: ");
  NodeTree.inorder(root);
  System.out.println();
  System.out.println("Postorder Traversal: ");
  NodeTree.postorder(root);
  System.out.println();
	}

}
/*
 * Preorder Traversal: 
10 20 30 40 50 60 70 
Inorder Traversal: 
30 20 40 10 60 50 70 
Postorder Traversal: 
30 40 20 60 70 50 10 
*/

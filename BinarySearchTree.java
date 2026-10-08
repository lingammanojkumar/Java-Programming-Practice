package datastructures;
class NodeSearch{
	int data;
	NodeSearch right,left;
	NodeSearch(int data){
		this.data=data;
		right=null;
		left=null;
	}

static void preorder(NodeSearch root)
{
	if(root==null) return;
	System.out.print(root.data+" ");
	preorder(root.left);
	preorder(root.right);
}
static void inorder(NodeSearch root)
{
	if(root==null) return;
	inorder(root.left);
	System.out.print(root.data+" ");
	inorder(root.right);
}
static void postorder(NodeSearch root) {
	if(root==null) return;
	postorder(root.left);
	postorder(root.right);
	System.out.print(root.data+" ");
}
static NodeSearch insert(int data,NodeSearch root) {
	if(root==null) {
		root=new NodeSearch(data);
		return root;
	}
	if(data<root.data) {
		root.left=insert(data,root.left);
	}else {
		root.right=insert(data,root.right);
	}
	return root;
}
static boolean search(int key,NodeSearch root) {
	if(root==null) return false;
	if(root.data==key) return true;
	else if(key<root.data) return search(key,root.left);
	else  return search(key,root.right);
}
}
public class BinarySearchTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    NodeSearch root=NodeSearch.insert(50,null);
    NodeSearch.insert(30,root);
    NodeSearch.insert(60, root);
    NodeSearch.insert(80, root);
    System.out.println(NodeSearch.search(60, root));
    System.out.println("Inorder Traversal: ");
    NodeSearch.inorder(root);    
    System.out.println();
    System.out.println("Postorder Traversal: ");
    NodeSearch.preorder(root);;
    System.out.println();
    System.out.println("Postorder Traversal: ");
    NodeSearch.postorder(root);
    System.out.println();
	}

}
/*
true
Inorder Traversal: 
30 50 60 80 
Postorder Traversal: 
50 30 60 80 
Postorder Traversal: 
30 80 60 50 
*/
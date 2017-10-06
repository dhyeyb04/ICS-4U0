
public class MyBinaryTree {
	
	private int numInTree;
	private StudentInfo root;
	
	public MyBinaryTree() {
		numInTree = 0;
		root = null;
	}
	
	public void addToTree(StudentInfo currentNode, StudentInfo itemToAdd) {
		
		if (numInTree == 0){
			root = itemToAdd;
			numInTree = 1;
		}
		else {
			//The currentNode has a reference to a student in the tree
			//Decide which way to go
			if (itemToAdd.getStudentNum() < currentNode.getStudentNum()) {
				//go left
				if (currentNode.getLeft() == null) {
					//Make itemToAdd the left child of the current node
					currentNode.setLeft(itemToAdd);
					numInTree++;
				}
				else {
					//Add itemToAdd to the left subtree of the current node
					addToTree(currentNode.getLeft(), itemToAdd);
				}
			}
			else {
				//Go right
				if (currentNode.getRight() == null) {
					//Make itemToAdd the right child of the current node
					currentNode.setRight(itemToAdd);
					numInTree++;
				}
				else {
					//Add itemToAdd to the right subtree of the current node
					addToTree(currentNode.getRight(), itemToAdd);
				}
			}
		}
		
	}// end addToTree
	
	public void inorder(StudentInfo currentNode) {
		if (if currentNode.getLeft() != null) {
			inorder(currentNode.getLeft());
		}
		
		
	}
}


public class TestBinaryTree {
	
	/*
	@param args
	*/
	public static void main(String[] args) {
		
		MyBinaryTree theTree = new MyBinaryTree();
		StudentInfo someStudent;
		
		someStudent = new StudentInfo(11, "Elmer", "Fudd");
		theTree.addToTree(theTree.getRoot(), someStudent);
		
		someStudent = new StudentInfo(16, "Daffy", "Fudd");
		theTree.addToTree(theTree.getRoot(), someStudent);
		
		//Add more students
		
		System.out.println("\n Inorder traversal of the ");
		theTree.inorder(theTree.getRoot());
		
		/*
		theTree.preorder();
		
		theTree.postorder();
		*/
	}

}

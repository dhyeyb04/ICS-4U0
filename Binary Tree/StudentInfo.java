
public class StudentInfo {
	
	private int studentNum;
	private String firstName;
	private String lastName;
	private StudentInfo left;
	private StudentInfo right;
	
	public StudentInfo(int sN, String fN, String lN) {
		studentNum = sN;
		firstName = fN;
		lastName = lN;
		left = null;
		right = null;
	}
	
	public int getStudentNum() {
		return studentNum;
	}
	
	public StudentInfo getLeft() {
		return left;
	}
	
	/*
	public void
	
	*/
}

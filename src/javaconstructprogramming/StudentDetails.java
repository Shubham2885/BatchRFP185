package javaconstructprogramming;

public class StudentDetails {
	//fname, lname, rollNo, mobileno, class
	private String fname;
	private String lname;
	private int rollNo;
	private long mobileNo;
	
	public StudentDetails(String fname, String lname, int rollNo, long mobileNo) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.rollNo = rollNo;
		this.mobileNo = mobileNo;
	}

	@Override
	public String toString() {
		return "StudentDetails [fname=" + fname + ", lname=" + lname + ", rollNo=" + rollNo + ", mobileNo=" + mobileNo
				+ "]";
	}
}

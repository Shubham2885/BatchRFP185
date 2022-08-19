package javaconstructprogramming;

public class StudentDetails {
	//fname, lname, rollNo, mobileno, class
	public String fname;
	public String lname;
	int rollNo;
	long mobileNo;
	String ssdf;
	
	static int x;
	
	void showDetails() {
		System.out.println("First Name = "+fname);
		System.out.println("Last Name = "+lname);
		
		System.out.println("rollNo= "+rollNo);
	}
	
	static void printWelcomeMessage() {
		
	}
}

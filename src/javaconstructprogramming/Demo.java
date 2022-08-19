package javaconstructprogramming;

public class Demo {

	public static void main(String[] args) {
		String name = "Shubham";
		String studentName[] = new String[100];

		StudentDetails obj = new StudentDetails();
		obj.fname = "Shubham";
		obj.lname = "Chavan";
		
		obj.showDetails();
		StudentDetails.x = 5;
		StudentDetails.printWelcomeMessage();
		
		AccessModifier accessModifier = new AccessModifier();
		accessModifier.y = 5;
		
		Account account = new Account();
		account.getAccoutNo();
		account.setBalance(23423.0);
	}
}

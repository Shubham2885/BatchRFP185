package javaconstructprogramming;

public class FunctionDemo {
	
	//no return type, no parameters
	void printWelcomeMessage() {
		System.out.println("Welcome to function demo....");
	}
	
	void printMyName(String name) {
		System.out.println("Welcome "+name);
	}
	
	String getTodayDay() {
		String day = "Tuesday";
		return day;
	}
	
	int getLengthOfMyName(String name) {
		return name.length();
	}

	public static void main(String[] args) {
		
		FunctionDemo functionDemo = new FunctionDemo();
		
		functionDemo.printWelcomeMessage();
		
		//value called argument
		//call by value
		functionDemo.printMyName("Shubham");
		
		System.out.println("What is the today day = "+functionDemo.getTodayDay());
		
		int len = functionDemo.getLengthOfMyName("Rahul");
		System.out.println("Length of my name is = "+ len);
	}
}

//ways of function 4

//1 no return type, no argument or parameters
//2 no return type, with parameters
//3 return type, no parameters
//4 return type, with parameters
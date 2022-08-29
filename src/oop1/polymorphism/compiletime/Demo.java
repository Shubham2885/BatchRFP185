package oop1.polymorphism.compiletime;

//method overloading
class PrintingMachine {
	
	void print(String x) {
		//logic
		System.out.println("using PrintingMachine -> printing on paper...");
	}
	
	void print(String photos, int count) {
		System.out.println("photos is printing...");
	}
	
	void print(double xls) {
		System.out.println("xls is printing...");
	}
	
	void print(char x) {
		System.out.println("xls is printing...");
	}
	
	void print(int xls) {
		System.out.println("xls is printing...");
	}
	
}

class BanerMachine extends PrintingMachine {
	@Override
	void print(String x) {
		//new logic
		System.out.println("using BanerMachine -> printing on baner...");
	}
}

public class Demo {

	public static void main(String[] args) {
		boolean x = false;
		PrintingMachine machine = x ? new PrintingMachine() : new BanerMachine();
		machine.print("happy birthday...");
		System.out.println();
	}
}

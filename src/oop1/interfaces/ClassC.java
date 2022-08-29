package oop1.interfaces;

public class ClassC implements InterfaceA, InterfaceB {

	@Override
	public void run() {
		System.out.println("Working fine....");
	}
	
	public static void main(String[] args) {
		
		InterfaceA interfaceA = new ClassC();
		
		InterfaceB interfaceB = new ClassC();
		
		interfaceB.run();
		
	}

}

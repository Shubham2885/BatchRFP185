package oop1.inheritance.single;

public class Child extends Parent {

	public Child(int x, int y) {
		super(x, y);
	}
	
	public Child() {
		
	}
	
	public String evenOrOdd() {
		int greaterValue = findGreater();
		return greaterValue % 2 == 0 ? "Even = "+greaterValue : "Odd = "+greaterValue;
	}
}

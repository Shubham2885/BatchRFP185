package oop1.inheritance.single;

public class Parent {

	int x;
	int y;
	
	public Parent(int x, int y) {
		System.out.println("Parent Constructor is called...");
		this.x = x;
		this.y = y;
	}
	
	public Parent() {
		
	}
	public void showParentDetails() {
		System.out.println("some logic is there");
	}
	
	public int findGreater() {
		return x>y ? x:y;
	}
}

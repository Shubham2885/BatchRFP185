package oop1.inheritance.single;

public class Demo {

	public static void main(String[] args) {
//		Parent parent = new Parent(5, 6);
//		System.out.println(parent.findGreater());
		
		Child child = new Child(5, 6);
		System.out.println(child.evenOrOdd());
		System.out.println(child);
		
		Child child2 = new Child();
	}
}

package oop1;

import oop1.inheritance.single.Parent;
class A1 {
	private String abc;
	public A1(String abc) {
		this.abc = abc;
	}
}

class A2 {
	private Integer integer;
	public A2(Integer integer) {
		this.integer = integer;
	}
}

class A3 {
	private Double double1;
	public A3(Double double1) {
		this.double1 = double1;
	}
}

class GenericClass <T> {
	private T data;

	public GenericClass(T data) {
		this.data = data;
	}
}

public class GenericClassDemo {

	public static void main(String[] args) {

	}
}

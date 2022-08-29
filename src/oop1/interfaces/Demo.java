package oop1.interfaces;

public interface Demo {

	
	int add(int x, int y);
	
	final double pi = 3.142;
	
	default double getPiValue() {
		return pi;
	}
	
	static double getPI() {
		return getPi();
	}
	
	private static double getPi() {
		return pi;
	}
}

//
//abstract method -> doesn't have body..
//add the final variable
//have default method, since from java 8
//have static method, since from java 8
//have private method, since from java 9
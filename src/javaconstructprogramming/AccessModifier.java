package javaconstructprogramming;

public class AccessModifier {

	//instance variable
	//
	int x;
	int y = 10;
	//instance method
	private int getXData(){
		return x;
	}
	
	private class Data{
		
	}
}

//public -> class, constructor, variable and method are available through out the project
//private-> inner class, constructor, variable and method are available only with in a class
//default-> class, inner class, constructor, variable and method are available within same package.

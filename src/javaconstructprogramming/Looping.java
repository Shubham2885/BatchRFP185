package javaconstructprogramming;

public class Looping {

	public static void main(String[] args) {
		
//		for(initilisation;condition;increment/decrement) {
//			//statement
//		}
		
		int x = 0;
		for(;x < 5;) {
			System.out.println("hello...");
			x++;
		}
		
		System.out.println(x);
		
//		while(condition) {
//			
//		}
		
		int num = 123456;
		int counter = 0;
		while(true) {
			if(num == 0) {
				break;
			}
			num = num/10;
			counter++;
		}
		
		System.out.println("Digits = "+counter);
		
		do {
			
		}while(true);
	}
}

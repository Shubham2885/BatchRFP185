package javaconstructprogramming;

public class RandomDemo {

	public static void main(String[] args) {
		
			double randomValue = Math.random();
			
			System.out.println(randomValue);
			
			if(randomValue > 0.5) {
				System.out.println("Happy...");
			}else {
				System.out.println("Sad...");
			}
			
			double val = -5.15;
			System.out.println("positive = "+Math.abs(val));
	}
}

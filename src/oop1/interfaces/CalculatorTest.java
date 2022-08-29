package oop1.interfaces;

public class CalculatorTest implements Calculator {

	@Override
	public int add(int x, int y) {
		int rusult = x + y;
		return rusult;
	}
	
	@Override
	public int sub(int x, int y) {
		int rusult = x - y;
		return rusult;
	}
	
	public int mul(int x, int y) {
		return x * y;
	}

	public static void main(String[] args) {
		
		
		Calculator calculator = new CalculatorTest();
		int result = calculator.add(5, 10);
		int subResult = calculator.sub(20, 10);
	}
	
}

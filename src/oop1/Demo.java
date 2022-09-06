package oop1;

interface IPerfectNumber {
	boolean isPerfectNumber();
}

class PerfectNumber implements IPerfectNumber {
	protected int num;

	public PerfectNumber(int num) {
		this.num = num;
	}

	@Override
	public boolean isPerfectNumber(){
		//
		return false;
	}
		
}

class EvenOdd extends PerfectNumber {

	public EvenOdd(int num) {
		super(num);
	}
	
	boolean isEvenOrOdd(){
		if(num % 2 == 0) {
			return isPerfectNumber();
		}else {
			return false;
		}
	}
}

public class Demo {

	public static void main(String[] args) {
		EvenOdd evenOdd = new EvenOdd(34);
		boolean result = evenOdd.isEvenOrOdd();
		
		if(result) {
			System.out.println("it's perfect no");
		}else {
			System.out.println("it's not perfect no");
		}
	}
	
}

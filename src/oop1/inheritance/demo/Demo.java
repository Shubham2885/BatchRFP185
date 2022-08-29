package oop1.inheritance.demo;

public class Demo {

	public static void main(String[] args) {
		
		int x = 90;
		int y =50;
		int z = 40;
		
		if(x%2 == 0)
			System.out.println("20 is even");
		else
			System.out.println("20 is odd");
		
		// condition ? resultTrue : resultFalse;
		System.out.println((x>y && x>z) ? "x is greater" : (y>x && y>z) ? "y is greater" : "z is greater" );
		
		String str = "Shubham";
		
		//upper
		//65-90 = 7
		//97-122 = 105 - 6 -(18)
		x = 98 - 6 -(26);
		System.out.println(x);
		System.out.println((char)x);
		
	}
}

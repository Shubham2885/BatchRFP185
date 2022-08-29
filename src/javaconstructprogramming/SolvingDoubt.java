package javaconstructprogramming;

public class SolvingDoubt {
	static int z = 10;
	int abc;
	int xyz;
	
	public SolvingDoubt(int abc, int xyz) {
		this.abc = abc;
		this.xyz = xyz;
	}

	public static void main(String[] args) {
		int x; //declaration
		
		int y = 10; //initilasation
		System.out.println(z);
	}
	
	public static void demoMethod() {
		int x = 10;
		
		for(int i = 0;i<5;i++) {
			
		}
		
//		System.out.println(i);
	}
	
	public SolvingDoubt getInstance() {
		return this;
	}
}

//instance, static, local variable

class X {
	public static void main(String[] args) {
		SolvingDoubt.z = 30;
		SolvingDoubt doubt = new SolvingDoubt(500,600);
		
		System.out.println(doubt);
		SolvingDoubt val = doubt.getInstance();
		
		System.out.println(val);
	}
}
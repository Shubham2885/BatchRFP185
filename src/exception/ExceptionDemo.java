package exception;

public class ExceptionDemo {

	public static void main(String[] args) throws Exception {
		
		int array[] = {12,34,325,234,52,3,2};
		int input = 35;
		int a = 10;
		int b = 5;
		int c = 0;
		int x = 0;
		String str = "12";
		try {
			c = a/b;
			x = Integer.parseInt(str);
			
		}catch (ArithmeticException | NumberFormatException e) {
			System.out.println(e.getMessage());
		}finally {
			System.out.println("Finally block always run...");
		}
		
		checkEven(x);
		search(array, input);
		
		System.out.println("Result = "+c);
		System.out.println("Converted value = "+x);
		
	}
	
	public static int checkEven(int num) throws Exception {
		
		if(num %2 ==0) {
			return num;
		}else {
			throw new Exception("Input number is not even....");
		}
		
	}
	
	public static boolean search(int array[], int input) {
		for(int i=0;i<array.length;i++) {
			if(input == array[i]) {
				return true;
			}
		}
		throw new NotFoundException("Input is not available in array...");
	}
}

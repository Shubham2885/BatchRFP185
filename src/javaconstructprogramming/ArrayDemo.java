package javaconstructprogramming;

public class ArrayDemo {

	public static void main(String[] args) {

		//data type nameOfarray []; declaration

		//data type nameOfArray [] = new datatype[size];

		//data type nameOfArray [] = {val1, val2, ...};

		int rollNo[];

		rollNo = new int[10];
		
		rollNo[0] = 34;
		rollNo[1] = 58;
		rollNo[2] = 76;

		int studentIds[] = {1,2,3,4,5,5,6}; //memory size = 28 (size of datatype * length of array)

		System.out.println(studentIds.length);
		System.out.println(studentIds[0]);
		System.out.println(studentIds[1]);
		System.out.println(studentIds[2]);


		for(int i=0; i<=studentIds.length -1; i++) {
			System.out.println(studentIds[i]);
		}

		int evenNumbers[] = new int[10];
		int oddNumbers[] = new int[10];
		
		
		int j=0;
		int m=0;
		
		for(int i=1;i<=20;i++) {
			if(i%2 == 0) {
				evenNumbers[j] = i;
				j++;
			}else {
				oddNumbers[m] = i;
				m++;
			}
		}
		
		System.out.println("Even Numbers array");
		for(int i=0; i<=evenNumbers.length -1; i++) {
			System.out.println("evenNumbers["+i+"] = "+evenNumbers[i]+",");

		}

		System.out.println("oddNumbers array");
		for(int i=0; i<=oddNumbers.length -1; i++) {
			System.out.println("oddNumbers["+i+"] = "+oddNumbers[i]+",");

		}
		
		double factorialValues[] = new double[5];
		
		double fact = 1;
		for(int i=1;i<=5;i++) {
			fact = fact * i;
			
			factorialValues[i-1] = fact;
		}
		System.out.println("factorial values array");
		
		for(int i=0; i<=factorialValues.length -1; i++) {
			System.out.println("factorialValues["+i+"] = "+factorialValues[i]+",");

		}
		
		
	}
}

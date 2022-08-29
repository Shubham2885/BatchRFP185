package javaconstructprogramming;

public class ArrayPractice {

	public static void main(String[] args) {
		
		int size = 15;
		int array[] = new int[] {5,10,15,20,25,30,35,40,45,50};
		byte byteArray[] = new byte[size];
		short shortArray[] = new short[10];
		long longArray[] = new long[10];
		
		Object object[] = new Object[10];
		
		boolean booleanArray[] = new boolean[10];
		
		char str[] = new char[10];
		
		String stringArray[] = new String[10];
		
		System.out.println(array[6]);
		int i = 0;
		while(i<array.length) {
			array[i] = (i+1) * 5;
			i++; //i = i+ 1;
		}
		
		i = array.length - 1;
		while(i>=0) {
			System.out.println(array[i]);
			i--; //i = i+ 1;
		}
		
		i--;
		while(i>=0) {
			if(array[i] == 45) {
				System.out.println(array[i]);
				break;
			}
			i--;
		}
		
		String strArray[] = {"Shubham", "rahul", "Mayur", "Yuraj", "Virat"};
		i=0;
		while(i<strArray.length) {
			String capStr = strArray[i];
			System.out.println(capStr.toLowerCase());
			i++;
		}
		
		StudentDetails student1 = new StudentDetails("Shubham", "Chavan", 1, 8293847);
		StudentDetails student2 = new StudentDetails("rahul", "Kale", 1, 8293847);
		StudentDetails student3 = new StudentDetails("Mayur", "Mahe", 1, 8293847);
		StudentDetails student4 = new StudentDetails("Yuraj", "Singh", 1, 8293847);
		StudentDetails student5 = new StudentDetails("Virat", "Kohli", 1, 8293847);
		
		StudentDetails studArray[] = new StudentDetails[5];
		
		studArray[0] = student1;
		studArray[1] = student2;
		studArray[2] = student3;
		studArray[3] = student4;
		studArray[4] = student5;
		
		i=0;
		while(i<studArray.length) {
			System.out.println(studArray[i]);
			i++;
		}
		
		object[0] = student1;
		
		StudentDetails details = (StudentDetails) object[0];
		
		System.out.println(object[0]);
		
	}
}

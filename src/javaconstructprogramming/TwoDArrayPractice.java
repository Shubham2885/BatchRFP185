package javaconstructprogramming;

public class TwoDArrayPractice {

	public static void main(String[] args) {
		
		int array[][] = new int[3][3];
		
		//row
		for(int i=0;i<3;i++) {
			//col
			for(int j=0;j<3;j++) {
				array[i][j] = i+j;
			}
			
		}
		
		for(int i=0;i<3;i++) {
			//col
			for(int j=0;j<3;j++) {
				System.out.print(array[i][j]+"\t");
			}
			System.out.println();
			System.out.println();
		}
	}
}

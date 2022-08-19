package javaconstructprogramming;

public class TwoDArray {

	public static void main(String[] args) {
		
		int rowsize = 2;
		int colsize = 2;
		int twoDArray1[][] = new int[rowsize][colsize];
		
		twoDArray1[0][0] = 10;
		twoDArray1[0][1] = 20;
		twoDArray1[1][0] = 30;
		twoDArray1[1][1] = 40;
		
		int twoDArray2[][] = new int[rowsize][colsize];
		
		twoDArray2[0][0] = 5;
		twoDArray2[0][1] = 15;
		twoDArray2[1][0] = 25;
		twoDArray2[1][1] = 35;
		
		int twoDArrayResult[][] = new int[rowsize][colsize];
		
		for(int i=0; i<rowsize; i++) {
			for(int j=0; j<colsize; j++) {
				twoDArrayResult[i][j] = twoDArray1[i][j] * twoDArray2[i][j];
			}
		}
		
		System.out.println("2 D twoDArrayResult");
		
		for(int i=0; i<rowsize; i++) {
			for(int j=0; j<colsize; j++) {
				System.out.print(twoDArrayResult[i][j]+" ");
			}
			System.out.println();
		}
		
		rowsize = 3;
		colsize = 3;
		char charTwoDArray[][] = new char[rowsize][colsize];
		
		int m = 97;
		for(int i=0; i<rowsize; i++) {
			for(int j=0; j<colsize; j++) {
				charTwoDArray[i][j] = (char) m;
				m++;
			}
		}
		System.out.println("2 D charTwoDArray");
		
		for(int i=0; i<rowsize; i++) {
			for(int j=0; j<colsize; j++) {
				System.out.print(charTwoDArray[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("Printing the diagonal values");
		
		for(int i=0; i<rowsize; i++) {
			for(int j=0; j<colsize; j++) {
				if((i+j) == 2) {
					System.out.print(charTwoDArray[i][j]+" ");
				}
			}
		}
	}
}

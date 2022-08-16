package javaconstructprogramming;

import java.util.Scanner;

public class Calculate {

	int areaOfRectangle(int l, int b){
		int area = l * b;
		return area;
	}
	
	double areaOfTriangle(double l, double b){
		double area = 0.5 * l * b;
		return area;
	}
	
	double getPiValue() {
		return 3.142;
	}
	
	double areaOfCircle(double r){
		double pi = getPiValue();
		double area = pi * r * r ;
		return area;
	}
	
	public static void main(String[] args) {
		Calculate calculate = new Calculate();
		
		Scanner scanner = new Scanner(System.in);
		
		int ch = 1;
		int l;
		int b;
		do {
			System.out.println("1 -> areaOfRectangle");
			System.out.println("2 -> areaOfTriangle");
			System.out.println("3 -> areaOfCircle");
			System.out.println("Enter you choice");
			int choice = scanner.nextInt();
			
			switch (choice) {
			case 1:
				System.out.println("Enter the value for l");
				l = scanner.nextInt();

				System.out.println("Enter the value for b");
				b = scanner.nextInt();
				
				int areaOfRect = calculate.areaOfRectangle(l, b);
				
				System.out.println("areaOfRectangle = "+areaOfRect);
				break;
			
			case 2:
				System.out.println("Enter the value for l");
				l = scanner.nextInt();

				System.out.println("Enter the value for b");
				b = scanner.nextInt();
				
				double areaOfTriangle = calculate.areaOfTriangle(l, b);
				System.out.println("areaOfTriangle = "+areaOfTriangle);

				break;
			
			case 3:
				System.out.println("Enter the radius ");
				double radius = scanner.nextDouble();
				double areaOfCircle = calculate.areaOfCircle(radius);
				System.out.println("areaOfCircle = "+areaOfCircle);
				break;
				
			default:
				System.out.println("invalid choice...");
				break;
			}
			
			System.out.println("do you want to contineu... press 1");
			ch = scanner.nextInt();
		}while(ch == 1);
	}
}



//



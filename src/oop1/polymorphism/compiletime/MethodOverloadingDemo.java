package oop1.polymorphism.compiletime;

import java.util.ArrayList;
import java.util.Arrays;

public class MethodOverloadingDemo {

	public int[] copyArray(int[] x) {
		int tempArray[] = new int[x.length];
		
		for(int i=0;i<x.length;i++) {
			tempArray[i] = x[i];
		}
		
		return tempArray;
	}
	
	public double[] copyArray(double[] x) {
		double tempArray[] = new double[x.length];
		
		for(int i=0;i<x.length;i++) {
			tempArray[i] = x[i];
		}
		
		return tempArray;
	}
	
	public char[] copyArray(char[] x) {
		char tempArray[] = new char[x.length];
		
		for(int i=0;i<x.length;i++) {
			tempArray[i] = x[i];
		}
		
		return tempArray;
	}

	public boolean findElement(int x, int arr[]) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i] == x) {
				return true;
			}
		}
		return false;
	}
	
	public boolean findElement(char x, char arr[]) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i] == x) {
				return true;
			}
		}
		return false;
	}
	
	public boolean findElement(double x, double arr[]) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i] == x) {
				return true;
			}
		}
		return false;
	}
	
	public <T> void showElement(T arr[]) {
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
	
	public static void main(String[] args) {
		
		Integer arr[] = {1,2,3,4,5};
		Character charArray[] = {'S', 'H', 'U', 'B'};
		String strArray[] = {"sdfs", "sldfjwen", "wern", "sdf"};
		
		ArrayList<Integer> listOfIntegers = new ArrayList<Integer>();
//		listOfIntegers.addAll(3, Arrays.asList(arr));
		listOfIntegers.add(6);
		listOfIntegers.add(7);
		listOfIntegers.add(8);
		listOfIntegers.add(9);
		System.out.println("Using advance for loop");
		for(Integer integer : listOfIntegers) {
			System.out.println(integer);
		}
		
		System.out.println("Using normal for loop");
		for(int i=0;i<listOfIntegers.size();i++) {
			System.out.println(listOfIntegers.get(i));
		}
		
		MethodOverloadingDemo demo = new MethodOverloadingDemo();
		demo.showElement(charArray);
		
		ArrayList<String> listOfStrings = new ArrayList<String>();
		
		for(int i=0;i<26;i++) {
			listOfStrings.add(""+(char)(65+i));
		}
		
		System.out.println(listOfStrings);
	}
}

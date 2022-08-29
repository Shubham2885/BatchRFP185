package oop1.interfaces;

public class Pratice {

	public static void main(String[] args) {
		
		ArrayManipulation arrayManipulation = new ArrayManipulationImpl();
		
		int arr[] = {1,2,3,4,5};
		
		int copiedArray[] = arrayManipulation.copyArray(arr);
		
		for(int i=0;i<copiedArray.length;i++) {
			System.out.println(copiedArray[i]);
		}
		
		boolean result = arrayManipulation.findElement(6, copiedArray);
		
		System.out.println(result);
	}
}

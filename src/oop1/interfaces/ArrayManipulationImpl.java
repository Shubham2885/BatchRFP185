package oop1.interfaces;

public class ArrayManipulationImpl implements ArrayManipulation {

	@Override
	public int[] copyArray(int[] x) {
		int tempArray[] = new int[x.length];
		
		for(int i=0;i<x.length;i++) {
			tempArray[i] = x[i];
		}
		
		return tempArray;
	}

	@Override
	public boolean findElement(int x, int arr[]) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i] == x) {
				return true;
			}
		}
		return false;
	}

}

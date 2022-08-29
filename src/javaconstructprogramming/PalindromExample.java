package javaconstructprogramming;

public class PalindromExample {
	
	boolean checkIsPalindrom(String str){
		StringBuilder sb = new StringBuilder(str);
		return (str.compareTo(sb.reverse().toString()) == 0);
	}
	
	boolean checkPalindromUsingLoop(String str) {
		int size = str.length();
		for(int i=0;i<size/2;i++) {
			if(str.charAt(i) == str.charAt(size-1-i)) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		PalindromExample palindromExample = new PalindromExample(); 
		boolean result = palindromExample.checkPalindromUsingLoop("1234321");
		
		if(result) {
			System.out.println("Given String is palindrom...");
		}else {
			System.out.println("Given String is not palindrom...");
		}
	}
	
}

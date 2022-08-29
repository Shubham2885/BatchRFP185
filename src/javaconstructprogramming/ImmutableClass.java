package javaconstructprogramming;

public class ImmutableClass {

	private final int x;
	private final int y;
	public ImmutableClass(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	@Override
	public String toString() {
		return "ImmutableClass [x=" + this.x + ", y=" + this.y + "]";
	}
	
	public static void main(String[] args) {
		ImmutableClass immutableClass = new ImmutableClass(5, 6);
		ImmutableClass immutableClass2 = new ImmutableClass(6, 88);
		System.out.println(immutableClass);
		System.out.println(immutableClass2.getX());
	}
}

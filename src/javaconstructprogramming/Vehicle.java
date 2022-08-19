package javaconstructprogramming;

public class Vehicle {
	
	//properties or data members or state
	byte numberWheel;
	String typeOfVehicle;
	byte numberOfGear;
	String brand;
	String color;
	
	//behaviour or member function
	void movingStayring(){
		
	}
	
	void applyingBreak(){
		
	}
	
	void accelator(){
		
	}
	
	void changingGear(){
		
	}
	
	
	public static void main(String[] args) {
		
		//object
		Vehicle car = new Vehicle();
		car.numberWheel = 4;
		car.numberOfGear = 5;
		car.typeOfVehicle = "SUV";
		car.brand = "BMW";
		car.color = "Black";
		Vehicle truck = new Vehicle();
		truck.numberWheel = 6;
		truck.numberOfGear = 6;
		truck.typeOfVehicle = "Transport";
		truck.brand = "TATA";
		truck.color = "White";
		
	}
}

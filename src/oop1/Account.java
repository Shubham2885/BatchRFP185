package oop1;

public class Account {

	private int accountNo;
	private double balance;
	static int count = 0;
	
	public Account(){
		System.out.println("Default constructor is called...");
		accountNo = 50;
		balance = 11000;
		count++;
	}
	
	public Account(int accountNo, double balance) {
		System.out.println("Parameterise constructor is called...");
		this.accountNo = accountNo;
		this.balance = balance;
		count++;
	}

	public void showDetails(){
		System.out.println("accountNo = "+accountNo);
		System.out.println("balance = "+balance);
	}
}

package oop1.interfaces.solution;

public class CreditCard implements BankCard{

	@Override
	public void doPayment(double amount) {
		System.out.println("Payment doing by CreditCard..");
	}
	
}

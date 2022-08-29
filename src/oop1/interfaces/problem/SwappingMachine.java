package oop1.interfaces.problem;

public class SwappingMachine {
	
//	DebitCard debitCard;
	CreditCard creditCard;
	
	public SwappingMachine(CreditCard creditCard) {
		this.creditCard = creditCard;
	}

	public void doPayment(double amount) {
		System.out.println("shoppingMall payment method is calling...");
		creditCard.doPayment(amount);
	}
	
	public static void main(String[] args) {
		
//		DebitCard debitCard = new DebitCard();
		CreditCard creditCard = new CreditCard();
		
		SwappingMachine swappingMachine = new SwappingMachine(creditCard);
		
		swappingMachine.doPayment(5000);
	}
}

package oop1.interfaces.solution;

public class SwappingMachine {
	
	BankCard bankCard;
	
	public SwappingMachine(BankCard bankCard) {
		this.bankCard = bankCard;
	}
	
	public void doPayment(double amount) {
		System.out.println("shoppingMall payment method is calling...");
		bankCard.doPayment(amount);
	}
	
	public static void main(String[] args) {
		
		BankCard bankCard = new DebitCard();
		SwappingMachine swappingMachine = new SwappingMachine(bankCard);
		swappingMachine.doPayment(347);
	}
}

package oop1;

public class ConstructorDemo {

	public static void main(String[] args) {
		
		Account account = new Account();
		account.showDetails();
		
		Account account2 = new Account(12345,50000);
		account2.showDetails();
		
		Account account3 = new Account();
		account3.showDetails();
		
		
		System.out.println(account);
		System.out.println(account2);
		
		System.out.println("3st account3.count = "+account3.count);
		System.out.println("1st account.count = "+account.count);
		System.out.println("2st account2.count = "+account2.count);
	}
}

//2 constructor -> special method, when constructor is invoked, it will initilize the all instance varilable
// default
//parameterise constructor

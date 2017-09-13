package oop;

public class BankAccountApp {

	public static void main(String[] args) {
		// Creating a new bank account

		BankAccount acc1 = new BankAccount("Travel Account", 9999);
		
		//acc1.name = "Roger Hue";
		//With Encapsulation: public API methods
		acc1.setName ("Roger Hue");
		System.out.println(acc1.getName());
		acc1.setSsn("123456789");
		System.out.println("SSN: " +acc1.getSsn());
		
	
		
		acc1.accountNumber = "123";
		acc1.balance = 10267;
		
		acc1.setRate();
		acc1.increaseRate();
		
		acc1.deposit(1500);
		acc1.deposit(999);
		acc1.deposit(3654);
		acc1.withdraw(6666);
		acc1.checkBalance();
		
		
		//Polymorphism through overriding
		System.out.println(acc1.toString());
	
		System.out.println("\n");
		
		
		//Polymorphism through overloading
		BankAccount acc2 = new BankAccount("Checking Account" , 1169);
		acc1.accountNumber = "456";
		acc2.balance = 4562;
		acc2.checkBalance();
		acc1.name = "Ben Dover";
		System.out.println(acc1.toString());
		acc1.showActivity();
		System.out.println("\n");
		
		
		/*
		
		BankAccount acc3 = new BankAccount("Savings Account" , 5100);
		acc3.accountNumber = "789";
		acc3.balance = 3333;
		acc3.checkBalance();
		acc1.name = "Water Melon";
		System.out.println(acc1.toString());
		System.out.println("\n");
		
		
		//Demo for inheritance
		CDAccount cd1 = new CDAccount();
		cd1.balance = 3000;
		cd1.interestRate = "4.5";
		cd1.name = "Juan";
		cd1.accountType = "CD Account";
		System.out.println(cd1.toString());
		cd1.compound();
		
		*/
	
	}

}

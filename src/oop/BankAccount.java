package oop;

public class BankAccount implements IRate {

	String accountNumber;
	
	//static belongs to the class not the object instance
	//final constant often static final
	private static final String routingNumber = "9999";
	
	//instance variables
	private String name;
	private String ssn;
	String accountType;
	double balance;
	
	
	
	//constructor definitions;  unique methods
		//1. They are used to define, setup and initialize properties of an object
		//2. Constructors are IMPLICITLY called upon instantiation
		//3. The same name as the class itself
		//4. Constructors have no return type
	
	
	BankAccount() {
		System.out.println("NEW ACCOUNT CREATED");
		
	}
	
	//Overloading call the same method name with different arguments
	BankAccount(String accountType) {
		System.out.println("NEW ACCOUNT: " + accountType);
	}
	
	BankAccount(String accountType, double initDeposit) {
		//initDeposit, accountType, MSG are all local variables
		System.out.println("NEW ACCOUNT: " + accountType);
		System.out.println("INITIAL DEPOSIT OF: $ " + initDeposit);
		String Msg = null;
		if (initDeposit < 1000) {
			Msg = "Error: Minimum deposit must be at least $1,000";
			
		} else {
			Msg = "Thanks for your intial deposit of $" + initDeposit;
		}
		
		System.out.println(Msg);
		balance = balance + initDeposit;
		
	}
	
	//Getters and Setters 
	
	// Allow the user to define the name
	public void setName(String name)  {
		this.name = "Mr. " + name;
		
	}
	public String getName() {
		return name;
		
	}
		
	
	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	
	
	
	//Interface Methods
	
	public void setRate() {
		System.out.println("SETTING RATE" );
	}
	
	public void increaseRate() {
		System.out.println("INCREASING RATE" );
	}
	
	

	//defined methods
	public void deposit(double amount) {
		balance = balance + amount;
		showActivity("DEPOSIT");
		
	}
	
	public void withdraw(double amount) {
		balance = balance + amount;
		showActivity("WITHDRAWL");
		
	}
	private void showActivity(String activity) {
		System.out.println("Youre recent transaction " + activity );
		System.out.println("Youre new balance is: $ " + balance );
	}

	public void checkBalance() {
		System.out.println("Balance: " + balance);
		
	}
	
	public void getStatus() {
		
	}
	@Override
	public String toString() {
		return "[ NAME: " + name + ". ACCOUNT# " + accountNumber +  ". ROUTING#: " + routingNumber + ". BALANCE: $" + balance +" ]";
		
	}
}

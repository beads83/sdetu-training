package Labs;

public class BankAccountApp {

	public static void main(String[] args) {
		
		
		BankAccount acc1 = new BankAccount("019707454", 1000);
		acc1.setName("John");
		System.out.println(acc1.toString());
		//System.out.println(acc1.getName());
		acc1.makeDeposit(500);
		acc1.makeDeposit(300);
		acc1.payBill(900);
		acc1.accrue();
		//System.out.println(acc1.toString());
		
	}

}
class BankAccount implements IInterest {
	//properties of bank account
	
	private static int iD = 1000;	//internal id
	private String accountNumber;  //id + random 2 digit number + first 2 of SSN
	private static final String routingNumber = "01101978";
	private String name;
	private String  SSN;
	private double balance;
	
	//constructors
	public BankAccount (String SSN, double initDeposit) {
		balance = initDeposit;
		//System.out.println("New Account Created");
		this.SSN = SSN;
		iD++;
		//System.out.println(iD);
		setAccountNumber();
	}
	
	private void setAccountNumber()  {
		int random = (int) (Math.random() * 100);
		//System.out.println(random);
		accountNumber = iD + "" + random + SSN.substring(0, 2);
		//System.out.println("Your Account Number: " + accountNumber);
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void payBill(double amount) {
		System.out.println("Paying bill: $" + amount);
		balance =  balance - amount;
		showBalance();
		
	}
	
	public void makeDeposit(double amount) {
		System.out.println("Making deposit: $" + amount);
		balance = balance + amount;
		showBalance();
		
	}
	public void showBalance() {
		System.out.println("Balance: $" + balance);
	}

	@Override
	public void accrue() {
		balance = balance * (1 + rate/100);
		showBalance();
		System.out.println("\n");
		
		
	}
	@Override
	public String toString() {
		return "[Name: " + name + " ]\n[Account Number: " + accountNumber + "]\n[Routing Number: " + routingNumber + "]\nBalance: $" + balance + "]\n";
		
	}
	
	
}
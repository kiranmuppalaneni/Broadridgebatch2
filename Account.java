public class Account {

	private long accountNumber;
	private String customerName;
	private String accountType;
	private double balance;

	public Account() {
		System.out.println("Constructor will be " + "called at the time of object creation");
		accountNumber = 1001;
		customerName = "cust1";
		accountType = "savings";
		balance = 1000000;
	}

	public Account(long accnum, String custName, String accoType, double bal) {
		System.out.println("Arg Constructor will be " + "called at the time of object creation");
		accountNumber = accnum;
		customerName = custName;
		accountType = accoType;
		balance = bal;
	}

//	public void createAccount(long accnum, String custName, String accoType, double bal) {
//		accountNumber = accnum;
//		customerName = custName;
//		accountType = accoType;
//		balance = bal;
//	}

	public void getAccountDetails() {
		System.out.println(accountNumber);
		System.out.println(customerName);
		System.out.println(accountType);
		System.out.println(balance);
	}

	public double getBalance() {
		return balance;
	}

	public double withdraw(double amount) {
		balance = balance - amount;
		return balance;
	}

	public double deposit(double amount) {
		balance = balance + amount;
		return balance;
	}
}

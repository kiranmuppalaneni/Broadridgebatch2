
public class SavingsAccount extends Account {

	public double getInterest() {
		double newBalance = getBalance() + getBalance() * 0.10;
		setBalance(newBalance);
		return newBalance;
	}

}

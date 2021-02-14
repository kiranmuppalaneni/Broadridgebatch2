
public class CurrentAccount extends Account {

	@Override
	public double getInterest() {
		double newBalance = getBalance() + getBalance() * 0.02;
		setBalance(newBalance);
		return newBalance;
	}

}

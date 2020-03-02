
public class InterestAccount extends Account {

	public double _interestRate;
	public double getinterestRate() {
		return _interestRate;
	}
	public void setinterestRate(double interestRate) {
		_interestRate = interestRate;
	}

	public InterestAccount(String description) {
		super(0, description);
	}
	
	public InterestAccount() {
		this("Account with Interest");
	}
	
	public InterestAccount(double interestRate) {
		this._interestRate = interestRate;
	}
	
	public void calculateInterest(int months) {
		double interest = this._balance * (_interestRate/12) * months;
		deposit(interest);
	}
}

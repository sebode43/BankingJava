package java.banking;

class InterestAccount extends Account { //extends calls superclass (base class in C#)

	private static int _nextAcctNbr = 1;
	private double _interestRate;
	public double getinterestRate() {
		return _interestRate;
	}
	public void setinterestRate(double interestRate) {
		_interestRate = interestRate;
	}
	
	public InterestAccount(double interestRate, String description) {
		super(description);
		this._interestRate = interestRate;
		this.setAcctNbr(_nextAcctNbr++);
		}

	public InterestAccount(double interestRate) {
		super(interestRate, "Account with Interest"); //super in the method body calls the superclass
	}
	
	public InterestAccount() {
		this(1.0); //this calls the current class instead
	}
	
}

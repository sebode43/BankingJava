
public abstract class Account {

	public double _balance;
	public int _acctNbr;
	public String _description;
	
	public double getBalance() {
		return _balance;
	}
	public void setBalance(double balance) {
		_balance = balance;
	}
	public int getAcctNbr() {
		return _acctNbr;
	}
	public void setAcctNbr(int acctNbr) {
		_acctNbr = acctNbr;
	}
	public String getDescription() {
		return _description;
	}
	public void setDescription(String description) {
		_description = description;
	}
	
	private static int _nextAcctNbr = 1;
	private int _attemptToOverdraw = 0;
	public int getAttemptToOverdraw() {
		return _attemptToOverdraw;
	}
	public void setAttemptToOverdraw(int _attemptToOverdraw) {
		this._attemptToOverdraw = _attemptToOverdraw;
	}

	public Account(double balance, String description) {
	this.setBalance(balance);
	this.setDescription(description);
	this.setAcctNbr(_nextAcctNbr++);
	}
	public Account(String description) {
		this(0, description);
	}
	public Account() {
		this(null);
	}
	public boolean isAmountGTZero(double amount) {
		return(amount <= 0) ? false : true;
	}
	private boolean isSufficentFunds(double amount) {
		if(getBalance() >= amount) {
		return true;
	}
		setAttemptToOverdraw(getAttemptToOverdraw() + 1);
	return false;
	}
	public void deposit(double amount) {
		if(isAmountGTZero(amount)) {
			setBalance(getBalance() + amount);
		}
	}
	public boolean withdraw(double amount) {
		if(isAmountGTZero(amount) && isSufficentFunds(amount)) {
			setBalance(getBalance() - amount);
			return true;
		}
		return false;
	}
	public void transfer(double amount, Account toAccount) {
		if(this.withdraw(amount)) {
			toAccount.deposit(amount);
		}
	}
	
	@Override //annotation
	public String toString() {
		return String.format("%-9.2d, %b", _description, _balance );
	}
	
	public void debug() {
		System.out.println(this);
	}
	
}

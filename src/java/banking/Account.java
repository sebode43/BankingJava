package java.banking;

public class Account implements iAccount { //implements instead of extends for interfaces

	private double _balance; //put _ for variables that are parameters
	private int _acctNbr;
	private String _description;
	
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
		this("Account");
	}
	public boolean isAmountGTZero(double amount) {
		return amount > 0;
	}
	private boolean isSufficentFunds(double amount) {
		return _balance >= amount;
	}
	
	public boolean deposit(double amount) {
			isAmountGTZero(amount);
			setBalance(getBalance() + amount);
			return true;
		}
	public boolean withdraw(double amount) {
		if(isAmountGTZero(amount) && isSufficentFunds(amount)) {
			setBalance(getBalance() - amount);
			return true;
		}
		return false;
	}
	public boolean transfer(double amount, Account toAccount) {
		if(this.withdraw(amount)) {
			return false;
		}
			toAccount.deposit(amount);
			return true;
	}
	
	@Override //annotation (like attributes in C#)
	public String toString() {
		return String.format("%-9.2d, %b", _description, _balance );
	}
	
	public void debug() {
		System.out.println(this);
	}
	
}

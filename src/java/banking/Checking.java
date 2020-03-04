package java.banking;

public class Checking implements iAccount {
	
	private static int _nextAcctNbr = 1;
	private InterestAccount _iacct;
	
	public int _checkNbr;
	public int getCheckNbr() {
		return _checkNbr;
	}


	public boolean deposit(double amount) {
		return	_iacct.deposit(amount);
	}

	public boolean withdraw(double amount) {
		return _iacct.withdraw(amount);
	}

	public boolean transfer(double amount, Account toAccount) {
		return _iacct.transfer(amount, toAccount);
	}
	
	public Checking(String description, double intRate) {
		_iacct = new InterestAccount(intRate);
		_iacct.setDescription(description);
		_iacct.setAcctNbr(_nextAcctNbr++);
		}
	
	public Checking(double intRate) {
		this("Checking", intRate); //this calls the current class instead
	}

	public Checking() {
		this(1.0);
	}
	
	@Override
	public double getBalance() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public void setBalance(double balance) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public int getAcctNbr() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public void setAcctNbr(int acctNbr) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void setDescription(String description) {
		// TODO Auto-generated method stub
		
	}

}
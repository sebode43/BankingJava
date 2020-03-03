
public class Checking implements iAccount {
	
	public InterestAccount _iacct;
	public InterestAccount getIacct() {
		return _iacct;
	}
	public void setIacct(InterestAccount iacct) {
		_iacct = iacct;
	}
	public int _checkNbr;
	public int getCheckNbr() {
		return _checkNbr;
	}
	public void setCheckNbr(int checkNbr) {
		_checkNbr = checkNbr;
	}

	public void deposit(double amount) {
		_iacct.deposit(amount);
	}

	public boolean withdraw(double amount) {
		_checkNbr++;
		return _iacct.withdraw(amount);
	}

	public void transfer(double amount, Account toAccount) {
		_iacct.transfer(amount, toAccount);
	}

	public void transfer(double amount, Checking toAccount) {
		_iacct.transfer(amount, toAccount._iacct);
	}

	public Checking(double intRate) {
		_iacct = new InterestAccount(intRate);
		_iacct._description = "Checking";
	}

	public Checking() {
		this(0.02);
	}

}
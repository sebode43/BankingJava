package java.banking;

public interface iAccount {

	double getBalance();
	void setBalance(double balance);
	int getAcctNbr();
	void setAcctNbr(int acctNbr);
	public String getDescription();
	void setDescription(String description);
	
	
	boolean deposit(double amount);
	boolean withdraw(double amount);
	boolean transfer(double amount, Account toAccount);
}

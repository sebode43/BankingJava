
public interface iAccount {
	public void deposit(double amount);
	public boolean withdraw(double amount);
	public void transfer(double amount, Account toAccount);
}

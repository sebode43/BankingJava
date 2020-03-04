package java.banking;

public class Savings extends InterestAccount {

	/*public Savings(String description) {
		super(description);
	}
	
	public Savings() {
		this("Savings");
	}*/
	
	public Savings() {
		this.setDescription("Savings");
	}
	
	public Savings(double interestRate) {
		super(interestRate);
		setDescription("Savings");
	}
}

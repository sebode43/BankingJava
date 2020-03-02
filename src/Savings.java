
public class Savings extends InterestAccount {

	/*public Savings(String description) {
		super(description);
	}
	
	public Savings() {
		this("Savings");
	}*/
	
	public void setDescription(String description) {
		_description = description;
	}
	
	public Savings() {
		this.setDescription("Savings");
	}
	
	public Savings(double interestRate) {
		super(interestRate);
		setDescription("Savings");
	}
}

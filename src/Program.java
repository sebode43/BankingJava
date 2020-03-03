import java.util.ArrayList;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Checking chk1 = new Checking();
		chk1.deposit(100);
		chk1.withdraw(75);
		System.out.println(chk1);
		
		Savings sav1 = new Savings();
		sav1.deposit(100);
		sav1.withdraw(75);
		
		Savings sav2 = new Savings();
		sav2.deposit(100);
		sav2.withdraw(75);
		sav2.calculateInterest(3);
		
		ArrayList<iAccount> accounts = new ArrayList<iAccount>();
		accounts.add(sav1);
		accounts.add(sav2);
		accounts.add(chk1);
		
		
		chk1.transfer(25, sav1);
		
	}

}

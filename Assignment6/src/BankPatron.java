
public class BankPatron {

	public String firstName;
	private String lastName;
	private double salary;
	private double cashHand;
	
	BankAccount acc1 = null;
	BankAccount acc2 = null;

	public BankPatron () {
		this.firstName = "def";
		this.lastName = "";
		this.salary = 0.0;
		this.cashHand = 0.0;
	}
	
	public BankPatron(String firstName, String lastName, double salary, double cashHand) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
		this.cashHand = cashHand;
	}
		
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public void setCashHand(double cashHand) {
		this.cashHand = cashHand;
	}
	public String getFull() {
		return (firstName + " " + lastName);
	}
	
	public double getCash() {
		return cashHand;
	}
	public double salary() {
		return salary;
	}
	
	public void payCheck() {
		double payCheck = salary/26.0714; 
		cashHand += payCheck;
	}
	public BankAccount getBankAccount(int num){
		if (num == 1) {
			return acc1;
	 } else if (num == 2) {
		return acc2;
	 } else {
		return null;
				}
	}
	public boolean deposit(double amount, BankAccount tempAcc) {
		boolean success = true;
		
		if (amount < cashHand) {
			success = false;
		} else if (amount >= cashHand) {
			tempAcc.deposit(amount);
			cashHand -= amount;
		}
		return success;
	}
	public boolean withdraw(double amount, BankAccount tempAcc) {
		if (tempAcc.withdraw(amount)) {
			cashHand += amount;
		}
		return tempAcc.withdraw(amount);
		
	}
	
	public boolean addAccount(double rate, AccountType type) {
		boolean success = true;
		if (acc1 == null) {
		acc1 = new BankAccount("", "", rate, type);
		} else if (acc1 != null) {
			acc2 = new BankAccount("", "", rate, type);
		} else if (acc1 != null && acc2 != null){
			success = false;
		}
		return success;
	}
	
	public boolean removeAccount(int num) {
		boolean success = true;
		if (num == 1 && acc1 != null) {
			acc1 = null;
		} else if (num == 2 && acc2 != null) {
			acc2 = null;
		} else if ((acc1 == null && acc2 == null) || (num != 1 && num != 2) ) {
			success = false;
		}
		return success;
	}
	
}

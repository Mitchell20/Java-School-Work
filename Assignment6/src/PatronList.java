public class PatronList {
	public BankPatron pat1;
	private BankPatron pat2;
	private BankPatron pat3;
	private BankPatron pat4;
	private BankPatron pat5;
	 
	public PatronList() {
		pat1 = null;
		pat2 = null;
		pat3 = null;
		pat4 = null;
		pat5 = null;
	}
	public int getNullPatron() {
		if (pat1 == null) {
			return 0;
		} else if (pat2 == null) {
			return 1;
		} else if (pat3 == null) {
			return 2;
		} else if (pat4 == null) {
			return 3;
		} else if (pat5 == null) {
			return 4;
		} else {
			return -1;
		}
	}
	
	public boolean addPatron(BankPatron temp){
		boolean success = true;
				
		if (getNullPatron() != -1) {
			temp = new BankPatron();
		}
		 else {
			success = false;
		}
		
		return success;
	}
	
	public BankPatron addPatron(String firstName, String lastName, double salary, double cashHand) {
		BankPatron temp = new BankPatron();
		temp.setFirstName(firstName);
		temp.setLastName(lastName);
		temp.setSalary(salary);
		temp.setCashHand(cashHand);
		return temp;
		
	}
	
	
	public BankPatron getPatron(int num) {
		if (num == 0) {
			return pat1;
		} else if (num == 1) {
			return pat2;
		} else if (num == 2) {
			return pat3;
		} else if (num == 3) {
			return pat4;
		} else if (num == 4) {
			return pat5;
		} else {
			return null;
		}
	}
	
	public BankPatron getPatron(String fullName) {
		if (pat1.getFull() == fullName) {
			return pat1;
		} else if (pat2.getFull() == fullName) {
			return pat2;
		} else if (pat3.getFull() == fullName) {
			return pat3;
		} else if (pat4.getFull() == fullName) {
			return pat4;
		} else if (pat5.getFull() == fullName) {
			return pat5;
		} else {
			return null;
		}
	}
	public boolean removePatron(String fullName) {
		boolean success = true;
		if (pat1.getFull() == fullName) {
			pat1 = null;
		} else if (pat2.getFull() == fullName) {
			pat2 = null;
		} else if (pat3.getFull() == fullName) {
			pat3 = null;
		} else if (pat4.getFull() == fullName) {
			pat4 = null;
		} else if (pat5.getFull() == fullName) {
			pat5 = null;
		} else {
			success = false;
		}
		return success;
	}
	public String printPatron(BankAccount tempAcc, BankPatron tempPat) {
		if (tempAcc != null) {
		return (tempAcc.getHolderFullName() + " " + tempAcc.getType() + " " + "Balance: " + tempAcc.checkBalance() + "Interest Rate: " + tempAcc.getRate());
		} else {
		return (tempPat.getFull());
		}
	}
}
import java.util.*;

public class Assignment6 {
	
	public static Scanner scan = new Scanner(System.in);
	public static PatronList pat = new PatronList();
	
	public static void main(String[] args) {
		
		 System.out.println("Welcome to the Vault!");
		 String choice = mainMenu();
		 String fullName;
		 while (!choice.equals("e")) {
			 
			 switch(choice) {
			 
			 case "a":
				
				 
				if (pat.getPatron(0) == null && pat.getPatron(1) == null && pat.getPatron(2) == null && pat.getPatron(3) == null && pat.getPatron(4) == null) {
					 System.out.println("None.");
					 
				 } else {
									 
					 if (pat.getPatron(0) != null) {
						 pat.printPatron(pat.getPatron(0).acc1,pat.getPatron(0));
						 pat.printPatron(pat.getPatron(0).acc2, pat.getPatron(0));
					 }
					 
					 if (pat.getPatron(1) != null) {
						 pat.printPatron(pat.getPatron(1).acc1, pat.getPatron(1));
						 pat.printPatron(pat.getPatron(1).acc2, pat.getPatron(1));
					 }
					 
					 if (pat.getPatron(2) != null) {
				 		 pat.printPatron(pat.getPatron(2).acc1, pat.getPatron(2));
				 		 pat.printPatron(pat.getPatron(2).acc2, pat.getPatron(2));
					 }
					 
					 if (pat.getPatron(3) != null) {
						 pat.printPatron(pat.getPatron(3).acc1, pat.getPatron(3));
						 pat.printPatron(pat.getPatron(3).acc2, pat.getPatron(3));
					 }
					 
					 if (pat.getPatron(4) != null) {
						 pat.printPatron(pat.getPatron(4).acc1, pat.getPatron(4));
						 pat.printPatron(pat.getPatron(4).acc2, pat.getPatron(4));
				 	 }
					 }
				 break;
			
			 case "b":
				
				 pat.addPatron(pat.getPatron(pat.getNullPatron()));
				 
				 System.out.println("First Name?");
				 String firstName = scan.next();
				 
				 System.out.println("Last Name?");
				 String lastName = scan.next();
				 
				 System.out.println("Salary?");
				 double salary = scan.nextDouble();
				 
				 System.out.println("Cash on Hand?");
				 double cashHand = scan.nextDouble();
				 			 
				 pat.addPatron(firstName, lastName, salary, cashHand);
				 
				 if (pat.addPatron(pat.getPatron(pat.getNullPatron()))) {
					 System.out.println("Welcome to the bank, " + firstName + " " + lastName);
					 
				 } else {
					 System.out.println("The bank line is full.");
				 }
				 
			
				 break;
				 
			 case "c":
				 
				System.out.println("Please enter the full name of the Patron you would like to remove.");
				fullName = scan.nextLine();
				 
				 pat.removePatron(fullName);
				 
				 if (pat.removePatron(fullName)) {
					 System.out.println("Patron successfully removed.");
				 } else {
					 System.out.println("Could not find patron by that name.");
				 }
				 
				 break;
				 
			 case "d":
				 
				 System.out.println("Which patron would you like to edit? Enter the full name.");
				 fullName = scan.nextLine();
				 
				 if (pat.getPatron(fullName) == null) {
					 System.out.println("Name does not exist.");
					 
				 } else {
					 specMenu(pat.getPatron(fullName));
				 }
				 break;
				 
			default:
				break;
			 }
			choice = mainMenu();			 
			 
		 }
		 System.out.println("Goodbye!");
		 
	}
	
	public static String mainMenu() {
		
		System.out.println("a. List the Patrons\nb. Add a New Patron\nc. Remove a Patron\nd. Patron Specific Actions\ne. Quit");
		String choice = scan.next(); 
		while (!choice.equals("a") && !choice.equals("b") &&!choice.equals("c") &&!choice.equals("d") &&!choice.equals("e")) {
			System.out.println("Enter a valid entry.");
			choice = scan.next();
		} 
			return choice;
			
		}
	
	public static String patronMenu() {
		System.out.println("a. Add a New Account\nb. Close Account\nc. Get Paid\nd. Apply Interest to Accounts\ne. Make Deposit\nf. Make Withdraw\ng. Return to Main Menu");
		String choice = scan.next(); 
		
		if (!choice.equals("a") && !choice.equals("b") && !choice.equals("c") && !choice.equals("d") && !choice.equals("e") && !choice.equals("f") && !choice.equals("g")) {
			System.out.println("Enter a valid entry.");
			choice = scan.next();
		} 
			return choice;
		
		}
	public static AccountType newAccount() {
		System.out.println("a. Checking\nb. Savings\nc. CD\nd. Money Market\ne. IRA");
		String choice = scan.next();
		AccountType type = null;
		
		while (!choice.equals("a") && !choice.equals("b") && !choice.equals("c") && !choice.equals("d") && !choice.equals("e")) {
			System.out.println("Invalid entry");
			choice = scan.next();
		
		}
		switch (choice) {
		
		case "a": 
			type = AccountType.Checking;
			break;
			
		case "b": 
			type = AccountType.Savings;
			break;
			
		case "c":
			type = AccountType.CD;
			break;
			
		case "d":
			type = AccountType.MoneyMarket;
			break;
			
		case "e":
			type = AccountType.IRA;
			break;
		}
		return type;
	}
	
	public static void specMenu(BankPatron temp) {
		String choice = patronMenu();
		
		while (!choice.equals("g")) {
			
			switch (choice) {
			
			case "a":
				AccountType type = newAccount();
				System.out.println("What will be your interest rate?");
				double rate = scan.nextDouble();
				
				temp.addAccount(rate, type);
				
				if (temp.addAccount(rate, type)) {
					System.out.println("Account successfully added.");
				} else {
					System.out.println("Account could not be added.");
				}
				break;
				
			case "b":
				System.out.println("Would you like to remove Account 1 or Account 2? Enter the number.");
				int numB = scan.nextInt();
				
				temp.removeAccount(numB);
				
				if (temp.removeAccount(numB)) {
					System.out.println("Account successfully removed.");
				} else {
					System.out.println("Account could not be removed.");
				}
				break;
				
			case "c":
				temp.payCheck();
				break;
				
			case "d":
				
				if (temp.acc1 != null) {
					temp.acc1.applyInterest();
				}
				if (temp.acc2 != null) {
					temp.acc2.applyInterest();
				}
				break;
			
			case "e":
				System.out.println("Which account would you like to make a deposit? 1 or 2?");
				int numE = scan.nextInt();
				
				BankAccount accountD = null;
				
				if (numE != 1 && numE != 2) {
					System.out.println("Enter 1 or 2.");
					numE = scan.nextInt();
				} else if (numE == 1) {
					accountD = temp.acc1;
				} else if (numE == 2) {
					accountD = temp.acc2;
				}
				
				System.out.println("Enter the amount you would like to deposit.");
				double amountD = scan.nextDouble();
				temp.deposit(amountD, accountD);
				
				if (temp.deposit(amountD, accountD)) {
					System.out.println("Deposit successful.");
				} else {
					System.out.println("Could not deposit into account.");
				}
				break;
				
			case "f":
				System.out.println("Which account would you like to withdraw from? 1 or 2?");
				int numF = scan.nextInt();
				
				BankAccount accountW = null;
				
				if (numF != 1 && numF != 2) {
					System.out.println("Enter 1 or 2.");
					numF = scan.nextInt();
				} else if (numF == 1) {
					accountW = temp.acc1;
				} else if (numF == 2) {
					accountW = temp.acc2;
				}
				
				System.out.println("Enter the amount you would like to withdraw.");
				double amountW = scan.nextDouble();
				temp.withdraw(amountW, accountW);
				
				if (temp.withdraw(amountW, accountW)) {
					System.out.println("Withdraw successful.");
				} else {
					System.out.println("Could not withdraw from account.");
				}
				break;
				
			}
			
			choice = patronMenu();
		}
	}
}

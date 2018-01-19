import java.util.*;

public class Assignment5 {
	public static Scanner scan = new Scanner (System.in);
	
	public static void main(String[] args) {
		
		 String  choice;
		
		Pet myPet1 = new Pet("Fido", 3);
		Pet myPet2 = new Pet("Furball", 1);
		Pet myPet3 = null;
		
		
		
		System.out.println("Welcome to the pet store!");
		
		choice = menu();
		System.out.println(choice);
		
		while (!choice.equals("E")) {
			
			if (choice.equals("A")) {
				System.out.println(myPet1.getName() + " is a bumpin' Beagle who's " + myPet1.getAge() +
						" years old and is " + myPet1.getAdopted() + ".");
				System.out.println(myPet2.getName() + " is a noice Newfoundland who's " + myPet2.getAge() +
						" years old and is " + myPet2.getAdopted() + ".");
				if (myPet3 != null) {
					System.out.println(myPet3.getName() + " is a noob here, he's " + myPet3.getAge() +
							" years old and is " + myPet3.getAdopted() + ".");
				}
			} else if (choice.equals("B")) {
				System.out.println("Everyone just got a little older eh?");
						myPet1.setAge(myPet1.getAge());
						myPet2.setAge(myPet2.getAge());
						if (myPet3 != null) {
						myPet3.setAge(myPet3.getAge());
						}
			} else if (choice.equals("C")) {
					
					System.out.println("Go ahead and enter a name for the new guy.");
					String pet3Name = scan.next();
					System.out.println("We're gonna need an age too.");
					int pet3Age = scan.nextInt();
					System.out.println(pet3Name + " is in the store.");
					myPet3 = new Pet(pet3Name, pet3Age);
					
			} else if(choice.equals("D")) {
					System.out.println("Which little guy do you want? The number matches the order they appear on the list");
					int guy = scan.nextInt();
					
					if (guy == 1) {
						if (myPet1.getAdopted().equals("adopted")) {
						System.out.println("Bummer, pet's already adopted.");
						} else {
							System.out.println("Thanks so much for adopting buddeh!");
							myPet1.setAdopted();
						}
					} else if (guy == 2) {
						if (myPet2.getAdopted().equals("adopted")) {
						System.out.println("Bummer, pet's already adopted.");
						} else {
							System.out.println("Thanks so much for adopting buddeh!");
							myPet2.setAdopted();
						}
					} else if (myPet3 != null && guy == 3) {
							if (myPet3.getAdopted().equals("adopted")) {
							System.out.println("Bummer, pet's already adopted.");
							} else {
								System.out.println("Thanks so much for adopting" + myPet3.getName() + "!");
								myPet3.setAdopted();
							}
					} else {
								System.out.println("Not a number of a little guy in this store.");
							}
					
				} else {
					System.out.println("Invalid Entry.");
					}
			menu();
			choice = menu();
			}
		
			System.out.println("Have a good day!");	
		}
						
	
	public static String menu() {
		System.out.println("Type the letter to make your selection.\nA. List the pets in the store.\nB. Age up the new pets.\nC. Add a new pet.\nD. Adopt a pet.\nE. Quit.");
		String choice = scan.next();
		return choice;	 
	}
}
		
	
	
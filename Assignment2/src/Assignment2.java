import java.util.Scanner;

public class Assignment2 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Please input a word or phrase.");
		String originalPhrase = in.nextLine();
		
		System.out.println("Please input the string you would like to "
				+ "search for in your word or phrase.");
		String searchPhrase = in.nextLine();
		
		System.out.println("Do you want to consider spaces? "
				+ "Type 1 for Yes, or 0 for No.");
		String yNSpaces = in.next();
			
		System.out.println("Do you want to consider uppercase and lowercase as different?"
				+ " Type 1 for Yes, or 0 for No.");
		String yNCase = in.next();
		
		 // String to int conversion
		
		int p = Integer.parseInt(yNSpaces);
		int q = Integer.parseInt(yNCase);
		
		// replaces string to a string with no spaces, casts string to all uppercase
				
		if (p == 0) {
			originalPhrase = originalPhrase.replace(" ","");
			searchPhrase = searchPhrase.replace(" ", "");
		};
		
		if (q == 0) {
			originalPhrase = originalPhrase.toUpperCase();
			searchPhrase = searchPhrase.toUpperCase();
		};
		
		// ensures original phrase contains search phrase
				
		if (originalPhrase.contains(searchPhrase)) { 
			 
			int begIndex = originalPhrase.lastIndexOf(searchPhrase); //returns the index of the beginning of the search in original
			int sub = originalPhrase.length() - searchPhrase.length() - begIndex; // difference between the end of the original length to the end of the search phrase
			int endIndex = originalPhrase.length() - sub; // returns the index of the end of the search in original
			
			if (searchPhrase.equals(originalPhrase)) {
					System.out.println("Your search is equal to the entire input.");
			} 
				else if (begIndex == 0 && sub > 0) {
				
				System.out.println("Your search at beginning of the original entry.");
				
			} 
				else if (begIndex > 0 && sub == 0) {
					
				System.out.println("Your search is at end of the original entry.");
			}
				else {
					System.out.println("Your search term starts at index [" + begIndex + "] and ends at index [" + (endIndex - 1) + "].");
				}
			}
		 
		 	else if(originalPhrase.contains(searchPhrase) != true) {
		 		
			System.out.println("Your search could not be found.");
			
			} ;
			
		}
				
	}
	



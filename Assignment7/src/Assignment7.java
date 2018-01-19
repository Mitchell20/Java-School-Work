import java.util.*;
public class Assignment7 {
	static Scanner scan = new Scanner(System.in);
	
		private static String mainMenu()
		{
			boolean tree = false;
			while(!tree)
			{
				System.out.println("What would you like to do?");
				System.out.println("a. Create a Searchable String");
				System.out.println("b. Print the current Searchable String");
				System.out.println("c. Search within the String");
				System.out.println("d. Quit");
				
				String choice = scan.nextLine();
				if(choice.length() == 1)
				{
					char c = choice.charAt(0);
					if(c >= 'a' && c <= 'd')
						return choice;
					else if (c >= 'A' && c <= 'D')
						return choice.toLowerCase();
					else
						System.out.println("Invalid menu choice. Try again.");
				}
				else
					System.out.println("Invalid menu choice. Try again.");
			}
			return "";
		}
		private static void searchString(MyString str)
		{
			System.out.print("What String did you want to search for? ");
			String search = scan.nextLine();
			
			if(str.equals(search))
				System.out.println("The search is identical to the MyString");
			else if(str.startsWith(search))
				System.out.println("The search is at the beginning of the string");
			else if(str.endsWith(search))
				System.out.println("The search is at the end of the string");
			else if(str.contains(search))
				System.out.println("The search is at index " + str.indexOf(search) + " of the string");
			else
				System.out.println("The search is not in the string");
		}
		public static void main(String[] args) {
			System.out.println("Hi. Welcome to the String searcher. ");
			String choice = "";
			MyString str = new MyString();
			String search;
			
			while(!choice.equals("d"))
			{
				choice = mainMenu();
				switch(choice)
				{
				case "a":
					System.out.print("Please enter the searchable string: ");
					search = scan.nextLine();
					str = new MyString(search);
					System.out.println("Set " + search + " as searchable string");
					break;
					
				case "b":
					System.out.println("The searchable string is: " + str);
					break;
					
				case "c":
					searchString(str);
					break;
					
				case "d":
					break;
				}
			}
			System.out.println("Bye!");
		}
	}

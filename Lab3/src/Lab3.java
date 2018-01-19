import java.util.*;

public class Lab3 {
	
	public static void main(String[] args)	{
		
		Scanner scan = new Scanner(System.in);
		
		// Define score as a double, inputed by user 
		
		System.out.println("Enter a score: ");
		double score = scan.nextDouble();
		
		// Nested if-else 
		
		if (score >= 90) {
			System.out.println("You got an A!");
		} else if (score >=80) {
		System.out.println("You got a B!");
		} else if (score >= 70) {
			System.out.println("You got a C!");
		} else if (score >= 60) {
			System.out.println("You got a D!");
		} else {
			System.out.println("You failed :(");
		}
		
		System.out.println("Enter another score: ");
		double secondScore = scan.nextDouble();
		
		// Cast double to integer, drops decimal
		
		int forSwitchScore = (int) secondScore/10;
		
		// Switch statement for letter grade
		
		switch(forSwitchScore) {
		
		case 10:
			System.out.println("You got an A!");
			break;
		case 9:
			System.out.println("You got an A!");
			break;
		case 8:
			System.out.println("You got a B!");
			break;
		case 7:
			System.out.println("You got a C!");
			break;
		case 6:
			System.out.println("You got a D!");
			break;
		default: 
			System.out.println("You failed :(");
		}
		
		System.out.println("You've reached an endless letter grade calculator. Enter a valid score to continue using the calculator: ");
		
		double loopScore = scan.nextDouble();
		int endlessLoopScore = (int) loopScore/10;
		
		// Endless loop, until user enters a negative
		
		while (endlessLoopScore >= 0) {
						
			switch(endlessLoopScore) {
			
			case 10:
				System.out.println("You got an A! Enter another valid score: ");
				break;
				
			case 9:
				System.out.println("You got an A! Enter another valid score: ");
				
				break;
				
			case 8:
				System.out.println("You got a B! Enter another valid score: ");
				
				break;
			
			case 7:
				System.out.println("You got a C! Enter another valid score: ");
				
				break;
				
			case 6:
				System.out.println("You got a D! Enter another valid score: ");
			
				break;
				
			default: 
				System.out.println("You failed :( Enter another valid score: ");
				
			}
			loopScore = scan.nextDouble();
			endlessLoopScore = (int) loopScore/10;
		}
			System.out.println("Please enter a valid score!");
	}
}
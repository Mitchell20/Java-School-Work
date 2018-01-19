import java.util.*;
public class Assignment4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// obtain height of tree
		
		System.out.println("Please type in the height of the tree.");
		int height = scan.nextInt();
		
		// check height entered with conditions
		
		while (height < 1 || height > 25) {
			System.out.println("The height must be at least 1 and no greater than 25."
					+ " Enter a new height.");
			height = scan.nextInt();
		}
				
		System.out.println("Would you like a diamond instead of a pyramid?\nType Yes or No.");
		String yN = scan.next();
		boolean diamond = false;
		
		// check yes/no validity
		
		while (!yN.equals("Yes") && !yN.equals("No")) {
			System.out.println("Invalid input. Please try again.");
			yN = scan.next();
		} 		
		
		// re-initialize diamond boolean, prompt user
		
		if (yN.equals("Yes")) {
			diamond = true;
			
			if (diamond) {
				System.out.println("Making a diamond instead.");
			} 
		} else {
			System.out.println("Printing a pyramid.");
		}
		
		// declare and initialize counting and loop vars
		
		int j, i, k, m, n, p;
		int count = 1;
		int temp = height*2-3;
		
		// pyramid logic
		
		for (i = 1; i <= height; i++) {
			for (j = i; j < height; j++) {
				System.out.print(" ");
			}
			for (k = 0; k < count; k++) {
				System.out.print("*");
			}		
			count += 2;
			System.out.println();
			}
		
			// diamond logic
		
		if (diamond) {
			for (p = 1; p < height; p++) {
			for (m = height - p; m < height; m++) {
			System.out.print(" ");
			}
			for (n = 0; n < temp; n++) {
				System.out.print("*");
			}
			temp -= 2;
			System.out.println();
	    }
	}
		scan.close();
}}
	
		
		

	



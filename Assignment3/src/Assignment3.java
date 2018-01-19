import java.util.*;

public class Assignment3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int nInputs = 0;
		double sum = 0;
		double num; // holds user's last input
				
		System.out.println("Please type in a double value. Type 0 to quit.");
		
		num = scan.nextDouble();
		double smallest = num;
		double largest = num;
		
		if (num == 0) {
			System.out.println("You didn't type anything in.");
			
		} else {
			
			while (num != 0){
			
			sum += num;
						
			if (num > largest) {
				largest = num;
			}
			if (num < smallest) {
				smallest = num;
			}
			
			nInputs++;
			
			System.out.println("Please type in a double value. Type 0 to quit.");
			
			num = scan.nextDouble();
	
		}			
			System.out.println("The sum of your inputs is: " + sum);
			System.out.println("The total number of inputs you provided was: " + nInputs);
			System.out.println("The average of your inputs was: " + sum/nInputs);
			System.out.println("The highest number you input was: " + largest);
			System.out.println("The lowest number you input was: " + smallest);
			
		}
	}
}



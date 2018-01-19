import java.util.*;

public class Lab4
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);

		for (int i = 1; i <= 10; i++ ) {
		
			for (int j = 1; j <= i; j++) {
				
				System.out.print("*");
		}
			System.out.println();
	}

		System.out.println("Now we will find some even and odd numbers.");
	
		int num = 0;
	
		do {
			System.out.println("Please enter an integer greater than 2: ");
		
			num = in.nextInt();
			
			if (num <= 2) {
			
				System.out.println(num + " is not greater than 2.");
				}
		} while (num <= 2);
	
		System.out.print("All the even numbers from 2 to " + num + " are: ");
	
		for (int i = 2; i <= num; i++) {
		
			if (i%2 == 0) {
			System.out.print(i + " ");
		}
			}
		
		System.out.println();
		System.out.print("All the odd numbers from 2 to " + num + " are: ");

		for (int i = 2; i <= num; i++) {
			
			if (i%2 == 1) {
			System.out.print(i + " ");
		}
		
	}
}
}
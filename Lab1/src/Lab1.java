import java.util.*;

public class Lab1 {

	public static void main(String[] args) {
		
			Scanner scan = new Scanner(System.in);
			
			System.out.print("Please enter a number: ");		//line asking for number
			
			int x = scan.nextInt();		//creates first int variable for user assignment
			
			System.out.println(x);		//prints out above entry for user verification
			System.out.print("You typed in: ");	
			System.out.println(x);
			
			System.out.print("Please enter a second number: ");
			
			int y = scan.nextInt();		//creates second int variable for user assignment
			
			System.out.println(y);
			System.out.print("You typed in: ");	
			System.out.println(y);
			
			System.out.print("Addition = ");
			System.out.println(x+y);	//Addition
			
			System.out.print("Subtraction = ");
			System.out.println(x-y);	//Subtraction
			
			System.out.print("Multiplication = ");
			System.out.println(x*y);	//Multiplication
			
			System.out.print("Integer Division = ");
			System.out.println(x/y);	//Integer Division
			
			System.out.print("Modulus = ");
			System.out.println(x%y);	//Modulus
	}

}

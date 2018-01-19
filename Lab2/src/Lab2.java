import java.util.Scanner;

public class Lab2 {
	
	public static void main (String [] args)
	{
		Scanner scan=new Scanner(System.in);	//scanner variable "scan" defined
		
		int age = 0; 	// integer called age
		double num1 = 0;
		double num2 = 0; 	// 2 double called num1, num2
		String firstName;	// string called firstName
		String lastName; 	// string called lastName
		String fullName;	//string called fullName
		
		// read in first name, last name, age, and two numbers
		
		System.out.println("Enter the first name: ");
		firstName = scan.next();	

		System.out.println("Enter the last name: ");
		lastName = scan.next();
		
		System.out.println("Enter the age: ");
		age = scan.nextInt();
		
		System.out.println("Enter first number:");
		num1 = scan.nextDouble();
		
		System.out.println("Enter Second number:");
		num2 = scan.nextDouble();
		
		fullName = firstName + " " + lastName;
		System.out.println(fullName + " is " + age + " years old.");
		
		//	convert fullname to uppercase
		
		String result = fullName.toUpperCase();
		System.out.println("Uppercase full name is: " + result);
		
		//	Compare 2 numbers
						
		if (num1 > num2) {
		
			System.out.println( "First number is greater than second number.");
		}
		else if (num2 > num1) {
			System.out.println("Second number is greater than first number.");
		}
		else System.out.println( "First and second number are equal.");
		}
	}

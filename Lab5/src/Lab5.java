import java.util.*;
public class Lab5
{
	public static void main(String[] args)	{
		Scanner scan = new Scanner(System.in);
				
		System.out.println("Enter two numbers of type double. The sum and average of the two numbers will be printed.");
		
		double a = scan.nextDouble();
		double b = scan.nextDouble();
		
		System.out.println("Sum: " + getSum(a,b));
		System.out.println("Average: " + getAve(a,b));
		
		System.out.println("Please enter a student's name, followed by a midterm score and a final score.");
		
		 String name = scan.next();
		 double midSc = scan.nextDouble();
		 double finSc = scan.nextDouble();
		 
			//create instance using constructor w/ 2 variables
		 
		 Student stu = new Student (name, midSc, finSc);
		 
		 System.out.println("Student name: " + stu.name + "\nTotal Grade: " + stu.grade );
		 
		System.out.println("This time using two variables. Enter a student's name, followed by a midterm score and a final score.");
			 
			//replace variables
			
			name = scan.next();
			midSc = scan.nextDouble();
			finSc = scan.nextDouble();
			
			double secondGrade = getAve(midSc, finSc);
			
			//create instance using constructor w/ 2 variables
			
			Student twoVar = new Student(name, secondGrade);
					
			 System.out.println("Student name: " + twoVar.name2 + "\nTotal Grade: " + twoVar.grade2 );
			
			scan.close();
	}
	public static double getSum(double num1, double num2){
		return num1 + num2;
	}
	public static double getAve(double num1, double num2) {
		return (num1+num2)/2;
	}
}
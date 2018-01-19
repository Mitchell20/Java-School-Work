import java.util.*;

public class Lab6 {
	
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	Rectangle rect1 = new Rectangle();
	
	double area, perimeter;
	
	area = rect1.getArea();
	perimeter = rect1.getPerimeter();
	
	System.out.println("Using the default constructor.\nArea: " + area + " Perimeter: " + perimeter);
 
	System.out.println("Enter an area and perimeter.");
	double length1 = scan.nextDouble();
	double width1 = scan.nextDouble();
	
	Rectangle rect2 = new Rectangle(length1, width1);
	
	if (length1 < 0 || width1 < 0) {
		System.out.println("You entered a negative value. Default constructor vaules used.");
		System.out.println("Area: " + area + "\nPerimeter: " + perimeter);
		
		Rectangle rect3 = new Rectangle(10,12);
		
		System.out.println("\nSumming first two lengths and widths:\nArea: " + rect3.getArea());
		System.out.println("Perimeter: " + rect3.getPerimeter());
		
	} else { 
			System.out.println("Using the parameterized constructor:\nArea: " + rect2.getArea());
			System.out.println("Perimeter: " + rect2.getPerimeter());
			
			Rectangle rect3 = new Rectangle(rect1.length + length1, rect1.width + width1);
			
			System.out.println("\nSumming first two lengths and widths:\nArea: " + rect3.getArea());
			System.out.println("Perimeter: " + rect3.getPerimeter());
	}
	
	scan.close();
	
 }
}
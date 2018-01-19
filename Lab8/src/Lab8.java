import java.util.*;
public class Lab8 {
public static Student stu = new Student();
static Scanner scan = new Scanner(System.in);

public static void main(String[] args) {
	
	stu.setName("Mitchell");
	stu.setMajor("EE");
	stu.setID(1207);
	stu.setAge(21);
	stu.setGPA(4.00);
	
	displayStudent(stu);
	
	displayStudent(inputStudent());
}
	public static void displayStudent(Student stu){
		System.out.println("Name: " + stu.getName() + "\nMajor: " + stu.getMajor() +
				"\nStudentID: " + stu.getID() + "\nAge: " + stu.getAge() + "\nGPA: " +
				stu.getGPA());
	}
	public static Student makeStudent(String name, String major, int studentID, int age, double GPA) {
		Student make = new Student(); 
		make.setName(name);
		make.setMajor(major);
		make.setID(studentID);
		make.setAge(age);
		make.setGPA(GPA);
		return (make);
		
	}
	public static Student inputStudent() {
		System.out.println("Enter name:");
		String name = scan.next();
		System.out.println("Enter major:");
		String major = scan.next();
		System.out.println("Enter studentID:");
		int studentID = scan.nextInt();
		System.out.println("Enter age:");
		int age = scan.nextInt();
		System.out.println("Enter GPA:");
		double GPA = scan.nextDouble();		
		return (makeStudent(name, major, studentID, age, GPA));
	}
}
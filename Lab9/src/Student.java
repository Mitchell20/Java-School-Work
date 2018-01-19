public class Student {
private String name;
private int age;
private String major;
private int studentID;
private double GPA;

public Student(){
	name = "Alice";
	age = 18;
	major = "computer science";
	studentID = 1212345678;
	GPA = 3.56;
}

public Student(String name, String major, int studentID, int age, double GPA) {
	
	setName(name);
	setMajor(major);
	setID(studentID);
	setAge(age);
	setGPA(GPA);
	}

public Student (String name, int age, int studentID) {
	setName(name);
	setAge(age);
	setID(studentID);
	}

public String getName() {
	return this.name;
	}
public void setName(String name) {
	this.name = name;
	}
public String getMajor() {
	return this.major;
	}
public void setMajor(String major) {
	this.major = major;
	}
public int getID() {
	return this.studentID;
	}
public void setID(int studentID) {
	this.studentID = studentID;
	}
public int getAge() {
	return this.age;
	}
public void setAge(int age) {
	this.age = age;
}
public double getGPA() {
	return this.GPA;
	}

public void setGPA(double GPA) {
	this.GPA = GPA;
}
public void displayStudent(){
	System.out.println("Name: " + name + "\nMajor: " + major +
			"\nStudentID: " + studentID + "\nAge: " + age + "\nGPA: " +
			GPA);
}
}

public class Student {
	private String name;
	private String major;
	private int studentID;
	private int age;
	private double GPA;
	
public void setName(String name) {
	this.name = name;
	}
public String getName() {
	return this.name;
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
public void setGPA(double GPA) {
	this.GPA = GPA;
}
public double getGPA() {
	return this.GPA;
}
}
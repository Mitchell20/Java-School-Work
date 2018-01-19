public class Student {
String name;
String major;
int studentId;
double gpa;
int age;

public void setName(String stName) {
name=stName;
	}

public String getName() {
return name;
	}

public void setMajor(String stMajor) {
	major = stMajor;
}

public String getMajor() {
	return major;
}

public void setID(int stID) {
	studentId = stID;
}

public int getID() {
	return studentId;
}

public void setGPA(double stGPA) {
	gpa = stGPA;
}

public double getGPA() {
	return gpa;
}

public void setAge(int stAge) {
	age = stAge;
}

public int getAge() {
	
	if (age < 6 || age > 18) {
		System.out.println("Student age not in range.");
	} else if (age > 5 && age < 12 ) {
		System.out.println("Elementary School.");
	} else if (age > 11 && age < 15) {
		System.out.println("Middle School.");
	} else if (age > 14 && age < 19) {
		System.out.println("High School.");
	}
	return age;
}
}
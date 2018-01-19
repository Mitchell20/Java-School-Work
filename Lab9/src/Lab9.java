import java.util.*;
public class Lab9 {
public static void main(String[] args) {
	
	Student stu1 = new Student();
	stu1.displayStudent();
	
	System.out.println();
	
	Student stu2 = new Student("Mitchell", "EE", 1207, 21, 3.01);
	stu2.displayStudent();
	
	System.out.println();
	
	Student stu3 = new Student ("Ghaith", 25, 1206);
	stu3.displayStudent();
}
}
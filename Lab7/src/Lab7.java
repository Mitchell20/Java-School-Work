import java.util.*;
public class Lab7 {
public static void main(String[] args)
{
Scanner scan=new Scanner(System.in);

String name;
String major;
int studentId;
double gpa;
int age;
Student stu = new Student();


System.out.print("Enter student name.");
name = scan.next();
stu.setName(name);

System.out.print("Enter student major.");
major = scan.next();
stu.setMajor(major);

System.out.print("Enter student ID.");
studentId = scan.nextInt();
stu.setID(studentId);

System.out.print("Enter student GPA.");
gpa = scan.nextDouble();
stu.setGPA(gpa);

System.out.print("Enter student age.");
age = scan.nextInt();
stu.setAge(age);

System.out.println("Name: " + stu.getName());
System.out.println("Major: " + stu.getMajor());
System.out.println("ID: " + stu.getID());
System.out.println("GPA: " + stu.getGPA());
System.out.println(stu.getAge());
}}
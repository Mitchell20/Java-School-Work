public class Student {
	 
	 String name, name2;
	 double grade, mid, fin;
	 double grade2;
	
	public Student (String initialName, double mid, double fin) {
		name = initialName;
		grade = Lab5.getAve(mid,fin);
		}
	public Student (String initialName, double initialGrade) {
		name2 = initialName;
		grade2 = initialGrade;
	}
	}
package ch06;

public class StudentTest {
	
	public static void main(String[] args) {
		Student studentLee = new Student();
		
		studentLee.studentName = "리";
		studentLee.studentNumber = 1;
		studentLee.grade = "2";
		System.out.println(studentLee.showStudentInfo());
		
		Student studentKim = new Student(3, "킴", "4");
		System.out.println(studentKim.showStudentInfo());
	}
}

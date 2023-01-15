package ch06;

public class Student {
	public int studentNumber;
	public String studentName;
	public String grade;
	
	//디폴트 생성자
	public Student() {}
	
	//생성자
	public Student(int number, String name, String grade) {
		System.out.println("student 생성");	
		//Student를 생성할 때 매개변수를 받아서 넣어주고 싶다?
		this.studentNumber = number;
		this.studentName = name;
		this.grade = grade;
		System.out.println("생성자 인자값");
		System.out.println("학번 : " + studentNumber);
		System.out.println("이름 : " + studentName);
		System.out.println("학년 : " + grade);
		System.out.println("-------END--------");
	}
	
	public String showStudentInfo() {
		return studentName + "학생의 학번은 "+ studentNumber + "이고, "+grade + "학년 입니다.";
	}
	
	
}

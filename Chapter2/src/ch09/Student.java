package ch09;

//참조 자료형 변수
public class Student {
	int studentId;
	String studentName;
	
	//참조 자료형
	Subject korea;
	Subject math;
	
	Student(int studentId, String studentName){
		this.studentId = studentId;
		this.studentName = studentName;
		
		korea = new Subject();
		math = new Subject();
	}
	
	public void setKorea(String name, int score) {
		korea.subjectName = name;
		korea.score = score;
	}
	
	public void setMath(String name, int score) {
		math.subjectName = name;
		math.score = score;
	}
	
	public void showScore() {
		int total = korea.score + math.score;
		System.out.println(studentName + "학생의 총점은 " + total + "점 입니다.");
	}
}

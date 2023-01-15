package ch04;

public class StudentTest {
	public static void main(String[] args) {
		
		//클래스	//변수명(참조변수)	//new키워드 //생성자();
		//Student하나를 생성해라
		//이것을 인스턴스라 부른다.
		Student studentLee = new Student(); 
		
		studentLee.studentID = 12345;
		studentLee.setStudentName("Lee");
		studentLee.address = "서울시 강남구";
		
		studentLee.showStudentInfo();
		
		Student studentKim = new Student();
		studentKim.studentID = 54321;
		studentKim.studentName = "KIM";
		studentKim.address = "경기도 성남시";
		
		studentKim.showStudentInfo();
		System.out.println(studentKim);
		System.out.println(studentLee);
	}
}

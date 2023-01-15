package ch04;

/*
 * 객체의 속성은 멤버 변수로
 * 객체의 기능은 메서드로 구현한다.
 * */
public class Student {
	public int studentID;
	public String studentName;
	public String address;
	
	public void showStudentInfo() {
		System.out.println( studentID + "학번의 이름은" + studentName + "이고, 주소는 "+ address);
	}
	public String getStudentName() {
		return studentName;
	}
	
	public void setStudentName(String name) {
		studentName = name;
	}
}

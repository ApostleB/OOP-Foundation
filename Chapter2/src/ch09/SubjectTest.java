package ch09;

public class SubjectTest {
	public static void main(String[] args) {
		Student studentLee = new Student(100, "Lee");
		studentLee.setKorea("국어", 100);
		studentLee.setMath("수학", 50);

		Student studentKim = new Student(200, "Kim");
		studentKim.setKorea("국어", 10);
		studentKim.setMath("수학", 60);
		
		studentLee.showScore();
		studentKim.showScore();
	}
}
 
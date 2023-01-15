package ch18;

public class CompanyTest {

	public CompanyTest() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Company compnay1 = Company.getInstance();
		Company compnay2 = Company.getInstance();
		
		System.out.println(compnay1);
		System.out.println(compnay2);

	}

}

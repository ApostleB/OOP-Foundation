package ch11;

public class MakeReportTest {
	public static void main(String[] args) {
		MakeReport make = new MakeReport();		
		String report = make.getReport();
		
		System.out.println(report);
	}

}

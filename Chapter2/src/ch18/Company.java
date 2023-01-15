package ch18;

//싱글톤 패턴
public class Company {
	
	private static Company instance = new Company();
	private Company() {
		
	}
	
	public static Company getInstance() {
		if(instance == null) instance = new Company();
		return instance;
	}
	
	public static void setInstance(Company instance) {
		Company.instance = instance;
	}
	
}

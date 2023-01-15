package ch16;

public class Employee {
	private static int serialNum = 1000;
		
	private int employeeId;
	private String employeeName;
	private String department;
	
	public Employee() {
		//static선언으로 값 공유
		serialNum++;
		this.employeeId = serialNum;
	}
	public static int getSerialNum() {
		return serialNum;
	}

	public int getEmployeeId() {
		//static이 아닌 변수는 instance 변수가 생성되지 않은 상태에서는 사용할 수 없다.
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}	
	
}

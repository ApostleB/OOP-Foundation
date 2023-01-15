package ch03;

public class VIPCustomer extends Customer{

	double salesRatio;
	private String agentID;
	
	/*
	 * public VIPCustomer() {
		super(0, "no-name");
		bonusRatio = 0.05;
		salesRatio = 0.1;
		customerGrade = "VIP";
		
		System.out.println("VIPCustomer() call");
	}
	*/
	
	public VIPCustomer(int customerID, String customerName) {
		//하위 클래스가 상위 클래스 생성자를 호출
		//기본적으로 상위클래스의 생성자가 호출이 되지만, 이렇게 써 줘도 됨.
		super(customerID, customerName);
		
		bonusRatio = 0.05;
		salesRatio = 0.1;
		customerGrade = "VIP";

		System.out.println("Customer(int String) call");
	}
	
	public String getAgentID() {
		return agentID;
	}

}

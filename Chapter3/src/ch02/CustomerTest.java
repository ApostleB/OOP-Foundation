package ch02;

public class CustomerTest {


	public static void main(String[] args) {
		Customer Lee = new Customer();
		
		Lee.setCustomerName("이");
		Lee.setCustomerID(100);
		Lee.bonusPoint = 1000;
		System.out.println(Lee.showCustomerInfo());
		
		VIPCustomer Kim = new VIPCustomer();
		Kim.setCustomerName("김");
		Kim.setCustomerID(999);
		Kim.bonusPoint = 10000;
		
		System.out.println(Kim.showCustomerInfo());

	}

}

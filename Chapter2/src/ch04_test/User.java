package ch04_test;

public class User {
	public int userId;
	public String userName;
	public String userAddr;
	
	public void userOutput() {
		System.out.println("User ID : "+userId);
		System.out.println("User NAME : "+userName);
		System.out.println("User ADDR : "+userAddr);
	}
	
	public void setUserName(String name) {
		userName = name;
	}
	
	public void setUserAddress(String addr) {
		userAddr = addr;
	}
}

package ch04_test;

public class UserTest {
	public static void main(String[] args){
		User user1 = new User();
		user1.userId = 12345;
		user1.userName = "테스트 유저";
		user1.userAddr = "테스트 주소";
		
		user1.userOutput();
	}
	
	

}

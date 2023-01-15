package ch061overloading;

public class Calculator {
	
	int left, right;
	int third = 0;
	
	public int setOprands(int left, int right) {
		System.out.println("setOprands(int left, int right)");
		System.out.println("메소드 오버로딩은 입력된 매개변수에 따라서 알맞은 메소드를 호출 할 수 있도록 도와주는 개념이다.");
		System.out.println("메소드 오버로딩의 개념이 적용될 첫 번째 메소드");
		this.left = left;
		this.right = right;
		return left + right;
	}
	
	public int setOprands(int left, int right, int third) {
		System.out.println("setOprands(int left, int right, int third)");
		System.out.println("메소드 오버로딩의 개념이 적용된 두 번째 메소드.");
		this.setOprands(left, right);
		this.third = third;
		return left + right + third;
	}
	
	public int sum() {
		System.out.println("SUM ");
		System.out.println("A :"+this.left);
		System.out.println("B :"+this.right);
		System.out.println("C :"+this.third);
		return this.left+this.right+this.third;
	}
	public int avg() {
		System.out.println("AVG ");
		System.out.println("A :"+this.left);
		System.out.println("B :"+this.right);
		System.out.println("C :"+this.third);
		return (this.left+this.right+this.third)/2;
	}
}

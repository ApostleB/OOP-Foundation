package ch061overloading;

public class CalculatorDemo {
	public static void main(String[] args) {
//		int a = 1;
//		int b = 2;
//		int c = 3;
		Calculator c1 = new Calculator();
		System.out.println("결괏 값 : " + c1.setOprands(1,2));
		System.out.println(c1.sum());
		System.out.println(c1.avg());
		System.out.println("=================");
		
		Calculator c2 = new Calculator();
		System.out.println("결괏 값 : " + c2.setOprands(1,2,3));
//		c2.setOprands(1,2,3);
		System.out.println(c2.sum());
		System.out.println(c2.avg());		
		

		System.out.println("=================");
		Calculator c3 = new Calculator();
		System.out.println("결괏 값 : " + c3.setOprands(1,3,3));
//		c2.setOprands(1,2,3);
		System.out.println(c3.sum());
		System.out.println(c3.avg());		
	}
}

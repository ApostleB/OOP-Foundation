package ch07;

public class Personal {
	int age;
	String height, weight,name; 
	public Personal(int age, String height, String weight, String name) {
		this.age = age;
		this.height = height;
		this.weight = weight;
		this.name = name;
		System.out.println("이름 : "+ name + " 나이 : "+ age +" 키 : " + height + " 몸무게 : "+weight);
	}
}

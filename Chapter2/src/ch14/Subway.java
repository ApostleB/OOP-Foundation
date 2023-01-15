package ch14;

public class Subway {
	int lineNumber;
	int passengerCount;
	int money;
	
	public Subway(int lineNumber) {
		this.lineNumber = lineNumber;
	}
	
	public void take(int money) {
		this.money += money;
		passengerCount++;
	}
	
	public void showSubwayInfo() {
		System.out.println("지하철 : " + lineNumber + "번의 승객 수는 " + passengerCount + "명 입니다."+ "\t수입은" + money +"원 입니다.");
	}

}

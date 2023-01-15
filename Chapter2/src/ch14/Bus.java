package ch14;

public class Bus {
	int busNumber;
	int passengerCount;
	int money;
	
	public Bus(int busNumber) {
		this.busNumber = busNumber;
	}
	
	public void take(int money) {
		this.money += money;
		passengerCount++;
	}
	
	public void showBusInfo() {
		System.out.println("버스 : " + busNumber + "번의 승객 수는 " + passengerCount + "명 입니다." + "\t수입은 " + money +"입니다." );
	}
}

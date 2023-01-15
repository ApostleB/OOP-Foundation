package ch10;

public class Birthday {
	private int year;
	private int month;
	private int day;
	
	private boolean isValid;
	
	public int getDay() {
		return day;
	}
	
	public void setDay(int day) {
		this.day = day;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		if(month > 12 | month < 1) {
			isValid = false;
		}else {
			isValid = true;
			this.month = month;
		}
	}
	
	public void showDate() {
		if(isValid) {
			System.out.println(year + "년 " + month + "월 " + day + "일 ");
		}else {
			System.out.println("유효하지 않은 날짜입니다.");
		}
	}
	
	public boolean getValid() {
		return this.isValid;
	}
}

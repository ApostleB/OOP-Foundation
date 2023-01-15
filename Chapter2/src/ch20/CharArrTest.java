package ch20;

public class CharArrTest {

	public static void main(String[] args) {
		char[] alp = new char[26];
		char ch = 'A';
		
		for(int i = 0 ; i < alp.length ; i++) {
			alp[i] = ch++;
		}
		
		for(char _alp : alp) {
			System.out.println( _alp + ", " + (int)_alp);
		}
	}

}

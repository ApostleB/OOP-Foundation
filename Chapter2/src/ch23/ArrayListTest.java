package ch23;
import ch21.Book;
import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		ArrayList<Book> library = new ArrayList<>();
		
		library.add(new Book("태백산맥1", "정"));
		library.add(new Book("태백산맥2", "정"));
		library.add(new Book("태백산맥3", "정"));
		library.add(new Book("태백산맥4", "정"));
		library.add(new Book("태백산맥5", "정"));
		
		for(int i = 0 ; i < library.size() ; i ++) {
			library.get(i).showInfo();
		}
		
	}

}

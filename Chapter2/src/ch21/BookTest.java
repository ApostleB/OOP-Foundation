package ch21;

public class BookTest {

	public static void main(String[] args) {
		Book[] library = new Book[5];
		Book[] copyLibrary = new Book[5];
		
		library[0] = new Book("태백산맥1", "정");
		library[1] = new Book("태백산맥2", "정");
		library[2] = new Book("태백산맥3", "정");
		library[3] = new Book("태백산맥4", "정");
		library[4] = new Book("태백산맥5", "정");
		
		System.arraycopy(library, 0, copyLibrary, 0, library.length);

		library[0].setAuthor("임");
		library[0].setTitle("지리산");
		for(Book book : library){
			System.out.println(book);
			book.showInfo();
		}
		System.out.println("===================================");

		//Book객체형 변수 book에 copyLibrary를 넣어라
		for(Book book : copyLibrary){
			System.out.println(book);
			book.showInfo();
		}
		
	}

}

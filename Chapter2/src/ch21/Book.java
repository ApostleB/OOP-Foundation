package ch21;

public class Book {

	private String title;
	private String author;
	
	public Book() {}
	public Book(String title,String author) {
		this.title = title;
		this.author = author;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	
	public void showInfo() {
		System.out.println("타이틀 : " + title);
		System.out.println("저자 : " + author);
	}

}

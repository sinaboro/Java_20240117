package ex03;

public class Book {
  //title (제목), author (저자), publishYear (출판 연도
	private String title;
	private String author;
	private int publishYear;
	
	public Book(String title, String author, int year) {
		this.title = title;
		this.author = author;
		this.publishYear = year;
	}
	
	String getDetails(){
		return title + " : " + author + " : " + publishYear;
	}
	
}

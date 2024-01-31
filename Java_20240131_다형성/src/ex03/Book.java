package ex03;

public class Book {
  //title (제목), author (저자), publishYear (출판 연도
	private String title;
	private String author;
	private int publishYear;
	
	
	String getDetails(){
		return title + " : " + author + " : " + publishYear;
	}
	
}

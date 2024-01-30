package ex04;
/*
 * 1. Book 클래스 (부모 클래스):
속성:

title (책 제목, 문자열 타입)
author (저자, 문자열 타입)
publicationYear (출판 연도, 정수 타입)

메서드:
생성자: 모든 속성을 초기화합니다.
displayInfo(): 책의 정보를 "Title: [title], Author: [author], Year: [publicationYear]" 형태로 출력합니다.
 */
public class Book {

	private String title;
	private String author;
	private int publicationYear;
	
	public Book() {}
	
	public Book(String title, String author, int publicationYear) {
		this.title = title;
		this.author = author;
		this.publicationYear = publicationYear;
	}
	
	void displayInfo() {
		System.out.println("Title: [" + title + "],  Author: [" +author + "], Year: [" + publicationYear + "]");
	}
}

package ex06;

/*
 * 문제 3: 도서 클래스 만들기
	클래스 이름: Book
	속성: title (제목), author (저자), publisher (출판사),
	 price (가격)
	기능:
	displayBookInfo(): 도서의 모든 정보를 출력하는 메소드
 */

public class Book {
	
	private String title;
	private String author;
	private String publisher;
	private int price;
	
	//다른 생성자 호출
	public Book(){
		this("제목없음", "저자없음", "출판사없음",0);
	}
	
	public Book(String title, String author,  int price){
		this.title  = title; 
		//this => 객체자기자신을 의미
		this.author = author;
		this.price  = price;
		//this(t, a, "출판사없음",p);
	}
	
	public Book(String _title, String a, String b, int p){
		title = _title;
		author = a;
		publisher = b;
		price  = p;
	}
	
	
	public void displayBookInfo() {
		System.out.println("제목 : " + title);
		System.out.println("저자 : " + author);
		System.out.println("출판사 : " + publisher);
		System.out.println("가격 : " + price);
	}
}

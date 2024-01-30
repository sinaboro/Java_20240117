package ex03;

/*
 * 문제 1: 학생 클래스 만들기
	클래스 이름: Student
	속성: 
	name (이름), 
	studentId (학번), 
	major (전공)
	
	기능:
	displayInformation(): 학생의 모든 정보를 출력하는 메소드
	
	초기화 - 생성자 이용, or setter 이용
 */
public class Student {
	
	private String name;
	private String studentId;
	private String major;
	
	Student() {	}  //디폴트 생성자
	
	Student(String n, String s, String m){ //인자값 3개 받는것...
		name = n;
		studentId = s;
		major = m;
	}
	
	void displayInformation() {
		
		System.out.println("학번 : " + studentId + " 이름 : " + name + " 전공 : " + major);
	}
	
}

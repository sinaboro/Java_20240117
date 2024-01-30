package ex01;

public class Cat {

	//멤버 변수(필드) --재료(레시피)
	String breed;
	String color;
	int age;
	
	
	void setAge(int n) {
		if(n>0 && n<=150)
			age = n;
		else {
			age= 1;
		}
	}
	//생성자(클래스이름하고 같다) --반환타입x
	
	
	//void(반환타입)  eat(함수명) ()(매개변수)
	//멤버 메소드 --액션(미역을 3분 불린다..)
	void eat() {
		System.out.println(age);
		System.out.println("쮸르를 먹는다");
		System.out.println("칼라는 " + color + "이다.");
	}
	
	void scratch() {
		
	}
	
	void meow() {
		
	}
}

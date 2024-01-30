package ex01_1;

import java.util.Scanner;

public class Example01 {

	public static void main(String[] args) {
		
		//Cat이란 클래스를 통해서 c1이란 참조변수가 참조하는 객체를 생성함
		Cat c1 = new Cat(); 
		//--> new Cat()은 Cat()란 생성자 호출을 통해서 객체를 생성한다.
		
		c1.breed = "페르시안고양이";
		c1.color = "흰색";
		c1.setAge(100);
		c1.eat();
		
		Cat c2  = new Cat();
		
		c2.breed = "코리아";
		c2.color = "검정";

		c2.eat();
		
	}

}


class Cat {

	//멤버 변수(필드) --재료(레시피)
	String breed;
	String color;
	int age;
	
	
	void setAge(int n) {
		if(n>0 && n<=150)
			age = n;
		else
			System.out.println("나이 확인");
	}
	//생성자(클래스이름하고 같다) --반환타입x
	Cat(){
		
	}
	
	
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


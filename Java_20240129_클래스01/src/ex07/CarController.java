package ex07;

import ex06.Book;

public class CarController {

	public static void main(String[] args) {
		
		Car car = new Car("그랜저", "현대", "2020", "흰색");
		
//		car.setCar("그랜저", "현대", "2020", "흰색");
		System.out.println("--------------------");
		car.displayCarDetails();
		System.out.println("--------------------");
//		car.color = "검정";
		car.setColor("빨강");
		
		car.displayCarDetails();
		System.out.println("-------------------");
		
		System.out.println(car.toString());

		System.out.println("-------------------");
		System.out.println("내 차 색상은 : " +  car.getColor());
		


	}

}

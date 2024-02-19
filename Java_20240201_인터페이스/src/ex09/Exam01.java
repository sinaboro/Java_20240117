package ex09;

abstract class Shape {
	
	Point p;
	
	Shape() {
		this(new Point(0,0));
	}
		
	Shape(Point p) {
		this.p = p;
	}
	
	abstract double calcArea(); // 도형의 면적을 계산해서 반환하는 메서드
	
	Point getPosition() {
		return p;
	}
	void setPosition(Point p) {
		this.p = p;
	}
}

class Circle extends Shape{
	
	double r; //반지름
	
	public Circle(double r) {
		this.r = r;
	}
	
	@Override
	double calcArea() {
		return Math.PI * r*r;
	}
	
}

class Rectangle extends Shape{

	double width; //폭
	double height; //높이
	
	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	@Override
	double calcArea() {
		return width*height;
	}
	
	boolean isSquare(){
		return   (width == height) ? true : false;  
	}
	
}

class Point {
	int x;
	int y;

	Point() {
		this(0,0);
	}
	
	Point(int x, int y) {
		this.x=x;
		this.y=y;
	}
	
	public String toString() {
		return "["+x+","+y+"]";
	}
}
	
public class Exam01 {

	public static void main(String[] args) {

	//	new Circle(5.0), new Rectangle(3,4), new Circle(1)
	 	Shape s =  new Circle(5.0);
	 	System.out.println(s.calcArea());
	 	
	 	s = new Rectangle(3,4);
	 	
	 	System.out.println(s.calcArea());
		
	}
}





















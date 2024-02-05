package ex05;

public class Exam01 {

	public static void main(String[] args) {
		Buyer b = new Buyer();

		b.buy(new Tv());
		b.buy(new Computer());
		b.buy(new Tv());
		b.buy(new Audio());
		b.buy(new Computer());
		b.buy(new Computer());
		b.buy(new Computer());
		
		b.summary();
	}

}

class Product {
	int price;			// 제품의 가격
	
	Product(int price) {
		this.price = price;
	}

	Product() {} // 기본 생성자
}
 
class Tv extends Product {
	Tv() {
		super(100);	
	}

	public String toString() { return "Tv"; }
}

class Computer extends Product {
	Computer() { super(200); }

	public String toString() { return "Computer"; }
}

class Audio extends Product {
	Audio() { super(50); }

	public String toString() { return "Audio"; }
}                         

class Buyer {			// 고객, 물건을 사는 사람
	
	int money = 1000;	// 소유금액
	Product[] cart = new Product[3];	// 구입한 제품을 저장하기 위한 배열
	
	int i =0;			// Product배열에 사용될 카운터

	void buy(Product p) {

		//1.1
		if(money < p.price) {
			System.out.println(p+"(" +p.price+ ") 제품을 사기에는 금액 부족!!!");
			return;
		}
		
		//1.2
		money -= p.price;
		
		//1.3
		add(p);
	}
	
	void add(Product p) {
		
		//1.1 -> i값이 장바구니 보다 크다면
		if(i >= cart.length) {
			Product[] temp = new Product[cart.length*2];  //1.1.1
			
			for(int i=0; i<cart.length; i++) //1.1.2
				temp[i] = cart[i];
			
			cart = temp; //1.1.3
		}
		//1.2 -> 물건을 장바구니 저장
		cart[i++] = p;
		
	}

	void summary() {		    // 구매한 물품에 대한 정보를 요약해서 보여 준다.
		String itemList = "";
		int sum=0;
		
		//1.1
		for(int i=0; i<cart.length; i++) {
			itemList += cart[i] + ", ";
			sum += cart[i].price;
		}
		System.out.println("구입한 물건의 목록 : " + itemList);
		System.out.println("사용한 금액 : " + sum);
		System.out.println("남은 금액 : " + money);
		
		
	}
}
















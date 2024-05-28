package ex06;

interface Printable{
	void print();
}

class Papers{
	private String msg;
	
	public Papers(String msg) { this.msg = msg; }
	
	public Printable getPrinter() {
		
		//선언
		class Printer implements Printable{

			@Override
			public void print() {
				System.out.println(msg);
			}			
		}
		
		//생성
		Printable tmp = new Printer();
		
		return tmp;
	}
}

public class LocalInnerClass {

	public static void main(String[] args) {
		
		Papers p = new Papers("전송할 메시지........");
		
		Printable pa = p.getPrinter();
		pa.print();
		
	}

}












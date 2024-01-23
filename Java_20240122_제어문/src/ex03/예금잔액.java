package ex03;

import java.util.Scanner;

public class 예금잔액 {

	public static void main(String[] args) {
		int bankBalance = 0;
		int tmp;
		boolean flag=true;
		Scanner sc = new Scanner(System.in);
		
		//for(; flag == true; ) {  // for(; i<100; )
		while(flag == true) {  // for(; i<100; )
		
			System.out.println("-------------------------------");
			System.out.println("1.예금\t|2.출금\t|3.잔고\t|4.종료");
			System.out.println("-------------------------------");
//			int num =   Integer.parseInt(sc.nextLine());
			int num =   sc.nextInt();
			switch(num){
				case 1:
					System.out.print("예금액>>");
//					tmp =   Integer.parseInt(sc.nextLine());
					tmp =   sc.nextInt();
					bankBalance += tmp;
					break;
				case 2:
					System.out.print("출금액>>");
					tmp =   sc.nextInt();
					bankBalance -= tmp;
					break;
				case 3:
					System.out.print("잔고>>"+bankBalance + "\n");
					break;
				default :
					flag = false;
					break;
			}
		}
		System.out.print("프로그램 종료");
	}

}

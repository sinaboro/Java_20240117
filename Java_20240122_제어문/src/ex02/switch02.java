package ex02;

public class switch02 {

	public static void main(String[] args) {
	     int grade = 15;
	     
	     switch (grade) {
	        case 1:
	           System.out.println("매우 우수");
	           break;
	        case 2:
	           System.out.println("우수");
	           break;
	        case 3:
	           System.out.println("좋음");
	           break;
	        case 4:
	           System.out.println("좀 더 열심히");
	           break;
	        case 5:
	           System.out.println("미흡");
	           break;
	        default:
	           System.out.println("잘못된 등급");
	     }
	}

}

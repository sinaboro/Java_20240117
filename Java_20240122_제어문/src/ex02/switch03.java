package ex02;

public class switch03 {

	public static void main(String[] args) {
	     String grade = "SCI";
	     
	     switch (grade) {
	        case "KOR":
	           System.out.println("매우 우수");
	           break;
	        case "ENG":
	           System.out.println("우수");
	           break;
	        case "MATH":
	           System.out.println("좋음");
	           break;
	        case "COM":
	           System.out.println("좀 더 열심히");
	           break;
	        case "SCI":
	           System.out.println("미흡");
	           break;
	        default:
	           System.out.println("잘못된 등급");
	     }
	}

}

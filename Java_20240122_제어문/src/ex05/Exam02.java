package ex05;

/*
 * 다음은 문자형 변수 ch가 영문자(대문자 또는 소문자)이거나 숫자일 때만 변수 b
의 값이 true가 되도록 하는 코드이다. (1)에 알맞은 코드를 넣으시오.
class Exercise3_9 {
	public static void main(String[] args)  {
	char ch = 'z';
	boolean b = (  (1)  );
	System.out.println(b);
	}
}  ==> hint> 아스키코드표 참조
 */
public class Exam02 {

	public static void main(String[] args) {
		char ch = ']';
		boolean b = (ch>=48 && ch<=57) || (ch>=65 && ch<=90) || (ch>=97 && ch<=122);
		System.out.println(b);

	}

}

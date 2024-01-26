package ex01;

public class StringArray01 {

	public static void main(String[] args) {
	 
	      
//	      String[] myArr = new String[3];            // 배열 선언,메모리 할당
//	  	
//		   myArr[0] = "kor";
//		   myArr[1] = "eng";
//		   	
//			
//			for (int i = 0; i < myArr.length; i++)
//				System.out.println(myArr[i]+" "); 
			
			String str = "korea";
			String str2 = "";
			
			String str3 = str.substring(2);
			
			System.out.println(str.length());
			System.out.println(str.isEmpty());
			System.out.println(str2.isEmpty());
			System.out.println(str.substring(2));
			System.out.println(str3);

			System.out.println(str.substring(1, 4));
			
			String str4 = "math";
			String str5 = str.concat(str4);  //koreamath
			
			System.out.println(str.concat(str4));
			System.out.println(str5);
			
			
			
			
			
			
			
			
			
			
			
			
			
			

	}

}

package ex02;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayListCollection {

	public static void main(String[] args) {

		//ArrayList와 LinkedList는 사용법이 같다..다만 저장되는 메모리구조가 다르다..
		
//		ArrayList<String> list = new ArrayList<String>();
		LinkedList<String> list = new LinkedList<String>();
		
		//문자열 인스턴스 저장
		list.add("Toy");
		list.add("Box");
		list.add("Robot");
//		list.add(10);
		
		//저장된 리스트 출력
		for(int i=0; i<list.size(); i++) 
			System.out.print(list.get(i) + " ");
		System.out.println();
		
		//향상된 for문 이용
		for(String str : list)
			System.out.print(str + " ");
		System.out.println();
		
		//삭제..
		list.remove(0);
//		System.out.println(list.get(0));  
		//앞자리가 삭제되면 뒤 데이타들이 전부 앞으로 한칸식 이동한다.
		//따라서 arraylist는 빈번한 삭제가 있는 경우에는 속도가 저하 될 수 있다.
		
		//향상된 for문 이용
		for(String str : list)
			System.out.print(str + " ");
		
	}

}

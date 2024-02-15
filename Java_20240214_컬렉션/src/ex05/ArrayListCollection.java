package ex05;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class ArrayListCollection {

	public static void main(String[] args) {

		//ArrayList와 LinkedList 두 클래스 상위 클래스인 List사용하자..
		
//		List<String> list = new ArrayList<String>();
		Set<String> list = new HashSet<String>();
		
		//문자열 인스턴스 저장
		list.add("Toy");
		list.add("Box");
		list.add("Robot");
		list.add("Toy");
//		list.add(10);
		
		Iterator<String> it = list.iterator();
		
		while(it.hasNext())
			System.out.print(it.next() + '\t');
		
		
		System.out.println();
		
		System.out.println("한번 더 출력");

		it = list.iterator();  //반복자를 다시 스타트지점으로 이동시킨다.
		while(it.hasNext())
			System.out.print(it.next() + '\t');
		
		
		
	}

}













package ex04;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class SetCollection {

	public static void main(String[] args) {
		
		//중복저장되지 않는다. , 순서가 없다.
		Set<String> set = new HashSet<String>();
//		List<String> set = new ArrayList<String>();
		
		set.add("Toy");
		set.add("Robot");
		set.add("Box");
		set.add("Toy");
		
		for(String s : set)
			System.out.print(s + '\t');
		System.out.println();
		
		Iterator<String> it = set.iterator();  //반복자.
		
		while(it.hasNext()) {
			System.out.print(it.next() + '\t');
		}
		System.out.println();
		
	}

}

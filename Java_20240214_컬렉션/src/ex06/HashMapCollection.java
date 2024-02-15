package ex06;

import java.util.HashMap;
import java.util.Map;

public class HashMapCollection {

	public static void main(String[] args) {
		
//		HashMap<Integer, String> map = new HashMap<Integer, String>();
		Map<Integer, String> map = new HashMap<Integer, String>();
		
		map.put(33, "Toy");
		map.put(47, "Box1");
		
		map.put(67,"Robot");
		map.put(47, "Box2");  //키가 중복되면 기존꺼 덥어쓴다.
		map.put(33, "Toy2");
		
		
		System.out.println(map.get(33));
		System.out.println(map.get(47));
		
		map.remove(33);  //삭제

		System.out.println(map.get(33));
		
		
		
		
	}

}

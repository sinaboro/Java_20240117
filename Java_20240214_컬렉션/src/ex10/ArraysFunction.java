package ex10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.math.*;

public class ArraysFunction {

	public static void main(String[] args) {
		
		int[] arr = new int[10];
		int[] arr2;
		int[] arr3;
	
		Arrays.fill(arr, 10);

		Arrays.setAll(arr, i -> (int)(Math.random()*45)+1);
				
		System.out.println(Arrays.toString(arr));
		
		arr2 = Arrays.copyOf(arr, 5);
		arr3 = Arrays.copyOfRange(arr, 2, 7);
		System.out.println("arr2 : " +  Arrays.toString(arr2));
		System.out.println("arr3 : " + Arrays.toString(arr3));
		
		//ArrayList는 선언과 동시 초기화 불가
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		
		System.out.println(list);
		
		list = Arrays.asList(10,20,30,40,50);  //리스트 초기화,, 단, 값 추가 못함.
		System.out.println(list);
		
		//list.add(60);  값 추가 불가
		
		//값을 추가하고 싶으면 ArrayList로 다시 변경해야한다.
		list = new ArrayList(list);
		list.add(60);
		list.add(70);
		System.out.println(list);
		
		
		
	}

}

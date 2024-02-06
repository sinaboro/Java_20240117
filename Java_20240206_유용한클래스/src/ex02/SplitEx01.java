package ex02;

public class SplitEx01 {

	public static void main(String[] args) {
		
		String animals = "dog,cat,bear";
		
		String[] arr = animals.split(",", 2);
		
//		System.out.println(arr);
		
		for(String a : arr)
			System.out.println(a);

		System.out.println("---------------------------");
		
		arr = animals.split(",");
		
		for(String a : arr)
			System.out.println(a);
		
	}

}

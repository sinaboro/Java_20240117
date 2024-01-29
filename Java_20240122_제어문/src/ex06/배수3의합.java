package ex06;

public class 배수3의합 {
	public static void main(String[] args) {
		
		int sum=0; 
		
		for(int i=0; i<=100; i++) {
			if(i %3 == 0) {
				sum += i;
			}
			
		}
		
		System.out.println("3배수의합 : " + sum);
		
		
		int[] arr = {10,20,30};
		
		for(int i=0; i<arr.length; i++)
			System.out.print(arr[i] + " ");
		
		int[] numArr =arr;
		for(int i=0; i<arr.length; i++)
			numArr[i] += 100;
		
		System.out.println();

//		for(int i=0; i<arr.length; i++)
//			System.out.print(arr[i] + " ");

		for(int n : arr)
			System.out.print(n + " ");
		
		System.out.println();
		
		String[] str = {"kor","eng","math","com","sci"};
//		for(String s : str)
//			System.out.print(s + " ");		
		 
		for(int i=0; i<str.length; i++)
			System.out.print(str[i] + " ");
		
		System.out.println();
		String s1 = "kor";
		String s2 = "kor";
		
		System.out.println(s1.equals(s2));
		
		String ju = "901011-1080413";
		
		String[] ju2 = ju.split("-");
		
		for(String j : ju2)
			System.out.println(j);
		
		
		
		
	}
}













package ex12;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ComparableController {

	public static void main(String[] args) {

		List<String> list1 = 
				new ArrayList<>(Arrays.asList("kor","Zng","aaa","ccc","amth","ttt"));
		
		System.out.println("정렬전: " + list1);
		Collections.sort(list1);
		System.out.println("정렬후: " + list1);
		
		List<Review> review = new ArrayList<Review>();
		review.add(new Review(10, LocalDate.of(2024, 02, 15)));
		review.add(new Review(1, LocalDate.of(2023, 04, 25)));
		review.add(new Review(8, LocalDate.of(2022, 06, 05)));
		review.add(new Review(2, LocalDate.of(2023,10,10)));
		review.add(new Review(20, LocalDate.of(2024, 10, 30)));
		
		for(Review re : review)
			System.out.println(re);
		System.out.println("--------------------------------");
		
		Collections.sort(review);
		
		for(Review re : review)
			System.out.println(re);
	}

}

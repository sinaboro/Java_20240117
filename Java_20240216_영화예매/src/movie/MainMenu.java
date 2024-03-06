package movie;

import java.util.ArrayList;
import java.util.List;

public class MainMenu extends AbstractMenu{

	private static final MainMenu instance = new MainMenu(null);
	private static final String MAIN_MENU_TEXT =  //기본 문구 
			"1: 영화 예매하기\n" +
			"2: 예매 확인하기\n" +
			"3: 예매 취소하기\n" +
			"4: 관리자 메뉴로 이동하기\n" +
			"q: 종료\n\n" +
			"메뉴를 선택하세요: ";
	
	private MainMenu(Menu prevMenu) {
		super(MAIN_MENU_TEXT, prevMenu);  //부모생성자 호출
	}

	public static MainMenu getInstance() {
		return instance;     //MainMenu 객체 생성 주소반환(싱글톤패턴)
	}
	
	@Override
	public Menu next()  {
		switch(sc.nextLine()) {
		case "1":
			reserve();  //영화 예매
			return this;
		case "2":
			checkReservation();   //예매확인
			return this;  //메인 메뉴 객체 반환(다시 메인메뉴가 나타난다.)
		case "3":
			cancelReservation();  //예매 취소
			return this; //메인 메뉴 객체 반환(다시 메인메뉴가 나타난다.)
		case "4":
			if(! checkAdminPassword()) {
				System.out.println(">> 비밀번호가 틀렸습니다.");
				return this;
			}
			AdminMenu adminMenu = AdminMenu.getInstance();
			adminMenu.setPrevMenu(this);
			return adminMenu;
		case "q": return prevMenu; //q입력하면, prevMenu를 반환
		default : return this;    //그 외 입력 MainMenu로 돌아감
		}
		
	}

	private void reserve() {
		try {
			List<Movie> movies = Movie.findAll();
			for(Movie movie : movies)
				System.out.println(movie);    //<<영화 목록 보여주기
			
			System.out.println("예매할 영화를 선택하세요: ");
			
			String movieId = sc.nextLine();
			Movie movie = Movie.findAll(movieId);  // << 예매 영화 선택
			
			//예매된 좌석 현황.
			ArrayList<Reservation> reservations = 
					Reservation.findMovieId(movieId);
			
			Seats seats = new Seats(reservations);
			
			seats.show();  //예약좌석 및 빈 좌석 확인
		
			System.out.println("좌석을 선택하세요(예:E-9): ");
			String seatName = sc.nextLine();
			
			seats.mark(seatName);  //좌석 예매
			
			Reservation reservation = 
					new Reservation(movie.getId() , movie.getTitle(), seatName);
			
			reservation.save();
			
			
		}catch (Exception e) {
			System.out.printf(">> 예매에 실패하였습니다: %s\n", e.getMessage());
		}
	}

	private void cancelReservation() {
		System.out.println("예매번호를 입력하세요:");
		
		Reservation  canceled = Reservation.cancel(sc.nextLine());
		
		if(canceled == null) {
			System.out.println("예매 내역이 없습니다.");
		}else {
			System.out.printf(">>[취소완료] %s의 예매가 취소되었습니다.", canceled);
		}
		
	}

	private void checkReservation() {
		System.out.println("예매번호를 입력하세요: ");
		
		try {
			Reservation reservation = Reservation.findById(sc.nextLine());
			
			if(reservation == null) {
				System.out.println(">> 예매 내역이 없습니다.");
			}else {
				System.out.println(">>[확인 완료]\n" + reservation);
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

	private boolean checkAdminPassword() {
		System.out.println("관리자 비밀번호를 입력하세요 : ");
		
		String admin = sc.nextLine();
		
		return "admin".equals(admin);
	}

}
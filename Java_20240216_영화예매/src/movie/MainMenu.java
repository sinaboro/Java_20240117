package movie;

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
	public Menu next() {
		switch(sc.nextLine()) {
		case "q": return prevMenu; //q입력하면, prevMenu를 반환
		default : return this;    //그 외 입력 MainMenu로 돌아감
		}
		
	}
	

}
